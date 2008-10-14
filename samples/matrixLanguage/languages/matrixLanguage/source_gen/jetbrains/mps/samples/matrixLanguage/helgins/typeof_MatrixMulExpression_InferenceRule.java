package jetbrains.mps.samples.matrixLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MatrixMulExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_MatrixMulExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      final SNode left = typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "leftExpression", true), "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210005562793", true);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(left, new Runnable() {

        public void run() {
          {
            final SNode right = typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "rightExpression", true), "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210005567145", true);
            TypeChecker.getInstance().getRuntimeSupport().whenConcrete(right, new Runnable() {

              public void run() {
                boolean done = false;
                if (TypeChecker.getInstance().getSubtypingManager().isSubtype(typeCheckingContext.getEquationManager().getRepresentator(left), new QuotationClass_6().createNode())) {
                  {
                    IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.samples.matrixLanguage.structure.MatrixType");
                    SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(typeCheckingContext.getEquationManager().getRepresentator(right), pattern_0);
                    if (coercedNode_0 != null) {
                      {
                        SNode _nodeToCheck_1029348928467 = nodeToCheck;
                        BaseIntentionProvider intentionProvider = null;
                        typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210171765363", true), new QuotationClass_7().createNode(SLinkOperations.getTarget(coercedNode_0, "scalarType", true)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210171765353", intentionProvider);
                      }
                      done = true;
                    }
                  }
                  if (!(done)) {
                    {
                      BaseIntentionProvider intentionProvider = null;
                      typeCheckingContext.reportTypeError(SLinkOperations.getTarget(nodeToCheck, "rightExpression", true), "Type must be Matrix but " + SNodeOperations.getConceptDeclaration(typeCheckingContext.getEquationManager().getRepresentator(right)), "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210175930104", intentionProvider);
                    }
                  }
                } else
                if (TypeChecker.getInstance().getSubtypingManager().isSubtype(typeCheckingContext.getEquationManager().getRepresentator(right), new QuotationClass_9().createNode())) {
                  {
                    IMatchingPattern pattern_1 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.samples.matrixLanguage.structure.MatrixType");
                    SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(typeCheckingContext.getEquationManager().getRepresentator(left), pattern_1);
                    if (coercedNode_1 != null) {
                      {
                        SNode _nodeToCheck_1029348928467 = nodeToCheck;
                        BaseIntentionProvider intentionProvider = null;
                        typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174269273", true), new QuotationClass_8().createNode(SLinkOperations.getTarget(coercedNode_1, "scalarType", true)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174269263", intentionProvider);
                      }
                      done = true;
                    }
                  }
                  if (!(done)) {
                    {
                      BaseIntentionProvider intentionProvider = null;
                      typeCheckingContext.reportTypeError(SLinkOperations.getTarget(nodeToCheck, "leftExpression", true), "Type must be Matrix but " + SNodeOperations.getConceptDeclaration(typeCheckingContext.getEquationManager().getRepresentator(left)), "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210176257229", intentionProvider);
                    }
                  }
                } else
                {
                  final SNode v_typevar_1210174591724 = typeCheckingContext.createNewRuntimeTypesVariable();
                  {
                    SNode _nodeToCheck_1029348928467 = nodeToCheck;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(typeCheckingContext.typeOf(nodeToCheck, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174591729", true), typeCheckingContext.getEquationManager().getRepresentator(v_typevar_1210174591724), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174591725", intentionProvider);
                  }
                  {
                    SNode _nodeToCheck_1029348928467 = nodeToCheck;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "leftExpression", true), "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174591735", true), typeCheckingContext.getEquationManager().getRepresentator(v_typevar_1210174591724), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174591731", intentionProvider);
                  }
                  {
                    SNode _nodeToCheck_1029348928467 = nodeToCheck;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "rightExpression", true), "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174591743", true), typeCheckingContext.getEquationManager().getRepresentator(v_typevar_1210174591724), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210174591739", intentionProvider);
                  }
                  done = true;
                }
              }

            }, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210004912543");
          }
        }

      }, "r:00000000-0000-4000-0000-011c89590452(jetbrains.mps.samples.matrixLanguage.helgins)", "1210004689795");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.samples.matrixLanguage.structure.MatrixMultExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
