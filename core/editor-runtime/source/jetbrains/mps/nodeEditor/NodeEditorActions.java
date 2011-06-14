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
package jetbrains.mps.nodeEditor;

import jetbrains.mps.nodeEditor.cells.*;
import jetbrains.mps.nodeEditor.selection.*;
import jetbrains.mps.nodeEditor.selection.SingularSelection.SideSelectDirection;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeUtil;

import java.awt.*;


public class NodeEditorActions {
  public abstract static class NavigationAction extends EditorCellAction {
    @Override
    public boolean executeInCommand() {
      return false;
    }
  }

  public static class MoveLeft extends NavigationAction {
    private boolean myHome;

    public MoveLeft() {
      this(false);
    }

    public MoveLeft(boolean home) {
      myHome = home;
    }

    public boolean canExecute(EditorContext context) {
      EditorCell selection = getDeepestSelectedCell(context);
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = getDeepestSelectedCell(context);
      EditorCell target = findTarget(selection);
      context.getNodeEditorComponent().changeSelection(target);
      if (target instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) target;
        if (myHome) {
          label.home();
        } else {
          label.end();
        }
      }
    }

    private EditorCell getDeepestSelectedCell(EditorContext context) {
      Selection deepestSelection = context.getNodeEditorComponent().getSelectionManager().getDeepestSelection();
      if (deepestSelection instanceof SingularSelection) {
        return ((SingularSelection) deepestSelection).getEditorCell();
      } else if (deepestSelection instanceof NodeRangeSelection) {
        return ((NodeRangeSelection) deepestSelection).getFirstCell();
      }
      return null;
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell toLeft = cell.getLeafToLeft(CellConditions.SELECTABLE);
      if (toLeft != null) {
        return toLeft;
      }
      return cell.getPrevLeaf(CellConditions.SELECTABLE);
    }
  }


  public static class MoveToRootHome extends NavigationAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(findTarget(selection));
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection rootCell = cell.isUnfoldedCollection() ? (EditorCell_Collection) cell : cell.getParent();
      while (rootCell != null && rootCell.getParent() != null) {
        rootCell = rootCell.getParent();
      }
      return rootCell == null ? null : rootCell.findChild(CellFinders.FIRST_SELECTABLE_LEAF);
    }
  }

  public static class MoveToRootEnd extends NavigationAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(findTarget(selection));
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection rootCell = cell.isUnfoldedCollection() ? (EditorCell_Collection) cell : cell.getParent();
      while (rootCell != null && rootCell.getParent() != null) {
        rootCell = rootCell.getParent();
      }
      return rootCell == null ? null : rootCell.findChild(CellFinders.LAST_SELECTABLE_LEAF);
    }

  }

  public static class MoveHome extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      EditorCell target = findTarget(selection);
      if (target instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) target;
        label.home();
        context.getNodeEditorComponent().resetLastCaretX();
      }
      context.getNodeEditorComponent().changeSelection(target);
    }

    private EditorCell findTarget(EditorCell cell) {
      return cell.getHomeCell(CellConditions.SELECTABLE);
    }

  }

  public static class MoveEnd extends NavigationAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      EditorCell target = findTarget(selection);
      if (target instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) target;
        label.end();
        context.getNodeEditorComponent().resetLastCaretX();
      }
      context.getNodeEditorComponent().changeSelection(target);
    }

    private EditorCell findTarget(EditorCell cell) {
      return cell.getEndCell(CellConditions.SELECTABLE);
    }
  }

  public static class MoveRight extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = getDeepestSelectedCell(context);
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = getDeepestSelectedCell(context);
      EditorCell target = findTarget(selection);
      context.getNodeEditorComponent().changeSelection(target);
      if (target.isPunctuationLayout() && ((EditorCell_Label) target).isCaretPositionAllowed(1)) {
        ((EditorCell_Label) target).setCaretPosition(1);
      } else if (target instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) target;
        label.home();
      }
    }

    private EditorCell getDeepestSelectedCell(EditorContext context) {
      Selection deepestSelection = context.getNodeEditorComponent().getSelectionManager().getDeepestSelection();
      if (deepestSelection instanceof SingularSelection) {
        return ((SingularSelection) deepestSelection).getEditorCell();
      } else if (deepestSelection instanceof NodeRangeSelection) {
        return ((NodeRangeSelection) deepestSelection).getLastCell();
      }
      return null;
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell toRight = cell.getLeafToRight(CellConditions.SELECTABLE);
      if (toRight != null) {
        return toRight;
      }
      return cell.getNextLeaf(CellConditions.SELECTABLE);
    }
  }

  public static class MoveUp extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selectedCell = getDeepestSelectedCell(context);
      return selectedCell != null && selectedCell.getParent() != null && findTarget(selectedCell, selectedCell.getCaretX()) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selectedCell = getDeepestSelectedCell(context);
      int caretX = selectedCell.getCaretX();
      if (context.getNodeEditorComponent().hasLastCaretX()) {
        caretX = context.getNodeEditorComponent().getLastCaretX();
      }
      context.getNodeEditorComponent().saveLastCaretX(caretX);
      EditorCell target = findTarget(selectedCell, caretX);
      target.setCaretX(caretX);
      context.getNodeEditorComponent().changeSelection(target, false);
    }

    private EditorCell getDeepestSelectedCell(EditorContext context) {
      Selection deepestSelection = context.getNodeEditorComponent().getSelectionManager().getDeepestSelection();
      if (deepestSelection instanceof SingularSelection) {
        return ((SingularSelection) deepestSelection).getEditorCell();
      } else if (deepestSelection instanceof NodeRangeSelection) {
        return ((NodeRangeSelection) deepestSelection).getFirstCell();
      }
      return null;
    }

    private EditorCell findTarget(EditorCell cell, int caretX) {
      return cell.getUpper(CellConditions.SELECTABLE, caretX);
    }
  }

  public static class MoveDown extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selectedCell = getDeepestSelectedCell(context);
      return selectedCell != null && findTarget(selectedCell, selectedCell.getCaretX()) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selectedCell = getDeepestSelectedCell(context);
      int caretX = selectedCell.getCaretX();
      if (context.getNodeEditorComponent().hasLastCaretX()) {
        caretX = context.getNodeEditorComponent().getLastCaretX();
      }
      context.getNodeEditorComponent().saveLastCaretX(caretX);
      EditorCell target = findTarget(selectedCell, caretX);
      target.setCaretX(caretX);
      context.getNodeEditorComponent().changeSelection(target, false);
    }

    private EditorCell getDeepestSelectedCell(EditorContext context) {
      Selection deepestSelection = context.getNodeEditorComponent().getSelectionManager().getDeepestSelection();
      if (deepestSelection instanceof SingularSelection) {
        return ((SingularSelection) deepestSelection).getEditorCell();
      } else if (deepestSelection instanceof NodeRangeSelection) {
        return ((NodeRangeSelection) deepestSelection).getLastCell();
      }
      return null;
    }

    private EditorCell findTarget(EditorCell cell, int caretX) {
      return cell.getLower(CellConditions.SELECTABLE, caretX);
    }
  }

  public static class MoveNext extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && selection.getNextLeaf(CellConditions.EDITABLE) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(selection.getNextLeaf(CellConditions.EDITABLE));
    }
  }

  public static class MovePrev extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && selection.getPrevLeaf(CellConditions.EDITABLE) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(selection.getPrevLeaf(CellConditions.EDITABLE));
    }
  }

  private static void navigatePage(EditorContext context, boolean isDown) {
    EditorComponent editor = context.getNodeEditorComponent();
    EditorCell selection = editor.getSelectedCell();
    Rectangle rect = editor.getVisibleRect();
    int height = (int) rect.getHeight();
    height = isDown ? height : -height;
    int caretX = selection.getCaretX();
    int y = selection.getY() + (selection.getHeight() / 2);
    int newY = y + height;
    EditorCell target = editor.findCellWeak(caretX, newY);
    if (target == null) {
      target = isDown ? editor.myRootCell.findChild(CellFinders.LAST_SELECTABLE_LEAF) : editor.myRootCell.findChild(CellFinders.FIRST_SELECTABLE_LEAF);
      editor.changeSelection(target);
    } else {
      target.setCaretX(caretX);
      editor.changeSelection(target);
    }
  }

  public static class MovePageUp extends NavigationAction {
    public boolean canExecute(EditorContext context) {
      return true;
    }

    public void execute(EditorContext context) {
      navigatePage(context, true);
    }
  }

  public static class MovePageDown extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return true;
    }

    public void execute(EditorContext context) {
      navigatePage(context, false);
    }
  }

  public static class SelectUp extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      SelectionManager selectionManager = context.getNodeEditorComponent().getSelectionManager();
      EditorCell anchorCell = getAnchorCell(selectionManager.getSelection());

      if (anchorCell instanceof EditorCell_Label && !((EditorCell_Label) anchorCell).isEverythingSelected()) {
        return true;
      }
      return anchorCell != null && anchorCell.getParent() != null && findTarget(anchorCell) != null;
    }

    public void execute(EditorContext context) {
      SelectionManager selectionManager = context.getNodeEditorComponent().getSelectionManager();
      EditorCell anchorCell = getAnchorCell(selectionManager.getSelection());

      if (anchorCell instanceof EditorCell_Label && !((EditorCell_Label) anchorCell).isEverythingSelected()) {
        EditorCell_Label label = (EditorCell_Label) anchorCell;
        selectionManager.pushSelection(selectionManager.createSelection(label));
        label.selectAll();
      } else {
        selectionManager.pushSelection(selectionManager.createSelection(findTarget(anchorCell)));
      }
    }

    private EditorCell findTarget(EditorCell cell) {
      while (cell.getParent() != null && cell.getParent().isTransparentCollection()) {
        cell = cell.getParent();
      }
      EditorCell_Collection parent = cell.getParent();
      while (parent != null) {
        if (parent.isSelectable()) {
          while (parent.getParent() != null && parent.getParent().isTransparentCollection() && parent.getParent().isSelectable()) {
            parent = parent.getParent();
          }
          return parent;
        }
        parent = parent.getParent();
      }
      return null;
    }

    private EditorCell getAnchorCell(Selection selection) {
      if (selection instanceof SingularSelection) {
        return ((SingularSelection) selection).getEditorCell();
      } else if (selection instanceof MultipleSelection) {
        // TODO: process MultipleSelection here
        return null;
      }
      return null;
    }
  }

  public static class SelectDown extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return context.getNodeEditorComponent().getSelectionManager().getSelectionStackSize() > 1;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().getSelectionManager().popSelection();
    }
  }

  public static class SideSelect extends EditorCellAction {
    private CellSide mySide;

    protected SideSelect(CellSide side) {
      mySide = side;
    }

    private EditorCell getNextLeaf(EditorCell current) {
      if (mySide == CellSide.LEFT) {
        return current.getPrevLeaf(CellConditions.SELECTABLE);
      } else {
        return current.getNextLeaf(CellConditions.SELECTABLE);
      }
    }

    public boolean canExecute(EditorContext context) {
      SelectionManager selectionManager = context.getNodeEditorComponent().getSelectionManager();
      Selection selection = selectionManager.getSelection();
      if (selection instanceof SingularSelection) {
        SingularSelection singularSelection = (SingularSelection) selection;
        if (!expandSelection(singularSelection) && selectionManager.getSelectionStackSize() > 1) {
          return true;
        }
        EditorCell selected = singularSelection.getEditorCell();
        EditorCell nextLeaf = getNextLeaf(selected);
        return nextLeaf != null && getCommonSelectableAncestor(selected, nextLeaf) != null;
      }
      return false;
    }

    public void execute(EditorContext context) {
      SelectionManager selectionManager = context.getNodeEditorComponent().getSelectionManager();
      SingularSelection selection = (SingularSelection) selectionManager.getSelection();
      if (!expandSelection(selection) && selectionManager.getSelectionStackSize() > 1) {
        selectionManager.popSelection();
        return;
      }
      EditorCell selected = selection.getEditorCell();
      EditorCell nextLeaf = getNextLeaf(selected);
      EditorCell cellToSelect = getCommonSelectableAncestor(selected, nextLeaf);
      Selection newSelection = selectionManager.createSelection(cellToSelect);
      if (newSelection instanceof SingularSelection) {
        ((SingularSelection) newSelection).setSideSelectDirection(mySide == CellSide.LEFT ? SideSelectDirection.LEFT : SideSelectDirection.RIGHT);
      }
      selectionManager.pushSelection(newSelection);
    }

    private boolean expandSelection(SingularSelection selection) {
      switch (selection.getSideSelectDirection()) {
        case LEFT:
          return mySide == CellSide.LEFT;
        case RIGHT:
          return mySide == CellSide.RIGHT;
      }
      return true;
    }

    private EditorCell getCommonSelectableAncestor(EditorCell first, EditorCell... cells) {
      EditorCell result = first;
      while (result != null) {
        if (result.isSelectable()) {
          boolean common = true;
          for (EditorCell cell : cells) {
            if (!result.isAncestorOf(cell) && result != cell) {
              common = false;
              break;
            }
          }
          if (common) return result;
        }

        result = result.getParent();
      }
      return null;
    }
  }

  public static class EnlargeSelection extends NavigationAction {

    private boolean myUp;

    public EnlargeSelection(boolean up) {
      myUp = up;
    }

    @Override
    public boolean canExecute(EditorContext context) {
      // TODO: this check should be reallocated into Selection.canExecuteAction() method once it created
      Selection selection = context.getNodeEditorComponent().getSelectionManager().getSelection();
      if (selection instanceof NodeRangeSelection) {
        return true;
      }
      if (selection instanceof SingularSelection) {
        EditorCell editorCell = ((SingularSelection) selection).getEditorCell();
        return editorCell.getSNode().getParent() != null;
      }
      return false;
    }

    @Override
    public void execute(final EditorContext context) {
      EditorComponent editorComponent = context.getNodeEditorComponent();
      SelectionManager selectionManager = editorComponent.getSelectionManager();
      Selection selection = selectionManager.getSelection();
      if (selection instanceof SingularSelection) {
        EditorCell selectedCell = ((SingularSelection) selection).getEditorCell();
        SNode selectedNode = selectedCell.getSNode();
        SNode topMostNodeInSingularContainment = findTopMostNodeWithSingularContainment(selectedNode);
        if (topMostNodeInSingularContainment != selectedNode) {
          EditorCell nodeCell = editorComponent.findNodeCell(topMostNodeInSingularContainment);
          if (nodeCell != null) {
            editorComponent.pushSelection(nodeCell);
            editorComponent.scrollToCell(nodeCell);
          }
        } else {
          Selection newSelection = selectionManager.createRangeSelection(selectedNode, selectedNode);
          if (newSelection instanceof NodeRangeSelection && selectedCell.isBigCell()) {
            newSelection = ((NodeRangeSelection) newSelection).enlargeSelection(myUp);
          }
          if (newSelection != null) {
            selectionManager.pushSelection(newSelection);
            scrollToSelection(editorComponent, newSelection);
          }
        }
      } else if (selection instanceof NodeRangeSelection) {
        Selection newSelection = ((NodeRangeSelection) selection).enlargeSelection(myUp);
        if (newSelection != null) {
          selectionManager.pushSelection(newSelection);
          scrollToSelection(editorComponent, newSelection);
        }
      }
    }

    private void scrollToSelection(EditorComponent editorComponent, Selection selection) {
      if (selection instanceof NodeRangeSelection) {
        editorComponent.scrollToCell(((NodeRangeSelection) selection).getLastCell());
      }
    }

    private SNode findTopMostNodeWithSingularContainment(SNode childNode) {
      while (childNode.getParent() != null && SNodeUtil.getLinkDeclaration_IsSingular(childNode.getRoleLink())) {
        childNode = childNode.getParent();
      }
      return childNode;
    }
  }

  public static class Complete extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getSelectedCell();
      return selection != null && selection.getSubstituteInfo() != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getSelectedCell();
      context.getNodeEditorComponent().activateNodeSubstituteChooser(selection, false);
    }
  }

  public static class CompleteSmart extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getSelectedCell();
      return selection != null && selection.getSubstituteInfo() != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getSelectedCell();
      context.getNodeEditorComponent().activateNodeSubstituteChooser(selection, false, true);
    }
  }

  public static class ShowMessage extends EditorCellAction {
    public void execute(EditorContext context) {
      context.getNodeEditorComponent().showMessageTooltip();
    }
  }
}
