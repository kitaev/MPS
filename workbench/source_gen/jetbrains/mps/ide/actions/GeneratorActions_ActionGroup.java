package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;

public class GeneratorActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GeneratorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.GeneratorActions_ActionGroup";
  public static final String LABEL_ID_generatorNew = ID + "generatorNew";
  public static final String LABEL_ID_make = ID + "make";
  public static final String LABEL_ID_generate = ID + "generate";
  public static final String LABEL_ID_favorites = ID + "favorites";
  public static final String LABEL_ID_scripts = ID + "scripts";

  public GeneratorActions_ActionGroup() {
    super("GeneratorActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        LabelledAnchor action = new LabelledAnchor(GeneratorActions_ActionGroup.LABEL_ID_generatorNew);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        GeneratorActions_ActionGroup.this.addAction(action);
      }
      {
        LabelledAnchor action = new LabelledAnchor(GeneratorActions_ActionGroup.LABEL_ID_make);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        GeneratorActions_ActionGroup.this.addAction(action);
      }
      {
        LabelledAnchor action = new LabelledAnchor(GeneratorActions_ActionGroup.LABEL_ID_generate);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        GeneratorActions_ActionGroup.this.addAction(action);
      }
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.ShowModuleDependencies_Action");
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.DeleteGenerator_Action");
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.CopyModuleName_Action");
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addParameterizedAction(new CheckModule_Action("Generator"), PluginId.getId("jetbrains.mps.ide"), "Generator");
      GeneratorActions_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(GeneratorActions_ActionGroup.LABEL_ID_favorites);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        GeneratorActions_ActionGroup.this.addAction(action);
      }
      GeneratorActions_ActionGroup.this.addSeparator();
      {
        LabelledAnchor action = new LabelledAnchor(GeneratorActions_ActionGroup.LABEL_ID_scripts);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        GeneratorActions_ActionGroup.this.addAction(action);
      }
      GeneratorActions_ActionGroup.this.addSeparator();
      GeneratorActions_ActionGroup.this.addAction("jetbrains.mps.ide.actions.GeneratorProperties_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
