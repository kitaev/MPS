package jetbrains.mps.baseLanguage.refactorings;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.paramchooser.mps.IChooserSettings;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MoveStaticField_destination_Settings extends IChooserSettings.BaseChooserSettings<SNode> {
  private RefactoringContext myRefactoringContext;

  public MoveStaticField_destination_Settings(final RefactoringContext context) {
    super("Select classifier to move");
    this.myRefactoringContext = context;
  }

  public boolean met(final SNode entity) {
    return SNodeOperations.isInstanceOf(entity, "jetbrains.mps.baseLanguage.structure.Classifier");
  }
}
