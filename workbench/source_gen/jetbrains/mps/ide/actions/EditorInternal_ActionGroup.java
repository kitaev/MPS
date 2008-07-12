package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.actions.cells.ShowCellInCellExplorerAction;
import jetbrains.mps.ide.actions.nodes.HighlightCellDependenciesAction;
import jetbrains.mps.ide.actions.nodes.TestNodePathAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;

public class EditorInternal_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(EditorInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorInternal";

  public EditorInternal_ActionGroup() {
    super("Internal", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(true);
    this.setPopup(true);
    try {
      this.add(new TestNodePathAction());
      this.add(new CellProperties_Action());
      this.add(new ShowCellInCellExplorerAction());
      this.addSeparator();
      this.add(new PrintNodeID_Action());
      this.add(new PrintTextPresentation_Action());
      this.add(new HighlightCellDependenciesAction());
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(EditorInternal_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
