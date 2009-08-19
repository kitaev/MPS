package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_CellMenuComponent extends CellMenuPart_Abstract {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_CellMenuComponent";
  public static final String CELL_MENU_COMPONENT = "cellMenuComponent";

  public CellMenuPart_CellMenuComponent(SNode node) {
    super(node);
  }

  public CellMenuComponent getCellMenuComponent() {
    return (CellMenuComponent)this.getReferent(CellMenuComponent.class, CellMenuPart_CellMenuComponent.CELL_MENU_COMPONENT);
  }

  public void setCellMenuComponent(CellMenuComponent node) {
    super.setReferent(CellMenuPart_CellMenuComponent.CELL_MENU_COMPONENT, node);
  }

  public static CellMenuPart_CellMenuComponent newInstance(SModel sm, boolean init) {
    return (CellMenuPart_CellMenuComponent)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_CellMenuComponent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_CellMenuComponent newInstance(SModel sm) {
    return CellMenuPart_CellMenuComponent.newInstance(sm, false);
  }
}
