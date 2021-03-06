package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.tool.BaseGeneratedTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class QuickQueryLanguage_ProjectPlugin extends BaseProjectPlugin {
  public QuickQueryLanguage_ProjectPlugin() {
  }

  public List<BaseGeneratedTool> initAllTools(Project project) {
    List<BaseGeneratedTool> tools = ListSequence.fromList(new ArrayList<BaseGeneratedTool>());
    ListSequence.fromList(tools).addElement(new RunReplacement_Tool(project));
    return tools;
  }
}
