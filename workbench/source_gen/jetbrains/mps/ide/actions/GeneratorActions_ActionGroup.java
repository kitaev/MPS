package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class GeneratorActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GeneratorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorActions";
  public static final String LABEL_ID_generatorNew = ID + "generatorNew";

  public GeneratorActions_ActionGroup() {
    super("GeneratorActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      GeneratorActions_ActionGroup.this.addAnchor(GeneratorActions_ActionGroup.LABEL_ID_generatorNew);
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateTemplateQueries_Action", "jetbrains.mps.ide", true);
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GenerateTemplateQueries_Action", "jetbrains.mps.ide", false);
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowModuleDependencies_Action", "jetbrains.mps.ide");
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteGenerator_Action", "jetbrains.mps.ide");
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CopyModuleName_Action", "jetbrains.mps.ide");
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CheckGenerator_Action", "jetbrains.mps.ide");
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GeneratorProperties_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
