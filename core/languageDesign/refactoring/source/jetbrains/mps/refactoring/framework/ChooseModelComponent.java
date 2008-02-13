package jetbrains.mps.refactoring.framework;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Condition;

import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.BorderLayout;

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
    add(myChooseNodeOrModelComponent, BorderLayout.CENTER);
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