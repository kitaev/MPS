package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class FixParametersInAnonymousClass_QuickFix extends QuickFix_Runtime {
  public FixParametersInAnonymousClass_QuickFix() {
  }

  public void execute(SNode node) {
    for (SNode parameter : SLinkOperations.getTargets(((SNode) FixParametersInAnonymousClass_QuickFix.this.getField("anonymousClass")[0]), "parameter", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(((SNode) FixParametersInAnonymousClass_QuickFix.this.getField("anonymousClass")[0]), "actualArgument", true)).addElement(parameter);
    }
  }
}
