package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class TypesystemEditorPopupInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(TypesystemEditorPopupInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.typesystem.plugin.TypesystemEditorPopupInternal";

  public TypesystemEditorPopupInternal_ActionGroup() {
    super("TypesystemEditorPopupInternal", ID);
    this.setIsInternal(true);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.lang.typesystem.plugin.SliceWithNode_Action", "jetbrains.mps.lang.typesystem");
      this.addAction("jetbrains.mps.lang.typesystem.plugin.ShowInequationsForCell_Action", "jetbrains.mps.lang.typesystem");
      this.addAction("jetbrains.mps.lang.typesystem.plugin.TestSubtypingGraph_Action", "jetbrains.mps.lang.typesystem");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, null);
  }

}
