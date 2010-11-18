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
package jetbrains.mps.debug.api;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.debug.api.DebugSessionManagerComponent.DebugSessionAdapter;
import jetbrains.mps.debug.api.DebugSessionManagerComponent.DebugSessionListener;
import jetbrains.mps.debug.api.breakpoints.*;
import jetbrains.mps.debug.api.integration.ui.breakpoint.BreakpointIconRenderer;
import jetbrains.mps.debug.api.integration.ui.breakpoint.MPSBreakpointPainter;
import jetbrains.mps.generator.traceInfo.TraceInfoCache;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.LeftMarginMouseListener;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.traceInfo.DebugInfo;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.editors.MPSFileNodeEditor;
import jetbrains.mps.workbench.highlighter.EditorOpenListener;
import jetbrains.mps.workbench.highlighter.EditorsProvider;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.event.MouseEvent;
import java.util.*;

@State(
  name = "BreakpointManager",
  storages = {
    @Storage(
      id = "other",
      file = "$WORKSPACE_FILE$"
    )
  }
)
public class BreakpointManagerComponent implements ProjectComponent, PersistentStateComponent<Element> {
  private static final Logger LOG = Logger.getLogger(BreakpointManagerComponent.class);
  private static final String BREAKPOINTS_LIST_ELEMENT = "breakpointsList";
  private static final String BREAKPOINT_ELEMENT = "breakpoint";
  private static final String KIND_TAG = "kind";

  private final Project myProject;
  private final DebugInfoManager myDebugInfoManager;
  private final BreakpointProvidersManager myProvidersManager;

  private final EditorsProvider myEditorsProvider;
  private final Map<SNodePointer, Set<ILocationBreakpoint>> myRootsToBreakpointsMap = new HashMap<SNodePointer, Set<ILocationBreakpoint>>();
  private final Set<IBreakpoint> myBreakpoints = new HashSet<IBreakpoint>();

  private final MyBreakpointListener myBreakpointListener = new MyBreakpointListener();
  private final LeftMarginMouseListener myMouseListener = new MyLeftMarginMouseListener();
  private final SessionChangeListener myChangeListener = new MySessionChangeAdapter();
  private final DebugSessionListener myDebugSessionListener = new MyDebugSessionAdapter();
  private final List<IBreakpointManagerListener> myListeners = new ArrayList<IBreakpointManagerListener>();

  public static BreakpointManagerComponent getInstance(@NotNull Project project) {
    return project.getComponent(BreakpointManagerComponent.class);
  }

  public BreakpointManagerComponent(Project project, DebugInfoManager debugInfoManager, BreakpointProvidersManager providersManager) {
    myProject = project;
    myDebugInfoManager = debugInfoManager;
    myProvidersManager = providersManager;
    myEditorsProvider = new EditorsProvider(project);
    myEditorsProvider.addEditorOpenListener(new MyEditorOpenListener());
  }

  public void toggleBreakpoint(EditorCell cell) {
    EditorCell debuggableCell = findDebuggableCell(cell);
    if (debuggableCell != null) {
      toggleBreakpoint(debuggableCell.getSNode(), true);
    }
  }

  public boolean isDebuggable(EditorCell cell) {
    return findDebuggableCell(cell) != null || findTraceableCell(cell) != null;
  }

  private SNode findDebuggableNode(final EditorComponent editorComponent, int x, final int y) {
    EditorCell foundCell = editorComponent.getRootCell().findCellWeak(x, y, new Condition<EditorCell>() {
      @Override
      public boolean met(EditorCell object) {
        EditorCell debuggableOrTraceableCell = findDebuggableOrTraceableCell(object);
        if (debuggableOrTraceableCell == null) {
          return false;
        }
        EditorCell iconAnchorCell = BreakpointIconRenderer.getBreakpointIconAnchorCell(editorComponent.findNodeCell(debuggableOrTraceableCell.getSNode()));
        // ignoring mouse clicks to any other rows except one containing "BreakpointIconAnchorCell"
        // (this cell will be marked with breakpoint icon in LeftEditorHighlighter)
        return (y >= iconAnchorCell.getY() && iconAnchorCell.getBaseline() >= y);
      }
    });
    if (foundCell == null) return null;
    EditorCell cell = findDebuggableOrTraceableCell(foundCell);
    if (cell == null) return null;
    return cell.getSNode();
  }

  private EditorCell findDebuggableOrTraceableCell(EditorCell foundCell) {
    EditorCell cell = findDebuggableCell(foundCell);
    if (cell == null) {
      cell = findTraceableCell(foundCell);
    }
    if (cell == null) return null;
    return cell;
  }

