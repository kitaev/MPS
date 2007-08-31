package jetbrains.mps.helgins.inference;

import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.*;
import jetbrains.mps.util.WeakSet;
import jetbrains.mps.util.Pair;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.Mapper;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.helgins.integration.HelginsPreferencesComponent;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.incremental.INodesReadListener;
import jetbrains.mps.bootstrap.helgins.structure.RuntimeErrorType;
import jetbrains.mps.bootstrap.helgins.structure.MeetType;
import jetbrains.mps.bootstrap.helgins.structure.JoinType;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.ide.EditorsPane;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.IGutterMessageOwner;
import jetbrains.mps.nodeEditor.AbstractEditorComponent;
import jetbrains.mps.core.structure.BaseConcept;

import java.util.*;
import java.util.Map.Entry;
import java.awt.Color;

import org.jetbrains.annotations.Nullable;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 08.05.2007
 * Time: 13:50:13
 * To change this template use File | Settings | File Templates.
 */
public class NodeTypesComponent_new implements IGutterMessageOwner {

  private static final char A_CHAR = 'a';
  private static final char Z_CHAR = 'z';

  private int myVariableIndex = 0;
  private char myVariableChar = A_CHAR;

  private final Object ACCESS_LOCK = new Object();

  private SNode myRootNode;
  private TypeChecker myTypeChecker;
  private Map<SNode, SNode> myNodesToTypesMap = new HashMap<SNode, SNode>();
  private Map<SNode, IErrorReporter> myNodesToErrorsMap = new HashMap<SNode, IErrorReporter>();

  private Set<SNode> myFullyCheckedNodes = new WeakSet<SNode>(); //nodes which are checked with their children
  private Set<SNode> myPartlyCheckedNodes = new WeakSet<SNode>(); // nodes which are checked themselves but not children

  private WeakHashMap<SNode, WeakSet<SNode>> myNodesToDependentNodes = new WeakHashMap<SNode, WeakSet<SNode>>();

  private EquationManager myEquationManager;

  private Set<SModelDescriptor> myModelDescriptorsWithListener = new HashSet<SModelDescriptor>();


  private MyModelListener myModelListener = new MyModelListener();
  private MyEventsReadListener myNodesReadListener = new MyEventsReadListener();

  private Set<SNode> myCurrentNodesToInvalidate = new HashSet<SNode>();

  // for diagnostics
  private Set<SNodeProxy> myNotSkippedNodes = new HashSet<SNodeProxy>();

  private static final Logger LOG = Logger.getLogger(NodeTypesComponent_new.class);
  private Set<SNode> myCurrentFrontier;
  private SNode myCurrentCheckedNode;
  private WeakHashMap<SNode, Set<Pair<String, String>>> myNodesToRules = new WeakHashMap<SNode, Set<Pair<String, String>>>();

  public NodeTypesComponent_new(SNode rootNode, TypeChecker typeChecker) {
    myRootNode = rootNode;
    myTypeChecker = typeChecker;
    // myProject = project;
    myEquationManager = new EquationManager(myTypeChecker);
  }

  public void clear() {
    clearEquationManager();
    clearNodesTypes();
    clearCaches();
  }

  private void clearEquationManager() {
    myEquationManager = new EquationManager(myTypeChecker);
  }

  public SNode getNode() {
    return myRootNode;
  }

  private void clearCaches() {
    myFullyCheckedNodes.clear();
    myPartlyCheckedNodes.clear();
    myNodesToDependentNodes.clear();
    myNodesToRules.clear();
  }

  private void clearNodesTypes() {
    myNodesToTypesMap.clear();
    myNodesToErrorsMap.clear();
    myCurrentNodesToInvalidate.clear();
    myVariableChar = A_CHAR;
    myVariableIndex = 0;
  }

  private void invalidateNode(SNode node) {
    myFullyCheckedNodes.remove(node);
    myPartlyCheckedNodes.remove(node);
    myNodesToTypesMap.remove(node);
    myNodesToErrorsMap.remove(node);
    myNodesToRules.remove(node);
  }

  public void reportTypeError(SNode nodeWithError, String errorString, String ruleModel, String ruleId) {
    if (nodeWithError != null) {
      myNodesToErrorsMap.put(nodeWithError, new SimpleErrorReporter(errorString, ruleModel, ruleId));
    }
  }

  public void reportTypeError(SNode nodeWithError, IErrorReporter errorReporter) {
    if (nodeWithError != null) {
      myNodesToErrorsMap.put(nodeWithError, errorReporter);
    }
  }

