package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.core.scripts.MoveNodes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.IChooseComponentPart;
import jetbrains.mps.refactoring.framework.HierarchicalChooseNodeComponent;
import jetbrains.mps.refactoring.framework.ConceptAncestorsProvider;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseComponentWithName;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class MovePropertyUp extends AbstractLoggableRefactoring {
  public static final String targetConcept = "targetConcept";

  public static String getKeyStroke_static() {
    return MoveNodes.getKeyStroke_static();
  }

  public static Class getClass_static() {
    return MovePropertyUp.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if(SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration")) {
      return true;
    } else
    {
      return MoveNodes.isApplicableWRTConcept_static(node);
    }
  }


  public String getUserFriendlyName() {
    return "Move Property Up (under construction)";
  }

  public String getKeyStroke() {
    return MovePropertyUp.getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return MovePropertyUp.isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration";
  }

  public Class getOverridenRefactoringClass() {
    return MoveNodes.getClass_static();
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      if(!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration"))) {
        return false;
      }
      SNode concept = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
      if(concept == null) {
        return false;
      }
      return ((SNode)refactoringContext.getParameter("targetConcept")) != concept && AbstractConceptDeclaration_Behavior.call_isAssignableFrom_1198080700262(((SNode)refactoringContext.getParameter("targetConcept")), concept);
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode linkDeclaration = (SNode)actionContext.getNode();
      refactoringContext.moveNodeToNode(linkDeclaration, linkDeclaration.getRole_(), ((SNode)refactoringContext.getParameter("targetConcept")));
      refactoringContext.changeFeatureName(linkDeclaration, SNodeOperations.getModel(((SNode)refactoringContext.getParameter("targetConcept"))) + "." + SPropertyOperations.getString(((SNode)refactoringContext.getParameter("targetConcept")), "name"), SPropertyOperations.getString(linkDeclaration, "role"));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      SModel model = actionContext.getNode().getModel();
      SModel targetModel = SNodeOperations.getModel(((SNode)refactoringContext.getParameter("targetConcept")));
      Language language = Language.getLanguageFor(model.getModelDescriptor());
      Language targetLanguage = Language.getLanguageFor(targetModel.getModelDescriptor());
      if(language != null) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(language.getAspectModelDescriptors())), new zSelector7(null, null)));
        result.put(language, aspectList);
      }
      if(targetLanguage != null && targetLanguage != language) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(targetLanguage.getAspectModelDescriptors())), new zSelector8(null, null)));
        result.put(targetLanguage, aspectList);
      }
      return result;
    }
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public IChooseComponentPart<SNode> targetConcept_componentCreator(ActionContext actionContext) {
    SNode node = actionContext.getNode();
    SNode abstractConceptDeclaration = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
    return new HierarchicalChooseNodeComponent("choose target concept", "targetConcept", actionContext, new ConceptAncestorsProvider(), abstractConceptDeclaration);
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      boolean result = false;
      List<IChooseComponent> components = new ArrayList<IChooseComponent>();
      {
        IChooseComponent<SNode> chooseComponent;
        chooseComponent = new ChooseComponentWithName<SNode>("targetConcept", this.targetConcept_componentCreator(actionContext));
        components.add(chooseComponent);
      }
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }

}
