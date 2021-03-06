package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PrepareConceptFunction extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.PrepareConceptFunction";
  public static final String RETRUN_TYPE_PARAMETER = "retrunTypeParameter";

  public PrepareConceptFunction(SNode node) {
    super(node);
  }

  public Type getRetrunTypeParameter() {
    return (Type) this.getChild(Type.class, PrepareConceptFunction.RETRUN_TYPE_PARAMETER);
  }

  public void setRetrunTypeParameter(Type node) {
    super.setChild(PrepareConceptFunction.RETRUN_TYPE_PARAMETER, node);
  }

  public static PrepareConceptFunction newInstance(SModel sm, boolean init) {
    return (PrepareConceptFunction) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.PrepareConceptFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PrepareConceptFunction newInstance(SModel sm) {
    return PrepareConceptFunction.newInstance(sm, false);
  }
}