  private EditorCell findDebuggableCell(EditorCell foundCell) {
    EditorCell cell = foundCell;
    while (cell != null) {
      SNode node = cell.getSNode();
      if (myDebugInfoManager.isDebuggableNode(node)) {
        return cell;
      }
      cell = cell.getParent();
    }
    return null;
  }

  private EditorCell findTraceableCell(EditorCell foundCell) {
    final TraceInfoCache traceInfoCache = TraceInfoCache.getInstance();
    EditorCell cell = foundCell;
    while (cell != null) {
      SNode node = cell.getSNode();
      DebugInfo debugInfo = traceInfoCache.get(node.getModel().getModelDescriptor());
      if (debugInfo != null && debugInfo.getPositionForNode(node.getId()) != null) {
        break;
      }
      cell = cell.getParent();
    }
    return cell;
  }

  @Override
  public void projectOpened() {
  }

  @Override
  public void projectClosed() {
  }

  @NotNull
  @Override
  public String getComponentName() {
    return "Breakpoint Manager";
  }

  @Override
  public void initComponent() {
    DebugSessionManagerComponent component = myProject.getComponent(DebugSessionManagerComponent.class);
    component.addCurrentDebugSessionListener(myDebugSessionListener);
  }

  @Override
  public void disposeComponent() {
    DebugSessionManagerComponent component = myProject.getComponent(DebugSessionManagerComponent.class);
    component.removeCurrentDebugSessionListener(myDebugSessionListener);
  }

  private void editorComponentOpened(@Nullable EditorComponent editorComponent) {
    if (editorComponent == null) return;
    final SNode rootNode = editorComponent.getEditedNode();
    if (rootNode == null) return;
    editorComponent.addLeftMarginPressListener(myMouseListener);
    SNodePointer rootPointer = ModelAccess.instance().runReadAction(new Computable<SNodePointer>() {
      @Override
      public SNodePointer compute() {
        return new SNodePointer(rootNode);
      }
    });
    Set<ILocationBreakpoint> breakpointsForRoot = myRootsToBreakpointsMap.get(rootPointer);
    if (breakpointsForRoot != null) {
      for (ILocationBreakpoint breakpoint : breakpointsForRoot) {
        editorComponent.addAdditionalPainter(new MPSBreakpointPainter(breakpoint));
        editorComponent.getLeftEditorHighlighter().addIconRenderer(new BreakpointIconRenderer(breakpoint, editorComponent));
      }
      editorComponent.repaint(); //todo should it be executed in ED thread?
    }
  }

  private void editorComponentClosed(@Nullable EditorComponent editorComponent) {
    if (editorComponent == null) return;
    editorComponent.removeLeftMarginPressListener(myMouseListener);
  }

  public void toggleBreakpoint(SNode node, boolean handleRemoveBreakpoint) {
    SNode root = node.getContainingRoot();
    if (root == null) return;
    boolean hasBreakpoint = false;
    IBreakpoint breakpoint = null;
    SNodePointer rootPointer = new SNodePointer(root);
    Set<ILocationBreakpoint> mpsBreakpointSet = myRootsToBreakpointsMap.get(rootPointer);
    if (mpsBreakpointSet != null) {
      hasBreakpoint = false;
      for (ILocationBreakpoint mpsBreakpoint : mpsBreakpointSet) {
        if (mpsBreakpoint.getSNode() == node) {
          hasBreakpoint = true;
          breakpoint = mpsBreakpoint;
          break;
        }
      }
    } else {
      hasBreakpoint = false;
    }
    if (hasBreakpoint) {
      if (handleRemoveBreakpoint) {
        removeBreakpoint(breakpoint);
      }
    } else {
      ILocationBreakpoint newBreakpoint = myDebugInfoManager.createBreakpoint(node, myProject);
      if (newBreakpoint != null) {
        addBreakpoint(newBreakpoint);
      } else if (myDebugInfoManager.isDebuggableNode(node)) {
        LOG.error("Node is debuggable but created breakpoint is null.", node);
      } else {
        LOG.error("Trying to create breakpoint on non-debuggable node.", node);
      }
    }
  }

  public void addBreakpoint(@NotNull IBreakpoint breakpoint) {
    synchronized (myBreakpoints) {
      if (breakpoint instanceof ILocationBreakpoint) {
        addLocationBreakpoint((ILocationBreakpoint) breakpoint);
      }
      breakpoint.setCreationTime(System.currentTimeMillis());
      myBreakpoints.add(breakpoint);
      breakpoint.addBreakpointListener(myBreakpointListener);
      breakpoint.addToRunningSessions();
    }
    fireBreakpointsChanged();
  }

