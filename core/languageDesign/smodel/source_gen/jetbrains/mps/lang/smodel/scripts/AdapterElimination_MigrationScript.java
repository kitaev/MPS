package jetbrains.mps.lang.smodel.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.baseLanguage.behavior.Interface_Behavior;

public class AdapterElimination_MigrationScript extends BaseMigrationScript {
  public AdapterElimination_MigrationScript(IOperationContext operationContext) {
    super("findAdapters");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "findAdapterClassUsagesInVariableDeclarations";
      }

      public String getAdditionalInfo() {
        return "findAdapterClassUsagesInVariableDeclarations";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
          return false;
        }
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        return ClassConcept_Behavior.call_isDescendant_1213877355812(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_5().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "findAdapterInterfaceUsagesInVariableDeclarations";
      }

      public String getAdditionalInfo() {
        return "findAdapterInterfaceUsagesInVariableDeclarations";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
          return false;
        }
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"))) {
          return false;
        }
        return Interface_Behavior.call_isDescendant_1238269307226(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"), SNodeOperations.cast(SLinkOperations.getTarget(new _Quotations.QuotationClass_6().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface"));
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
