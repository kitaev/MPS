package jetbrains.mps.lang.editor.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class HorizontalGapMigration_MigrationScript extends BaseMigrationScript {

  public HorizontalGapMigration_MigrationScript(IOperationContext operationContext) {
    super("horizontal gap migration");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "Pardding rigth delete";
      }

      public String getAdditionalInfo() {
        return "Pardding rigth delete";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SPropertyOperations.getString(node, "value").equals("0.0") || SPropertyOperations.getString(node, "value").equals("0.");
      }

      public void doUpdateInstanceNode(SNode node) {
        SNodeOperations.deleteNode(node);
      }

      public boolean isShowAsIntention() {
        return false;
      }

    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "First posiotion allowed repacement";
      }

      public String getAdditionalInfo() {
        return "First posiotion allowed repacement";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.FirstPositionAllowedStyleClassItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SPropertyOperations.getBoolean(node, "flag") == false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem", null);
        SPropertyOperations.set(newNode, "flag", "" + true);
        SNodeOperations.replaceWithAnother(node, newNode);
      }

      public boolean isShowAsIntention() {
        return false;
      }

    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "Last position allowad replacement";
      }

      public String getAdditionalInfo() {
        return "Last position allowad replacement";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.LastPositionAllowedStyleClassItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SPropertyOperations.getBoolean(node, "flag") == false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem", null);
        SPropertyOperations.set(newNode, "flag", "" + true);
        SNodeOperations.replaceWithAnother(node, newNode);
      }

      public boolean isShowAsIntention() {
        return false;
      }

    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {

      public String getName() {
        return "Selectable false";
      }

      public String getAdditionalInfo() {
        return "Selectable false";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SPropertyOperations.getBoolean(node, "flag") == false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem", null);
        SPropertyOperations.set(newNode, "flag", "" + true);
        SNodeOperations.insertNextSiblingChild(node, newNode);
        SNode newNode2 = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem", null);
        SPropertyOperations.set(newNode2, "flag", "" + true);
        SNodeOperations.insertNextSiblingChild(node, newNode2);
      }

      public boolean isShowAsIntention() {
        return false;
      }

    });
  }
}
