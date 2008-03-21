package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.smodel.search.SModelSearchUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SLinkListAccess_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SLinkListAccess_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    final SNode linkDecl = SLinkOperations.getTarget(op, "link", false);
    if (linkDecl == null) {
      return;
    }
    // assign type
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206103737722", true), new QuotationClass_87().createNode(SLinkOperations.getTarget(linkDecl, "target", false), "" + SPropertyOperations.hasValue(linkDecl, "metaClass", "aggregation", null)), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206103745585");
    // ---
    RulesUtil.checkAppliedCorrectly_generic(op);
    final SNode Concept_typevar_1186062842230 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1186062842230));
    {
      final SNode C = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1186062842230);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

        public void run() {
          SNode inputNodeConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(C);
          List<LinkDeclaration> declaredLinks = SModelSearchUtil_new.getLinkDeclarationsExcludingOverridden(((AbstractConceptDeclaration)SNodeOperations.getAdapter(inputNodeConcept)));
          if (!(declaredLinks.contains(((LinkDeclaration)SNodeOperations.getAdapter(linkDecl))))) {
            TypeChecker.getInstance().reportTypeError(op, "access to link '" + SPropertyOperations.getString(linkDecl, "role") + "' is not expected here", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062887864");
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186062870557");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
