/*
 * Copyright 2003-2008 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.refactoring.framework;

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
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
public class ChooseModelComponent implements IChooseComponent<SModel> {
  private ChooseNodeOrModelComponent myChooseNodeOrModelComponent;

  public ChooseModelComponent(IOperationContext operationContext) {
    myChooseNodeOrModelComponent = new ChooseNodeOrModelComponent(operationContext, null, true, false, true);
  }

  public SModel submit() throws InvalidInputValueException {
    return (SModel) myChooseNodeOrModelComponent.submit();
  }

  public String getPropertyName() {
    return myChooseNodeOrModelComponent.getPropertyName();
  }

  public void setPropertyName(String propertyName) {
    myChooseNodeOrModelComponent.setPropertyName(propertyName);
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

  public JComponent getMainComponent() {
    return myChooseNodeOrModelComponent;
  }

  public void setCaption(String caption) {
    myChooseNodeOrModelComponent.setCaption(caption);
  }

  public void initComponent() {
    myChooseNodeOrModelComponent.initComponent();
  }
}
