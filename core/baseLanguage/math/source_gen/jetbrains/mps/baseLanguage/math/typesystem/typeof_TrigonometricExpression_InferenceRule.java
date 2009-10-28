package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TrigonometricExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_TrigonometricExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    final SNode t1_typevar_1238344499359 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(expression, "param", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499360", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(t1_typevar_1238344499359), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499364", true), _info_12389875345);
    }
    {
      final SNode t1v = typeCheckingContext.getEquationManager().getRepresentator(t1_typevar_1238344499359);
      typeCheckingContext.whenConcrete(t1v, new Runnable() {
        public void run() {
          if (TypeChecker.getInstance().getSubtypingManager().isSubtype(typeCheckingContext.getEquationManager().getRepresentator(t1_typevar_1238344499359), MathTypeUtil.qDouble)) {
            {
              SNode _nodeToCheck_1029348928467 = expression;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499372", 0, intentionProvider);
              typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499377", true), (SNode)SNodeOperations.copyNode(MathTypeUtil.qDouble), _info_12389875345);
            }
          } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(t1_typevar_1238344499359), "jetbrains.mps.baseLanguage.math.structure.ComplexType")) {
            {
              SNode _nodeToCheck_1029348928467 = expression;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499408", 0, intentionProvider);
              typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499415", true), (SNode)SNodeOperations.copyNode(MathTypeUtil.qComplex), _info_12389875345);
            }
          } else {
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(expression, "Trigonometric functions are defined for subtypes of complex", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499429", intentionProvider, errorTarget);
            }
          }
        }
      }, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238344499368", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.MathFuncExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
