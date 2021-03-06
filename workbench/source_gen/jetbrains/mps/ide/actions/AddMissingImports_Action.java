package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.MissingDependenciesFixer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;

public class AddMissingImports_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(AddMissingImports_Action.class);

  public AddMissingImports_Action() {
    super("Fix Missing Imports", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "AddMissingImports", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("modelDescriptor", event.getData(MPSDataKeys.MODEL));
    if (MapSequence.fromMap(_params).get("modelDescriptor") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      new MissingDependenciesFixer(((IOperationContext) MapSequence.fromMap(_params).get("context")), ((SModelDescriptor) MapSequence.fromMap(_params).get("modelDescriptor"))).fix();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AddMissingImports", t);
      }
    }
  }
}
