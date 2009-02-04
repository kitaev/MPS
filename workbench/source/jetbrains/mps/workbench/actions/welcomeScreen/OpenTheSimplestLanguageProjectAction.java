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
package jetbrains.mps.workbench.actions.welcomeScreen;

import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.workbench.actions.help.Icons;
import jetbrains.mps.util.PathManager;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.ide.impl.ProjectUtil;

import java.io.File;

public class OpenTheSimplestLanguageProjectAction extends AnAction {
  public OpenTheSimplestLanguageProjectAction() {
    getTemplatePresentation().setIcon(Icons.OPEN_SAMPLE);
  }

  public void actionPerformed(AnActionEvent e) {
    String projectFile = PathManager.getSamplesPath() + File.separator + "theSimplestLanguage" + File.separator + "theSimplestLanguage.mpr";
    ProjectUtil.openProject(projectFile, e.getData(PlatformDataKeys.PROJECT), false);
  }
}
