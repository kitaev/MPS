package jetbrains.mps.lang.textGen.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AbstractAppendPart_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_AbstractAppendPart_InferenceRule() {
  }

  public void applyRule(final SNode part, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = part;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "1237483038485", true), (SNode)new _Quotations.QuotationClass_2().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:f568ac81-f20d-491c-8e81-330fbdff24e6(jetbrains.mps.lang.textGen.typesystem)", "1237483038480", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.textGen.structure.AbstractAppendPart";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
