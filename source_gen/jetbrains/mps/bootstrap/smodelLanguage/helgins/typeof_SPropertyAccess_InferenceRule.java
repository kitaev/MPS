package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration;
import jetbrains.mps.smodel.search.SModelSearchUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.structureLanguage.constraints.DataTypeDeclaration_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SPropertyAccess_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SPropertyAccess_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    if((SLinkOperations.getTarget(op, "property", false) != null)) {
      final SNode C_typevar_1186062582563 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186062582563), RulesUtil.get_inputNodeConcept(op), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062585190");
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186062582563), new Runnable() {

        public void run() {
          SNode inputNodeConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(C_typevar_1186062582563);
          List<PropertyDeclaration> declaredProperties = SModelSearchUtil_new.getPropertyDeclarationsExcludingOverridden(((AbstractConceptDeclaration)SNodeOperations.getAdapter(inputNodeConcept)));
          SNode property = SLinkOperations.getTarget(op, "property", false);
          if(!(declaredProperties.contains(((PropertyDeclaration)SNodeOperations.getAdapter(property))))) {
            TypeChecker.getInstance().reportTypeError(op, "access to property '" + SPropertyOperations.getString(property, "name") + "' is not expected here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062616321");
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062603529");
    }
    SNode dataType = SLinkOperations.getTarget(SLinkOperations.getTarget(op, "property", false), "dataType", false);
    if(dataType != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(DataTypeDeclaration_Behavior.call_toBaseLanguageType_1182472765133(dataType), op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1182474193368");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
