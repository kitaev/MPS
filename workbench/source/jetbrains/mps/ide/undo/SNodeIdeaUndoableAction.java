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
package jetbrains.mps.ide.undo;

import com.intellij.openapi.command.undo.DocumentReference;
import com.intellij.openapi.command.undo.UndoableAction;
import com.intellij.openapi.command.undo.UnexpectedUndoException;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNodeUndoableAction;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;

import java.util.*;
import java.util.Map.Entry;

class SNodeIdeaUndoableAction implements UndoableAction {
  private boolean myIsGlobal;
  private DocumentReference[] myAffectedDocuments;
  private Map<MPSNodeVirtualFile, Long> myChangedTimestamps = new HashMap<MPSNodeVirtualFile, Long>();

  private List<SNodeUndoableAction> myWrapped;

  SNodeIdeaUndoableAction(List<SNodeUndoableAction> wrapped) {
    myWrapped = wrapped;
    List<DocumentReference> affected = new LinkedList<DocumentReference>();

    myIsGlobal = false;
    for (SNodeUndoableAction a : wrapped) {
      myIsGlobal |= a.isGlobal();
    }

    if (myIsGlobal) {
      myAffectedDocuments = new DocumentReference[0];
      return;
    }

    for (SNodeUndoableAction a : wrapped) {
      if (a.getRoot() != null) {
        MPSNodeVirtualFile file = MPSNodesVirtualFileSystem.getInstance().getFileFor(a.getRoot());
        assert file.isValid() : "Invalid file was returned by VFS node is not available: " + file.getNode();
        myChangedTimestamps.put(file, file.getModificationStamp());

        if (MPSUndoUtil.getDoc(file) != null) {
          affected.add(MPSUndoUtil.getRefForDoc(MPSUndoUtil.getDoc(file)));
        }
      }

    }

    myAffectedDocuments = affected.toArray(new DocumentReference[affected.size()]);
  }

  public final void undo() throws UnexpectedUndoException {
    ModelAccess.instance().executeCommand(new Runnable() {
      public void run() {
        for (Entry<MPSNodeVirtualFile, Long> e : myChangedTimestamps.entrySet()) {
          e.getKey().setModificationStamp(e.getValue());
        }

        List<SNodeUndoableAction> rev = new LinkedList<SNodeUndoableAction>(myWrapped);
        Collections.reverse(rev);
        for (SNodeUndoableAction a : rev) {
          a.undo();
        }
      }
    });
  }

  public final void redo() throws UnexpectedUndoException {
    ModelAccess.instance().executeCommand(new Runnable() {
      public void run() {
        for (SNodeUndoableAction a : myWrapped) {
          a.redo();
        }
      }
    });
  }

  public DocumentReference[] getAffectedDocuments() {
    return myAffectedDocuments;
  }

  public boolean isGlobal() {
    return myIsGlobal;
  }
}