  public boolean isInCheckedNodes(SNode node) {
    return myFullyCheckedNodes.contains(node);
  }

  boolean loadTypesystemRules(SNode root) {
    List<Language> languages = root.getModel().getLanguages(GlobalScope.getInstance());
    boolean isLoadedAnyLanguage = false;
    for (Language language : languages) {
      boolean b = myTypeChecker.getRulesManager().loadLanguage(language);
      isLoadedAnyLanguage = isLoadedAnyLanguage || b;
    }
    if (!isLoadedAnyLanguage) return false;
    return true;
  }

  @Nullable
  private AbstractEditorComponent getEditorComponent() {
    MPSProject project = myTypeChecker.getProject();
    if (project == null) return null;
    EditorsPane editorsPane = project.getComponent(EditorsPane.class);
    if (editorsPane == null) return null;
    IEditor iEditor = editorsPane.getEditorFor(myRootNode);
    if (iEditor == null) return null;
    AbstractEditorComponent component = iEditor.getCurrentEditorComponent();
    return component;
  }

  public void computeTypes() {
    computeTypes(false);
  }


  public void computeTypes(boolean refreshTypes) {
    try {
      if (!isIncrementalMode() || refreshTypes) {
        clear();
      } else {
        myNotSkippedNodes.clear();
        AbstractEditorComponent component = getEditorComponent();
        if (component != null) {
          component.getHighlightManager().clearForOwner(this);
        }

        doInvalidate();
        myPartlyCheckedNodes.addAll(myFullyCheckedNodes);
        myFullyCheckedNodes.clear();
      }

      myTypeChecker.setCurrentTypesComponent(this);
      if (!loadTypesystemRules(myRootNode)) {
        return;
      }
      clearEquationManager();

      computeTypesForNode(myRootNode);

      // solve residual inequations
      myEquationManager.solveInequations();

      // setting expanded types to nodes
      for (Map.Entry<SNode, SNode> contextEntry : new HashSet<Entry<SNode, SNode>>(myNodesToTypesMap.entrySet())) {
        SNode term = contextEntry.getKey();
        if (term == null) continue;
        SNode type = expandType(contextEntry.getValue(), myTypeChecker.getRuntimeTypesModel());
        if (BaseAdapter.isInstance(type, RuntimeErrorType.class)) {
          RuntimeErrorType errorType = (RuntimeErrorType) BaseAdapter.fromNode(type);
          reportTypeError(term, errorType.getErrorText(), errorType.getNodeModel(), errorType.getNodeId());
        }
        myNodesToTypesMap.put(term, type);
      }

      // setting expanded errors
      for (SNode node : new HashSet<SNode>(myNodesToErrorsMap.keySet())) {
        IErrorReporter iErrorReporter = myNodesToErrorsMap.get(node);
        String errorString = iErrorReporter.reportError();
        myNodesToErrorsMap.put(node, new SimpleErrorReporter(errorString, iErrorReporter.getRuleModel(), iErrorReporter.getRuleId()));
      }

      //write access listeners
      removeOurListener();
      for (SNode nodeToDependOn : myNodesToDependentNodes.keySet()) {
        addOurListener(nodeToDependOn.getModel().getModelDescriptor());
      }
      final Set<SNodeProxy> skippedNodes = new HashSet<SNodeProxy>(myNotSkippedNodes);
      if (HelginsPreferencesComponent.getInstance().isUsesDebugHighlighting()) {
        CommandProcessor.instance().invokeLater(new Runnable() {
          public void run() {
            AbstractEditorComponent component = getEditorComponent();
            if (component == null) return;
            for (SNodeProxy skippedNode : skippedNodes) {
              component.getHighlightManager().mark(skippedNode.getNode(), new Color(255, 127, 0, 50),"", NodeTypesComponent_new.this);
            }
          }
        });
      }
    } finally{
      myTypeChecker.clearCurrentTypesComponent();
      myNotSkippedNodes.clear();
      clearEquationManager();
    }
  }

  private boolean isIncrementalMode() {
    return myTypeChecker.isIncrementalMode();
    //return true;
  }

