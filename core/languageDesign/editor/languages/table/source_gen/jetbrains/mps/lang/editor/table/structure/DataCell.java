package jetbrains.mps.lang.editor.table.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DataCell extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.table.structure.DataCell";
  public static final String VALUE = "value";

  public DataCell(SNode node) {
    super(node);
  }

  public String getValue() {
    return this.getProperty(DataCell.VALUE);
  }

  public void setValue(String value) {
    this.setProperty(DataCell.VALUE, value);
  }

  public static DataCell newInstance(SModel sm, boolean init) {
    return (DataCell) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.table.structure.DataCell", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DataCell newInstance(SModel sm) {
    return DataCell.newInstance(sm, false);
  }
}
