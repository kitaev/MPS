package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import java.util.List;
import jetbrains.mps.vcs.diff.oldchanges.OldChange;
import java.util.ArrayList;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.SModel;
import java.util.Set;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vcs.diff.oldchanges.OldSetReferenceChange;
import jetbrains.mps.vcs.diff.oldchanges.MoveNodeChange;
import jetbrains.mps.vcs.diff.oldchanges.ChangeConceptChange;
import jetbrains.mps.vcs.diff.oldchanges.NewNodeChange;
import jetbrains.mps.vcs.diff.oldchanges.OldSetPropertyChange;
import jetbrains.mps.vcs.diff.oldchanges.DeleteNodeChange;
import jetbrains.mps.smodel.SNodeId;
import java.util.HashSet;
import jetbrains.mps.nodeEditor.NodeHighlightManager;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import jetbrains.mps.nodeEditor.AdditionalPainter;
import com.intellij.openapi.util.Computable;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class OldDiffEditorComponent extends EditorComponent {
  private static final Color ERROR_COLOR = new Color(255, 220, 220);

  private EditorMessageOwner myOwner = new EditorMessageOwner() {};
  private List<OldChange> myChanges = new ArrayList<OldChange>();
  private ArrayList<OldChangeEditorMessage> myChangeEditorMessages = new ArrayList<OldChangeEditorMessage>();
  private InspectorEditorComponent myInspector;

  public OldDiffEditorComponent(IOperationContext context, SNode node) {
    super(context);
    myInspector = new InspectorEditorComponent();
    myInspector.setReadOnly(true);
    editNode(node, context);
  }

  public void inspect(SNode node) {
    myInspector.inspectNode(node, getOperationContext());
    removeAllChangesFrom(myInspector);
    if (myInspector.getHighlightManager().getMessageFor(node) == null) {
      makeChangeBlocks(myInspector, new ArrayList(myChangeEditorMessages));
    }
  }

  public EditorCell createRootCell() {
    return createRootCell(null);
  }

  public InspectorEditorComponent getInspector() {
    return myInspector;
  }

  public EditorCell createRootCell(List<SModelEvent> events) {
    if (getEditedNode() == null || getEditedNode().isDeleted()) {
      EditorContext editorContext = getEditorContext();
      return new EditorCell_Constant(editorContext, getEditedNode(), "<no node>");
    }
    return getEditorContext().createRootCell(getEditedNode(), events);
  }

  public void hightlight(final List<OldChange> changes, final boolean isNewVersion, final boolean revertedChanges) {
    final List<OldChangeEditorMessage> resultChanges = new ArrayList<OldChangeEditorMessage>();
    myChanges = new ArrayList<OldChange>(changes);
    SNode sNode = getRootCell().getSNode();
    if (sNode == null) {
      return;
    }
    final SModel model = sNode.getModel();
    final Set<OldChange> newChanges = getNewChanges(changes);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (OldChange change : changes) {
          if (change instanceof OldSetReferenceChange) {
            OldSetReferenceChange referenceChange = (OldSetReferenceChange) change;
            OldChangeEditorMessage message = createEditorMessage(change, model, revertedChanges, !(newChanges.contains(change)));
            message.setRole(referenceChange.getRole());
            resultChanges.add(message);
            getHighlightManager().mark(message);
          }
          if (change instanceof MoveNodeChange || change instanceof ChangeConceptChange) {
            OldChangeEditorMessage message = createEditorMessage(change, model, revertedChanges, !(newChanges.contains(change)));
            resultChanges.add(message);
            getHighlightManager().mark(message);
          }
          if (change instanceof NewNodeChange) {
            if (!(isNewVersion)) {
              OldChangeEditorMessage message = createEditorMessage(change, model, revertedChanges, !(newChanges.contains(change)));
              resultChanges.add(message);
              getHighlightManager().mark(message);
            }
          }
          if (change instanceof OldSetPropertyChange) {
            OldSetPropertyChange propertyChange = (OldSetPropertyChange) change;
            OldChangeEditorMessage message = createEditorMessage(change, model, revertedChanges, !(newChanges.contains(change)));
            message.setProperty(propertyChange.getProperty());
            resultChanges.add(message);
            getHighlightManager().mark(message);
          }
          if (change instanceof DeleteNodeChange) {
            if (isNewVersion) {
              OldChangeEditorMessage message = createEditorMessage(change, model, revertedChanges, !(newChanges.contains(change)));
              resultChanges.add(message);
              getHighlightManager().mark(message);
            }
          }
        }
      }
    });
    for (OldChangeEditorMessage editorMessage : resultChanges) {
      getInspector().getHighlightManager().mark(editorMessage);
    }
    getHighlightManager().repaintAndRebuildEditorMessages();
    getInspector().getHighlightManager().repaintAndRebuildEditorMessages();
    myChangeEditorMessages = new ArrayList<OldChangeEditorMessage>(resultChanges);
  }

  private Set<OldChange> getNewChanges(List<OldChange> changes) {
    Set<SNodeId> newNodes = new HashSet<SNodeId>();
    for (OldChange change : changes) {
      if (change instanceof NewNodeChange) {
        newNodes.add(change.getAffectedNodeId());
      }
    }
    Set<OldChange> newChanges = new HashSet<OldChange>();
    for (OldChange change : changes) {
      if (change instanceof NewNodeChange) {
        SNodeId id = ((NewNodeChange) change).getNodeParent();
        if (id != null && newNodes.contains(id)) {
          newChanges.add(change);
        }
      } else {
        SNodeId id = change.getAffectedNodeId();
        if (id != null && newNodes.contains(id)) {
          newChanges.add(change);
        }
      }
    }
    return newChanges;
  }

  private OldChangeEditorMessage createEditorMessage(OldChange change, SModel model, boolean revertChanges, boolean show) {
    Color color = null;
    if (show) {
      if (revertChanges) {
        color = change.getChangeType().getOpositeChange().getColor();
      } else {
        color = change.getChangeType().getColor();
      }
      if (change.isError()) {
        color = ERROR_COLOR;
      }
    }
    SNode id = model.getNodeById(change.getAffectedNodeId());
    return new OldChangeEditorMessage(change, id, color, "", myOwner);
  }

  public void makeChangeBlocks() {
    makeChangeBlocks(this, new ArrayList(myChangeEditorMessages));
    if (myInspector.getHighlightManager().getMessageFor(myInspector.getEditedNode()) == null) {
      makeChangeBlocks(myInspector, new ArrayList(myChangeEditorMessages));
    }
  }

  public void makeChangeBlocks(EditorComponent component, List<OldChangeEditorMessage> changeEditorMessages) {
    relayout();
    final NodeHighlightManager highlightManager = component.getHighlightManager();
    for (Iterator<OldChangeEditorMessage> iterator = changeEditorMessages.iterator(); iterator.hasNext();) {
      OldChangeEditorMessage change = iterator.next();
      if (highlightManager.getCell(change) == null) {
        iterator.remove();
      }
    }
    Collections.sort(changeEditorMessages, new Comparator<OldChangeEditorMessage>() {
      public int compare(OldChangeEditorMessage o1, OldChangeEditorMessage o2) {
        return highlightManager.getCell(o1).getY() - highlightManager.getCell(o2).getY();
      }
    });
    OldChangesBlock block = null;
    for (OldChangeEditorMessage m : changeEditorMessages) {
      EditorCell cell = highlightManager.getCell(m);
      if (block == null) {
        block = new OldChangesBlock();
      } else {
        if (block.getMaxY() < cell.getY()) {
          configureBlock(block);
          addBlock(component, block);
          block = new OldChangesBlock();
        }
      }
      configureBlock(block);
      block.addChange(m, cell);
    }
    if (block != null) {
      addBlock(component, block);
    }
  }

  private void addBlock(EditorComponent component, OldChangesBlock block) {
    block.addTo(component);
  }

  private void removeAllChangesFrom(EditorComponent component) {
    for (AdditionalPainter painter : getAdditionalPainters()) {
      if (painter instanceof OldChangesBlock) {
        ((OldChangesBlock) painter).removeFrom(component);
      }
    }
  }

  @Override
  public void editNode(final SNode node, IOperationContext operationContext) {
    super.editNode(node, operationContext);
    setReadOnly(ModelAccess.instance().runReadAction(new Computable<Boolean>() {
      public Boolean compute() {
        return node != null && node.getModel().isNotEditable();
      }
    }));
  }

  public abstract void configureBlock(OldChangesBlock block);

  public void removeAllChanges() {
    for (OldChangeEditorMessage message : myChangeEditorMessages) {
      getHighlightManager().unmark(message);
      myInspector.getHighlightManager().unmark(message);
    }
    removeAllChangesFrom(this);
    removeAllChangesFrom(myInspector);
  }

  public SNode getFirstVisibleNode() {
    return getFirstVisibleNode(getEditedNode());
  }

  private SNode getFirstVisibleNode(SNode node) {
    EditorCell cell = findNodeCell(node);
    if (cell == null) {
      return null;
    }
    if (cell.getY() > getViewport().getViewPosition().y) {
      return node;
    }
    SNode result = null;
    int resultY = Integer.MAX_VALUE;
    for (SNode child : node.getChildrenIterable()) {
      SNode visibleForChild = getFirstVisibleNode(child);
      if (visibleForChild != null) {
        int thisY = findNodeCell(visibleForChild).getY();
        if (thisY < resultY) {
          resultY = thisY;
          result = visibleForChild;
        }
      }
    }
    return result;
  }

  public void synchronizeViewWith(final OldDiffEditorComponent otherComponent) {
    if (this == otherComponent) {
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SNode visibleNode = getFirstVisibleNode();
        if (visibleNode != null) {
          SNodeId id = visibleNode.getSNodeId();
          int newRelativePos = getViewport().getViewPosition().y - findNodeCell(visibleNode).getY();
          SNode sNode = otherComponent.getEditedNode();
          if (sNode == null) {
            return;
          }
          SNode nodeById = sNode.getModel().getNodeById(id);
          EditorCell oldCell = otherComponent.findNodeCell(nodeById);
          Point position = getViewport().getViewPosition();
          if (oldCell != null) {
            otherComponent.getViewport().setViewPosition(new Point((int) position.getX(), newRelativePos + oldCell.getY()));
            Rectangle viewRect = otherComponent.getViewport().getViewRect();
            if (viewRect.y + viewRect.height > otherComponent.getHeight()) {
              otherComponent.getViewport().setViewPosition(new Point(viewRect.x, otherComponent.getHeight() - viewRect.height));
            }
          }
        }
      }
    });
  }

  public List<OldChange> getChanges() {
    return myChanges;
  }
}
