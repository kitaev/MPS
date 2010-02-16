package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.Dimension;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import javax.swing.JCheckBox;
import javax.swing.event.TableModelListener;
import javax.swing.event.TableModelEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import javax.swing.table.TableCellEditor;
import javax.swing.JComponent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

/*package*/ class ParametersPanel extends JPanel {
  private static final int MINIMUM_TABLE_COLUMN_WIDTH = 50;

  private ExtractMethodRefactoringParameters myModel;
  private ParametersTableModel myTableModel;

  /*package*/ ParametersPanel(ExtractMethodRefactoringParameters params) {
    super();
    this.myModel = params;
    this.myTableModel = new ParametersTableModel(this.myModel.getParameters());
    this.initPanel();
  }

  private void initPanel() {
    this.setLayout(new GridBagLayout());

    final JTable parametersTable = new JTable(this.myTableModel);

    JPanel buttonsPanel = new JPanel(new GridBagLayout());
    final JButton upButton = this.createParametersRowMoveButton(parametersTable, "Move up", -1, 0, buttonsPanel);
    final JButton downButton = this.createParametersRowMoveButton(parametersTable, "Move down", 1, 1, buttonsPanel);

    parametersTable.setShowGrid(false);
    parametersTable.setCellSelectionEnabled(false);
    parametersTable.setRowSelectionAllowed(true);
    parametersTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    parametersTable.setIntercellSpacing(new Dimension(0, 0));
    parametersTable.setTableHeader(null);
    parametersTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent p0) {
        int s = parametersTable.getSelectedRow();
        upButton.setEnabled(s > 0);
        downButton.setEnabled(s != 0 && s < ListSequence.fromList(ParametersPanel.this.myModel.getParameters()).count() - 1);
      }
    });
    this.fitTableColumns(parametersTable);
    parametersTable.getColumnModel().getColumn(1).setCellEditor(this.createCellEditor());
    parametersTable.getColumnModel().getColumn(0).setMaxWidth(new JCheckBox().getPreferredSize().width);
    this.myTableModel.addTableModelListener(new TableModelListener() {
      public void tableChanged(TableModelEvent p0) {
        ParametersPanel.this.fitTableColumns(parametersTable);
      }
    });

    GridBagConstraints c = new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0);
    this.add(parametersTable, c);

    c.gridx = 1;
    c.weightx = 0;
    c.fill = GridBagConstraints.NONE;
    this.add(buttonsPanel, c);
  }

  /*package*/ ParametersTableModel getTableModel() {
    return this.myTableModel;
  }

  /*package*/ void fitTableColumns(JTable table) {
    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
      TableColumn column = table.getColumnModel().getColumn(i);
      int max = MINIMUM_TABLE_COLUMN_WIDTH;
      for (int j = 0; j < table.getRowCount(); j++) {
        TableCellRenderer r = table.getCellRenderer(j, i);
        Component c = r.getTableCellRendererComponent(table, table.getValueAt(j, i), false, false, j, i);
        int width = c.getPreferredSize().width;
        if (width > max) {
          max = width;
        }
      }
      column.setPreferredWidth(max);
    }
  }

  /*package*/ TableCellEditor createCellEditor() {
    return new ParameterTypeCellEditor(this.myModel);
  }

  private JButton createParametersRowMoveButton(final JTable parametersTable, String name, final int dr, int y, JComponent component) {
    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(2, 10, 2, 10);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 1;
    c.gridy = y;
    c.weightx = 0;
    c.weighty = 0;
    c.anchor = GridBagConstraints.PAGE_END;
    JButton button = new JButton(new AbstractAction(name) {
      public void actionPerformed(ActionEvent e) {
        int row = parametersTable.getSelectedRow();
        ParametersPanel.this.myTableModel.swapRows(row, row + dr);
        parametersTable.getSelectionModel().setSelectionInterval(row + dr, row + dr);
      }
    });
    button.setEnabled(false);
    component.add(button, c);
    return button;
  }
}
