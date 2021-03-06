package jetbrains.mps.baseLanguage.refactorings;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.BaseRefactoring;
import jetbrains.mps.lang.core.refactorings.Rename;
import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MethodRefactoringUtils;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.refactoring.framework.paramchooser.mps.MPSChooserFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;

public class RenameMethod extends BaseRefactoring {
  public RenameMethod() {
    this.addTransientParameter("newName");
    this.addTransientParameter("refactorOverriding");
  }

  public String getUserFriendlyName() {
    return "Rename Method";
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public Class getOverridenRefactoringClass() {
    return Rename.class;
  }

  public IRefactoringTarget getRefactoringTarget() {
    return new RenameMethod_Target();
  }

  public boolean init(final RefactoringContext refactoringContext) {
    final Wrappers._T<List<SNode>> overriding = new Wrappers._T<List<SNode>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        overriding.value = MethodRefactoringUtils.findOverridingMethods(RenameUtil.getMethodDeclaration(refactoringContext.getSelectedNode()), new EmptyProgressIndicator());
      }
    });
    return (ListSequence.fromList(overriding.value).isEmpty() ?
      RenameMethod.this.ask(refactoringContext, MPSChooserFactory.createStringChooser(refactoringContext, "newName", new RenameMethod_newName_Settings(refactoringContext))) :
      RenameMethod.this.ask(refactoringContext, MPSChooserFactory.createStringChooser(refactoringContext, "newName", new RenameMethod_newName_Settings(refactoringContext)), MPSChooserFactory.createBooleanChooser(refactoringContext, "refactorOverriding", new RenameMethod_refactorOverriding_Settings(refactoringContext)))
    );
  }

  public void refactor(final RefactoringContext refactoringContext) {
    SNode method = RenameUtil.getMethodDeclaration(refactoringContext.getSelectedNode());

    List<SNode> overriding = MethodRefactoringUtils.findOverridingMethods(method, new EmptyProgressIndicator());
    if (ListSequence.fromList(overriding).isNotEmpty() && ((Boolean) refactoringContext.getParameter("refactorOverriding"))) {
      for (SNode node : ListSequence.fromList(overriding)) {
        SPropertyOperations.set(node, "name", ((String) refactoringContext.getParameter("newName")));
      }
    }
    SPropertyOperations.set(method, "name", ((String) refactoringContext.getParameter("newName")));
  }

  public List<SModel> getModelsToGenerate(final RefactoringContext refactoringContext) {
    return (List<SModel>) refactoringContext.getModelsFromUsages(refactoringContext.getSelectedModel().getSModel());
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    SNode method = RenameUtil.getMethodDeclaration(refactoringContext.getSelectedNode());
    return (((Boolean) refactoringContext.getParameter("refactorOverriding")) == null || !(((Boolean) refactoringContext.getParameter("refactorOverriding"))) ?
      FindUtils.getSearchResults(new EmptyProgressIndicator(), method, GlobalScope.getInstance(), "jetbrains.mps.baseLanguage.findUsages.ExactMethodUsages_Finder") :
      FindUtils.getSearchResults(new EmptyProgressIndicator(), method, GlobalScope.getInstance(), "jetbrains.mps.baseLanguage.findUsages.BaseMethodUsages_Finder")
    );
  }

  public static String getKeyStroke_static() {
    return Rename.getKeyStroke_static();
  }
}
