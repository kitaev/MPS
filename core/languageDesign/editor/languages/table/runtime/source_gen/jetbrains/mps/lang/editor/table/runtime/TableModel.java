package jetbrains.mps.lang.editor.table.runtime;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public interface TableModel {
  public int getColumnsNumber();
  public int getRowsNumber();
  public void deleteRow(int row);
  public SNode getValueAt(int row, int column);
  public void createElement(int row, int column);
  public void insertRow(int row);
}
