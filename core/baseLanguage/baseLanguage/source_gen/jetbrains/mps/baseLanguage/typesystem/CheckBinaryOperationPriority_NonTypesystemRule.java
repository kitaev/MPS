package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.plugin.ParenthesisUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class CheckBinaryOperationPriority_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public CheckBinaryOperationPriority_NonTypesystemRule() {
  }

  public void applyRule(final SNode binaryOperation, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.getParent(binaryOperation) != null && SNodeOperations.isInstanceOf(SNodeOperations.getParent(binaryOperation), "jetbrains.mps.baseLanguage.structure.BinaryOperation")) {
      SNode parent = SNodeOperations.cast(SNodeOperations.getParent(binaryOperation), "jetbrains.mps.baseLanguage.structure.BinaryOperation");
      boolean isRigth = false;
      if (SLinkOperations.getTarget(parent, "rightExpression", true) == binaryOperation) {
        isRigth = true;
      } else if (SLinkOperations.getTarget(parent, "leftExpression", true) == binaryOperation) {
        isRigth = false;
      }
      if (ParenthesisUtil.isBadPriority(binaryOperation, parent, isRigth)) {
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.typesystem.BinaryExpressionPriority_QuickFix", true);
          intentionProvider.putArgument("child", binaryOperation);
          intentionProvider.putArgument("parent", parent);
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(binaryOperation, "Bad priority of operations", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "6778605776626937239", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BinaryOperation";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