  public void computeTypesForNode(SNode node) {
    if (node == null) return;
    Set<SNode> frontier = new LinkedHashSet<SNode>();
    Set<SNode> newFrontier = new LinkedHashSet<SNode>();
    frontier.add(node);
    while (!(frontier.isEmpty())) {
      for (SNode sNode : frontier) {
        if (myFullyCheckedNodes.contains(sNode)) {
          continue;
        }
        newFrontier.addAll(sNode.getChildren()); //todo perform a check if it's necessary to check children
        if (!myPartlyCheckedNodes.contains(sNode)) {
          myNotSkippedNodes.add(new SNodeProxy(sNode));
          myCurrentFrontier = newFrontier;

          if (isIncrementalMode()) {
            myNodesReadListener.clear();
            NodeReadEventsCaster.setNodesReadListener(myNodesReadListener);
          }
          try {
            applyRulesToNode(sNode);
          } finally{
            if (isIncrementalMode()) {
              NodeReadEventsCaster.removeNodesReadListener();
            }
            myCurrentFrontier = null;
          }
          if (isIncrementalMode()) {
            synchronized(ACCESS_LOCK) {
              myNodesReadListener.setAccessReport(true);
              addDepedentNodes(sNode, new HashSet<SNode>(myNodesReadListener.myAcessedNodes));
              myNodesReadListener.setAccessReport(false);
            }
            myNodesReadListener.clear();
          }
          myPartlyCheckedNodes.add(sNode);
        }
        myFullyCheckedNodes.add(sNode);
      }
      frontier = newFrontier;
      newFrontier = new LinkedHashSet<SNode>();
    }
  }


  private void addDepedentNodes(SNode sNode, Set<SNode> nodesToDependOn) {
    for (SNode nodeToDependOn : nodesToDependOn) {
      if (nodeToDependOn == null) continue;
      WeakSet<SNode> dependentNodes = myNodesToDependentNodes.get(nodeToDependOn);
      if (dependentNodes == null) {
        dependentNodes = new WeakSet<SNode>();
        myNodesToDependentNodes.put(nodeToDependOn, dependentNodes);
      }
      dependentNodes.add(sNode);
    }
  }

  public void addDependcyOnCurrent(SNode node) {
    HashSet<SNode> hashSet = new HashSet<SNode>();
    hashSet.add(myCurrentCheckedNode);
    addDepedentNodes(node, hashSet);
  }

  public Map<SNode, SNode> getMainContext() {
    return myNodesToTypesMap;
  }

  /*package*/ void applyRulesToNode(SNode node) {
    Set<InferenceRule_Runtime> newRules = myTypeChecker.getRulesManager().getInferenceRules(node);
    if (newRules != null) {
      SNode oldCheckedNode = myCurrentCheckedNode;
      myCurrentCheckedNode = node;
      for (InferenceRule_Runtime rule : newRules) {
        // long t1 = System.currentTimeMillis();
        try {
          rule.applyRule(node);
        } catch(Throwable t) {
          LOG.error(t);
        } finally {
          //  Statistics.getStatistic(Statistics.HELGINS).add(rule.getClass().getName(), System.currentTimeMillis() - t1, true);
        }
      }
      myCurrentCheckedNode = oldCheckedNode;
    }
  }

  public void addNodeToFrontier(SNode node) {
    if (myPartlyCheckedNodes.contains(node)) {
      return;
    }
    if (myCurrentFrontier != null) {
      myCurrentFrontier.add(node);
    }
  }

  private void addOurListener(SModelDescriptor sm) {
    if (sm.hasSModelCommandListener(myModelListener)) return;
    sm.addModelCommandListener(myModelListener);
    myModelDescriptorsWithListener.add(sm);
  }

  private void removeOurListener() {
    for (SModelDescriptor sm : myModelDescriptorsWithListener) {
      sm.removeModelCommandListener(myModelListener);
    }
    myModelDescriptorsWithListener.clear();
  }

  public Set getEffects(SNode type) {
    return myEquationManager.getEffects(type);
  }

  public boolean hasEffect(SNode type, Object effect) {
    Set set = getEffects(type);
    return set != null && set.contains(effect);
  }

  public void addEffect(SNode type, Object effect) {
    myEquationManager.addEffect(new NodeWrapper(type), effect);
  }

  public void clearListeners() {
    removeOurListener();
  }

  public SNode getType(SNode node) {
    if (myFullyCheckedNodes.contains(node)) {
      return getRawTypeFromContext(node);
    }
    return null;
  }

  public void markUnchecked(SNode node) {
    invalidateNode(node);
  }

  public SNode getRawTypeFromContext(SNode node) {
    return myNodesToTypesMap.get(node);
  }

