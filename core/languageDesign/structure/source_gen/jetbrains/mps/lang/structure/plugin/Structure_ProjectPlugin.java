package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Structure_ProjectPlugin extends BaseProjectPlugin {
  public List<GeneratedTool> initTools(Project project) {
    List<GeneratedTool> tools = ListSequence.fromList(new ArrayList<GeneratedTool>());
    ListSequence.fromList(tools).addElement(new StructureView_Tool(project));
    return tools;
  }
}
