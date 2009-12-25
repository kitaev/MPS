package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class LanguageActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(LanguageActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.LanguageActions";
  public static final String LABEL_ID_newGroup = ID + "newGroup";
  public static final String LABEL_ID_generateModule = ID + "generateModule";
  public static final String LABEL_ID_find_usages = ID + "find_usages";
  public static final String LABEL_ID_find_instances = ID + "find_instances";
  public static final String LABEL_ID_refactoring = ID + "refactoring";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public LanguageActions_ActionGroup() {
    super("LanguageActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      LanguageActions_ActionGroup.this.addAnchor(LanguageActions_ActionGroup.LABEL_ID_newGroup);
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAnchor(LanguageActions_ActionGroup.LABEL_ID_generateModule);
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CheckModule_Action", "jetbrains.mps.ide", "Language");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.OptimizeModuleImports_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.FixVirtualPackges_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AnalyzeClasspath_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.LanguageProperties_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.LanguageHierarchy_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowModuleDependencies_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.AddModuleToProject_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RemoveModuleFromProject_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteModules_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CopyModuleName_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.MakeModule_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.RebuildModule_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CleanModule_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.SetModuleFolder_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAnchor(LanguageActions_ActionGroup.LABEL_ID_find_usages);
      LanguageActions_ActionGroup.this.addAnchor(LanguageActions_ActionGroup.LABEL_ID_find_instances);
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAnchor(LanguageActions_ActionGroup.LABEL_ID_refactoring);
      LanguageActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.UpgradeModelPersistenceInModule_Action", "jetbrains.mps.ide");
      LanguageActions_ActionGroup.this.addSeparator();
      LanguageActions_ActionGroup.this.addAnchor(LanguageActions_ActionGroup.LABEL_ID_vcs);
      LanguageActions_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
