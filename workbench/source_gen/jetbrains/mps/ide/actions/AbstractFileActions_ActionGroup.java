package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.projectPane.fileSystem.actions.FileDeleteActionFixed;

public class AbstractFileActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(AbstractFileActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.AbstractFileActions";
  public static final String LABEL_ID_ideaActions = ID + "ideaActions";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public AbstractFileActions_ActionGroup() {
    super("AbstractFileActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      AbstractFileActions_ActionGroup.this.addAnchor(AbstractFileActions_ActionGroup.LABEL_ID_ideaActions);
      AbstractFileActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.FileDelete_Action", "jetbrains.mps.ide", new FileDeleteActionFixed());
      AbstractFileActions_ActionGroup.this.addSeparator();
      AbstractFileActions_ActionGroup.this.addAnchor(AbstractFileActions_ActionGroup.LABEL_ID_vcs);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(FileActions_ActionGroup.ID, FileActions_ActionGroup.LABEL_ID_abstractFileActions);
    this.insertGroupIntoAnother(FolderActions_ActionGroup.ID, FolderActions_ActionGroup.LABEL_ID_abstractFileActions);
    this.insertGroupIntoAnother(ModuleActions_ActionGroup.ID, ModuleActions_ActionGroup.LABEL_ID_abstractFileActions);
  }
}
