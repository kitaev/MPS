package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.constraints.SNodeOperation_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.structure.DataTypeDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Property_SetOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Property_SetOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    SNode propertyAccessOp = SNodeOperation_Behavior.call_getLeftExpressionOperation_1203459446846(op);
    SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(propertyAccessOp, "property", false), "dataType", false);
    if(!((dataType != null))) {
      TypeChecker.getInstance().reportTypeError(op, "couldn't define accessed property datatype", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295963");
    }
    SNode value = SLinkOperations.getTarget(op, "value", true);
    if((value != null)) {
      if(DataTypeUtil.isSimpleString(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295984", true), new QuotationClass_3().createNode(), value, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295979");
      } else
      if(DataTypeUtil.isSimpleInteger(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295997", true), new QuotationClass_4().createNode(), value, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059295992");
      } else
      if(DataTypeUtil.isSimpleBoolean(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(value, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059296010", true), new QuotationClass_5().createNode(), value, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059296005");
      } else
      if(DataTypeUtil.isEnum(((DataTypeDeclaration)SNodeOperations.getAdapter(dataType)))) {
        if(!(SNodeOperations.isInstanceOf(value, "jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference"))) {
          TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(op, "value", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059478775", true), new QuotationClass_6().createNode(), SLinkOperations.getTarget(op, "value", true), "<enum member> or String is expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059478770");
        }
      } else
      {
        TypeChecker.getInstance().reportTypeError(op, "unknown property datatype: " + dataType, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186059296043");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
