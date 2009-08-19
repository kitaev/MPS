package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DropRootRule extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.DropRootRule";
  public static final String APPLICABLE_CONCEPT = "applicableConcept";
  public static final String CONDITION_FUNCTION = "conditionFunction";

  public DropRootRule(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, DropRootRule.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(DropRootRule.APPLICABLE_CONCEPT, node);
  }

  public DropRootRule_Condition getConditionFunction() {
    return (DropRootRule_Condition)this.getChild(DropRootRule_Condition.class, DropRootRule.CONDITION_FUNCTION);
  }

  public void setConditionFunction(DropRootRule_Condition node) {
    super.setChild(DropRootRule.CONDITION_FUNCTION, node);
  }

  public static DropRootRule newInstance(SModel sm, boolean init) {
    return (DropRootRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.DropRootRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DropRootRule newInstance(SModel sm) {
    return DropRootRule.newInstance(sm, false);
  }
}