  private void addLocationBreakpoint(ILocationBreakpoint breakpoint) {
    SNode node = breakpoint.getNodePointer().getNode();
    if (node != null) {
      SNode root = node.getContainingRoot();
      if (root != null) {
        SNodePointer rootPointer = new SNodePointer(root);
        Set<ILocationBreakpoint> breakpointsForRoot = myRootsToBreakpointsMap.get(rootPointer);
        if (breakpointsForRoot == null) {
          breakpointsForRoot = new HashSet<ILocationBreakpoint>();
          myRootsToBreakpointsMap.put(rootPointer, breakpointsForRoot);
        }
        breakpointsForRoot.add(breakpoint);

        for (IEditor editor : myEditorsProvider.getSelectedEditors()) {
          EditorComponent editorComponent = editor.getCurrentEditorComponent();
          if (editorComponent != null) {
            SNode editedNode = editorComponent.getEditedNode();
            if (root == editedNode) {
              editorComponent.addAdditionalPainter(new MPSBreakpointPainter(breakpoint));
              editorComponent.getLeftEditorHighlighter().addIconRenderer(new BreakpointIconRenderer(breakpoint, editorComponent));
              editorComponent.repaint(); //todo should it be executed in ED thread?
            }
          }
        }
      }
    }
  }

  public void removeBreakpoint(@NotNull final IBreakpoint breakpoint) {
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        synchronized (myBreakpoints) {
          if (breakpoint instanceof ILocationBreakpoint) {
            removeLocationBreakpoint((ILocationBreakpoint) breakpoint);
          }
          myBreakpoints.remove(breakpoint);
          breakpoint.removeBreakpointListener(myBreakpointListener);
          breakpoint.removeFromRunningSessions();
        }
      }
    });
    fireBreakpointsChanged();
  }

  private void removeLocationBreakpoint(ILocationBreakpoint breakpoint) {
    SNode node = breakpoint.getSNode();
    if (node != null) {
      SNode root = node.getContainingRoot();
      if (root != null) {
        SNodePointer rootPointer = new SNodePointer(root);
        Set<ILocationBreakpoint> breakpointsForRoot = myRootsToBreakpointsMap.get(rootPointer);
        if (breakpointsForRoot != null) {
          breakpointsForRoot.remove(breakpoint);
        }

        for (IEditor editor : myEditorsProvider.getSelectedEditors()) {
          EditorComponent editorComponent = editor.getCurrentEditorComponent();
          if (editorComponent != null) {
            SNode editedNode = editorComponent.getEditedNode();
            if (root == editedNode) {
              editorComponent.removeAdditionalPainterByItem(breakpoint);
              editorComponent.getLeftEditorHighlighter().removeIconRenderer(breakpoint.getSNode(), BreakpointIconRenderer.TYPE);
              editorComponent.repaint(); //todo should it be executed in ED thread?
            }
          }
        }
      }
    }
  }

  public void clear() {
    synchronized (myBreakpoints) {
      myRootsToBreakpointsMap.clear();
      myBreakpoints.clear();
    }
  }

  public void createFromUi(IBreakpointKind kind) {
    IBreakpointsProvider provider = myProvidersManager.getProvider(kind);
    if (provider == null) {
      Messages.showErrorDialog(myProject, "Can not create " + kind.getPresentation() + ". Provider was not found.", "Error Creating" + kind.getPresentation());
    } else {
      IBreakpoint breakpoint = provider.createFromUi(kind, myProject);
      if (breakpoint != null) {
        addBreakpoint(breakpoint);
      }
    }
  }

  public void loadState(Element state) {
    synchronized (myBreakpoints) {
      clear();
      List breakpointsElement = state.getChildren(BREAKPOINT_ELEMENT);
      for (ListIterator it = breakpointsElement.listIterator(); it.hasNext();) {
        Element breakpointElement = (Element) it.next();
        String kindName = breakpointElement.getAttributeValue(KIND_TAG);

        IBreakpointKind kind = myProvidersManager.getKind(kindName);
        if (kind == null) {
          // todo we might save whatever we cant read for later?
          continue;
        }

        IBreakpointsProvider provider = myProvidersManager.getProvider(kind);
        if (provider == null) {
          continue;
        }

        IBreakpoint breakpoint = provider.loadFromState((Element) breakpointElement.getChildren().get(0), kind, myProject);
        if (breakpoint != null) {
          myBreakpoints.add(breakpoint);
        }
      }
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      @Override
      public void run() {
        synchronized (myBreakpoints) {
          for (IBreakpoint breakpoint : myBreakpoints) {
            if (breakpoint instanceof ILocationBreakpoint) {
              addLocationBreakpoint((ILocationBreakpoint) breakpoint);
            }
          }
        }
      }
    });
  }

  public Element getState() {
    synchronized (myBreakpoints) {
      Element rootElement = new Element(BREAKPOINTS_LIST_ELEMENT);

      for (IBreakpoint breakpoint : myBreakpoints) {
        IBreakpointKind kind = breakpoint.getKind();
        IBreakpointsProvider provider = myProvidersManager.getProvider(kind);
        if (provider == null) {
          continue;
        }

        Element element = provider.saveToState(breakpoint);
        if (element != null) {
          Element breakpointElement = new Element(BREAKPOINT_ELEMENT);
          breakpointElement.setAttribute(new Attribute(KIND_TAG, kind.getName()));
          breakpointElement.addContent(element);
          rootElement.addContent(breakpointElement);
        }
      }
      return rootElement;
    }
  }

  //this is called when a breakpoint is hit

  public void processBreakpointHit(IBreakpoint breakpoint) {
    //todo do something later if necessary (like highlihgting a line, etc)
  }

  public Set<IBreakpoint> getAllBreakpoints() {
    synchronized (myBreakpoints) {
      return new HashSet<IBreakpoint>(myBreakpoints);
    }
  }

  public void addChangeListener(IBreakpointManagerListener listener) {
    synchronized (myListeners) {
      myListeners.add(listener);
    }
  }

  public void removeChangeListener(IBreakpointManagerListener listener) {
    synchronized (myListeners) {
      myListeners.remove(listener);
    }
  }

  private void fireBreakpointsChanged() {
    List<IBreakpointManagerListener> listeners;
    synchronized (myListeners) {
      listeners = new ArrayList<IBreakpointManagerListener>(myListeners);
    }
    for (IBreakpointManagerListener listener : listeners) {
      listener.breakpointsChanged();
    }
  }

  private class MyBreakpointListener implements IBreakpointListener {
    @Override
    public void breakpointToggled(final IBreakpoint breakpoint, boolean enabled) {
      ModelAccess.instance().runReadAction(new Runnable() {
        @Override
        public void run() {
          if (breakpoint instanceof ILocationBreakpoint) {
            SNode node = ((ILocationBreakpoint) breakpoint).getNodePointer().getNode();
            if (node != null) {
              SNode root = node.getContainingRoot();
              if (root != null) {
                for (IEditor editor : myEditorsProvider.getSelectedEditors()) {
                  EditorComponent editorComponent = editor.getCurrentEditorComponent();
                  if (editorComponent != null) {
                    SNode editedNode = editorComponent.getEditedNode();
                    if (root == editedNode) {
                      editorComponent.repaint(); //todo should it be executed in ED thread?
                    }
                  }
                }
              }
            }
          }
        }
      });
    }
  }

  private class MyLeftMarginMouseListener implements LeftMarginMouseListener {
    @Override
    public void mousePressed(MouseEvent e, EditorComponent editorComponent) {
    }

    @Override
    public void mouseReleased(MouseEvent e, EditorComponent editorComponent) {
    }

    @Override
    public void mouseClicked(final MouseEvent e, final EditorComponent editorComponent) {
      if (e.getButton() == MouseEvent.BUTTON1) {
        ModelAccess.instance().runReadAction(new Runnable() {
          @Override
          public void run() {
            SNode node = findDebuggableNode(editorComponent, e.getX(), e.getY());
            if (node != null) {
              toggleBreakpoint(node, false);
            }
          }
        });
      }
    }
  }

  private class MySessionChangeAdapter extends SessionChangeAdapter {
    @Override
    public void muted(AbstractDebugSession session) {
      ApplicationManager.getApplication().invokeLater((new Runnable() {
        @Override
        public void run() {
          for (IEditor editor : myEditorsProvider.getSelectedEditors()) {
            EditorComponent editorComponent = editor.getCurrentEditorComponent();
            if (editorComponent != null) {
              editorComponent.repaint();
            }
          }
        }
      }));
    }
  }

  private class MyDebugSessionAdapter extends DebugSessionAdapter {
    @Override
    public void registered(AbstractDebugSession session) {
      session.addChangeListener(myChangeListener);
    }

    @Override
    public void detached(AbstractDebugSession session) {
      session.removeChangeListener(myChangeListener);
    }
  }

  private class MyEditorOpenListener implements EditorOpenListener {
    @Override
    public void editorOpened(MPSFileNodeEditor editor) {
      editorComponentOpened(editor.getNodeEditor().getCurrentEditorComponent());
    }

    @Override
    public void editorClosed(MPSFileNodeEditor editor) {
      editorComponentClosed(editor.getNodeEditor().getCurrentEditorComponent());
    }
  }

  public interface IBreakpointManagerListener {
    void breakpointsChanged();
  }
}
