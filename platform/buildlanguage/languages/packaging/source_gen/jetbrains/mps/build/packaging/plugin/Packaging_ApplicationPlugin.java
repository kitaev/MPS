package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import java.util.ArrayList;

public class Packaging_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = new ArrayList<BaseGroup>();
    groups.add(new ProjectPaneModelAddition_ActionGroup());
    groups.add(new ProjectPaneProjectAddition_ActionGroup());
    return groups;
  }

}
