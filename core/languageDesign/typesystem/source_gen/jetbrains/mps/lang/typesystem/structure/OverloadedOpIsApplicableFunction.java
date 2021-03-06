package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OverloadedOpIsApplicableFunction extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.OverloadedOpIsApplicableFunction";

  public OverloadedOpIsApplicableFunction(SNode node) {
    super(node);
  }

  public static OverloadedOpIsApplicableFunction newInstance(SModel sm, boolean init) {
    return (OverloadedOpIsApplicableFunction) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.OverloadedOpIsApplicableFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OverloadedOpIsApplicableFunction newInstance(SModel sm) {
    return OverloadedOpIsApplicableFunction.newInstance(sm, false);
  }
}
