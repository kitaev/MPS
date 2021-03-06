package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IfMacro extends NodeMacro {
  public static final String concept = "jetbrains.mps.lang.generator.structure.IfMacro";
  public static final String CONDITION_FUNCTION = "conditionFunction";
  public static final String ALTERNATIVE_CONSEQUENCE = "alternativeConsequence";

  public IfMacro(SNode node) {
    super(node);
  }

  public IfMacro_Condition getConditionFunction() {
    return (IfMacro_Condition) this.getChild(IfMacro_Condition.class, IfMacro.CONDITION_FUNCTION);
  }

  public void setConditionFunction(IfMacro_Condition node) {
    super.setChild(IfMacro.CONDITION_FUNCTION, node);
  }

  public RuleConsequence getAlternativeConsequence() {
    return (RuleConsequence) this.getChild(RuleConsequence.class, IfMacro.ALTERNATIVE_CONSEQUENCE);
  }

  public void setAlternativeConsequence(RuleConsequence node) {
    super.setChild(IfMacro.ALTERNATIVE_CONSEQUENCE, node);
  }

  public static IfMacro newInstance(SModel sm, boolean init) {
    return (IfMacro) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.IfMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IfMacro newInstance(SModel sm) {
    return IfMacro.newInstance(sm, false);
  }
}