  public IErrorReporter getError(SNode node) {
    IErrorReporter iErrorReporter = myNodesToErrorsMap.get(node);
    return iErrorReporter;
  }

  private SNode expandType(SNode node, SModel typesModel) {
    if (node == null) return null;
    IWrapper representator = myEquationManager.getRepresentatorWrapper(new NodeWrapper(node));
    return expandWrapper(representator, typesModel).getNode();
  }

  private IWrapper expandWrapper(IWrapper representator, SModel typesModel) {
    if (representator instanceof MeetWrapper) {
      MeetWrapper meetWrapper = (MeetWrapper) representator;
      MeetType meetType = MeetType.newInstance(typesModel);
      for (IWrapper wrapper : meetWrapper.getArguments()) {
        meetType.addArgument((BaseConcept) expandWrapper(wrapper, typesModel).getNode().getAdapter());
      }
      return new NodeWrapper(meetType.getNode());
    }
    if (representator instanceof JoinWrapper) {
      JoinWrapper joinWrapper = (JoinWrapper) representator;
      JoinType joinType = JoinType.newInstance(typesModel);
      for (IWrapper wrapper : joinWrapper.getArguments()) {
        joinType.addArgument((BaseConcept) expandWrapper(wrapper, typesModel).getNode().getAdapter());
      }
      return new NodeWrapper(joinType.getNode());
    }
    return expandNode(representator, representator, 0, new HashSet<IWrapper>(), typesModel);
  }

  private NodeWrapper expandNode(IWrapper wrapper, IWrapper representator, int depth, Set<IWrapper> variablesMet, SModel typesModel) {
    if (wrapper == null) return null;

    if (wrapper.isVariable()) {
      IWrapper type = myEquationManager.getRepresentatorWrapper(wrapper);
      NodeWrapper wrapper1 = (NodeWrapper) wrapper;
      if (type != representator || depth > 0) {

        if (variablesMet.contains(wrapper)) {
          //recursion!!
          RuntimeErrorType error = RuntimeErrorType.newInstance(typesModel);
          error.setErrorText("recursion types not allowed");
          return new NodeWrapper(error.getNode());
        }
        variablesMet.add(wrapper);
        wrapper1 = expandNode(type, type, 0, variablesMet, typesModel);
        variablesMet.remove(wrapper);
      }
      return wrapper1;
    }
    if (wrapper.isCondition()) {
      RuntimeErrorType error = RuntimeErrorType.newInstance(typesModel);
      error.setErrorText("argument of WHEN CONCRETE block is never concrete");
      ConditionWrapper conditionWrapper = (ConditionWrapper) wrapper;
      error.setNodeModel(conditionWrapper.getNodeModel());
      error.setNodeId(conditionWrapper.getNodeId());
      return new NodeWrapper(error.getNode());
    }
    Map<SNode, SNode> childrenReplacement = new HashMap<SNode, SNode>();
    List<SNode> children = new ArrayList<SNode>(wrapper.getNode().getChildren());
    for (SNode child : children) {
      SNode newChild = expandNode(new NodeWrapper(child), representator, depth+1, variablesMet, typesModel).getNode();
      if (newChild != child) {
        childrenReplacement.put(child, newChild);
      }
    }
    for (SNode child : new ArrayList<SNode>(children)) {
      if (!childrenReplacement.keySet().contains(child)) continue;
      if (child.getParent() == null) {
        RuntimeErrorType error = RuntimeErrorType.newInstance(typesModel);
        error.setErrorText("recursion types not allowed");
        return new NodeWrapper(error.getNode());
      }
      SNode parent = child.getParent();
      assert parent != null;
      String roleInParent = child.getRole_();
      assert roleInParent != null;
      parent.removeChild(child);
      SNode childReplacement = childrenReplacement.get(child);
      childReplacement = CopyUtil.copy(childReplacement, parent.getModel());
      parent.addChild(roleInParent, childReplacement);
    }
    return (NodeWrapper) wrapper;
  }

  public EquationManager getEquationManager() {
    return myEquationManager;
  }

  public Set<Pair<SNode, String>> getNodesWithErrorStrings() {
    return CollectionUtil.map(myNodesToErrorsMap.keySet(), new Mapper<SNode, Pair<SNode, String>>() {
      public Pair<SNode, String> map(SNode sNode) {
        return new Pair<SNode, String>(sNode, myNodesToErrorsMap.get(sNode).reportError());
      }
    });
  }

