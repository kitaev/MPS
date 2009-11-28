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
package jetbrains.mps.vcs.diff.ui;

import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.impl.ApplicationImpl;
import com.intellij.openapi.graph.base.DataProvider;
import com.intellij.openapi.diff.DiffManager;
import com.intellij.openapi.diff.DiffRequest;
import com.intellij.openapi.diff.MergeRequest;
import com.intellij.openapi.diff.impl.mergeTool.MergeRequestImpl;
import com.intellij.idea.IdeaTestApplication;
import static jetbrains.mps.TestMain.configureMPS;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.util.JDOMUtil;
import jetbrains.mps.vcs.ModelUtils;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.*;
import jetbrains.mps.project.MPSProject.ProjectScope;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.TestMain;
import jetbrains.mps.library.LibraryManager;
import jetbrains.mps.library.Library;
import jetbrains.mps.library.BaseLibraryManager.MyState;
import jetbrains.mps.nodeEditor.EditorManager;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jetbrains.annotations.NotNull;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.Set;

public class TestMergeDialog {
  private static EditorManager myEditorManager = new EditorManager();

  public static void main(final String[] args) throws JDOMException, IOException {
    IdeMain.setTestMode(TestMode.NO_TEST);
    configureMPS();

    final SModel baseModel = ModelUtils.readModel(args[0]);
    final SModel mineModel = ModelUtils.readModel(args[1]);
    final SModel newModel = ModelUtils.readModel(args[2]);

    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        LibraryManager manager = LibraryManager.getInstance();
        MyState state = manager.getState();
        Library webrdnq = new Library();
        webrdnq.setName("webr-dnq");
        webrdnq.setPath("/media/d/devel/webr-dnq");
        state.getLibraries().put(webrdnq.getName(), webrdnq);
        Library charisma = new Library();
        charisma.setName("charisma");
        charisma.setPath("/media/d/devel/charisma");
        state.getLibraries().put(charisma.getName(), charisma);
        manager.loadState(state);
        manager.update();
      }
    });

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        final MergeModelsDialog dialog = ModelAccess.instance().runReadAction(new Computable<MergeModelsDialog>() {
          public MergeModelsDialog compute() {
            IOperationContext context = new StandaloneMPSContext() {

              public MPSProject getMPSProject() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
              }

              public IModule getModule() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
              }

              @NotNull
              public IScope getScope() {
                return GlobalScope.getInstance();
              }

              @Override
              public <T> T getComponent(Class<T> clazz) {
                if (clazz == EditorManager.class) {
                  return (T) myEditorManager;
                }
                return null;
              }
            };

            return new MergeModelsDialog(context, baseModel, mineModel, newModel);
          }
        });
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.showDialog();

        final SModel result = dialog.getResultModel();
        if (result == null) {
          dialog.dispose();
          System.exit(0);
        }
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            IFile iFile = FileSystem.getFile(args[3]);
            if (!iFile.exists()) iFile.createNewFile();
            ModelPersistence.saveModel(result, iFile);
          }
        });
        dialog.dispose();
        System.exit(0);
      }
    });
  }

}
