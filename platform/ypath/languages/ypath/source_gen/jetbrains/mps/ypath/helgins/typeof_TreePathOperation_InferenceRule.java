package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.helgins.inference.TypeChecker;

public class typeof_TreePathOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_TreePathOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    SNode parent = SNodeOperations.getParent(op, null, false, false);
    do {
      SNode matchedNode_1178551167097 = parent;
      {
        boolean matches_1178551167099 = false;
        matches_1178551167099 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.ypath.structure.TreePathOperationExpression");
        if(matches_1178551167099) {
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.ypath.helgins", "1178551167102", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(matchedNode_1178551167097, "jetbrains.mps.ypath.helgins", "1178551167104", true), op, null, "jetbrains.mps.ypath.helgins", "1178551167101");
          break;
        }
      }
      TypeChecker.getInstance().reportTypeError(op, "Error in model structure: wrong parent type", "jetbrains.mps.ypath.helgins", "1190288908359");
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
