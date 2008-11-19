package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import com.intellij.openapi.project.Project;
import java.util.ArrayList;

public class Ide_ProjectPlugin extends BaseProjectPlugin {

  public List<GeneratedTool> initTools(Project project) {
    List<GeneratedTool> tools = new ArrayList<GeneratedTool>();
    tools.add(new NodeExplorer_Tool(project));
    tools.add(new ModuleRepository_Tool(project));
    tools.add(new ModelRepository_Tool(project));
    return tools;
  }

}
