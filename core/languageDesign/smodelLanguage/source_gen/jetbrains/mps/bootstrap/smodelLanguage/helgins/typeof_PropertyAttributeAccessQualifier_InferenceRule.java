package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.constraints.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyAttributeAccessQualifier_InferenceRule implements InferenceRule_Runtime {

  public typeof_PropertyAttributeAccessQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    SNode annotationLink = SLinkOperations.getTarget(nodeToCheck, "annotationLink", false);
    if (annotationLink == null) {
      return;
    }
    // assign type
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206103035534", true), new QuotationClass_76().createNode(SPropertyOperations.hasValue(annotationLink, "sourceCardinality", "0..1", "0..1") + "", SLinkOperations.getTarget(annotationLink, "target", false)), nodeToCheck, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206103041053");
    // ---
    if (!(SPropertyOperations.hasValue(annotationLink, "stereotype", "property", "node"))) {
      TypeChecker.getInstance().reportTypeError(nodeToCheck, "property annotation link is expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204832870610");
    }
    final SNode propQ = SLinkOperations.getTarget(nodeToCheck, "propertyQualifier", true);
    if (SNodeOperations.isInstanceOf(propQ, "jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression")) {
      // # property name
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(propQ, "expression", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204835998062", false), new QuotationClass_64().createNode(), SLinkOperations.getTarget(propQ, "expression", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204835998060", false, 0);
    } else
    if (SNodeOperations.isInstanceOf(propQ, "jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier")) {
      // check that property is in scope
      final SNode property = SLinkOperations.getTarget(propQ, "property", false);
      final SNode Concept_typevar_1204914077372 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
      RulesUtil.equate_inputNodeConcept(SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation", false, false), TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1204914077372));
      {
        final SNode C = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1204914077372);
        TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

          public void run() {
            SNode inputNodeConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(C);
            List<SNode> declaredProperties = AbstractConceptDeclaration_Behavior.call_getPropertyDeclarations_1203539034160(inputNodeConcept);
            if (!(ListSequence.fromList(declaredProperties).contains(property))) {
              TypeChecker.getInstance().reportTypeError(propQ, "access to property '" + SPropertyOperations.getString(property, "name") + "' is not expected here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204914077394");
            }
          }

        }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1204914077379");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
