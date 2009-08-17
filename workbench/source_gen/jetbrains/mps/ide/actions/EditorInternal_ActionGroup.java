package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class EditorInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorInternal";

  public EditorInternal_ActionGroup() {
    super("Internal", ID);
    this.setIsInternal(true);
    this.setPopup(true);
    try {
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.ide.actions.TestNodePath_Action", "jetbrains.mps.ide");
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CellProperties_Action", "jetbrains.mps.ide");
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateCode_Action", "jetbrains.mps.ide");
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowCellInExplorer_Action", "jetbrains.mps.ide");
      EditorInternal_ActionGroup.this.addSeparator();
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.ide.actions.PrintNodeID_Action", "jetbrains.mps.ide");
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.ide.actions.HighlightCellDependencies_Action", "jetbrains.mps.ide");
      EditorInternal_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.PrintNodeLine_Action", "jetbrains.mps.baseLanguage");
      EditorInternal_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, null);
  }

}
