/*
 * Copyright 2003-2010 JetBrains s.r.o.
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
package jetbrains.mps.plugins.pluginparts.actions;

import jetbrains.mps.workbench.action.BaseAction;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public abstract class GeneratedAction extends BaseAction {
  protected GeneratedAction() {
  }

  protected GeneratedAction(String text) {
    super(text);
  }

  protected GeneratedAction(String text, String description, Icon icon) {
    super(text, description, icon);
  }

  @Deprecated
  public void cleanup() {


  }
}
