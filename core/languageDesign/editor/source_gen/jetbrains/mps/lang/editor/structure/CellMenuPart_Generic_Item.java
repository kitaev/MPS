package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_Generic_Item extends CellMenuPart_Abstract {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Item";
  public static final String MATCHING_TEXT = "matchingText";
  public static final String HANDLER_FUNCTION = "handlerFunction";

  public CellMenuPart_Generic_Item(SNode node) {
    super(node);
  }

  public String getMatchingText() {
    return this.getProperty(CellMenuPart_Generic_Item.MATCHING_TEXT);
  }

  public void setMatchingText(String value) {
    this.setProperty(CellMenuPart_Generic_Item.MATCHING_TEXT, value);
  }

  public CellMenuPart_Generic_Item_Handler getHandlerFunction() {
    return (CellMenuPart_Generic_Item_Handler)this.getChild(CellMenuPart_Generic_Item_Handler.class, CellMenuPart_Generic_Item.HANDLER_FUNCTION);
  }

  public void setHandlerFunction(CellMenuPart_Generic_Item_Handler node) {
    super.setChild(CellMenuPart_Generic_Item.HANDLER_FUNCTION, node);
  }

  public static CellMenuPart_Generic_Item newInstance(SModel sm, boolean init) {
    return (CellMenuPart_Generic_Item)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Item", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_Generic_Item newInstance(SModel sm) {
    return CellMenuPart_Generic_Item.newInstance(sm, false);
  }
}
