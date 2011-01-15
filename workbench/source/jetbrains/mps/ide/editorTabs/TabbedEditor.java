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
package jetbrains.mps.ide.editorTabs;

import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;
import com.intellij.openapi.fileEditor.impl.FileEditorManagerImpl;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.FileStatusManager;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.BaseNodeEditor;
import jetbrains.mps.ide.MPSEditorState;
import jetbrains.mps.ide.editorTabs.tabs.TabsComponent;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import org.apache.commons.lang.ObjectUtils;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

import java.awt.BorderLayout;
import java.util.List;
import java.util.Set;

public class TabbedEditor extends BaseNodeEditor {
  private TabsComponent myTabsComponent;
  private SModelListener myModelListener = new MyNameListener();
  private TabColorProvider myColorProvider = null;
  private SNodePointer myBaseNode;
  private IOperationContext myContext;

  public TabbedEditor(SNodePointer baseNode, Set<EditorTabDescriptor> possibleTabs, IOperationContext context) {
    super(context);
    myBaseNode = baseNode;
    myContext = context;
    myColorProvider = Extensions.getRootArea().getExtensionPoint(TabColorProvider.EP_NAME).getExtension();

    myTabsComponent = new TabsComponent(baseNode, possibleTabs) {
      protected void changeNode(SNode newNode) {
        showNode(newNode, false);
      }
    };

    showNode(baseNode.getNode(), false);

    getComponent().add(myTabsComponent, BorderLayout.SOUTH);
  }

  public void dispose() {
    myTabsComponent.dispose();
    if (myColorProvider != null) {
      myColorProvider.stop(this);
    }
    super.dispose();
  }

  public List<SNodePointer> getAllEditedNodes() {
    return myTabsComponent.getAllEditedNodes();
  }

  public void showNode(SNode node, boolean select) {
    SNode containingRoot = node.isRoot() ? node : node.getContainingRoot();
    boolean rootChange = containingRoot != getCurrentlyEditedNode().getNode();
    myTabsComponent.setLastNode(new SNodePointer(node));

    if (rootChange) {
      if (myColorProvider != null) {
        myColorProvider.stop(this);
      }

      SModelDescriptor model = getCurrentNodeModel();
      if (model != null) {
        model.removeModelListener(myModelListener);
      }
    }

    EditorComponent editor = getCurrentEditorComponent();
    editor.editNode(containingRoot, new ModuleContext(containingRoot.getModel().getModelDescriptor().getModule(), myContext.getProject()));

    if (rootChange) {
      SModelDescriptor model = getCurrentNodeModel();
      assert model != null;

      model.addModelListener(myModelListener);

      if (myColorProvider != null) {
        myColorProvider.start(this);
      }

      updateProperties();
    }

    if (select) {
      editor.selectNode(node);
    }
  }

  private SModelDescriptor getCurrentNodeModel() {
    SNodePointer n = getCurrentlyEditedNode();
    if (n == null) return null;
    SNode node = n.getNode();
    if (node == null) return null;
    return node.getModel().getModelDescriptor();
  }

  private boolean updateProperties() {
    final Project project = getOperationContext().getProject();
    FileEditorManagerImpl manager = (FileEditorManagerImpl) FileEditorManager.getInstance(project);
    VirtualFile virtualFile = manager.getCurrentFile();
    if (virtualFile == null) return true;

    FileStatusManager.getInstance(project).fileStatusChanged(virtualFile);
    manager.updateFilePresentation(virtualFile);
    return false;
  }

  private class MyNameListener extends SModelAdapter {
    public void propertyChanged(SModelPropertyEvent event) {
      SNodePointer pointer = new SNodePointer(event.getNode());
      if (event.getPropertyName().equals(INamedConcept.NAME) && pointer.equals(getCurrentlyEditedNode())) {
        updateProperties();
      }
    }
  }

  public MPSEditorState saveState(@NotNull FileEditorStateLevel level) {
    TabbedEditorState state = new TabbedEditorState();
    state.myCurrentNode = getCurrentlyEditedNode();

    BaseEditorState superState = (BaseEditorState) super.saveState(level);
    state.refCopyFrom(superState);
    return state;
  }

  public void loadState(@NotNull final MPSEditorState state) {
    super.loadState(state);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (state instanceof TabbedEditorState) {
          SNode node = ((TabbedEditorState) state).myCurrentNode.getNode();
          showNode(node, false);
        } else {
          //regular editor was shown for that node last time
          showNode(myBaseNode.getNode(), false);
        }
      }
    });
  }

  public static class TabbedEditorState extends BaseEditorState implements MPSEditorState {
    private static final String NODE = "node";
    private static final String NODE_ID = "nodeId";
    private static final String MODEL_ID = "modelId";

    private SNodePointer myCurrentNode;

    public void save(Element e) {
      super.save(e);
      Element node = new Element(NODE);
      node.setAttribute(NODE_ID, myCurrentNode.getNodeId().toString());
      node.setAttribute(MODEL_ID, myCurrentNode.getModelReference().toString());
      e.addContent(node);
    }

    public void load(Element e) {
      super.load(e);
      Element nodeElem = e.getChild(NODE);

      String nodeId = nodeElem.getAttributeValue(NODE_ID);
      String modelId = nodeElem.getAttributeValue(MODEL_ID);
      myCurrentNode = new SNodePointer(modelId, nodeId);
    }

    public int hashCode() {
      return super.hashCode() * 13 + myCurrentNode.hashCode();
    }

    public boolean equals(Object obj) {
      if (!(obj instanceof TabbedEditorState)) return false;
      if (!super.equals(obj)) return false;
      return ObjectUtils.equals(myCurrentNode, ((TabbedEditorState) obj).myCurrentNode);
    }
  }
}
