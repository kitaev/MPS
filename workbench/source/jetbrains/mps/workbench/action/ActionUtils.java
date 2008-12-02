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
package jetbrains.mps.workbench.action;

import com.intellij.openapi.actionSystem.*;
import jetbrains.mps.logging.Logger;

import javax.swing.JPopupMenu;

public class ActionUtils {
  private static final Logger LOG = Logger.getLogger(ActionUtils.class);

  public static void updateGroup(ActionGroup group, AnActionEvent e) {
    try {
      group.update(e);
    } catch (Throwable t) {
      LOG.error(t);
    }
    for (AnAction child : group.getChildren(null)) {
      try {
        child.update(e);
      } catch (Throwable t) {
        LOG.error(t);
      }
      if (child instanceof ActionGroup) updateGroup((ActionGroup) child, e);
    }
  }

  public static BaseGroup getGroup(String id) {
    return ((BaseGroup) ActionManager.getInstance().getAction(id));
  }

  public static DefaultActionGroup getDefaultGroup(String id) {
    return ((DefaultActionGroup) ActionManager.getInstance().getAction(id));
  }

  public static DefaultActionGroup groupFromActions(AnAction... actions) {
    DefaultActionGroup g = new DefaultActionGroup();
    for (AnAction action : actions) {
      if (action!=null){
        g.add(action);
      }
    }
    return g;
  }

  public static AnActionEvent createEvent(String place, DataContext context) {
    AnActionEvent res = new AnActionEvent(null, context, place, new Presentation(), ActionManager.getInstance(), 0);
    return res;
  }
}
