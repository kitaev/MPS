package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.devkit.actions.navigate.GoToLanguageAction;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.devkit.actions.navigate.GoToDevkitAction;

public class GotoModuleEx_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GotoModuleEx_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.devkit.actions.GotoModuleEx_ActionGroup";

  public GotoModuleEx_ActionGroup() {
    super("GotoModuleEx", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      GotoModuleEx_ActionGroup.this.addParameterizedAction(new GoToLanguage_Action(new GoToLanguageAction()), PluginId.getId("jetbrains.mps.ide.mpsdevkit"), new GoToLanguageAction());
      GotoModuleEx_ActionGroup.this.addParameterizedAction(new GoToDevkit_Action(new GoToDevkitAction()), PluginId.getId("jetbrains.mps.ide.mpsdevkit"), new GoToDevkitAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
