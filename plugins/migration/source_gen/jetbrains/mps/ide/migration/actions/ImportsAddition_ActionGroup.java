package jetbrains.mps.ide.migration.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ImportsAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ImportsAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.migration.actions.ImportsAddition_ActionGroup";

  public ImportsAddition_ActionGroup() {
    super("ImportsAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ImportsAddition_ActionGroup.this.addSeparator();
      ImportsAddition_ActionGroup.this.addAction("jetbrains.mps.ide.migration.actions.AddGeneralPurposeDevKitToLanguageModels_Action");
      ImportsAddition_ActionGroup.this.addAction("jetbrains.mps.ide.migration.actions.AddLanguageDesingDevKitToLanguages_Action");
      ImportsAddition_ActionGroup.this.addAction("jetbrains.mps.ide.migration.actions.RemoveBootstrapLanguagesDevKitFromLanguageModels_Action");
      ImportsAddition_ActionGroup.this.addAction("jetbrains.mps.ide.migration.actions.RemoveLanguageDesignDevKitFromModels_Action");
      ImportsAddition_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
