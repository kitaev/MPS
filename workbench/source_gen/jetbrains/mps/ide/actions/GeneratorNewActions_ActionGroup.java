package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class GeneratorNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GeneratorNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorNewActions";

  public GeneratorNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      this.addAction("jetbrains.mps.ide.actions.NewModel_Action", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_generatorNew);
  }

}
