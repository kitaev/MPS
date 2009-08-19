package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.BaseGeneratedRefactoring;
import jetbrains.mps.lang.core.scripts.MoveNodes;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseModelDescriptorComponent;
import jetbrains.mps.util.Condition;

public class MoveConcepts extends BaseGeneratedRefactoring {
  public static final String targetModel = "targetModel";
  public static final String sourceModel = "sourceModel";

  public MoveConcepts() {
    this.addTransientParameter("targetModel");
    this.addTransientParameter("sourceModel");
  }

  public String getUserFriendlyName() {
    return "Move Concepts";
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.class;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    if (ListSequence.fromList(refactoringContext.getSelectedNodes()).isEmpty()) {
      return false;
    }
    SModel model = SNodeOperations.getModel(ListSequence.fromList(refactoringContext.getSelectedNodes()).first());
    for (SNode node : refactoringContext.getSelectedNodes()) {
      if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
        return false;
      }
      if (SNodeOperations.getModel(node) != model) {
        return false;
      }
    }
    return true;
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"));
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    SearchResults searchResults = new SearchResults();
    for (SNode selNode : ListSequence.fromList(refactoringContext.getSelectedNodes())) {
      searchResults.addAll(FindUtils.getSearchResults(new EmptyProgressIndicator(), selNode, GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder"));
    }
    return searchResults;
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    List<SNode> nodes = (List<SNode>)refactoringContext.getSelectedNodes();
    refactoringContext.setParameter("sourceModel", SNodeOperations.getModel(ListSequence.fromList(refactoringContext.getSelectedNodes()).first()).getModelDescriptor());
    Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
    Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
    List<SNode> editors = new ArrayList<SNode>();
    List<SNode> behaviors = new ArrayList<SNode>();
    List<SNode> constraints = new ArrayList<SNode>();
    List<SNode> dataFlows = new ArrayList<SNode>();
    // collecting editors:
    SModelDescriptor editorModelDescriptor = sourceLanguage.getEditorModelDescriptor();
    if (editorModelDescriptor != null) {
      for (SNode node : nodes) {
        SNode editor = RefUtil.findEditorDeclaration(editorModelDescriptor.getSModel(), node);
        if (editor != null) {
          ListSequence.fromList(editors).addElement(editor);
        }
      }
    }
    // collecting behaviors:
    SModelDescriptor behaviorModelDescriptor = sourceLanguage.getBehaviorModelDescriptor();
    if (behaviorModelDescriptor != null) {
      for (SNode node : nodes) {
        SNode behavior = RefUtil.findBehaviorDeclaration(behaviorModelDescriptor.getSModel(), node);
        if (behavior != null) {
          ListSequence.fromList(behaviors).addElement(behavior);
        }
      }
    }
    // collecting constraints:
    SModelDescriptor constraintsModelDescriptor = sourceLanguage.getConstraintsModelDescriptor();
    if (constraintsModelDescriptor != null) {
      for (SNode node : nodes) {
        SNode constraint = RefUtil.findConstraintsDeclaration(constraintsModelDescriptor.getSModel(), node);
        if (constraint != null) {
          ListSequence.fromList(constraints).addElement(constraint);
        }
      }
    }
    // collecting data flow:
    SModelDescriptor dataflowModelDescriptor = sourceLanguage.getDataFlowModelDescriptor();
    if (dataflowModelDescriptor != null) {
      for (SNode node : nodes) {
        SNode dataFlow = RefUtil.findDataFlowDeclaration(dataflowModelDescriptor.getSModel(), node);
        if (dataFlow != null) {
          ListSequence.fromList(dataFlows).addElement(dataFlow);
        }
      }
    }
    // refactoring itself
    for (SNode node : nodes) {
      refactoringContext.changeFeatureName(node, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModelFqName().toString() + "." + SPropertyOperations.getString(node, "name"), SPropertyOperations.getString(node, "name"));
    }
    refactoringContext.moveNodesToModel(nodes, ((SModelDescriptor)refactoringContext.getParameter("targetModel")).getSModel());
    if (ListSequence.fromList(editors).isNotEmpty()) {
      SModelDescriptor targetEditorModelDescriptor = targetLanguage.getEditorModelDescriptor();
      if (targetEditorModelDescriptor == null) {
        targetEditorModelDescriptor = LanguageAspect.EDITOR.createNew(targetLanguage);
      }
      SModel editorModel = targetEditorModelDescriptor.getSModel();
      refactoringContext.moveNodesToModel(editors, editorModel);
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(editorModel);
    }
    if (ListSequence.fromList(behaviors).isNotEmpty()) {
      SModelDescriptor targetBehaviorModelDescriptor = targetLanguage.getBehaviorModelDescriptor();
      if (targetBehaviorModelDescriptor == null) {
        targetBehaviorModelDescriptor = LanguageAspect.BEHAVIOR.createNew(targetLanguage);
      }
      SModel behaviorModel = targetBehaviorModelDescriptor.getSModel();
      refactoringContext.moveNodesToModel(behaviors, behaviorModel);
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(behaviorModel);
    }
    if (ListSequence.fromList(constraints).isNotEmpty()) {
      SModelDescriptor targetConstraintsModelDescriptor = targetLanguage.getConstraintsModelDescriptor();
      if (targetConstraintsModelDescriptor == null) {
        targetConstraintsModelDescriptor = LanguageAspect.CONSTRAINTS.createNew(targetLanguage);
      }
      SModel constraintsModel = targetConstraintsModelDescriptor.getSModel();
      refactoringContext.moveNodesToModel(constraints, constraintsModel);
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(constraintsModel);
    }
    if (ListSequence.fromList(dataFlows).isNotEmpty()) {
      SModelDescriptor targetDataFlowModelDescriptor = targetLanguage.getDataFlowModelDescriptor();
      if (targetDataFlowModelDescriptor == null) {
        targetDataFlowModelDescriptor = LanguageAspect.DATA_FLOW.createNew(targetLanguage);
      }
      SModel dataFlowModel = targetDataFlowModelDescriptor.getSModel();
      refactoringContext.moveNodesToModel(dataFlows, dataFlowModel);
      refactoringContext.computeCaches();
      refactoringContext.updateModelWithMaps(dataFlowModel);
    }
    // todo: move other concept-related aspect stuff
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    Map<IModule, List<SModel>> result = MapSequence.fromMap(new LinkedHashMap<IModule, List<SModel>>(16, (float)0.75, false));
    Language sourceLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("sourceModel")));
    if (sourceLanguage != null) {
      MapSequence.fromMap(result).putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), sourceLanguage));
    }
    Language targetLanguage = Language.getLanguageFor(((SModelDescriptor)refactoringContext.getParameter("targetModel")));
    if (targetLanguage != null) {
      MapSequence.fromMap(result).putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), targetLanguage));
    }
    return result;
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public List<IChooseComponent> getChooseComponents(final RefactoringContext refactoringContext) {
    List<IChooseComponent> components = ListSequence.fromList(new ArrayList<IChooseComponent>());
    {
      IChooseComponent<SModelDescriptor> chooseComponent;
      chooseComponent = new ChooseModelDescriptorComponent(refactoringContext.getCurrentOperationContext());
      chooseComponent.setCondition(new MoveConcepts.My_targetModel_Condition(refactoringContext));
      chooseComponent.setPropertyName("targetModel");
      chooseComponent.setCaption("choose target model");
      chooseComponent.initComponent();
      ListSequence.fromList(components).addElement(chooseComponent);
    }
    return components;
  }

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }

  public static class My_targetModel_Condition implements Condition<SModelDescriptor> {
    private RefactoringContext myRefactoringContext;

    public My_targetModel_Condition(RefactoringContext refactoringContext) {
      this.myRefactoringContext = refactoringContext;
    }

    public boolean met(SModelDescriptor argument) {
      return this.met_internal(argument, this.myRefactoringContext);
    }

    public boolean met_internal(SModelDescriptor argument, RefactoringContext refactoringContext) {
      return Language.getModelAspect(argument) == LanguageAspect.STRUCTURE;
    }
  }
}
