package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class GeneratorNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GeneratorNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorNewActions_ActionGroup";
  public static final String LABEL_ID_newModel = ID + "newModel";

  public GeneratorNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      GeneratorNewActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.NewModel_Action");
      {
        LabelledAnchor action = new LabelledAnchor(GeneratorNewActions_ActionGroup.LABEL_ID_newModel);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        GeneratorNewActions_ActionGroup.this.addAction(action);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
