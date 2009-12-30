package jetbrains.mps.baseLanguage.math.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MathTypeCast_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MathTypeCast_InferenceRule() {
  }

  public void applyRule(final SNode cast, final TypeCheckingContext typeCheckingContext) {
    switch (SPropertyOperations.getInteger_def(cast, "target", "1")) {
      case 1:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1237546816595", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1237546812717", true), (SNode) SNodeOperations.copyNode(MathTypeUtil.qBigInteger), _info_12389875345);
        }
        break;
      case 2:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238320962984", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238320960653", true), (SNode) SNodeOperations.copyNode(MathTypeUtil.qComplex), _info_12389875345);
        }
        break;
      case 3:
      case 4:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238423072352", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238423072357", true), (SNode) SNodeOperations.copyNode(MathTypeUtil.qBigDecimal), _info_12389875345);
        }
        break;
      case 5:
      case 6:
      case 7:
      case 8:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238423076001", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "1238423076006", true), (SNode) SNodeOperations.copyNode(MathTypeUtil.qBigComplex), _info_12389875345);
        }
        break;
      case 9:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312513", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312510", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qInt), _info_12389875345);
        }
        break;
      case 10:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312555", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312561", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qLong), _info_12389875345);
        }
        break;
      case 11:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312563", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312569", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qFloat), _info_12389875345);
        }
        break;
      case 12:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312571", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312577", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qDouble), _info_12389875345);
        }
        break;
      case 13:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312579", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312585", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qBigInteger), _info_12389875345);
        }
        break;
      case 14:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312595", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312601", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qBigDecimal), _info_12389875345);
        }
        break;
      case 15:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312603", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312609", true), (SNode) MathTypeUtil.qMatrix(MathTypeUtil.qComplex), _info_12389875345);
        }
        break;
      case 16:
        {
          SNode _nodeToCheck_1029348928467 = cast;
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312611", 0, intentionProvider);
          typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:47d0f24b-df34-4ea0-aa7e-7c2eb0f88f31(jetbrains.mps.baseLanguage.math.typesystem)", "5217243589491312617", true), (SNode) SNodeOperations.copyNode(MathTypeUtil.qBCMatrix), _info_12389875345);
        }
        break;
      default:
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.math.structure.MathTypeCast";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
