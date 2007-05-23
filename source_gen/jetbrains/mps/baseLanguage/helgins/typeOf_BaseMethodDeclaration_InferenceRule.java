package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.helgins.QuotationClass_32;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.helgins.RulesFunctions_BaseLanguage;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_BaseMethodDeclaration_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_BaseMethodDeclaration_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    for(SNode throwsItem : SLinkOperations.getTargets(argument, "throwsItem", true)) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(throwsItem, new QuotationClass_32().createNode(), argument);
    }
    // ==========
    if(SLinkOperations.getTarget(argument, "body", true) == null) {
      return;
    }
    if(SConceptPropertyOperations.getBoolean(argument, "abstract")) {
      return;
    }
    // generic check
    TypeChecker.getInstance().getRuntimeSupport().check(SLinkOperations.getTarget(argument, "body", true));
    // =============
    SNode expectedRetType = SLinkOperations.getTarget(argument, "returnType", true);
    if(SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(expectedRetType), "jetbrains.mps.baseLanguage.structure.Type") || SNodeOperations.isInstanceOf(expectedRetType, "jetbrains.mps.baseLanguage.structure.VoidType")) {
      // actually - no return type
      expectedRetType = null;
    }
    // =============
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(argument, "body", true));
    boolean somethingReturned = !(SequenceOperations.isEmpty(returnStatements));
    if(expectedRetType == null) {
      // shouldn't return any values
      {
        ICursor<SNode> _zCursor1 = CursorFactory.createCursor(returnStatements);
        try {
          while(_zCursor1.moveToNext()) {
            SNode returnStatement = _zCursor1.getCurrent();
            if((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
              TypeChecker.getInstance().reportTypeError(returnStatement, "no return value expected");
            }
          }
        } finally {
          _zCursor1.release();
        }
      }
    } else
    {
      // should return subtypes of the 'expected type'
      {
        ICursor<SNode> _zCursor2 = CursorFactory.createCursor(returnStatements);
        try {
          while(_zCursor2.moveToNext()) {
            SNode returnStatement = _zCursor2.getCurrent();
            if((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
              TypeChecker.getInstance().reportTypeError(returnStatement, "should return value");
            } else
            {
              SNode returnType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(returnStatement, "expression", true));
              if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(returnType, expectedRetType))) {
                TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(returnStatement, "expression", true), "" + expectedRetType + " is expected");
              }
            }
          }
        } finally {
          _zCursor2.release();
        }
      }
    }
    // =============
    if(expectedRetType != null) {
      // last expression statement can serve as return statement
      SNode lastStatement = SequenceOperations.getLast(SLinkOperations.getTargets(SLinkOperations.getTarget(argument, "body", true), "statement", true));
      if(SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode returnType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(lastStatement, "expression", true));
        if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(returnType, expectedRetType))) {
          TypeChecker.getInstance().reportTypeError(SLinkOperations.getTarget(lastStatement, "expression", true), "" + expectedRetType + " is expected");
        }
        somethingReturned = true;
      }
      if(!(somethingReturned)) {
        TypeChecker.getInstance().reportTypeError(argument, "function should return " + expectedRetType);
      }
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
