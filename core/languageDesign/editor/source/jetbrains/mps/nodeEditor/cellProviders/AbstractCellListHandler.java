/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.nodeEditor.cellProviders;

import jetbrains.mps.nodeEditor.*;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellActions.CellAction_InsertIntoCollection;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.structure.BaseConcept;

import java.util.*;
import java.awt.event.KeyEvent;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 21.02.2006
 * Time: 14:29:05
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractCellListHandler implements KeyboardHandler {
  public static final String ELEMENT_CELL_ACTIONS_SET = "element-cell-actions-set";

  protected SNode myOwnerNode;
  protected EditorContext myEditorContext;
  protected EditorCell_Collection myListEditorCell_Collection;
  protected SNode myInsertedNode;
  protected String myElementRole;

  public AbstractCellListHandler(SNode ownerNode, String elementRole, EditorContext editorContext) {
    myOwnerNode = ownerNode;
    myElementRole = elementRole;
    myEditorContext = editorContext;
  }

  public EditorContext getEditorContext() {
    return myEditorContext;
  }

  public SNode getOwner() {
    return myOwnerNode;
  }

  public String getElementRole() {
    return myElementRole;
  }

  protected abstract SNode getAnchorNode(EditorCell anchorCell);

  protected abstract void doInsertNode(SNode anchorNode, boolean insertBefore);

  public void startInsertMode(EditorContext editorContext, EditorCell anchorCell, boolean insertBefore) {
    SNode anchorNode = getAnchorNode(anchorCell);
    myInsertedNode = createNodeToInsert(editorContext);
    doInsertNode(anchorNode, insertBefore);
    EditorComponent editor = editorContext.getNodeEditorComponent();
    editor.pushKeyboardHandler(this);
  }

  protected void finishInsertMode(EditorContext editorContext) {
    if (isInsertMode()) {
      editorContext.getNodeEditorComponent().popKeyboardHandler(); // remove this handler from stack.
      myInsertedNode = null;
    }
  }

  protected void cancelInsertMode(EditorContext editorContext) {
    if (isInsertMode()) {
      editorContext.getNodeEditorComponent().popKeyboardHandler(); // remove this handler from stack.
      myInsertedNode.delete();
      myInsertedNode = null;
    }
  }

  protected boolean isInsertMode() {
    return myInsertedNode != null;
  }

  public abstract EditorCell createNodeCell(EditorContext editorContext, SNode node);

  public EditorCell createSeparatorCell(EditorContext editorContext) {
    return null;
  }

  protected abstract EditorCell createEmptyCell(EditorContext editorContext);

  public abstract SNode createNodeToInsert(EditorContext editorContext);

  public EditorCell_Collection createCells_Vertical(EditorContext editorContext) {
    return createCells(editorContext, new CellLayout_Vertical());
  }

  public EditorCell_Collection createCells_Horizontal(EditorContext editorContext) {
    return createCells(editorContext, new CellLayout_Horizontal());
  }

  public EditorCell_Collection createCells(EditorContext editorContext, CellLayout cellLayout, boolean selectable) {
    EditorCell_Collection cellsCollection = createCells(editorContext, cellLayout);
    if (!selectable) {
      return cellsCollection;
    }

    // if the list compartment is selectable - create wrapping cell collection around it so
    // that actions intended to work for the list element do not work for the list owner.
    EditorCell_Collection wrapperCell = EditorCell_Collection.create(editorContext, myOwnerNode, new CellLayout_Horizontal(), null);
    wrapperCell.setSelectable(true);
    wrapperCell.addEditorCell(cellsCollection);
    return wrapperCell;
  }

  public EditorCell_Collection createCells(EditorContext editorContext, CellLayout cellLayout) {
    myListEditorCell_Collection = EditorCell_Collection.create(editorContext, myOwnerNode, cellLayout, this);
    myListEditorCell_Collection.setSelectable(false);

    Iterator<SNode> listNodes = getNodesForList().iterator();
    if (!listNodes.hasNext()) {
      EditorCell emptyCell = createEmptyCell(editorContext);
      emptyCell.setRole(getElementRole());
      myListEditorCell_Collection.addEditorCell(emptyCell);
    } else {
      EditorCell separatorCell = null;
      while (listNodes.hasNext()) {
        separatorCell = addSeparatorCell(editorContext, separatorCell);
        SNode node = listNodes.next();
        myListEditorCell_Collection.addEditorCell(createNodeCell(editorContext, node));
      }
    }

    // add insert/insert-before actions
    myListEditorCell_Collection.setAction(CellActionType.INSERT, new CellAction_InsertIntoCollection(this, false));
    myListEditorCell_Collection.setAction(CellActionType.INSERT_BEFORE, new CellAction_InsertIntoCollection(this, true));

    return myListEditorCell_Collection;
  }

  protected abstract List<SNode> getNodesForList();

  protected EditorCell addSeparatorCell(EditorContext editorContext, EditorCell separatorCell) {
    if (separatorCell != null) {
      myListEditorCell_Collection.addEditorCell(separatorCell);
    }
    separatorCell = createSeparatorCell(editorContext);
    return separatorCell;
  }

  public boolean processKeyPressed(EditorContext editorContext, KeyEvent keyEvent) {
    EditorComponent editor = editorContext.getNodeEditorComponent();
    CellActionType actionType = editor.getActionType(keyEvent, editorContext);
    if (actionType == CellActionType.INSERT || actionType == CellActionType.INSERT_BEFORE) {
      cancelInsertMode(editorContext);
      myListEditorCell_Collection.getParent().executeAction(actionType);
    } else {
      finishInsertMode(editorContext);
      editor.processKeyPressed(keyEvent);
    }
    return true;
  }

  public boolean processKeyTyped(EditorContext editorContext, KeyEvent keyEvent) {
    return false;
  }

  public boolean processKeyReleased(EditorContext editorContext, KeyEvent keyEvent) {
    EditorComponent editor = editorContext.getNodeEditorComponent();
    CellActionType actionType = editor.getActionType(keyEvent, editorContext);
    if (!(actionType == CellActionType.INSERT || actionType == CellActionType.INSERT_BEFORE) ||
            keyEvent.getModifiers() == 0) { // disable this feature if 'insert' keystroke doesn't contain modifiers
      finishInsertMode(editorContext);
      return true;
    }
    return false;
  }


  // important: create such a method in every descendant of this class, it will be invoked via reflection
  @SuppressWarnings({"UnusedDeclaration"})
  public static String getRoleByRelationDeclaration(BaseConcept relationDeclaration) {
    return null;
  }
}
