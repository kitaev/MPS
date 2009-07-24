package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;

public class typeof_TreePathOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TreePathOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    SNode parent = SNodeOperations.getParent(op);
    do {
      SNode matchedNode_0 = parent;
      {
        boolean matches_0 = false;
        {
          SNode matchingNode_0 = parent;
          if (matchingNode_0 != null) {
            matches_0 = SModelUtil_new.isAssignableConcept(matchingNode_0.getConceptFqName(), "jetbrains.mps.ypath.structure.TreePathOperationExpression");
          }
        }
        if (matches_0) {
          {
            SNode _nodeToCheck_1029348928467 = op;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1178551167102", true), (SNode)typeCheckingContext.typeOf(matchedNode_0, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1178551167104", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1178551167101", intentionProvider);
          }
          break;
        }
      }
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(op, "Error in model structure: wrong parent type", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1190288908359", intentionProvider, errorTarget);
      }
    } while(false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
