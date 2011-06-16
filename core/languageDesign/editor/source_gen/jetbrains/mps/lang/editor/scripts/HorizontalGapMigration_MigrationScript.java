package jetbrains.mps.lang.editor.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.lang.editor.behavior.IStyleContainer_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class HorizontalGapMigration_MigrationScript extends BaseMigrationScript {
  public HorizontalGapMigration_MigrationScript(IOperationContext operationContext) {
    super("horizontal gap migration");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Padding right delete";
      }

      public String getAdditionalInfo() {
        return "Padding right delete";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SPropertyOperations.getString(node, "value").equals("1.0") || SPropertyOperations.getString(node, "value").equals("1.");
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
        return "Padding left delete";
      }

      public String getAdditionalInfo() {
        return "Padding left delete";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.PaddingLeftStyleClassItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SPropertyOperations.getString(node, "value").equals("1.0") || SPropertyOperations.getString(node, "value").equals("1.");
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
        return "Last position allowed replacement";
      }

      public String getAdditionalInfo() {
        return "Last position allowed replacement";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.LastPositionAllowedStyleClassItem";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        List<SNode> paddingRight = IStyleContainer_Behavior.call_getClassItems_1219419901278(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.IStyleContainer"), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem"));
        return SPropertyOperations.getBoolean(node, "flag") == false && ListSequence.fromList(paddingRight).isNotEmpty();
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
        List<SNode> paddingRigth = IStyleContainer_Behavior.call_getClassItems_1219419901278(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.IStyleContainer"), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem"));
        if (ListSequence.fromList(paddingRigth).isNotEmpty()) {
          SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem", null);
          SPropertyOperations.set(newNode, "flag", "" + true);
          SNodeOperations.insertNextSiblingChild(node, newNode);
        }
        SNode newNode2 = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem", null);
        SPropertyOperations.set(newNode2, "flag", "" + true);
        SNodeOperations.insertNextSiblingChild(node, newNode2);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Add punctuation left to constant cell";
      }

      public String getAdditionalInfo() {
        return "Add punctuation left to constant cell";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.editor.structure.CellModel_Constant";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
          SNode prev = SNodeOperations.getPrevSibling(node);
          if (ListSequence.fromList(IStyleContainer_Behavior.call_getClassItems_1219419901278(SNodeOperations.cast(prev, "jetbrains.mps.lang.editor.structure.EditorCellModel"), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem"))).isNotEmpty()) {
            return true;
          }
          if (SNodeOperations.isInstanceOf(prev, "jetbrains.mps.lang.editor.structure.CellModel_RefCell")) {
            if (ListSequence.fromList(IStyleContainer_Behavior.call_getClassItems_1219419901278(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(prev, "jetbrains.mps.lang.editor.structure.CellModel_RefCell"), "editorComponent", true), "cellModel", true), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem"))).isNotEmpty()) {
              return true;
            }
          }
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem", null);
        SPropertyOperations.set(newNode, "flag", "" + true);
        ListSequence.fromList(SLinkOperations.getTargets(node, "styleItem", true)).addElement(newNode);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }
}
