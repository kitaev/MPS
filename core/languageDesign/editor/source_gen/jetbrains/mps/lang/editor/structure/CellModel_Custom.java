package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.EditorCellModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.structure.QueryFunction_CellProvider;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_Custom extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_Custom";
  public static final String CELL_PROVIDER = "cellProvider";

  public CellModel_Custom(SNode node) {
    super(node);
  }

  public QueryFunction_CellProvider getCellProvider() {
    return (QueryFunction_CellProvider)this.getChild(QueryFunction_CellProvider.class, CellModel_Custom.CELL_PROVIDER);
  }

  public void setCellProvider(QueryFunction_CellProvider node) {
    super.setChild(CellModel_Custom.CELL_PROVIDER, node);
  }


  public static CellModel_Custom newInstance(SModel sm, boolean init) {
    return (CellModel_Custom)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_Custom", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_Custom newInstance(SModel sm) {
    return CellModel_Custom.newInstance(sm, false);
  }

}
