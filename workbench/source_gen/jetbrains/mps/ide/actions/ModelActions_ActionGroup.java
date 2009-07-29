package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.generator.IGenerationType;

public class ModelActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ModelActions";
  public static final String LABEL_ID_createRootNode = ID + "createRootNode";
  public static final String LABEL_ID_showHelp = ID + "showHelp";
  public static final String LABEL_ID_refactoring = ID + "refactoring";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public ModelActions_ActionGroup() {
    super("ModelActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_createRootNode);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.PasteNode_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteModels_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CloneModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CopyModelName_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.OptimizeModelImports_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AddMissingImports_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowReferencesToMissingStuff_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_showHelp);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CheckModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateModel_Action", "jetbrains.mps.ide", IGenerationType.FILES);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateModel_Action", "jetbrains.mps.ide", IGenerationType.TEXT);
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowMappingsPartitioning_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowDifferencesWithModelOnDisk_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RevertMemoryChanges_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.SaveModel_Action", "jetbrains.mps.ide");
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_refactoring);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAnchor(ModelActions_ActionGroup.LABEL_ID_vcs);
      ModelActions_ActionGroup.this.addSeparator();
      ModelActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ModelProperties_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
