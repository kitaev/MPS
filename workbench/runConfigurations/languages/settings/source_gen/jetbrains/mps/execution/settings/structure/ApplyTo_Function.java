package jetbrains.mps.execution.settings.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ApplyTo_Function extends EditorOperationDeclaration {
  public static final String concept = "jetbrains.mps.execution.settings.structure.ApplyTo_Function";

  public ApplyTo_Function(SNode node) {
    super(node);
  }

  public static ApplyTo_Function newInstance(SModel sm, boolean init) {
    return (ApplyTo_Function) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.ApplyTo_Function", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ApplyTo_Function newInstance(SModel sm) {
    return ApplyTo_Function.newInstance(sm, false);
  }
}
