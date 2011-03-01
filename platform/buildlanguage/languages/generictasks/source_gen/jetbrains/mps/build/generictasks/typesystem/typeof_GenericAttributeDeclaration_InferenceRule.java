package jetbrains.mps.build.generictasks.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GenericAttributeDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_GenericAttributeDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if ((SLinkOperations.getTarget(nodeToCheck, "attributeType", true) != null) && (SLinkOperations.getTarget(nodeToCheck, "default", true) != null)) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "default", true);
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:eac20369-5993-49cc-a9ac-fbeb7a91d81f(jetbrains.mps.build.generictasks.typesystem)", "353793545802854687", 0, intentionProvider);
        _info_12389875345.setInequationGroup("");
        typeCheckingContext.createGreaterThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:eac20369-5993-49cc-a9ac-fbeb7a91d81f(jetbrains.mps.build.generictasks.typesystem)", "353793545802854693", true), (SNode) SLinkOperations.getTarget(nodeToCheck, "attributeType", true), false, _info_12389875345);
      }
      if ((SLinkOperations.getTarget(nodeToCheck, "enum", true) != null)) {
        {
          SNode _nodeToCheck_1029348928467 = nodeToCheck;
          BaseQuickFixProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:eac20369-5993-49cc-a9ac-fbeb7a91d81f(jetbrains.mps.build.generictasks.typesystem)", "353793545802854699", 0, intentionProvider);
          _info_12389875345.setInequationGroup("");
          typeCheckingContext.createLessThanInequation((SNode) ListSequence.fromList(SLinkOperations.getConceptLinkTargets(SLinkOperations.getTarget(nodeToCheck, "enum", true), "type")).first(), (SNode) SLinkOperations.getTarget(nodeToCheck, "attributeType", true), false, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.build.generictasks.structure.AttributeDeclaration";
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
