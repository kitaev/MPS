package jetbrains.mps.core.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.HashMap;
import java.util.ArrayList;

public class SafeDelete extends AbstractLoggableRefactoring {

  private Set<String> myTransientParameters = new HashSet<String>();

  public SafeDelete() {
  }

  public static String getKeyStroke_static() {
    return "alt DELETE";
  }

  public static Class getClass_static() {
    return SafeDelete.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil_new.isAssignableConcept(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(node))), "jetbrains.mps.core.structure.BaseConcept")) {
      return true;
    } else
    {
      return false;
    }
  }


  public String getUserFriendlyName() {
    return "Safe Delete Node";
  }

  public Set<String> getTransientParameters() {
    return new HashSet<String>(this.myTransientParameters);
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.core.structure.BaseConcept";
  }

  public Class getOverridenRefactoringClass() {
    return null;
  }

  public boolean isApplicable(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      if (node == null) {
        return false;
      }
      return true;
    }
  }

  public boolean isApplicableToModel(SModelDescriptor modelDescriptor) {
    return true;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return true;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(ActionContext actionContext, RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(actionContext.createProgressIndicator(), actionContext.getNode(), GlobalScope.getInstance(), "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(ActionContext actionContext, RefactoringContext refactoringContext) {
    {
      SNode node = actionContext.getNode();
      SNodeOperations.deleteNode(node);
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new HashMap<IModule, List<SModel>>();
  }

  public List<SModel> getModelsToUpdate(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new ArrayList<SModel>();
  }

  public void updateModel(SModel model, RefactoringContext refactoringContext) {
  }

  public List<SNode> getNodesToOpen(ActionContext actionContext, RefactoringContext refactoringContext) {
    return new ArrayList<SNode>();
  }

  public boolean doesUpdateModel() {
    return false;
  }

  public boolean askForInfo(ActionContext actionContext, RefactoringContext refactoringContext) {
    return this.isApplicable(actionContext, refactoringContext);
  }

}
