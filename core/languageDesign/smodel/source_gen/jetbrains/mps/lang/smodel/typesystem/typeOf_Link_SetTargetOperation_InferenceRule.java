package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetTargetOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_Link_SetTargetOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    // checking
    SNode parameter = SLinkOperations.getTarget(op, "linkTarget", true);
    if ((parameter != null)) {
      final SNode ExpectedType_typevar_1206101371703 = typeCheckingContext.createNewRuntimeTypesVariable();
      RulesUtil.equate_inputNodeType(typeCheckingContext, op, typeCheckingContext.getEquationManager().getRepresentator(ExpectedType_typevar_1206101371703));
      SNode parmType = typeCheckingContext.typeOf(parameter, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060393994", true);
      {
        SNode _nodeToCheck_1029348928467 = op;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequation((SNode)parmType, (SNode)typeCheckingContext.getEquationManager().getRepresentator(ExpectedType_typevar_1206101371703), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186060404653", false, 0, intentionProvider);
      }
    }
    // op returns node passed in parameter
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225406429482", true), (SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "linkTarget", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225406448709", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1225406438063", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
