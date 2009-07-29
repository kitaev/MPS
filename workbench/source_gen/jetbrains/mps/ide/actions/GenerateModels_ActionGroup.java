package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.generate.GenerateFilesFromModelsAction;
import jetbrains.mps.workbench.actions.generate.GenerateTextFromModelsAction;

public class GenerateModels_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GenerateModels_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GenerateModels";

  public GenerateModels_ActionGroup() {
    super("GenerateModels", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      GenerateModels_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateFilesFromModel_Action", "jetbrains.mps.ide", new GenerateFilesFromModelsAction());
      GenerateModels_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateTextFromModel_Action", "jetbrains.mps.ide", new GenerateTextFromModelsAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(Generate_ActionGroup.ID, Generate_ActionGroup.LABEL_ID_generateModel);
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_generateModel);
  }

}
