package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuDescriptor extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuDescriptor";
  public static final String CELL_MENU_PART = "cellMenuPart";

  public CellMenuDescriptor(SNode node) {
    super(node);
  }

  public int getCellMenuPartsCount() {
    return this.getChildCount(CellMenuDescriptor.CELL_MENU_PART);
  }

  public Iterator<CellMenuPart_Abstract> cellMenuParts() {
    return this.children(CellMenuPart_Abstract.class, CellMenuDescriptor.CELL_MENU_PART);
  }

  public List<CellMenuPart_Abstract> getCellMenuParts() {
    return this.getChildren(CellMenuPart_Abstract.class, CellMenuDescriptor.CELL_MENU_PART);
  }

  public void addCellMenuPart(CellMenuPart_Abstract node) {
    this.addChild(CellMenuDescriptor.CELL_MENU_PART, node);
  }

  public void insertCellMenuPart(CellMenuPart_Abstract prev, CellMenuPart_Abstract node) {
    this.insertChild(prev, CellMenuDescriptor.CELL_MENU_PART, node);
  }

  public static CellMenuDescriptor newInstance(SModel sm, boolean init) {
    return (CellMenuDescriptor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuDescriptor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuDescriptor newInstance(SModel sm) {
    return CellMenuDescriptor.newInstance(sm, false);
  }
}
