package jetbrains.mps.ide.migration.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.Tools_ActionGroup;

public class Migration_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.ide.migration");

  public Migration_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new AddGeneralPurposeDevKitToLanguageModels_Action());
    addAction(new AddLanguageDesingDevKitToLanguages_Action());
    addAction(new BuildAllBehaviors_Action());
    addAction(new BuildAllConstraints_Action());
    addAction(new BuildAllGenerators_Action());
    addAction(new BuildAllLanguageDescriptors_Action());
    addAction(new BuildAllStructures_Action());
    addAction(new FindDuplicatedStubs_Action());
    addAction(new FixVirtualPackages_Action());
    addAction(new Migration20_Action());
    addAction(new ReResolveStubRefs_Action());
    addAction(new RemoveBootstrapLanguagesDevKitFromLanguageModels_Action());
    addAction(new RemoveLanguageDesignDevKitFromModels_Action());
    addAction(new UpdateLanguageAccessories_Action());
    addAction(new UpgradeModelPersistenceGlobally_Action());
    addAction(new UpgradeModelPersistenceInModel_Action());
    addAction(new UpgradeModelPersistenceInModule_Action());
    addAction(new UpgradeModelPersistenceInProject_Action());
    addAction(new UpgradeModulePersistenceGlobally_Action());
    // groups 
    addGroup(new ImportsAddition_ActionGroup());
    addGroup(new MakeAddition_ActionGroup());
    addGroup(new Migrations20_ActionGroup());
    addGroup(new PersistenceAddition_ActionGroup());
    addGroup(new StubsAddition_ActionGroup());
    addGroup(new ToolsAddition_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(MakeAddition_ActionGroup.ID, Migrations20_ActionGroup.ID, null);
    insertGroupIntoAnother(Migrations20_ActionGroup.ID, ToolsAddition_ActionGroup.ID, ToolsAddition_ActionGroup.LABEL_ID_migrationGroup);
    insertGroupIntoAnother(StubsAddition_ActionGroup.ID, Migrations20_ActionGroup.ID, null);
    insertGroupIntoAnother(ToolsAddition_ActionGroup.ID, Tools_ActionGroup.ID, Tools_ActionGroup.LABEL_ID_migration20);
    insertGroupIntoAnother(ImportsAddition_ActionGroup.ID, Migrations20_ActionGroup.ID, null);
    insertGroupIntoAnother(PersistenceAddition_ActionGroup.ID, Migrations20_ActionGroup.ID, null);
  }
}
