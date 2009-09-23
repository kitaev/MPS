package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RefactoringParameter extends BaseVariableDeclaration {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.RefactoringParameter";

  public RefactoringParameter(SNode node) {
    super(node);
  }

  public static RefactoringParameter newInstance(SModel sm, boolean init) {
    return (RefactoringParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.RefactoringParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RefactoringParameter newInstance(SModel sm) {
    return RefactoringParameter.newInstance(sm, false);
  }
}
