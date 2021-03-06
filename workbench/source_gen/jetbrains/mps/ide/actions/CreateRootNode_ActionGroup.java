package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.model.CreateRootNodeGroup;

public class CreateRootNode_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(CreateRootNode_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.CreateRootNode_ActionGroup";

  public CreateRootNode_ActionGroup() {
    super("Root Node", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      CreateRootNode_ActionGroup.this.add(new CreateRootNodeGroup());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
