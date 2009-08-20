package jetbrains.mps.langBeta.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AlphaConcept_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AlphaConcept_InferenceRule() {
  }

  public void applyRule(final SNode concept, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = concept;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f238a35e-6ea5-4d00-9126-cad2ba0ec3c4(jetbrains.mps.langBeta.typesystem)", "1241091815260", true), (SNode)new _Quotations.QuotationClass_0().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:f238a35e-6ea5-4d00-9126-cad2ba0ec3c4(jetbrains.mps.langBeta.typesystem)", "1241091824523", intentionProvider);
    }
    {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      typeCheckingContext.reportTypeError(concept, "alpha concept!", "r:f238a35e-6ea5-4d00-9126-cad2ba0ec3c4(jetbrains.mps.langBeta.typesystem)", "1241088431255", intentionProvider, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.langBeta.structure.AlphaConcept";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
