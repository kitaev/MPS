package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ArithmSymbol_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ArithmSymbol_InferenceRule() {
  }

  public void applyRule(final SNode symbol, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = symbol;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042199446", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042199450", true), (SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(symbol, "expression", true), "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042201546", true), _info_12389875345);
    }
    {
      final SNode t = typeCheckingContext.typeOf(symbol, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042132166", true);
      typeCheckingContext.whenConcrete(t, new Runnable() {
        public void run() {
          if (TypeChecker.getInstance().getSubtypingManager().isSubtype(typeCheckingContext.getEquationManager().getRepresentator(t), MathTypeUtil.qBigComplex)) {
            {
              SNode _nodeToCheck_1029348928467 = symbol;
              BaseIntentionProvider intentionProvider = null;
              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042133318", 0, intentionProvider);
              _info_12389875345.setInequationGroup("default");
              typeCheckingContext.createLessThanInequation((SNode)SNodeOperations.copyNode(MathTypeUtil.qInt), (SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042133323", true), true, _info_12389875345);
            }
          } else if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(t), "jetbrains.mps.baseLanguage.math.structure.MatrixType") || SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(t), "jetbrains.mps.baseLanguage.math.structure.VectorType")) {
          } else {
            String s = "";
            if (SNodeOperations.isInstanceOf(symbol, "jetbrains.mps.baseLanguage.math.structure.BigProdExpression")) {
              s = "Multiplicand's ";
            }
            if (SNodeOperations.isInstanceOf(symbol, "jetbrains.mps.baseLanguage.math.structure.BigSumExpression")) {
              s = "Summand's ";
            }
            {
              BaseIntentionProvider intentionProvider = null;
              IErrorTarget errorTarget = new NodeErrorTarget();
              IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(symbol, s + "type should be subtype of numeral type or matrix type", "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042133341", intentionProvider, errorTarget);
            }
          }
        }
      }, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1418611629042132163", false, false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.ArithmSymbol";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
