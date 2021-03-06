package jetbrains.mps.vcs.changesmanager;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorMessageOwner;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.util.Map;
import jetbrains.mps.vcs.diff.oldchanges.OldChange;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.vcs.diff.oldchanges.OldChangeType;
import jetbrains.mps.vcs.diff.oldchanges.DeleteNodeChange;
import jetbrains.mps.vcs.diff.oldchanges.OldAddRootChange;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.nodeEditor.NodeHighlightManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.messageTargets.EditorMessageWithTarget;
import jetbrains.mps.errors.MessageStatus;
import jetbrains.mps.errors.messageTargets.MessageTargetEnum;
import jetbrains.mps.errors.messageTargets.DeletedNodeMessageTarget;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.ide.util.ColorAndGraphicsUtil;
import java.awt.Graphics;
import org.apache.commons.lang.ObjectUtils;
import java.awt.Rectangle;
import java.util.ArrayList;
import com.intellij.openapi.vcs.FileStatus;

public class EditorComponentChangesHighligher implements EditorMessageOwner {
  private static final Color HIGHLIGHT_COLOR_ADDED = new Color(214, 245, 214);
  private static final Color HIGHLIGHT_COLOR_CHANGED = new Color(216, 227, 251);
  private static final Color HIGHLIGHT_COLOR_CHANGED_FRAME = new Color(188, 207, 249);
  private static final Color HIGHLIGHT_COLOR_DELETED = new Color(203, 203, 203);
  private static final Color GUTTER_COLOR = new Color(252, 242, 242);
  private static final Color TRANSPARENT_COLOR = new Color(0, 0, 0, 0);

  private EditorComponent myEditorComponent;
  private final Map<OldChange, EditorComponentChangesHighligher.ChangeEditorMessage> myChangesMessages = MapSequence.fromMap(new HashMap<OldChange, EditorComponentChangesHighligher.ChangeEditorMessage>());
  private ChangeListener myChangeListener;
  private ChangesFoldingAreaPainter myFoldingAreaPainter;
  private ModelChangesManager myModelChangesManager;
  private boolean myEnabled;
  private boolean myDisposed = false;
  private final Object myDisposedLock = new Object();

