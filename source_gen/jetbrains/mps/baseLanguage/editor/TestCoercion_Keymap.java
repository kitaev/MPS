package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;

public class TestCoercion_Keymap extends EditorCellKeyMap {

  public  TestCoercion_Keymap() {
    this.setApplicableToEveryModel(true);
    EditorCellKeyMapAction action;
    this.putAction("ctrl+alt+shift", "VK_T", new TestCoercion_Keymap_Action0());
  }
}
