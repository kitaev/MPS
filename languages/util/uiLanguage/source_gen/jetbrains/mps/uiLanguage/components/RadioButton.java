package jetbrains.mps.uiLanguage.components;

/*Generated by MPS */

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;

public class RadioButton extends JButton {
  public RadioButton myThis;
  private boolean mySelected;
  private ButtonGroup myGroup;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public RadioButton() {
    this.myThis = this;
    RadioButton component = this;
    this.myEvents.initialize();
  }

  public Events getEvents() {
    return this.myEvents;
  }

  public void addNotify() {
    super.addNotify();
    this.bind();
  }

  public void removeNotify() {
    this.unbind();
    super.removeNotify();
  }

  private void bind() {
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  public boolean getSelected() {
    return this.mySelected;
  }

  public ButtonGroup getGroup() {
    return this.myGroup;
  }

  public void setSelected(boolean newValue) {
    boolean oldValue = this.mySelected;
    this.mySelected = newValue;
    this.firePropertyChange("selected", oldValue, newValue);
  }

  public void setGroup(ButtonGroup newValue) {
    ButtonGroup oldValue = this.myGroup;
    this.myGroup = newValue;
    this.firePropertyChange("group", oldValue, newValue);
  }
}
