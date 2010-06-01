package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.workbench.MPSDataKeys;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class Find_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(Find_Action.class);

  private EditorComponent editorComponent;

  public Find_Action() {
    super("Find...", "Find a string in active editor", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
    this.setMnemonic("f".charAt(0));
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl F";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "Find", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.editorComponent = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      Find_Action.this.editorComponent.getSearchPanel().activate();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "Find", t);
      }
    }
  }
}
