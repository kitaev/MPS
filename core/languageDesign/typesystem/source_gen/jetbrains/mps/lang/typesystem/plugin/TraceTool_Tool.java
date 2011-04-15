package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.newTypesystem.presentation.trace.TypeSystemTracePanel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import javax.swing.JComponent;

public class TraceTool_Tool extends GeneratedTool {
  private static final Icon ICON = IconManager.EMPTY_ICON;

  private TypeSystemTracePanel myPanel;

  public TraceTool_Tool(Project project) {
    super(project, "Typesystem Trace", 5, ICON, ToolWindowAnchor.RIGHT, false);
  }

  public void init(Project project) {
    super.init(project);
    TraceTool_Tool.this.myPanel = new TypeSystemTracePanel();
  }

  public void buildTrace(TypeCheckingContextNew t, final IOperationContext operationContext, SNode node, EditorComponent editorComponent, boolean rebuild) {
    TraceTool_Tool.this.myPanel.showTraceForNode(t, operationContext, node, editorComponent, true);
  }

  public JComponent getComponent() {
    return TraceTool_Tool.this.myPanel;
  }
}
