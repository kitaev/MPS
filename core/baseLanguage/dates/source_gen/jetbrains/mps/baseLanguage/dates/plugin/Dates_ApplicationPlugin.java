package jetbrains.mps.baseLanguage.dates.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.ActionFactory;

public class Dates_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = new ArrayList<BaseGroup>();
    String moduleName = "jetbrains.mps.baseLanguage.dates";
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.dates.plugin.DateLangGroup_ActionGroup");
    return groups;
  }

  private void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      groups.add(group);
    }
  }

}
