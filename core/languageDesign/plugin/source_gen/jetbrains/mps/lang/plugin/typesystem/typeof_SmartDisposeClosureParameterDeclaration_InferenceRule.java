package jetbrains.mps.lang.plugin.typesystem;

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

public class typeof_SmartDisposeClosureParameterDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SmartDisposeClosureParameterDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode declaration, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(declaration), "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(SNodeOperations.getParent(declaration)), "jetbrains.mps.lang.plugin.structure.AddTabOperation")) {
      {
        SNode _nodeToCheck_1029348928467 = declaration;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "485694842828666182", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "485694842828666177", true), (SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(SNodeOperations.getParent(declaration)), "jetbrains.mps.lang.plugin.structure.AddTabOperation"), "componentExpression", true), "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "485694842828666194", true), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.plugin.structure.SmartDisposeClosureParameterDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
