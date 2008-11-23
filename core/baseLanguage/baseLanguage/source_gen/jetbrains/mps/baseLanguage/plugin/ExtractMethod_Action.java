package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.ArrayList;

public class ExtractMethod_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ExtractMethod_Action.class);
  private static final Icon ICON = null;

  private List<SNode> nodes;
  public Frame frame;

  public ExtractMethod_Action() {
    super("Extract Method", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt M";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ExtractMethodFabric.isRefactoringAvailable(ExtractMethod_Action.this.nodes);
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ExtractMethod", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      List<SNode> nodes = event.getData(MPSDataKeys.SNODES);
      boolean error = false;
      if (nodes != null) {
      }
      if (error || nodes == null) {
        this.nodes = null;
      } else
      {
        this.nodes = new ArrayList<SNode>(nodes);
      }
    }
    if (this.nodes == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ExtractMethodDialog dialog = new ExtractMethodDialog(event.getData(MPSDataKeys.EDITOR_CONTEXT), ExtractMethod_Action.this.nodes, ExtractMethod_Action.this.frame);
      dialog.showDialog();
      dialog.pack();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ExtractMethod", t);
    }
  }

}
