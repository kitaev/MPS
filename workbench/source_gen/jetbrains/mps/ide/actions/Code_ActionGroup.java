package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class Code_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Code_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Code_ActionGroup";
  public static final String LABEL_ID_overrideImplement = ID + "overrideImplement";
  public static final String LABEL_ID_comments = ID + "comments";

  public Code_ActionGroup() {
    super("Code", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      Code_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowStructure_Action");
      {
        LabelledAnchor action = new LabelledAnchor(Code_ActionGroup.LABEL_ID_overrideImplement);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        Code_ActionGroup.this.addAction(action);
      }
      Code_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(Code_ActionGroup.LABEL_ID_comments);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        Code_ActionGroup.this.addAction(action);
      }
      Code_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
