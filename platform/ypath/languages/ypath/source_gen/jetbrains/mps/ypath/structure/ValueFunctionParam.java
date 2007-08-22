package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ValueFunctionParam extends ConceptFunctionParameter {

  public  ValueFunctionParam(SNode node) {
    super(node);
  }

  public static ValueFunctionParam newInstance(SModel sm, boolean init) {
    return (ValueFunctionParam)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.ValueFunctionParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ValueFunctionParam newInstance(SModel sm) {
    return ValueFunctionParam.newInstance(sm, false);
  }

}
