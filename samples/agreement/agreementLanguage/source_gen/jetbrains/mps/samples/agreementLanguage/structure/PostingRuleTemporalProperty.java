package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PostingRuleTemporalProperty extends TemporalProperty {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.PostingRuleTemporalProperty";

  public PostingRuleTemporalProperty(SNode node) {
    super(node);
  }

  public PostingRule getPostingRule() {
    return this.ensureAdapter(PostingRule.class, "value", this.getValue());
  }

  public void setPostingRule(PostingRule node) {
    this.setValue(node);
  }

  public static PostingRuleTemporalProperty newInstance(SModel sm, boolean init) {
    return (PostingRuleTemporalProperty) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.PostingRuleTemporalProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PostingRuleTemporalProperty newInstance(SModel sm) {
    return PostingRuleTemporalProperty.newInstance(sm, false);
  }
}
