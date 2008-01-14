package jetbrains.mps.ide;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

/**
 * Created by IntelliJ IDEA.
* User: Cyril.Konopko
* Date: 14.01.2008
* Time: 15:13:28
* To change this template use File | Settings | File Templates.
*/
public class ChooseItemWindowCellRenderer<Item> extends JPanel implements ListCellRenderer {
  private JLabel myTextLabel;
  private JLabel myDescriptionLabel;
  private ChooseItemComponent<Item> myChooseItemComponent;

  public ChooseItemWindowCellRenderer(ChooseItemComponent<Item> chooseItemComponent) {
    myChooseItemComponent = chooseItemComponent;

    setLayout(new BorderLayout());

    myTextLabel = new JLabel();
    add(myTextLabel, BorderLayout.CENTER);

    myDescriptionLabel = new JLabel();
    myDescriptionLabel.setForeground(Color.GRAY);
    add(myDescriptionLabel, BorderLayout.EAST);
  }

  public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
    Item item = (Item) value;
    setIcon(myChooseItemComponent.getItemIcon(item));
    if (isSelected) {
      setBackground(list.getSelectionBackground());
      setForeground(list.getSelectionForeground());
      myDescriptionLabel.setForeground(null);
    } else {
      setBackground(Color.WHITE);
      setForeground(myChooseItemComponent.getItemColor(item));
      myDescriptionLabel.setForeground(Color.GRAY);
    }
    setText(myChooseItemComponent.getItemPresentation(item));
    setDescription(myChooseItemComponent.getItemDescription(item));
    setEnabled(list.isEnabled());
    setFont(list.getFont());

    return this;
  }

  private void setIcon(Icon icon) {
    myTextLabel.setIcon(icon);
  }

  private void setText(String description) {
    myTextLabel.setText(description);
  }

  private void setDescription(String description) {
    myDescriptionLabel.setText(description);
  }
}
