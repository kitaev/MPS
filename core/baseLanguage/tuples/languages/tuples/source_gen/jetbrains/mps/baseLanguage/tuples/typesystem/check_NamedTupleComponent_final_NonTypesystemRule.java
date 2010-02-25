package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_NamedTupleComponent_final_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_NamedTupleComponent_final_NonTypesystemRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    if (expression == SLinkOperations.getTarget(SNodeOperations.as(SNodeOperations.getParent(expression), "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"), "lValue", true)) {
      {
        IMatchingPattern pattern_2398_ftu096gg = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType");
        SNode coercedNode_2398_ftu096gg = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(expression), pattern_2398_ftu096gg, typeCheckingContext);
        if (coercedNode_2398_ftu096gg != null) {
          if (ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(coercedNode_2398_ftu096gg, "classifier", false), "component", true)).any(new IWhereFilter<SNode>() {
            public boolean accept(SNode cmp) {
              return SPropertyOperations.getBoolean(cmp, "final");
            }
          })) {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(expression, "Cannot assign to final tuple component", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "4292022102258809122", intentionProvider, errorTarget);
            }
          }
        } else {
        }
      }
    }

  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.Expression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
