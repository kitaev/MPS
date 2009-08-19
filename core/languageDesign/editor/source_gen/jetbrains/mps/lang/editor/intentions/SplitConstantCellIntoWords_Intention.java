package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SplitConstantCellIntoWords_Intention extends BaseIntention {
  public SplitConstantCellIntoWords_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.CellModel_Constant";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Split Constant Cell into Words";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if ((SNodeOperations.getParent(node) == null)) {
      return false;
    }
    String text = SPropertyOperations.getString(node, "text");
    if (text == null || text.length() == 0) {
      return false;
    }
    if (text.trim().contains(" ")) {
      return true;
    }
    return false;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    String text = SPropertyOperations.getString(node, "text").trim();
    SNode collection = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection", null);
    SLinkOperations.setNewChild(collection, "cellLayout", "jetbrains.mps.lang.editor.structure.CellLayout_Flow");
    SNodeOperations.replaceWithAnother(node, collection);
    String[] strings = text.split(" ");
    int i = 0;
    for (String word : strings) {
      SNode constantCell = SNodeOperations.copyNode(node);
      SPropertyOperations.set(constantCell, "text", word);
      boolean leftPaddingSet = false;
      boolean rightPaddingSet = false;
      for (SNode styleClassItem : SLinkOperations.getTargets(constantCell, "styleItem", true)) {
        if (SNodeOperations.isInstanceOf(styleClassItem, "jetbrains.mps.lang.editor.structure.PaddingLeftStyleClassItem")) {
          leftPaddingSet = true;
          if (i != 0) {
            SPropertyOperations.set(SNodeOperations.cast(styleClassItem, "jetbrains.mps.lang.editor.structure.PaddingLeftStyleClassItem"), "value", "0.5");
          }
        }
        if (SNodeOperations.isInstanceOf(styleClassItem, "jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem")) {
          rightPaddingSet = true;
          if (i != strings.length - 1) {
            SPropertyOperations.set(SNodeOperations.cast(styleClassItem, "jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem"), "value", "0.5");
          }
        }
      }
      if (!(leftPaddingSet)) {
        SNode paddingLeftStyleClassItem = SLinkOperations.addNewChild(constantCell, "styleItem", "jetbrains.mps.lang.editor.structure.PaddingLeftStyleClassItem");
        SPropertyOperations.set(paddingLeftStyleClassItem, "value", "0.5");
      }
      if (!(rightPaddingSet)) {
        SNode paddingRightStyleClassItem = SLinkOperations.addNewChild(constantCell, "styleItem", "jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem");
        SPropertyOperations.set(paddingRightStyleClassItem, "value", "0.5");
      }
      SLinkOperations.addChild(collection, "childCellModel", constantCell);
      i++ ;
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }
}
