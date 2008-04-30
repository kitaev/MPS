package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UpdateModelByDefaultOperation extends Statement {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.UpdateModelByDefaultOperation";

  public UpdateModelByDefaultOperation(SNode node) {
    super(node);
  }

  public static UpdateModelByDefaultOperation newInstance(SModel sm, boolean init) {
    return (UpdateModelByDefaultOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.UpdateModelByDefaultOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UpdateModelByDefaultOperation newInstance(SModel sm) {
    return UpdateModelByDefaultOperation.newInstance(sm, false);
  }

}
