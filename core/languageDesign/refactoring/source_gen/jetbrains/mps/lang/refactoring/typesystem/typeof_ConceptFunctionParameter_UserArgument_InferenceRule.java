package jetbrains.mps.lang.refactoring.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_UserArgument_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ConceptFunctionParameter_UserArgument_InferenceRule() {
  }

  public void applyRule(final SNode conceptFunctionParameter_UserArgument, final TypeCheckingContext typeCheckingContext) {
    SNode filterArgumentClause = SNodeOperations.getAncestor(conceptFunctionParameter_UserArgument, "jetbrains.mps.lang.refactoring.structure.FilterArgumentClause", false, false);
    SNode requiredUserEnteredArgument = SNodeOperations.cast(SNodeOperations.getParent(filterArgumentClause), "jetbrains.mps.lang.refactoring.structure.RequiredUserEnteredArgument");
    {
      SNode _nodeToCheck_1029348928467 = conceptFunctionParameter_UserArgument;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1192795194145", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) SLinkOperations.getTarget(requiredUserEnteredArgument, "argumentType", true), (SNode) typeCheckingContext.typeOf(conceptFunctionParameter_UserArgument, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "1192795196477", true), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.ConceptFunctionParameter_UserArgument";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }
}
