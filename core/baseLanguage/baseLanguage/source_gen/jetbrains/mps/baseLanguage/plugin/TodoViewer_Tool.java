package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import javax.swing.JComponent;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import com.intellij.openapi.wm.ToolWindowAnchor;

public class TodoViewer_Tool extends GeneratedTool {

  private JComponent myComponent;

  public TodoViewer_Tool(Project project) {
    super(project, "TODO", 2, IconManager.loadIcon(MacrosUtil.expandPath("${language_descriptor}\\source\\jetbrains\\mps\\baseLanguage\\plugin\\todo.png", "jetbrains.mps.baseLanguage"), true), ToolWindowAnchor.BOTTOM, false);
  }

  public JComponent getComponent() {
    return TodoViewer_Tool.this.myComponent;
  }

  public void init(Project project) {
    TodoViewer_Tool.this.myComponent = new TodoViewer(TodoViewer_Tool.this.getMPSProject());
  }

}
