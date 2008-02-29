package jetbrains.mps.refactoring.framework;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Condition;

import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 18.12.2007
 * Time: 20:04:41
 * To change this template use File | Settings | File Templates.
 */
public class ChooseModelComponent extends JPanel implements IChooseComponent<SModel> {
  private ChooseNodeOrModelComponent myChooseNodeOrModelComponent;

  public ChooseModelComponent(String caption, String propertyName, ActionContext actionContext) {
    myChooseNodeOrModelComponent = new ChooseNodeOrModelComponent(caption, propertyName, actionContext, null, true, false, true);
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.fill = GridBagConstraints.BOTH;
    constraints.weightx = 1;
    constraints.weighty = 1;
    add(myChooseNodeOrModelComponent, constraints);
  }

  public SModel submit() throws InvalidInputValueException {
    return (SModel) myChooseNodeOrModelComponent.submit();
  }

  public String getPropertyName() {
    return myChooseNodeOrModelComponent.getPropertyName();
  }

  public void setInitialValue(SModel initialValue) {
    myChooseNodeOrModelComponent.setInitialValue(initialValue);
  }

  public void setCondition(Condition<SModel> condition) {
    myChooseNodeOrModelComponent.setCondition((Condition) condition);
  }

  public JComponent getComponentToFocus() {
    return myChooseNodeOrModelComponent.getComponentToFocus();
  }
}