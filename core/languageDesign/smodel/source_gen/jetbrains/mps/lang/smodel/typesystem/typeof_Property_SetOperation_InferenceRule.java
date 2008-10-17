package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Property_SetOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_Property_SetOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedCorrectly_generic(typeCheckingContext, op);
    SNode propertyAccessOp = SNodeOperation_Behavior.call_getLeftExpressionOperation_1213877508946(op);
    SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(propertyAccessOp, "property", false), "dataType", false);
    if (!((dataType != null))) {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(op, "couldn't define accessed property datatype", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059295963", intentionProvider);
    }
    SNode value = SLinkOperations.getTarget(op, "value", true);
    if ((value != null)) {
      if (DataTypeDeclaration_Behavior.call_isSimpleString_1220268704138(dataType)) {
        {
          SNode _nodeToCheck_1029348928467 = op;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059295984", true), new _Quotations.QuotationClass_3().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059295979", false, 0, intentionProvider);
        }
      } else
      if (DataTypeDeclaration_Behavior.call_isSimpleInteger_1220268868375(dataType)) {
        {
          SNode _nodeToCheck_1029348928467 = op;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059295997", true), new _Quotations.QuotationClass_4().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059295992", false, 0, intentionProvider);
        }
      } else
      if (DataTypeDeclaration_Behavior.call_isSimpleBoolean_1220268891062(dataType)) {
        {
          SNode _nodeToCheck_1029348928467 = op;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059296010", true), new _Quotations.QuotationClass_5().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059296005", false, 0, intentionProvider);
        }
      } else
      if (DataTypeDeclaration_Behavior.call_isEnum_1220268692373(dataType)) {
        if (!(SNodeOperations.isInstanceOf(value, "jetbrains.mps.lang.smodel.structure.EnumMemberReference"))) {
          if (DataTypeDeclaration_Behavior.call_isEnumOfInteger_1220268950942(dataType)) {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1214430014542", true), new _Quotations.QuotationClass_6().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1214430014537", false, 0, intentionProvider);
            }
          } else
          if (DataTypeDeclaration_Behavior.call_isEnumOfBoolean_1220268971570(dataType)) {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1214430042918", true), new _Quotations.QuotationClass_7().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1214430042913", false, 0, intentionProvider);
            }
          } else
          {
            {
              SNode _nodeToCheck_1029348928467 = op;
              BaseIntentionProvider intentionProvider = null;
              typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(value, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059478775", true), new _Quotations.QuotationClass_8().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059478770", false, 0, intentionProvider);
            }
          }
        }
      } else
      {
        {
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.reportTypeError(op, "unknown property datatype: " + dataType, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1186059296043", intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Property_SetOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
