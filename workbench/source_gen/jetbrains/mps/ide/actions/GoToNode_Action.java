package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.smodel.SNode;

public class GoToNode_Action extends GeneratedAction {
  private static final Icon ICON = new ImageIcon(GoToNode_Action.class.getResource("node.png"));
  protected static Log log = LogFactory.getLog(GoToNode_Action.class);

  public GoToNode_Action() {
    super("Go to Source Node", "go to source node", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToNode", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("source", event.getData(MPSDataKeys.SOURCE_NODE));
    if (MapSequence.fromMap(_params).get("source") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")).getComponent(MPSEditorOpener.class).openNode(((SNode) MapSequence.fromMap(_params).get("source")), ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")), false, true);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToNode", t);
      }
    }
  }
}
