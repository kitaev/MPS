package jetbrains.mps.bootstrap.structureLanguage.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
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
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class RenameProperty extends AbstractLoggableRefactoring {
  public static final String newName = "newName";

  public String getUserFriendlyName() {
    return "Rename Property";
  }

  public String getSourceId() {
    return "jetbrains.mps.bootstrap.structureLanguage.scripts#1198764756152";
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      return SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration");
    }
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode propertyDeclaration = (SNode)actionContext.getNode();
      SNode concept = SNodeOperations.getAncestor(propertyDeclaration, "jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration", false, false);
      refactoringContext.changeFeatureName(propertyDeclaration, SNodeOperations.getModel(concept) + "" + SPropertyOperations.getString(concept, "name"), ((String)refactoringContext.getParameter("newName")));
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      Map<IModule, List<SModel>> result = new HashMap<IModule, List<SModel>>();
      SModel model = actionContext.getNode().getModel();
      Language language = Language.getLanguageFor(model.getModelDescriptor());
      if(language != null) {
        List<SModel> aspectList = SequenceOperations.toList(SequenceOperations.select(((List<SModelDescriptor>)new ArrayList<SModelDescriptor>(language.getAspectModelDescriptors())), new zSelector6(null, null)));
        result.put(language, aspectList);
      }
      return result;
    }
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public String newName_initialValue(ActionContext actionContext) {
    SNode node = actionContext.getNode();
    if(!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration"))) {
      return "";
    }
    return SPropertyOperations.getString(node, "name");
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    boolean result = false;
    List<IChooseComponent> components = new ArrayList<IChooseComponent>();
    {
      IChooseComponent<String> chooseComponent;
      chooseComponent = new ChooseStringComponent("enter new name", "newName");
      chooseComponent.setInitialValue(this.newName_initialValue(actionContext));
      components.add(chooseComponent);
    }
    ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, actionContext, refactoringContext, components);
    dialog.showDialog();
    result = dialog.getResult();
    return result;
  }

}
