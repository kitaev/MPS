package jetbrains.mps.lang.structure.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.BaseGeneratedRefactoring;
import jetbrains.mps.lang.core.scripts.Rename;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.ChooseStringComponent;

public class RenameLink extends BaseGeneratedRefactoring {
  public static final String newName = "newName";

  public RenameLink() {
    this.addTransientParameter("newName");
  }

  public String getUserFriendlyName() {
    return "Rename Link";
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public Class getOverridenRefactoringClass() {
    return Rename.class;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    SNode node = refactoringContext.getSelectedNode();
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.LinkDeclaration");
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.LinkDeclaration"));
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(new EmptyProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.LinkInstances_Finder", "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    SNode linkDeclaration = SNodeOperations.cast(refactoringContext.getSelectedNode(), "jetbrains.mps.lang.structure.structure.LinkDeclaration");
    SNode concept = SNodeOperations.getAncestor(linkDeclaration, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
    refactoringContext.changeFeatureName(linkDeclaration, SNodeOperations.getModel(concept).getSModelFqName() + "." + SPropertyOperations.getString(concept, "name"), ((String)refactoringContext.getParameter("newName")));
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    Map<IModule, List<SModel>> result = MapSequence.fromMap(new LinkedHashMap<IModule, List<SModel>>(16, (float)0.75, false));
    Language sourceLanguage = Language.getLanguageFor(SNodeOperations.getModel(refactoringContext.getSelectedNode()).getModelDescriptor());
    if (sourceLanguage != null) {
      MapSequence.fromMap(result).putAll(RefactoringUtil.getLanguageAndItsExtendingLanguageModels(refactoringContext.getSelectedMPSProject(), sourceLanguage));
    }
    return result;
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public String newName_initialValue(final RefactoringContext refactoringContext) {
    SNode node = refactoringContext.getSelectedNode();
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.LinkDeclaration"))) {
      return "";
    }
    return SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.LinkDeclaration"), "role");
  }

  public List<IChooseComponent> getChooseComponents(final RefactoringContext refactoringContext) {
    List<IChooseComponent> components = ListSequence.fromList(new ArrayList<IChooseComponent>());
    {
      IChooseComponent<String> chooseComponent;
      chooseComponent = new ChooseStringComponent();
      chooseComponent.setPropertyName("newName");
      chooseComponent.setCaption("enter new name");
      chooseComponent.initComponent();
      chooseComponent.setInitialValue(RenameLink.this.newName_initialValue(refactoringContext));
      ListSequence.fromList(components).addElement(chooseComponent);
    }
    return components;
  }

  public static String getKeyStroke_static() {
    return Rename.getKeyStroke_static();
  }
}
