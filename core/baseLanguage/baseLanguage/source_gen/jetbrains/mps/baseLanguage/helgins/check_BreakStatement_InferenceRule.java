package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_BreakStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public check_BreakStatement_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    if (!(SPropertyOperations.hasValue(nodeToCheck, "label", null))) {
      final String lbl = SPropertyOperations.getString(nodeToCheck, "label");
      Iterable<SNode> matchingLoops = ListSequence.fromList(SNodeOperations.getAncestors(nodeToCheck, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return lbl.equals(SPropertyOperations.getString(it, "label"));
        }

      });
      if (!(Sequence.fromIterable(matchingLoops).isNotEmpty())) {
        TypeChecker.getInstance().reportTypeError(nodeToCheck, "No such label", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.helgins)", "1199469904373");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BreakStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
