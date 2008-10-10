package jetbrains.mps.lang.pattern.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ListPattern_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ListPattern_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode attributedNode = SNodeOperations.getParent(nodeToCheck);
    SNode parent = SNodeOperations.getParent(attributedNode);
    if (parent == null) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202491231736", true), new QuotationClass_6().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202491231731", intentionProvider);
      }
    } else
    {
      String role = attributedNode.getRole_();
      SNode linkDeclaration = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202491231771", true), new QuotationClass_7().createNode(SLinkOperations.getTarget(linkDeclaration, "target", false)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.helgins)", "1202491231762", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.pattern.structure.ListPattern";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
