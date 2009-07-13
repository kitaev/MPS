package jetbrains.mps.lang.plugin.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Rename_S_ActionParameters_MigrationScript extends BaseMigrationScript {

  public Rename_S_ActionParameters_MigrationScript(IOperationContext operationContext) {
    super("rename \"S...\" action parameters");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "rename \"SNODE\" action parameters";
      }

      public String getAdditionalInfo() {
        return "rename \"SNODE\" action parameters";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SLinkOperations.getTarget(node, "key", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "variableDeclaration", false);
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setTarget(node, "key", SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "variableDeclaration", false), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "rename \"SNODES\" action parameters";
      }

      public String getAdditionalInfo() {
        return "rename \"SNODES\" action parameters";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SLinkOperations.getTarget(node, "key", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_3().createNode(), "variableDeclaration", false);
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setTarget(node, "key", SLinkOperations.getTarget(new _Quotations.QuotationClass_2().createNode(), "variableDeclaration", false), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
