package jetbrains.mps.ui.modeling.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Modeling_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.ui.modeling");

  public Modeling_ApplicationPlugin() {
  }

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = ListSequence.fromList(new ArrayList<BaseCustomApplicationPlugin>());
    this.addCustomPart(res, new EditorExtensions_CustomApplicationPlugin());
    return res;
  }

  private void addCustomPart(List<BaseCustomApplicationPlugin> plugins, BaseCustomApplicationPlugin plugin) {
    ListSequence.fromList(plugins).addElement(plugin);
    plugin.init();
  }
}
