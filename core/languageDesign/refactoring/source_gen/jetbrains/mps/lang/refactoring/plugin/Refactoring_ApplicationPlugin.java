package jetbrains.mps.lang.refactoring.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.lang.refactoring.plugin.RefactoringActionGroupFirstUpdate_CustomApplicationPlugin;

public class Refactoring_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = ListSequence.<BaseGroup>fromArray();
    String moduleName = "jetbrains.mps.lang.refactoring";
    this.addGroup(groups, moduleName, "jetbrains.mps.lang.refactoring.plugin.Refactoring_ActionGroup");
    return groups;
  }

  private void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      ListSequence.fromList(groups).addElement(group);
    }
  }

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = ListSequence.<BaseCustomApplicationPlugin>fromArray();
    this.addCustomPart(res, new RefactoringActionGroupFirstUpdate_CustomApplicationPlugin());
    return res;
  }

  private void addCustomPart(List<BaseCustomApplicationPlugin> plugins, BaseCustomApplicationPlugin plugin) {
    ListSequence.fromList(plugins).addElement(plugin);
    plugin.init();
  }

}
