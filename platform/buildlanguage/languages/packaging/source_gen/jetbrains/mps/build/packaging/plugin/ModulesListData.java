package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.project.IModule;
import java.util.Comparator;
import javax.swing.Icon;

public class ModulesListData implements NodeData {
  private final List<NodeData> myData = ListSequence.fromList(new LinkedList<NodeData>());
  private final List<ModuleData> myModules = ListSequence.fromList(new LinkedList<ModuleData>());

  public ModulesListData(List<IModule> modules) {
    for (IModule m : modules) {
      ModuleData moduleData = new ModuleData(m);
      ListSequence.fromList(this.myModules).addElement(moduleData);
    }
    ListSequence.fromList(this.myModules).sort(new Comparator<ModuleData>() {
      public int compare(ModuleData p0, ModuleData p1) {
        return p0.getText().compareToIgnoreCase(p1.getText());
      }
    }, true);
  }

  public String getText() {
    return "All Modules In Project";
  }

  public List<NodeData> getChildren() {
    return this.myData;
  }

  public List<ModuleData> getModules() {
    return this.myModules;
  }

  public Icon getIcon(boolean expanded) {
    return null;
  }

  public boolean canHaveChildren() {
    return true;
  }

  public void addChildren(NodeData nodeData) {
    ListSequence.fromList(this.myData).addElement(nodeData);
  }

  public NodeData getParent() {
    return null;
  }

  public void setParent(NodeData parent) {
  }
}
