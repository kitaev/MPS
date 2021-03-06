package jetbrains.mps.lang.quotation.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import javax.swing.JOptionPane;
import java.awt.Component;

public class ShowMetaLevel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowMetaLevel_Action.class);

  public ShowMetaLevel_Action() {
    super("Show Quotation Metalevel", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowMetaLevel", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.core.structure.BaseConcept"))) {
          node = null;
        }
      }
      MapSequence.fromMap(_params).put("currentNode", node);
    }
    if (MapSequence.fromMap(_params).get("currentNode") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("component", event.getData(MPSDataKeys.CONTEXT_COMPONENT));
    if (MapSequence.fromMap(_params).get("component") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      int metaLevel = BaseConcept_Behavior.call_getMetaLevel_3981318653438234726(((SNode) MapSequence.fromMap(_params).get("currentNode")));
      JOptionPane.showMessageDialog(((Component) MapSequence.fromMap(_params).get("component")), metaLevel);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowMetaLevel", t);
    }
  }
}
