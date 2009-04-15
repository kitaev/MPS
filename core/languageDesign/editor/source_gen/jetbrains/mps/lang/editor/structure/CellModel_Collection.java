package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.EditorCellModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.structure.CellLayout;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_Collection extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_Collection";
  public static final String VERTICAL = "vertical";
  public static final String GRID_LAYOUT = "gridLayout";
  public static final String USES_BRACES = "usesBraces";
  public static final String USES_FOLDING = "usesFolding";
  public static final String CELL_LAYOUT = "cellLayout";
  public static final String CHILD_CELL_MODEL = "childCellModel";

  public CellModel_Collection(SNode node) {
    super(node);
  }

  public boolean getVertical() {
    return this.getBooleanProperty(CellModel_Collection.VERTICAL);
  }

  public void setVertical(boolean value) {
    this.setBooleanProperty(CellModel_Collection.VERTICAL, value);
  }

  public boolean getGridLayout() {
    return this.getBooleanProperty(CellModel_Collection.GRID_LAYOUT);
  }

  public void setGridLayout(boolean value) {
    this.setBooleanProperty(CellModel_Collection.GRID_LAYOUT, value);
  }

  public boolean getUsesBraces() {
    return this.getBooleanProperty(CellModel_Collection.USES_BRACES);
  }

  public void setUsesBraces(boolean value) {
    this.setBooleanProperty(CellModel_Collection.USES_BRACES, value);
  }

  public boolean getUsesFolding() {
    return this.getBooleanProperty(CellModel_Collection.USES_FOLDING);
  }

  public void setUsesFolding(boolean value) {
    this.setBooleanProperty(CellModel_Collection.USES_FOLDING, value);
  }

  public CellLayout getCellLayout() {
    return (CellLayout)this.getChild(CellLayout.class, CellModel_Collection.CELL_LAYOUT);
  }

  public void setCellLayout(CellLayout node) {
    super.setChild(CellModel_Collection.CELL_LAYOUT, node);
  }

  public int getChildCellModelsCount() {
    return this.getChildCount(CellModel_Collection.CHILD_CELL_MODEL);
  }

  public Iterator<EditorCellModel> childCellModels() {
    return this.children(EditorCellModel.class, CellModel_Collection.CHILD_CELL_MODEL);
  }

  public List<EditorCellModel> getChildCellModels() {
    return this.getChildren(EditorCellModel.class, CellModel_Collection.CHILD_CELL_MODEL);
  }

  public void addChildCellModel(EditorCellModel node) {
    this.addChild(CellModel_Collection.CHILD_CELL_MODEL, node);
  }

  public void insertChildCellModel(EditorCellModel prev, EditorCellModel node) {
    this.insertChild(prev, CellModel_Collection.CHILD_CELL_MODEL, node);
  }


  public static CellModel_Collection newInstance(SModel sm, boolean init) {
    return (CellModel_Collection)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_Collection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_Collection newInstance(SModel sm) {
    return CellModel_Collection.newInstance(sm, false);
  }

}
