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
package jetbrains.mps.workbench.highlighter;

import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerEvent;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.fileEditor.FileEditorManagerListener.Before;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.messages.MessageBusConnection;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.workbench.editors.MPSFileNodeEditor;
import jetbrains.mps.logging.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditorsProvider {
  private static Logger LOG = Logger.getLogger(EditorsProvider.class);

  private Project myProject;

  private List<MPSFileNodeEditor> myEditors = new ArrayList<MPSFileNodeEditor>();

  private List<EditorOpenListener> myEditorOpenListeners = new ArrayList<EditorOpenListener>();

  private final Object myLock = new Object();

  private MessageBusConnection myMessageBusConnection;

  public EditorsProvider(Project project) {
    myProject = project;

    FileEditorManagerListener editorManagerListener = new FileEditorManagerListener() {
      public void fileOpened(FileEditorManager source, VirtualFile file) {
        updateInformation();
        FileEditor selectedEditor = source.getSelectedEditor(file);
        if (selectedEditor instanceof MPSFileNodeEditor) {
          MPSFileNodeEditor editor = (MPSFileNodeEditor) selectedEditor;
          fireEditorOpened(editor);
        }
      }

      public void fileClosed(FileEditorManager source, VirtualFile file) {
        updateInformation();
        /*
        FileEditor selectedEditor = source.getSelectedEditor(file);
        dumpFileEditors(source.getAllEditors());
        if (selectedEditor instanceof MPSFileNodeEditor) {
          MPSFileNodeEditor editor = (MPSFileNodeEditor) selectedEditor;
          fireEditorClosed(editor.getNodeEditor());
        }
        */
      }

      public void selectionChanged(FileEditorManagerEvent event) {
        updateInformation();
      }
    };

    updateInformation();

    myMessageBusConnection = myProject.getMessageBus().connect();
    myMessageBusConnection.subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, editorManagerListener);
    myMessageBusConnection.subscribe(FileEditorManagerListener.Before.FILE_EDITOR_MANAGER, new Before() {
      @Override
      public void beforeFileOpened(FileEditorManager source, VirtualFile file) {
      }

      @Override
      public void beforeFileClosed(FileEditorManager source, VirtualFile file) {
        updateInformation();
        FileEditor selectedEditor = source.getSelectedEditor(file);
        if (selectedEditor instanceof MPSFileNodeEditor) {
          MPSFileNodeEditor editor = (MPSFileNodeEditor) selectedEditor;
          fireEditorClosed(editor);
        }
      }
    });
  }

  //todo add synchronization if necessary
  public void addEditorOpenListener(EditorOpenListener listener) {
    myEditorOpenListeners.add(listener);
  }

  //todo add synchronization if necessary
  public void removeEditorOpenListener(EditorOpenListener listener) {
    myEditorOpenListeners.remove(listener);
  }

  //todo add synchronization if necessary
  private void fireEditorOpened(MPSFileNodeEditor editor) {
    for (EditorOpenListener listener : myEditorOpenListeners) {
      listener.editorOpened(editor);
    }
  }

  //todo add synchronization if necessary
  private void fireEditorClosed(MPSFileNodeEditor editor) {
    for (EditorOpenListener listener : myEditorOpenListeners) {
      listener.editorClosed(editor);
    }
  }

  private void updateInformation() {
    synchronized (myLock) {
      myEditors.clear();

      FileEditorManager fileEditorManager = FileEditorManager.getInstance(myProject);
      for (FileEditor fileEditor : fileEditorManager.getSelectedEditors()) {
        if (fileEditor instanceof MPSFileNodeEditor) {
          MPSFileNodeEditor mpsFileNodeEditor = (MPSFileNodeEditor) fileEditor;
          IEditor nodeEditor = mpsFileNodeEditor.getNodeEditor();
          if (nodeEditor != null) {
            myEditors.add(mpsFileNodeEditor);
          }
        }
      }
    }
  }

  public List<MPSFileNodeEditor> getEditors() {
    return myEditors;
  }

  public List<IEditor> getAllEditors() {
    List<MPSFileNodeEditor> emptyEditors = new ArrayList<MPSFileNodeEditor>(0);
    List<IEditor> result = new ArrayList<IEditor>();
    synchronized (myLock) {
      for (MPSFileNodeEditor e : myEditors) {
        IEditor editor = e.getNodeEditor();
        if (editor != null) {
          result.add(editor);
        } else {
          emptyEditors.add(e);
        }
      }
    }
    for (MPSFileNodeEditor emptyEditor : emptyEditors) {
      LOG.error("MPSFileNodeEditor has null editor : " + emptyEditor);
    }
    return result;
  }
}
