package jetbrains.mps.ide.common;

/*Generated by MPS */

import javax.swing.DefaultListCellRenderer;
import java.awt.Component;
import javax.swing.JList;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;

public class ReadComboBoxRenderrer extends DefaultListCellRenderer {
  public ReadComboBoxRenderrer() {
  }

  public Component getListCellRendererComponent(final JList list, final Object value, final int index, final boolean isSelected, final boolean cellHasFocus) {
    final Wrappers._T<Component> result = new Wrappers._T<Component>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        result.value = getListCellRenderretComponentInternal(list, value, index, isSelected, cellHasFocus);
      }
    });
    return result.value;
  }

  private Component getListCellRenderretComponentInternal(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
    return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
  }
}
