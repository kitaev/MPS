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

package jetbrains.mps.ide.tabbedEditor;

import jetbrains.mps.changesmanager.NodeFileStatusListener;
import jetbrains.mps.changesmanager.RootNodeFileStatusManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.workbench.nodesFs.MPSNodeVirtualFile;
import jetbrains.mps.workbench.nodesFs.MPSNodesVirtualFileSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLazyTab implements ILazyTab {
  private SNodePointer myBaseNode;
  private TabbedEditor myTabbedEditor;

  private SModelListener myModelListener = createModelListener();
  private List<SModelDescriptor> myModelsWithListeners = new ArrayList<SModelDescriptor>();

  private NodeFileStatusListener myNodeFileStatusListener = createFileStatusListener();


  public AbstractLazyTab(TabbedEditor tabbedEditor,SNode baseNode) {
    myTabbedEditor = tabbedEditor;
    myBaseNode = new SNodePointer(baseNode);

    RootNodeFileStatusManager statusManager = RootNodeFileStatusManager.getInstance(getTabbedEditor().getOperationContext().getProject());
    if (statusManager != null) {
      statusManager.addNodeFileStatusListener(myNodeFileStatusListener);
    }    
  }

  public TabbedEditor getTabbedEditor() {
    return myTabbedEditor;
  }
  
  public SNode getBaseNode() {
    return myBaseNode.getNode();
  }

  public MPSNodeVirtualFile getBaseNodeVirtualFile() {
    return MPSNodesVirtualFileSystem.getInstance().getFileFor(myBaseNode);
  }

  protected IOperationContext getOperationContext() {
    return getTabbedEditor().getOperationContext();
  }

  //todo make protected
  public void addModelToListen(SModelDescriptor model) {
    if (myModelsWithListeners.contains(model)) return;
    myModelsWithListeners.add(model);
    model.addModelListener(myModelListener);
  }

  public void dispose() {
    RootNodeFileStatusManager statusManager = RootNodeFileStatusManager.getInstance(getTabbedEditor().getOperationContext().getProject());
    if (statusManager != null) {
      statusManager.removeNodeFileStatusListener(myNodeFileStatusListener);
    }
    
    for (SModelDescriptor d : myModelsWithListeners) {
      d.removeModelListener(myModelListener);
    }
    myModelsWithListeners.clear();
  }

  protected abstract SModelListener createModelListener();
  protected abstract NodeFileStatusListener createFileStatusListener();
  protected abstract boolean checkNodeStateChanged();
}
