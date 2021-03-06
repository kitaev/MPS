package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class SelectLocalEnd_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(SelectLocalEnd_Action.class);

  public SelectLocalEnd_Action() {
    super("Move Caret to Next Word with Selection", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return EditorActionUtils.isReadonlyActionEnabled(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent"))) && SelectLocalEnd_Action.this.canCallSelectLocalEnd(_params);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "SelectLocalEnd", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorCell", event.getData(MPSDataKeys.EDITOR_CELL));
    if (MapSequence.fromMap(_params).get("editorCell") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorContext", event.getData(MPSDataKeys.EDITOR_CONTEXT));
    if (MapSequence.fromMap(_params).get("editorContext") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ((EditorCell) MapSequence.fromMap(_params).get("editorCell")).executeAction(CellActionType.SELECT_LOCAL_END);
      ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).scrollToCell(((EditorCell) MapSequence.fromMap(_params).get("editorCell")));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "SelectLocalEnd", t);
      }
    }
  }

  private boolean canCallSelectLocalEnd(final Map<String, Object> _params) {
    return ((EditorCell) MapSequence.fromMap(_params).get("editorCell")) instanceof EditorCell_Label && !(((EditorCell) MapSequence.fromMap(_params).get("editorCell")).isLastCaretPosition()) && ((EditorCell_Label) ((EditorCell) MapSequence.fromMap(_params).get("editorCell"))).isLastPositionAllowed();
  }
}
