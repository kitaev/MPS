/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.util;

import javax.swing.*;
import java.awt.*;

/**
 * @author Kostik
 */
public class JSplitPaneWithoutBorders extends JSplitPane {
  public JSplitPaneWithoutBorders(int newOrientation, Component newLeftComponent, Component newRightComponent) {
    super(newOrientation, true, newLeftComponent, newRightComponent);
    setBorder(null);

    if (getLeftComponent() instanceof JComponent) {
      ((JComponent) getLeftComponent()).setBorder(null);
    }

    if (getRightComponent() instanceof JComponent) {
      ((JComponent) getRightComponent()).setBorder(null);
    }
  }
}
