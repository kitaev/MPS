package jetbrains.mps.ide.resolve;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCheckerAdapter;
import java.util.Set;
import jetbrains.mps.smodel.SNode;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.typesystem.inference.TypeRecalculatedListener;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.event.SModelEventVisitor;
import jetbrains.mps.smodel.event.SModelEventVisitorAdapter;
import jetbrains.mps.smodel.event.SModelChildEvent;
import jetbrains.mps.smodel.event.SModelReferenceEvent;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import jetbrains.mps.ide.ThreadUtils;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.search.MethodResolveUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.IMethodCall_Behavior;
import jetbrains.mps.nodeEditor.EditorComponent;

public class MethodDeclarationsFixer extends EditorCheckerAdapter {
  private static boolean DISABLED = false;

  private Set<SNode> myCheckedMethodCalls = new HashSet<SNode>();
  private Map<SNode, Set<SNode>> myMethodDeclsToCheckedMethodCalls = new HashMap<SNode, Set<SNode>>();
  private Map<Pair<String, String>, Set<SNode>> myMethodConceptsAndNamesToCheckedMethodCalls = new HashMap<Pair<String, String>, Set<SNode>>();
  private Map<SNode, SNode> myParametersToCheckedMethodCalls = new HashMap<SNode, SNode>();
  private Map<SNode, SNode> myMethodCallsToSetDecls = new HashMap<SNode, SNode>();
  private Set<SNode> myCurrentExpressionsWithChangedTypes = new HashSet<SNode>();
  private final Object myRecalculatedTypesLock = new Object();
  private TypeRecalculatedListener myTypeRecalculatedListener = new TypeRecalculatedListener() {
    public void typeWillBeRecalculatedForTerm(SNode term) {
      synchronized (myRecalculatedTypesLock) {
        myCurrentExpressionsWithChangedTypes.add(term);
      }
    }
  };

  public MethodDeclarationsFixer() {
  }

  public void init() {
    TypeChecker.getInstance().addTypeRecalculatedListener(myTypeRecalculatedListener);
  }

  public void dispose() {
    TypeChecker.getInstance().removeTypeRecalculatedListener(myTypeRecalculatedListener);
  }

  public Set<EditorMessage> createMessages(SNode rootNode, IOperationContext operationContext, List<SModelEvent> events, boolean wasCheckedOnce, final EditorContext editorContext) {
    if (DISABLED) {
      return new HashSet<EditorMessage>();
    }
    SModel model = SNodeOperations.getModel(rootNode);
    if (model.getModelDescriptor() == null || model.isTransient() || model.isDisposed()) {
      return new HashSet<EditorMessage>(0);
    }
    final Map<SNode, SNode> reResolvedTargets = new HashMap<SNode, SNode>();
    if (!(wasCheckedOnce)) {
      for (SNode methodCall : SNodeOperations.getDescendants(rootNode, "jetbrains.mps.baseLanguage.structure.IMethodCall", false, new String[]{})) {
        testAndFixMethodCall(methodCall, reResolvedTargets);
      }
    } else {
      Set<SNode> expressionsWithChangedTypes;
      synchronized (myRecalculatedTypesLock) {
        expressionsWithChangedTypes = new HashSet<SNode>(myCurrentExpressionsWithChangedTypes);
        myCurrentExpressionsWithChangedTypes.clear();
      }
      SModelEventVisitor visitor = new SModelEventVisitorAdapter() {
        public void visitChildEvent(SModelChildEvent event) {
          SNode child = event.getChild();
          if (event.isAdded()) {
            nodeAdded(child, reResolvedTargets);
          } else {
            nodeRemoved(child, event.getParent(), reResolvedTargets);
          }
        }

        public void visitReferenceEvent(SModelReferenceEvent event) {
          SReference reference = event.getReference();
          SNode sourceNode = reference.getSourceNode();
          if (SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.IMethodCall") && "baseMethodDeclaration".equals(reference.getRole())) {
            methodCallDeclarationChanged(SNodeOperations.cast(sourceNode, "jetbrains.mps.baseLanguage.structure.IMethodCall"), reResolvedTargets);
          }
        }

        public void visitPropertyEvent(SModelPropertyEvent event) {
          SNode node = event.getNode();
          SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
          if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") && "name".equals(event.getPropertyName())) {
            methodDeclarationNameChanged(node, reResolvedTargets);
            methodDeclarationSignatureChanged(node, reResolvedTargets);
          }
        }
      };
      for (SModelEvent event : events) {
        if (event.getAffectedRoot() != rootNode) {
          continue;
        }
        event.accept(visitor);
      }
      for (SNode expressionWithChangedType : expressionsWithChangedTypes) {
        expressionTypeChanged(expressionWithChangedType, reResolvedTargets);
      }
    }
    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        if (reResolvedTargets.isEmpty()) {
          return;
        }
        Project p = (editorContext != null && editorContext.getOperationContext() != null ?
          editorContext.getOperationContext().getProject() :
          null
        );
        if (p == null) {
          return;
        }

