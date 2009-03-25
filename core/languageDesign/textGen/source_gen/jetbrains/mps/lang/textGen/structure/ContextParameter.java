package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContextParameter extends jetbrains.mps.lang.textGen.structure.AbstractTextGenParameter {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.ContextParameter";

  public ContextParameter(SNode node) {
    super(node);
  }

  public static ContextParameter newInstance(SModel sm, boolean init) {
    return (ContextParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.ContextParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContextParameter newInstance(SModel sm) {
    return ContextParameter.newInstance(sm, false);
  }

}
