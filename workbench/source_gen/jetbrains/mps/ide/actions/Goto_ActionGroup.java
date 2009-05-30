package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;

public class Goto_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Goto_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Goto";

  public Goto_ActionGroup() {
    super("Go To", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToActionAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToRootNodeAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToNamedNodeAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.GoToNodeById_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.GoToConceptDeclaration_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.GoToRulesAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToModelAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToLanguageAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToSolutionAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.goTo.GoToDevkitAction", "jetbrains.mps.ide");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother("GoToMenu", null);
  }

}
