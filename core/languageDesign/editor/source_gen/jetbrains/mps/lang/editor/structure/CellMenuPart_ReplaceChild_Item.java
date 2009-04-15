package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.CellMenuPart_Abstract;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_Item_Create;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_ReplaceChild_Item extends CellMenuPart_Abstract {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_Item";
  public static final String MATCHING_TEXT = "matchingText";
  public static final String DESCRIPTION_TEXT = "descriptionText";
  public static final String CREATE_FUNCTION = "createFunction";

  public CellMenuPart_ReplaceChild_Item(SNode node) {
    super(node);
  }

  public String getMatchingText() {
    return this.getProperty(CellMenuPart_ReplaceChild_Item.MATCHING_TEXT);
  }

  public void setMatchingText(String value) {
    this.setProperty(CellMenuPart_ReplaceChild_Item.MATCHING_TEXT, value);
  }

  public String getDescriptionText() {
    return this.getProperty(CellMenuPart_ReplaceChild_Item.DESCRIPTION_TEXT);
  }

  public void setDescriptionText(String value) {
    this.setProperty(CellMenuPart_ReplaceChild_Item.DESCRIPTION_TEXT, value);
  }

  public CellMenuPart_ReplaceChild_Item_Create getCreateFunction() {
    return (CellMenuPart_ReplaceChild_Item_Create)this.getChild(CellMenuPart_ReplaceChild_Item_Create.class, CellMenuPart_ReplaceChild_Item.CREATE_FUNCTION);
  }

  public void setCreateFunction(CellMenuPart_ReplaceChild_Item_Create node) {
    super.setChild(CellMenuPart_ReplaceChild_Item.CREATE_FUNCTION, node);
  }


  public static CellMenuPart_ReplaceChild_Item newInstance(SModel sm, boolean init) {
    return (CellMenuPart_ReplaceChild_Item)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_Item", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_ReplaceChild_Item newInstance(SModel sm) {
    return CellMenuPart_ReplaceChild_Item.newInstance(sm, false);
  }

}
