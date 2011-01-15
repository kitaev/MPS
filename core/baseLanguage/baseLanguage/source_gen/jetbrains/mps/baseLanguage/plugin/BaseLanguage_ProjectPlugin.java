package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.tool.BaseGeneratedTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomProjectPlugin;
import jetbrains.mps.project.MPSProject;

public class BaseLanguage_ProjectPlugin extends BaseProjectPlugin {
  public BaseLanguage_ProjectPlugin() {
  }

  public List<BaseGeneratedTool> initAllTools(Project project) {
    List<BaseGeneratedTool> tools = ListSequence.fromList(new ArrayList<BaseGeneratedTool>());
    ListSequence.fromList(tools).addElement(new AnalyzeStacktrace_Tool(project));
    ListSequence.fromList(tools).addElement(new TodoViewer_Tool(project));
    return tools;
  }

  public List<BaseCustomProjectPlugin> initCustomParts(Project project) {
    List<BaseCustomProjectPlugin> res = ListSequence.fromList(new ArrayList<BaseCustomProjectPlugin>());
    MPSProject mpsProject = project.getComponent(MPSProject.class);
    {
      BaseCustomProjectPlugin plugin = new BaseLanguageCustomPlugin_CustomProjectPlugin();
      ListSequence.fromList(res).addElement(plugin);
      plugin.init(mpsProject);
    }
    return res;
  }
}
