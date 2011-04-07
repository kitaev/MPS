package jetbrains.mps.ide.editor.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class Insert_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(Insert_Action.class);

  public Insert_Action() {
    super("Insert New Element", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    if (((EditorCell) MapSequence.fromMap(_params).get("editorCell")) instanceof EditorCell_Component) {
      return false;
    }
    return ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).isFocusOwner() && !(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).isReadOnly()) && !(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).getNodeSubstituteChooser().isVisible());
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "Insert", t);
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
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      if (((EditorCell) MapSequence.fromMap(_params).get("editorCell")).isFirstCaretPosition()) {
        if (!(((EditorCell) MapSequence.fromMap(_params).get("editorCell")).isLastCaretPosition()) || (((EditorCell) MapSequence.fromMap(_params).get("editorCell")) instanceof EditorCell_Label && !(((EditorCell_Label) ((EditorCell) MapSequence.fromMap(_params).get("editorCell"))).isLastPositionAllowed()))) {
          EditorActionUtils.callInsertBeforeAction(((EditorCell) MapSequence.fromMap(_params).get("editorCell")));
          return;
        }
      }
      EditorActionUtils.callInsertAction(((EditorCell) MapSequence.fromMap(_params).get("editorCell")));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "Insert", t);
      }
    }
  }
}
