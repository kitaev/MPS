package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.cellExplorer.CellExplorerView;

public class ShowCellInExplorer_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ShowCellInExplorer_Action.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}\\icons\\cellExplorer.png", "jetbrains.mps.ide"), true);

  public IOperationContext context;
  public EditorCell cell;

  public ShowCellInExplorer_Action() {
    super("Show Cell In Explorer", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowCellInExplorer", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.cell == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ShowCellInExplorer_Action.this.context.getComponent(CellExplorerView.class).showCell(ShowCellInExplorer_Action.this.cell);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowCellInExplorer", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(ShowCellInExplorer_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
