package jetbrains.mps.ypath.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.ypath.constraints.FeatureTargetTypeUtil;
import jetbrains.mps.ypath.behavior.ParameterWrapper_Behavior;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.ypath.behavior.ITreePathExpression_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathOperationExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TreePathOperationExpression_InferenceRule() {
  }

  public void applyRule(final SNode tpoe, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(tpoe, "operation", true), "jetbrains.mps.ypath.structure.IterateOperation")) {
      final SNode op = SLinkOperations.getTarget(tpoe, "operation", true);
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(op, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature")) {
        if (SPropertyOperations.getString(SLinkOperations.getTarget(op, "paramObject", true), "name") != null) {
          final SNode SourceType_typevar_1186145333005 = typeCheckingContext.createNewRuntimeTypesVariable();
          {
            SNode _nodeToCheck_1029348928467 = tpoe;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation(typeCheckingContext.getEquationManager().getRepresentator(SourceType_typevar_1186145333005), typeCheckingContext.typeOf(SLinkOperations.getTarget(tpoe, "expression", true), "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1186145352982", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1186145347351", intentionProvider);
          }
          {
            final SNode _representatorVar0 = typeCheckingContext.getEquationManager().getRepresentator(SourceType_typevar_1186145333005);
            typeCheckingContext.whenConcrete(_representatorVar0, new Runnable() {

              public void run() {
                SNode targetType = FeatureTargetTypeUtil.getTargetType(SLinkOperations.getTarget(op, "usedFeature", false), SLinkOperations.getTarget(typeCheckingContext.getEquationManager().getRepresentator(SourceType_typevar_1186145333005), "nodeType", true), ParameterWrapper_Behavior.call_getParameterValue_1213877312166(SLinkOperations.getTarget(op, "paramObject", true)));
                if (!((targetType != null))) {
                  BaseIntentionProvider intentionProvider = null;
                  IErrorTarget errorTarget = new NodeErrorTarget();
                  typeCheckingContext.reportTypeError(tpoe, "Received null target type", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1196269826366", intentionProvider, errorTarget);
                }
                if ((targetType != null)) {
                  {
                    SNode _nodeToCheck_1029348928467 = tpoe;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(typeCheckingContext.typeOf(tpoe, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595148", true), new _Quotations.QuotationClass_1().createNode(targetType, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595143", intentionProvider);
                  }
                }
              }

            }, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1186145326892", false);
          }
        }
      } else
      {
        SNode treePath = ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe);
        if (treePath != null) {
          {
            SNode _nodeToCheck_1029348928467 = tpoe;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createEquation(typeCheckingContext.typeOf(tpoe, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595329", true), SLinkOperations.getTarget(treePath, "treePathType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1223982595324", intentionProvider);
          }
        } else
        if (!(false)) {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(tpoe, "No treepath found", "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1196942498551", intentionProvider, errorTarget);
        }
      }
    } else
    {
      {
        SNode _nodeToCheck_1029348928467 = tpoe;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(typeCheckingContext.typeOf(tpoe, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184588387870", true), typeCheckingContext.typeOf(SLinkOperations.getTarget(tpoe, "expression", true), "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184588395631", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905aa(jetbrains.mps.ypath.typesystem)", "1184588384882", intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathOperationExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
