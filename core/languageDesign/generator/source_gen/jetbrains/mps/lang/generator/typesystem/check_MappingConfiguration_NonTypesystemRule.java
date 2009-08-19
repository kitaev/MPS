package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_MappingConfiguration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_MappingConfiguration_NonTypesystemRule() {
  }

  public void applyRule(final SNode mc, final TypeCheckingContext typeCheckingContext) {
    for (SNode scriptReference : ListSequence.fromList(SLinkOperations.getTargets(mc, "preMappingScript", true))) {
      if (!(SPropertyOperations.hasValue(SLinkOperations.getTarget(scriptReference, "mappingScript", false), "scriptKind", "pre_processing", "post_processing"))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(scriptReference, "pre-processing script kind is expected", "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1195601255636", intentionProvider, errorTarget);
      }
    }
    // --
    for (SNode scriptReference : ListSequence.fromList(SLinkOperations.getTargets(mc, "postMappingScript", true))) {
      if (!(SPropertyOperations.hasValue(SLinkOperations.getTarget(scriptReference, "mappingScript", false), "scriptKind", "post_processing", "post_processing"))) {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        typeCheckingContext.reportTypeError(scriptReference, "post-processing script kind is expected", "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1195601346473", intentionProvider, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.generator.structure.MappingConfiguration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