        ModelAccess.instance().runUndoTransparentCommand(new Runnable() {
          public void run() {
            for (SNode methodCall : reResolvedTargets.keySet()) {
              SNode referent = reResolvedTargets.get(methodCall);
              if (referent != null && !(referent.shouldHaveBeenDisposed())) {
                SLinkOperations.setTarget(methodCall, "baseMethodDeclaration", referent, false);
              }
            }
          }
        }, p);
      }
    });
    return new HashSet<EditorMessage>();
  }

  public void clearCaches() {
    myCheckedMethodCalls.clear();
    myMethodDeclsToCheckedMethodCalls.clear();
    myMethodConceptsAndNamesToCheckedMethodCalls.clear();
    myParametersToCheckedMethodCalls.clear();
    myMethodCallsToSetDecls.clear();
  }

  public void testAndFixMethodCall(SNode methodCallNode, Map<SNode, SNode> reResolvedTargets) {
    SNode baseMethodDeclaration = SLinkOperations.getTarget(methodCallNode, "baseMethodDeclaration", false);
    String methodName;
    if (baseMethodDeclaration == null) {
      if (!(SNodeOperations.isInstanceOf(methodCallNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"))) {
        return;
      }
      SNode classifier = SLinkOperations.getTarget(SNodeOperations.cast(methodCallNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "classifier", false);
      if (classifier == null) {
        return;
      }
      methodName = SPropertyOperations.getString(classifier, "name");
    } else {
      methodName = SPropertyOperations.getString(baseMethodDeclaration, "name");
    }
    List<SNode> actualArgs = SLinkOperations.getTargets(methodCallNode, "actualArgument", true);
    List<SNode> candidates = getCandidates(methodCallNode, methodName);
    if (candidates.isEmpty()) {
      return;
    }
    SNode newTarget = null;
    boolean good;
    Map<SNode, SNode> typeByTypeVar = getTypeByTypeVar(methodCallNode);
    jetbrains.mps.util.Pair<List<SNode>, Boolean> parmCountPair = MethodResolveUtil.selectByVisibilityReportNoGoodMethodNode(candidates, methodCallNode);
    List<SNode> methodDeclarationsGoodParams = parmCountPair.o1;
    if (methodDeclarationsGoodParams.size() == 1) {
      newTarget = ListSequence.fromList(methodDeclarationsGoodParams).first();
      good = parmCountPair.o2;
    } else {
      parmCountPair = MethodResolveUtil.selectByParmCountReportNoGoodMethodNode(methodDeclarationsGoodParams, actualArgs);
      methodDeclarationsGoodParams = parmCountPair.o1;
      if (methodDeclarationsGoodParams.size() == 1) {
        newTarget = ListSequence.fromList(methodDeclarationsGoodParams).first();
        good = parmCountPair.o2;
      } else {
        jetbrains.mps.util.Pair<SNode, Boolean> parmTypesPair = MethodResolveUtil.chooseByParameterTypeReportNoGoodMethodNode(methodDeclarationsGoodParams, actualArgs, typeByTypeVar);
        newTarget = parmTypesPair.o1;
        good = parmTypesPair.o2;
      }
    }
    if (newTarget != null) {
      if (baseMethodDeclaration == null || (good && newTarget != baseMethodDeclaration)) {
        reResolvedTargets.put(methodCallNode, newTarget);
      }
      myMethodCallsToSetDecls.put(methodCallNode, newTarget);
      myCheckedMethodCalls.add(methodCallNode);
      for (SNode actualArgument : SLinkOperations.getTargets(methodCallNode, "actualArgument", true)) {
        myParametersToCheckedMethodCalls.put(actualArgument, methodCallNode);
      }
      SNode newTargetNode = newTarget;
      Set<SNode> nodeSet = myMethodDeclsToCheckedMethodCalls.get(newTargetNode);
      if (nodeSet == null) {
        nodeSet = new HashSet<SNode>();
        myMethodDeclsToCheckedMethodCalls.put(newTargetNode, nodeSet);
      }
      nodeSet.add(methodCallNode);
      Pair<String, String> key = new Pair<String, String>(newTarget.getConceptFqName(), methodName);
      Set<SNode> nodesByNameAndConcept = myMethodConceptsAndNamesToCheckedMethodCalls.get(key);
      if (nodesByNameAndConcept == null) {
        nodesByNameAndConcept = new HashSet<SNode>();
        myMethodConceptsAndNamesToCheckedMethodCalls.put(key, nodesByNameAndConcept);
      }
      nodesByNameAndConcept.add(methodCallNode);
    }
  }

  private Map<SNode, SNode> getTypeByTypeVar(SNode methodCall) {
    return IMethodCall_Behavior.call_getTypesByTypeVars_851115533308208851(methodCall);
  }

  public List<SNode> getCandidates(SNode methodCall, String methodName) {
    return IMethodCall_Behavior.call_getAvailableMethodDeclarations_5776618742611315379(methodCall, methodName);
  }

  private void methodDeclarationNameChanged(SNode method, Map<SNode, SNode> resolveTargets) {
    Set<SNode> methodCalls = myMethodDeclsToCheckedMethodCalls.get(method);
    if (methodCalls != null) {
      for (SNode methodCall : methodCalls) {
        if (methodCall != null) {
          testAndFixMethodCall(methodCall, resolveTargets);
        }
      }
    }
  }

  private void methodDeclarationSignatureChanged(SNode method, Map<SNode, SNode> resolveTargets) {
    Set<SNode> methodCalls = myMethodConceptsAndNamesToCheckedMethodCalls.get(new Pair<String, String>(method.getConceptFqName(), method.getName()));
    if (methodCalls != null) {
      for (SNode methodCall : methodCalls) {
        if (methodCall != null) {
          testAndFixMethodCall(methodCall, resolveTargets);
        }
      }
    }
  }

  private void methodCallDeclarationChanged(SNode methodCall, Map<SNode, SNode> resolveTargets) {
    if (myCheckedMethodCalls.contains(methodCall) && SLinkOperations.getTarget(methodCall, "baseMethodDeclaration", false) == myMethodCallsToSetDecls.get(methodCall)) {
      return;
    }
    testAndFixMethodCall(methodCall, resolveTargets);
  }

  private void expressionTypeChanged(SNode expression, Map<SNode, SNode> resolveTargets) {
    SNode methodCall = myParametersToCheckedMethodCalls.get(expression);
    if (methodCall != null) {
      testAndFixMethodCall(methodCall, resolveTargets);
    }
  }

  private void nodeAdded(SNode child, Map<SNode, SNode> resolveTargets) {
    for (SNode methodCall : SNodeOperations.getDescendants(child, "jetbrains.mps.baseLanguage.structure.IMethodCall", true, new String[]{})) {
      testAndFixMethodCall(methodCall, resolveTargets);
    }
    SNode parent = SNodeOperations.getParent(child);
    if (myCheckedMethodCalls.contains(parent)) {
      SNode p = SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.IMethodCall");
      myParametersToCheckedMethodCalls.put(child, p);
      testAndFixMethodCall(p, resolveTargets);
    }
    SNode formalParam = SNodeOperations.getAncestor(child, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration", true, false);
    if ((SNodeOperations.getParent(formalParam) != null)) {
      methodDeclarationSignatureChanged(SNodeOperations.getParent(formalParam), resolveTargets);
    }
  }

  private void nodeRemoved(SNode child, SNode formerParent, Map<SNode, SNode> resolveTargets) {
    for (SNode methodCall : SNodeOperations.getDescendants(child, "jetbrains.mps.baseLanguage.structure.IMethodCall", true, new String[]{})) {
    }
    if (myCheckedMethodCalls.contains(formerParent)) {
      myParametersToCheckedMethodCalls.remove(child);
      testAndFixMethodCall(SNodeOperations.cast(formerParent, "jetbrains.mps.baseLanguage.structure.IMethodCall"), resolveTargets);
    }
    if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")) {
      methodDeclarationSignatureChanged(formerParent, resolveTargets);
    } else {
      SNode formalParam = SNodeOperations.getAncestor(formerParent, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration", true, false);
      if ((SNodeOperations.getParent(formalParam) != null)) {
        methodDeclarationSignatureChanged(SNodeOperations.getParent(formalParam), resolveTargets);
      }
    }
  }

  @Override
  public void clear(SNode node, EditorComponent editor) {
    clearCaches();
  }
}
