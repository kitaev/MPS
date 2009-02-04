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
package jetbrains.mps.nodeEditor;

import jetbrains.mps.nodeEditor.EditorCellKeyMap.ActionKey;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.CellFinders;
import jetbrains.mps.util.Pair;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.structure.modules.ModuleReference;

import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.JViewport;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

import com.intellij.openapi.util.Computable;

/**
 * author: Igor Alshannikov
 * Sep 28, 2006
 */
public class KeyMapUtil {
  private static Logger LOG = Logger.getLogger(KeyMapUtil.class);
  
  /**
   * @return list of pairs: keymapAction/actionCell
   */
  static List<Pair<EditorCellKeyMapAction, EditorCell>> getKeyMapActionsForEvent(final EditorCell selectedCell, final KeyEvent keyEvent, final EditorContext editorContext) {
    return ModelAccess.instance().runReadAction(new Computable<List<Pair<EditorCellKeyMapAction, EditorCell>>>() {
      public List<Pair<EditorCellKeyMapAction, EditorCell>> compute() {
        // need to process key event?
        if (keyEvent.getID() != KeyEvent.KEY_PRESSED && keyEvent.getID() != KeyEvent.KEY_TYPED) return Collections.emptyList();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == KeyEvent.VK_CONTROL || keyCode == KeyEvent.VK_ALT || keyCode == KeyEvent.VK_SHIFT ||
                /*keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT || */ //TODO why?!
                keyCode == KeyEvent.VK_PAGE_UP || keyCode == KeyEvent.VK_PAGE_DOWN
                /* || keyCode == KeyEvent.VK_BACK_SPACE*/) {
          return Collections.emptyList();
        }
        if ((keyEvent.getModifiers() & (KeyEvent.CTRL_MASK | KeyEvent.ALT_MASK | KeyEvent.SHIFT_MASK)) == 0) {
          // no modifiers - ignore letters/digits etc.
          char keyChar = keyEvent.getKeyChar();
          if (Character.isLetterOrDigit(keyChar)
                  /* || Character.isSpaceChar(keyChar) || Character.isWhitespace(keyChar)
                    Sorry, I need to handle space manually in textLanguage */) {
            return Collections.emptyList(); //TODO why?!
          }
        }

        // collect all keymaps available
        List<Pair<EditorCellKeyMap, EditorCell>> keymapsAndCells = getRegisteredKeymaps(selectedCell, editorContext);
        if (keymapsAndCells.isEmpty()) {
          return Collections.emptyList();
        }

        return selectActionsFromKeymaps(selectedCell, keyEvent, editorContext, keymapsAndCells);
      }
    });
  }

  /**
   * @return List of pairs keymap/ownerCell
   */
  private static List<Pair<EditorCellKeyMap, EditorCell>> getRegisteredKeymaps(EditorCell selectedCell, EditorContext editorContext) {
    Set<Class> addedKeymaps = new HashSet<Class>(); // don't duplicate keymaps
    List<Pair<EditorCellKeyMap, EditorCell>> keyMapsAndCells = new ArrayList<Pair<EditorCellKeyMap, EditorCell>>();

    EditorCell keymapOwnerCell = selectedCell;
    while (keymapOwnerCell != null) {
      EditorCellKeyMap keymap = keymapOwnerCell.getKeyMap();
      if (keymap != null && !addedKeymaps.contains(keymap.getClass())) {
        keyMapsAndCells.add(new Pair<EditorCellKeyMap, EditorCell>(keymap, keymapOwnerCell));
        addedKeymaps.add(keymap.getClass());
      }
      keymapOwnerCell = keymapOwnerCell.getParent();
    }
    SNode node = editorContext.getNodeEditorComponent().getEditedNode();
    if (node != null) {
      SModel model = node.getModel();
      for (ModuleReference ref : model.getLanguageRefs(GlobalScope.getInstance())) {
        List<EditorCellKeyMap> keyMapsForNamespace = LanguagesKeymapManager.getInstance().getKeyMapsForLanguage(editorContext.getScope().getLanguage(ref));
        if (keyMapsForNamespace != null) {
          for (EditorCellKeyMap keymap : keyMapsForNamespace) {
            if (!addedKeymaps.contains(keymap.getClass())) {
              keyMapsAndCells.add(new Pair<EditorCellKeyMap, EditorCell>(keymap, selectedCell));
              addedKeymaps.add(keymap.getClass());
            }
          }
        }
      }
    }

    return keyMapsAndCells;
  }

  public static Set<EditorCellKeyMapAction> getRegisteredActions(EditorCell selectedCell, EditorContext context) {
    Set<EditorCellKeyMapAction> result = new HashSet<EditorCellKeyMapAction>();
    for (Pair<EditorCellKeyMap, EditorCell> pair : getRegisteredKeymaps(selectedCell, context)) {
      result.addAll(pair.o1.getActions(null));
    }
    return result;
  }

  /**
   * @param keyEvent        !!! can be null
   * @param keymapsAndCells - List of pairs keymap/ownerCell
   * @return List of pairs keymapAction/actionCell
   */
  private static List<Pair<EditorCellKeyMapAction, EditorCell>> selectActionsFromKeymaps(EditorCell selectedCell,
                                                                                         KeyEvent keyEvent,
                                                                                         EditorContext editorContext,
                                                                                         List<Pair<EditorCellKeyMap, EditorCell>> keymapsAndCells) {
    // choose appropriate actions from keymaps
    int caretPosition = getCaretPositionCode(selectedCell);
    List<Pair<EditorCellKeyMapAction, EditorCell>> actionsAndCells = new LinkedList<Pair<EditorCellKeyMapAction, EditorCell>>();
    for (Pair<EditorCellKeyMap, EditorCell> keymapAndCell : keymapsAndCells) {
      EditorCellKeyMap keymap = keymapAndCell.o1;
      EditorCell keymapOwnerCell = keymapAndCell.o2;

      List<EditorCellKeyMapAction> actions = keymap.getActions(keyEvent);
      for (EditorCellKeyMapAction action : actions) {
        EditorCell actionCell = selectActionCell(action, keymapOwnerCell, selectedCell, caretPosition, keyEvent, editorContext);
        if (actionCell != null) {
          actionsAndCells.add(new Pair<EditorCellKeyMapAction, EditorCell>(action, actionCell));
        }
      }
    }

    return actionsAndCells;
  }

  private static int getCaretPositionCode(EditorCell selectedCell) {
    int actualCaretPosition = EditorCellKeyMapAction.CARET_AT_ANY_POSITION;
    if (selectedCell instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) selectedCell;
      if (isStrictlyFirstCaretPosition(label)) {
        actualCaretPosition = EditorCellKeyMapAction.CARET_AT_FIRST_POSITION;
      } else if (isStrictlyLastCaretPosition(label)) {
        actualCaretPosition = EditorCellKeyMapAction.CARET_AT_LAST_POSITION;
      } else {
        actualCaretPosition = EditorCellKeyMapAction.CARET_AT_INTERMEDIATE_POSITION;
      }
    }
    return actualCaretPosition;
  }

  /**
   * @param keyEvent !!! can be null !!!
   */
  private static EditorCell selectActionCell(EditorCellKeyMapAction action, EditorCell keymapOwnerCell, EditorCell selectedCell, int actualCaretPosition, KeyEvent keyEvent, EditorContext editorContext) {
    // choose 'context cell' (between 'selected cell' and 'keymap owner cell' inclusive)
    EditorCell actionCell = selectedCell;
    while (actionCell != null) {
      boolean conditionSatisfied = false;
      if (action.getCaretPolicy() == EditorCellKeyMapAction.CARET_AT_ANY_POSITION) {
        conditionSatisfied = true;
      } else if (action.getCaretPolicy() == actualCaretPosition) {
        if (action.getCaretPolicy() == EditorCellKeyMapAction.CARET_AT_FIRST_POSITION) {
          conditionSatisfied = (actionCell.findChild(CellFinders.FIRST_SELECTABLE_LEAF, true) == selectedCell) && isStrictlyFirstCaretPosition(selectedCell);
        } else if (action.getCaretPolicy() == EditorCellKeyMapAction.CARET_AT_LAST_POSITION) {
          conditionSatisfied = (actionCell.findChild(CellFinders.LAST_SELECTABLE_LEAF, true) == selectedCell) && isStrictlyLastCaretPosition(selectedCell);
        } else {
          conditionSatisfied = true;
        }
      }

      try {
        if (conditionSatisfied && canExecuteKeyMapAction(action, keyEvent, actionCell, editorContext)) {
          return actionCell;
        }
      } catch (Exception e) {
        LOG.error(e);
        return null;
      }
      if (actionCell == keymapOwnerCell) {
        return null;
      }
      actionCell = actionCell.getParent();
    }
    return null;
  }

  private static boolean isStrictlyFirstCaretPosition(EditorCell cell) {
    if (!(cell instanceof EditorCell_Label)) return false;
    EditorCell_Label label = (EditorCell_Label) cell;
    return label.isFirstCaretPosition() && label.isFirstPositionAllowed();
  }

  private static boolean isStrictlyLastCaretPosition(EditorCell cell) {
    if (!(cell instanceof EditorCell_Label)) return false;
    EditorCell_Label label = (EditorCell_Label) cell;
    return label.isLastCaretPosition() && label.isLastPositionAllowed();
  }

  public static List<Pair<EditorCellKeyMapAction, ActionKey>> getAllApplicableActionsAndKeys(EditorCell selectedCell, EditorContext editorContext) {
    // collect all keymaps available
    List<Pair<EditorCellKeyMap, EditorCell>> keymapsAndCells = getRegisteredKeymaps(selectedCell, editorContext);
    if (keymapsAndCells.isEmpty()) {
      return Collections.emptyList();
    }

    // choose appropriate actions from keymaps
    int caretPosition = getCaretPositionCode(selectedCell);
    List<Pair<EditorCellKeyMapAction, ActionKey>> result = new LinkedList<Pair<EditorCellKeyMapAction, ActionKey>>();
    for (Pair<EditorCellKeyMap, EditorCell> keymapAndCell : keymapsAndCells) {
      EditorCellKeyMap keymap = keymapAndCell.o1;
      EditorCell keymapOwnerCell = keymapAndCell.o2;

      List<Pair<EditorCellKeyMapAction, ActionKey>> actionsAndKeys = keymap.getAllActionsAndKeys();
      for (Pair<EditorCellKeyMapAction, ActionKey> actionAndKey : actionsAndKeys) {
        EditorCellKeyMapAction action = actionAndKey.o1;
        EditorCell actionCell = selectActionCell(action, keymapOwnerCell, selectedCell, caretPosition, null, editorContext);
        if (actionCell != null) {
          result.add(actionAndKey);
        }
      }
    }
    return result;
  }


  public static boolean canExecuteKeyMapAction(final EditorCellKeyMapAction action, final KeyEvent keyEvent, EditorCell contextCell, final EditorContext editorContext) {
    return editorContext.runWithContextCell(contextCell, new Computable<Boolean>() {
      public Boolean compute() {
        return action.canExecute(keyEvent, editorContext);
      }
    });
  }

  public static void executeKeyMapAction(final EditorCellKeyMapAction action, final KeyEvent keyEvent, EditorCell contextCell, final EditorContext editorContext) {
    editorContext.runWithContextCell(contextCell, new Runnable() {
      public void run() {
        editorContext.executeCommand(new Runnable() {
          public void run() {
            action.execute(keyEvent, editorContext);
          }
        });
      }
    });
  }

  static void showActionsMenu(List<Pair<EditorCellKeyMapAction, EditorCell>> actionsInfo, final KeyEvent keyEvent, final EditorContext editorContext, EditorCell selectedCell) {
    JPopupMenu menu = new JPopupMenu();
    int index = 1;
    for (Pair<EditorCellKeyMapAction, EditorCell> actionAndContextCell : actionsInfo) {
      final EditorCellKeyMapAction action = actionAndContextCell.o1;
      final EditorCell contextCell = actionAndContextCell.o2;
      char acc = 0;
      if (1 <= index && index <= 9) {
        acc = (char) ('0' + index);
      } else if (index == 10) {
        acc = '0';
      } else if (10 < index && index - 11 < ('Z' - 'A')) {
        acc = (char) ('A' + index - 11);
      }
      JMenuItem menuItem = new JMenuItem(action.getDescriptionText());
      if (acc != 0) {
        menuItem.setAccelerator(KeyStroke.getKeyStroke(acc));
      }
      ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              executeKeyMapAction(action, keyEvent, contextCell, editorContext);
            }
          });
        }
      };
      menuItem.addActionListener(actionListener);
      menu.add(menuItem);
      index++;
    }
    EditorComponent component = editorContext.getNodeEditorComponent();
    int x = selectedCell.getX();
    int y = selectedCell.getY() + selectedCell.getHeight();
    if (component.getParent() instanceof JViewport) {
      JViewport viewport = (JViewport) component.getParent();
      Rectangle vr = viewport.getViewRect();
      x = Math.max(vr.x, x);
      y = Math.max(vr.y, y);
    }
    menu.show(component, x, y);
  }
}