  public String getNewVarName() {
    String result = myVariableChar + (myVariableIndex == 0 ? "" : ""+ myVariableIndex);
    if (myVariableChar == Z_CHAR) {
      myVariableIndex++;
      myVariableChar = A_CHAR;
    } else {
      myVariableChar++;
    }
    return result;
  }

  private void doInvalidate() {
    Set<SNode> invalidatedNodes = new HashSet<SNode>();
    Set<SNode> newNodesToInvalidate = new HashSet<SNode>();
    Set<SNode> currentNodesToInvalidate = myCurrentNodesToInvalidate;
    while (!currentNodesToInvalidate.isEmpty()) {
      for (SNode nodeToInvalidate : currentNodesToInvalidate) {
        if (invalidatedNodes.contains(nodeToInvalidate)) continue;
        invalidateNode(nodeToInvalidate);
        invalidatedNodes.add(nodeToInvalidate);
        WeakSet<SNode> nodes = myNodesToDependentNodes.get(nodeToInvalidate);
        if (nodes != null) {
          newNodesToInvalidate.addAll(nodes);
        }
      }
      currentNodesToInvalidate = newNodesToInvalidate;
      newNodesToInvalidate = new HashSet<SNode>();
    }
    myCurrentNodesToInvalidate.clear();
  }

  public void markNodeAsAffectedByRule(SNode node, String ruleModel, String ruleId) {
    Set<Pair<String, String>> rulesWhichAffectNodesType = myNodesToRules.get(node);
    if (rulesWhichAffectNodesType == null) {
      rulesWhichAffectNodesType = new HashSet<Pair<String, String>>();
      myNodesToRules.put(node, rulesWhichAffectNodesType);
    }
    rulesWhichAffectNodesType.add(new Pair<String, String>(ruleModel, ruleId));
  }

  public Set<Pair<String, String>> getRulesWhichAffectNodeType(SNode node) {
    Set<Pair<String, String>> set = myNodesToRules.get(node);
    if (set == null) return null;
    return new HashSet<Pair<String, String>>(set);
  }


  private class MyModelListener implements SModelCommandListener {
    public void modelChangedInCommand(List<SModelEvent> events) {
      for (SModelEvent event : events) {
        event.accept(new SModelEventVisitorAdapter() {

          public void visitChildEvent(SModelChildEvent event) {
            markDependentNodesForInvalidation(event.getChild(), myCurrentNodesToInvalidate);
            markDependentNodesForInvalidation(event.getParent(), myCurrentNodesToInvalidate);
          }

          public void visitReferenceEvent(SModelReferenceEvent event) {
            markDependentNodesForInvalidation(event.getReference().getSourceNode(), myCurrentNodesToInvalidate);
          }
        });
      }
    }

    private void markDependentNodesForInvalidation(SNode eventNode, Set<SNode> nodesToInvalidate) {
      Set<SNode> nodes = myNodesToDependentNodes.get(eventNode);
      if (nodes != null) {
        nodesToInvalidate.addAll(nodes);
      }
      nodesToInvalidate.add(eventNode);
    }
  }

  private class MyEventsReadListener implements INodesReadListener {
    private Set<SNode> myAcessedNodes = new HashSet<SNode>();
    private boolean myIsSetAccessReport = false;

    public void setAccessReport(boolean accessReport) {
      myIsSetAccessReport = accessReport;
    }

    private void reportAccess() {
      if (myIsSetAccessReport) {
        new Throwable().printStackTrace();
      }
    }

    public void nodeChildReadAccess(SNode node, String childRole, SNode child) {
      synchronized(ACCESS_LOCK) {
        reportAccess();
        myAcessedNodes.add(node);
        myAcessedNodes.add(child);
      }
    }

    public void nodePropertyReadAccess(SNode node, String propertyName, String value) {
      synchronized(ACCESS_LOCK) {
        reportAccess();
        myAcessedNodes.add(node);
      }
    }

    public void nodeReferentReadAccess(SNode node, String referentRole, SNode referent) {
      synchronized(ACCESS_LOCK) {
        reportAccess();
        myAcessedNodes.add(node);
        myAcessedNodes.add(referent);
      }
    }

    public void nodeUnclassifiedReadAccess(SNode node) {
      synchronized(ACCESS_LOCK) {
        reportAccess();
        myAcessedNodes.add(node);
      }
    }

    public void clear() {
      synchronized(ACCESS_LOCK) {
        reportAccess();
        myAcessedNodes.clear();
      }
    }
  }
}
