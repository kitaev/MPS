package jetbrains.mps.patterns.editor;

/*Generated by MPS 15.11.2006 18:17:43 */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;

public class _PatternExpression_KeyMap extends EditorCellKeyMap {

  public  _PatternExpression_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    this.putAction("any", "_", new _PatternExpression_KeyMap_Action0());
    this.putAction("any", "@", new _PatternExpression_KeyMap_Action1());
    this.putAction("any", "#", new _PatternExpression_KeyMap_Action2());
    this.putAction("any", "$", new _PatternExpression_KeyMap_Action3());
    this.putAction("any", "*", new _PatternExpression_KeyMap_Action4());
  }
}