  public EditorComponentChangesHighligher(final Project project, @NotNull final EditorComponent editorComponent, boolean enabled) {
    myEditorComponent = editorComponent;
    myFoldingAreaPainter = new ChangesFoldingAreaPainter(this);
    myEditorComponent.getLeftEditorHighlighter().addFoldingAreaPainter(myFoldingAreaPainter);
    myEnabled = enabled;

    ChangesManager.getInstance(project).getCommandQueue().runTask(new Runnable() {
      public void run() {
        synchronized (myDisposedLock) {
          if (myDisposed) {
            return;
          }
        }
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            SNode editedNode = editorComponent.getEditedNode();
            if (editedNode == null || editedNode.isDisposed()) {
              return;
            }
            final SModel model = editedNode.getModel();
            if (model != null && model.getModelDescriptor() != null) {
              myModelChangesManager = ChangesManager.getInstance(project).getModelChangesManager(model);
              myChangeListener = new EditorComponentChangesHighligher.MyChangeListener();
            } else {
              return;
            }
          }
        });
        if (myChangeListener != null) {
          for (OldChange change : ListSequence.fromList(myModelChangesManager.getChangeList())) {
            highlightChange(change);
          }
          synchronized (myChangesMessages) {
            for (EditorComponentChangesHighligher.ChangeEditorMessage message : Sequence.fromIterable(MapSequence.fromMap(myChangesMessages).values())) {
              getHighlightManager().mark(message);
            }
          }
          getHighlightManager().repaintAndRebuildEditorMessages();
          ThreadUtils.runInUIThreadNoWait(new Runnable() {
            public void run() {
              myFoldingAreaPainter.relayout();
            }
          });
          synchronized (EditorComponentChangesHighligher.this) {
            if (myChangeListener != null) {
              myModelChangesManager.addChangeListener(myChangeListener);
            }
          }
        }
      }
    });
  }

  private EditorMessage highlightChange(@NotNull final OldChange change) {
    final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
    final Wrappers._T<MessageTarget> messageTarget = new Wrappers._T<MessageTarget>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        final Wrappers._T<SModel> model = new Wrappers._T<SModel>();
        SNode editedNode = myEditorComponent.getEditedNode();
        if (editedNode == null || editedNode.isDisposed()) {
          return;
        }
        model.value = editedNode.getModel();
        if (model.value == null || model.value.isDisposed()) {
          return;
        }
        SNodeId affectedNodeId = change.getAffectedNodeId();
        messageTarget.value = change.getMessageTarget();
        if (affectedNodeId == null || messageTarget.value == null) {
          return;
        }
        if (change.getChangeType() == OldChangeType.DELETE) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              SNodeId parentId = ((DeleteNodeChange) change).getParentId();
              node.value = (parentId == null ?
                null :
                model.value.getNodeById(parentId)
              );
            }
          });
        } else {
          node.value = model.value.getNodeById(affectedNodeId);
        }
      }
    });
    if (node.value == null) {
      return null;
    }

    final Wrappers._boolean isOurChange = new Wrappers._boolean();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        isOurChange.value = myEditorComponent.getEditedNode().isAncestorOf(node.value);
      }
    });
    if (!(isOurChange.value)) {
      return null;
    }

    OldChangeType type = change.getChangeType();
    Color c;
    if (type == OldChangeType.ADD) {
      c = HIGHLIGHT_COLOR_ADDED;
    } else if (type == OldChangeType.CHANGE) {
      c = HIGHLIGHT_COLOR_CHANGED;
    } else if (type == OldChangeType.DELETE) {
      c = HIGHLIGHT_COLOR_DELETED;
    } else {
      return null;
    }
    if (change instanceof OldAddRootChange) {
      // don't highlight added roots 
      return null;
    }
    EditorComponentChangesHighligher.ChangeEditorMessage message;
    synchronized (myChangesMessages) {
      if (MapSequence.fromMap(myChangesMessages).containsKey(change)) {
        return null;
      }
      message = new EditorComponentChangesHighligher.ChangeEditorMessage(change, node.value, c, messageTarget.value);
      if (myEditorComponent == null) {
        return null;
      }
      MapSequence.fromMap(myChangesMessages).put(change, message);
    }
    return message;
  }

  private EditorMessage unhighlightChange(@NotNull OldChange change) {
    EditorMessage message;
    synchronized (myChangesMessages) {
      message = MapSequence.fromMap(myChangesMessages).get(change);
      if (message == null || getHighlightManager() == null || message.getNode() == null) {
        return null;
      }
      MapSequence.fromMap(myChangesMessages).removeKey(change);
    }
    return message;
  }

  public void dispose() {
    synchronized (myDisposedLock) {
      myDisposed = true;
      try {
        for (OldChange change : SetSequence.fromSet(MapSequence.fromMap(myChangesMessages).keySet()).toListSequence()) {
          unhighlightChange(change);
        }
        getHighlightManager().clearForOwner(this);
        myEditorComponent.getLeftEditorHighlighter().removeFoldingAreaPainter(myFoldingAreaPainter);
      } finally {
        if (myModelChangesManager != null) {
          synchronized (this) {
            myModelChangesManager.removeChangeListener(myChangeListener);
            myChangeListener = null;
          }
        }
      }
    }
  }

  @NotNull
  /*package*/ EditorComponent getEditorComponent() {
    return myEditorComponent;
  }

  @NotNull
  /*package*/ List<EditorComponentChangesHighligher.ChangeEditorMessage> getEditorMessages() {
    synchronized (myChangesMessages) {
      return Sequence.fromIterable(MapSequence.fromMap(myChangesMessages).values()).toListSequence();
    }
  }

  public void setEnabled(boolean enabled) {
    myEnabled = enabled;
    getHighlightManager().repaintAndRebuildEditorMessages();
  }

  @Nullable
  private ChangesFoldingAreaPainter.MessageGroup getPreviousMessageGroup(@NotNull EditorContext editorContext) {
    if (editorContext.getContextCell() == null) {
      return null;
    }
    final int topY = editorContext.getContextCell().getY();
    return ListSequence.fromList(myFoldingAreaPainter.getMessageGroups()).findLast(new IWhereFilter<ChangesFoldingAreaPainter.MessageGroup>() {
      public boolean accept(ChangesFoldingAreaPainter.MessageGroup mg) {
        return topY > mg.getY() + mg.getHeight();
      }
    });
  }

  @Nullable
  private ChangesFoldingAreaPainter.MessageGroup getNextMessageGroup(@NotNull EditorContext editorContext) {
    if (editorContext.getContextCell() == null) {
      return null;
    }
    final int bottomY = editorContext.getContextCell().getY() + editorContext.getContextCell().getHeight();
    return ListSequence.fromList(myFoldingAreaPainter.getMessageGroups()).findFirst(new IWhereFilter<ChangesFoldingAreaPainter.MessageGroup>() {
      public boolean accept(ChangesFoldingAreaPainter.MessageGroup mg) {
        return bottomY < mg.getY();
      }
    });
  }

  private void goToMessageGroup(@Nullable ChangesFoldingAreaPainter.MessageGroup messageGroup) {
    if (messageGroup == null) {
      return;
    }
    EditorCell wholeCell = ListSequence.fromList(messageGroup.getMessages()).first().getCell(myEditorComponent);
    EditorCell leafCell = wholeCell.findLeaf(wholeCell.getX(), wholeCell.getY());
    myEditorComponent.changeSelection(wholeCell);
    myEditorComponent.changeSelection(leafCell);
    myFoldingAreaPainter.updateAfterTransfer(messageGroup);
  }

  public void goToPreviousChange(@NotNull EditorContext editorContext) {
    goToMessageGroup(getPreviousMessageGroup(editorContext));
  }

  public void goToNextChange(@NotNull EditorContext editorContext) {
    goToMessageGroup(getNextMessageGroup(editorContext));
  }

  public boolean isPreviousChangeAvailable(@NotNull EditorContext editorContext) {
    return getPreviousMessageGroup(editorContext) != null;
  }

  public boolean isNextChangeAvailable(@NotNull EditorContext editorContext) {
    return getNextMessageGroup(editorContext) != null;
  }

  public void rollbackChanges(@NotNull EditorContext editorContext) {
    myModelChangesManager.rollbackChanges(ListSequence.fromList(myFoldingAreaPainter.getCurrentMessageGroup().getMessages()).<OldChange>select(new ISelector<EditorComponentChangesHighligher.ChangeEditorMessage, OldChange>() {
      public OldChange select(EditorComponentChangesHighligher.ChangeEditorMessage msg) {
        return msg.getChange();
      }
    }));
    myFoldingAreaPainter.updateAfterRollback();
  }

  private NodeHighlightManager getHighlightManager() {
    return check_7ugudc_a0a41(myEditorComponent);
  }

  private static boolean hasChildrenWithDifferentNode(EditorCell cell) {
    if (cell instanceof EditorCell_Collection) {
      final EditorCell_Collection collectionCell = (EditorCell_Collection) cell;
      return Sequence.fromIterable(((Iterable<EditorCell>) collectionCell)).any(new IWhereFilter<EditorCell>() {
        public boolean accept(EditorCell child) {
          return child.getSNode() != collectionCell.getSNode();
        }
      });
    } else {
      return false;
    }
  }

  private static NodeHighlightManager check_7ugudc_a0a41(EditorComponent checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getHighlightManager();
    }
    return null;
  }

  public class ChangeEditorMessage extends EditorMessageWithTarget {
    private OldChange myChange;
    private boolean myHighlighted = false;

    public ChangeEditorMessage(@NotNull OldChange change, @NotNull SNode node, Color color, MessageTarget messageTarget) {
      super(node, MessageStatus.OK, messageTarget, color, "", EditorComponentChangesHighligher.this);
      myChange = change;
    }

    private boolean isDeletedChild() {
      return myMessageTarget.getTarget() == MessageTargetEnum.DELETED_CHILD;
    }

    public boolean isThinDeletedMessage(@NotNull EditorComponent editorComponent) {
      EditorCell cell = getCell(editorComponent);
      return isDeletedChild() && ((DeletedNodeMessageTarget) myMessageTarget).getNextChildIndex() != -1 && cell instanceof EditorCell_Collection && (((EditorCell_Collection) cell).getCellLayout() instanceof CellLayout_Vertical || cell.getStyle().get(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE)) && hasChildrenWithDifferentNode(cell);
    }

    public int getY(@NotNull EditorComponent editorComponent) {
      if (isThinDeletedMessage(editorComponent)) {
        EditorCell cell = getCell(editorComponent);
        EditorCell_Collection collectionCell = ((EditorCell_Collection) cell);
        int nextChildIndex = ((DeletedNodeMessageTarget) myMessageTarget).getNextChildIndex();
        if (collectionCell.getChildCount() > nextChildIndex) {
          return collectionCell.getChildAt(nextChildIndex).getY();
        } else {
          return ((int) collectionCell.getChildAt(collectionCell.getChildCount() - 1).getBounds().getMaxY());
        }
      } else {
        return -1;
      }
    }

    @Nullable
    private Color getActualColor(@Nullable Color defaultColor) {
      // Computes color depending on information if message is highlighted and if highlihgting is enabled 
      if (defaultColor == null) {
        return null;
      }
      if (myHighlighted) {
        Color saturated = ColorAndGraphicsUtil.saturateColor(defaultColor, 1.5f);
        if (saturated.equals(defaultColor)) {
          return ColorAndGraphicsUtil.brightenColor(defaultColor, 0.9f);
        } else {
          return saturated;
        }
      } else if (myEnabled) {
        return defaultColor;
      } else {
        return EditorComponentChangesHighligher.TRANSPARENT_COLOR;
      }
    }

    @Override
    public void paint(@NotNull Graphics graphics, EditorComponent component, EditorCell cell) {
      boolean targetIsNode = myMessageTarget.getTarget() == MessageTargetEnum.NODE;
      if (ObjectUtils.equals(getNode(), cell.getSNode()) && targetIsNode || !(targetIsNode) && !(cell instanceof EditorCell_Collection)) {
        cell.paintSelection(graphics, getColor(), false);
      } else {
        if (isDeletedChild() && !(cell.isBigCell())) {
          int nextChildIndex = ((DeletedNodeMessageTarget) myMessageTarget).getNextChildIndex();
          if (nextChildIndex != -1) {
            EditorCell_Collection collectionCell = ((EditorCell_Collection) cell);

            if (!(hasChildrenWithDifferentNode(cell))) {
              cell.paintSelection(graphics, getColor(), false);
              return;
            }

            boolean vertical = collectionCell.getCellLayout() instanceof CellLayout_Vertical || cell.getStyle().get(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE);
            Rectangle bounds = cell.getBounds();
            if (vertical) {
              int y;
              if (collectionCell.getChildCount() > nextChildIndex) {
                y = collectionCell.getChildAt(nextChildIndex).getY();
              } else {
                y = ((int) collectionCell.getChildAt(collectionCell.getChildCount() - 1).getBounds().getMaxY());
              }
              graphics.setColor(getColor());
              graphics.drawLine(bounds.x, y, bounds.x + bounds.width, y);
            } else {
              // horizontal collection: draw vertical line 
              int x;
              if (collectionCell.getChildCount() > nextChildIndex) {
                x = collectionCell.getChildAt(nextChildIndex).getX();
              } else {
                x = ((int) collectionCell.getChildAt(collectionCell.getChildCount() - 1).getBounds().getMaxX());
              }
              int y1 = bounds.y;
              int y2 = bounds.y + bounds.height;

              graphics.setColor(getColor());
              graphics.drawLine(x, y1, x, y2);
              graphics.fillPolygon(new int[]{x, x - 3, x + 3}, new int[]{y1 - 2, y1 - 5, y1 - 5}, 3);
              graphics.fillPolygon(new int[]{x, x - 3, x + 3}, new int[]{y2 + 2, y2 + 5, y2 + 5}, 3);

              graphics.setColor(ColorAndGraphicsUtil.brightenColor(getColor(), 0.8f));
              graphics.drawPolygon(new int[]{x, x - 3, x + 3}, new int[]{y1 - 2, y1 - 5, y1 - 5}, 3);
              graphics.drawPolygon(new int[]{x, x - 3, x + 3}, new int[]{y2 + 2, y2 + 5, y2 + 5}, 3);
            }
            return;
          }
        }
        graphics.setColor(getActualColor((isDeletedChild() ?
          EditorComponentChangesHighligher.HIGHLIGHT_COLOR_DELETED :
          EditorComponentChangesHighligher.HIGHLIGHT_COLOR_CHANGED_FRAME
        )));
        Rectangle bounds = cell.getBounds();
        graphics.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
      }
    }

    public void setHighlighted(boolean highlighted) {
      myHighlighted = highlighted;
    }

    @Override
    @Nullable
    public Color getColor() {
      return getActualColor(super.getColor());
    }

    @NotNull
    public OldChange getChange() {
      return myChange;
    }

    @Override
    public boolean isLongInGutter() {
      return true;
    }

    @Override
    @NotNull
    public Color getColorInGutter() {
      return EditorComponentChangesHighligher.GUTTER_COLOR;
    }

    @Override
    public boolean isBackground() {
      return myHighlighted || myEnabled;
    }

    @Override
    public int getStart(EditorComponent component) {
      if (isThinDeletedMessage(component)) {
        return getY(component);
      } else {
        return super.getStart(component);
      }
    }

    @Override
    public int getHeight(EditorComponent component) {
      if (isThinDeletedMessage(component)) {
        return 1;
      } else {
        return super.getHeight(component);
      }
    }
  }

  private class MyChangeListener implements ChangeListener {
    private List<EditorMessage> myAddedMessages = ListSequence.fromList(new ArrayList<EditorMessage>());
    private List<EditorMessage> myRemovedMessages = ListSequence.fromList(new ArrayList<EditorMessage>());

    public MyChangeListener() {
    }

    public void changeAdded(@NotNull OldChange change, @NotNull SModel model) {
      EditorMessage addedMessage = highlightChange(change);
      if (addedMessage != null) {
        ListSequence.fromList(myRemovedMessages).removeElement(addedMessage);
        ListSequence.fromList(myAddedMessages).addElement(addedMessage);
      }
    }

    public void changeRemoved(@NotNull OldChange change, @NotNull SModel model) {
      EditorMessage removedMessage = unhighlightChange(change);
      if (removedMessage != null) {
        ListSequence.fromList(myRemovedMessages).addElement(removedMessage);
        ListSequence.fromList(myAddedMessages).removeElement(removedMessage);
      }
    }

    public void fileStatusChanged(@Nullable FileStatus newFileStatus, @NotNull SModel model) {
    }

    public void changeUpdateStarted() {
    }

    public void changeUpdateFinished() {
      if (!(ListSequence.fromList(myAddedMessages).isEmpty()) || !(ListSequence.fromList(myRemovedMessages).isEmpty())) {
        NodeHighlightManager nodeHighlightManager = getHighlightManager();
        for (EditorMessage removedMessage : ListSequence.fromList(myRemovedMessages)) {
          nodeHighlightManager.unmark(removedMessage);
        }
        for (EditorMessage addedMessage : ListSequence.fromList(myAddedMessages)) {
          nodeHighlightManager.mark(addedMessage);
        }
        nodeHighlightManager.repaintAndRebuildEditorMessages();
        ThreadUtils.runInUIThreadNoWait(new Runnable() {
          public void run() {
            myFoldingAreaPainter.relayout();
          }
        });
        ListSequence.fromList(myAddedMessages).clear();
        ListSequence.fromList(myRemovedMessages).clear();
      }
    }
  }
}
