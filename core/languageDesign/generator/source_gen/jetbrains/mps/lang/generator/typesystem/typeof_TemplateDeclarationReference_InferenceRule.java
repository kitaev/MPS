package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TemplateDeclarationReference_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TemplateDeclarationReference_InferenceRule() {
  }

  public void applyRule(final SNode templateReference, final TypeCheckingContext typeCheckingContext) {
    SNode rule = SNodeOperations.getAncestor(templateReference, "jetbrains.mps.lang.generator.structure.BaseMappingRule", false, false);
    if (rule != null) {
      SNode templateApplicableConcept = SLinkOperations.getTarget(SLinkOperations.getTarget(templateReference, "template", false), "applicableConcept", false);
      SNode ruleApplicableConcept = SLinkOperations.getTarget(rule, "applicableConcept", false);
      if (ruleApplicableConcept != null && templateApplicableConcept != null) {
        if (!(SConceptOperations.isSubConceptOf(ruleApplicableConcept, NameUtil.nodeFQName(templateApplicableConcept)))) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            typeCheckingContext.reportTypeError(templateReference, "template is not applicable to the rule concept '" + SPropertyOperations.getString(ruleApplicableConcept, "name") + "'", "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1183153489205", intentionProvider, errorTarget);
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.generator.structure.TemplateDeclarationReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
