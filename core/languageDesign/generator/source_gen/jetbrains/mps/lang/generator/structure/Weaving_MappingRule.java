package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Weaving_MappingRule extends BaseMappingRule {
  public static final String concept = "jetbrains.mps.lang.generator.structure.Weaving_MappingRule";
  public static final String RULE_CONSEQUENCE = "ruleConsequence";
  public static final String CONTEXT_NODE_QUERY = "contextNodeQuery";

  public Weaving_MappingRule(SNode node) {
    super(node);
  }

  public RuleConsequence getRuleConsequence() {
    return (RuleConsequence)this.getChild(RuleConsequence.class, Weaving_MappingRule.RULE_CONSEQUENCE);
  }

  public void setRuleConsequence(RuleConsequence node) {
    super.setChild(Weaving_MappingRule.RULE_CONSEQUENCE, node);
  }

  public Weaving_MappingRule_ContextNodeQuery getContextNodeQuery() {
    return (Weaving_MappingRule_ContextNodeQuery)this.getChild(Weaving_MappingRule_ContextNodeQuery.class, Weaving_MappingRule.CONTEXT_NODE_QUERY);
  }

  public void setContextNodeQuery(Weaving_MappingRule_ContextNodeQuery node) {
    super.setChild(Weaving_MappingRule.CONTEXT_NODE_QUERY, node);
  }

  public static Weaving_MappingRule newInstance(SModel sm, boolean init) {
    return (Weaving_MappingRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.Weaving_MappingRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Weaving_MappingRule newInstance(SModel sm) {
    return Weaving_MappingRule.newInstance(sm, false);
  }
}
