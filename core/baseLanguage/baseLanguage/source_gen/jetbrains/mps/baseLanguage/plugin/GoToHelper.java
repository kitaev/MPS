package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.openapi.project.Project;
import java.util.ArrayList;
import jetbrains.mps.project.ProjectOperationContext;
import java.util.Collections;
import javax.swing.ListCellRenderer;
import javax.swing.JList;
import com.intellij.ui.components.JBList;
import com.intellij.openapi.ui.popup.PopupChooserBuilder;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class GoToHelper {
  public GoToHelper() {
  }

  public static void showOverridingMethodsMenu(List<SNode> nodes, RelativePoint point, Project project, String methodName) {
    String title = "Choose overriding method of " + methodName + "() to navigate to";
    GoToHelper.MethodCellRenderer renderer = new GoToHelper.MethodCellRenderer();
    GoToHelper.showMenu(point, project, title, nodes, renderer);
  }

  public static void showOverridenMethodsMenu(List<SNode> nodes, RelativePoint point, Project project, String methodName) {
    String title = "Choose super method of" + methodName + "()";
    GoToHelper.MethodCellRenderer renderer = new GoToHelper.MethodCellRenderer();
    GoToHelper.showMenu(point, project, title, nodes, renderer);
  }

  public static void showInheritedClassesMenu(List<SNode> nodes, RelativePoint point, Project project) {
    String title = "Choose inherited class to navigate to";
    GoToHelper.DefaultNodeNavigationItemCellRenderer renderer = new GoToHelper.DefaultNodeNavigationItemCellRenderer();
    GoToHelper.showMenu(point, project, title, nodes, renderer);
  }

  private static void showMenu(RelativePoint point, Project project, String title, List<SNode> nodes, NodeListCellRenderer renderer) {
    if (nodes.isEmpty()) {
      return;
    }
    List<NodeNavigationItem> navigatables = new ArrayList<NodeNavigationItem>();
    ProjectOperationContext context = ProjectOperationContext.get(project);
    for (SNode node : nodes) {
      navigatables.add(new NodeNavigationItem(node, context, project));
    }
    Collections.sort(navigatables, renderer.getComparator());
    GoToHelper.openTargets(point, navigatables, title, renderer);
  }

  public static void openTargets(RelativePoint p, List<NodeNavigationItem> targets, String title, ListCellRenderer listRenderer) {
    if (targets.isEmpty()) {
      return;
    }
    if (targets.size() == 1) {
      targets.get(0).navigate();
    } else {
      final JList list = new JBList(targets.toArray());
      list.setCellRenderer(listRenderer);
      new PopupChooserBuilder(list).setTitle(title).setMovable(true).setItemChoosenCallback(new Runnable() {
        public void run() {
          int[] ids = list.getSelectedIndices();
          if (ids == null || ids.length == 0) {
            return;
          }
          Object[] selectedElements = list.getSelectedValues();
          for (Object element : selectedElements) {
            NodeNavigationItem selected = (NodeNavigationItem) element;
            selected.navigate();
          }
        }
      }).createPopup().show(p);
    }
  }

  public static class DefaultNodeNavigationItemCellRenderer extends NodeListCellRenderer<NodeNavigationItem> {
    public DefaultNodeNavigationItemCellRenderer() {
    }

    public String getElementText(final NodeNavigationItem element) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          return getLabelNode(element).getPresentation();
        }
      });
    }

    protected String getContainerText(final NodeNavigationItem element, String name) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          return NodePresentationUtil.descriptionText(getContainerNode(element), false);
        }
      });
    }

    protected Icon getIcon(NodeNavigationItem element) {
      return IconManager.getIconFor(getLabelNode(element));
    }

    protected SNode getLabelNode(NodeNavigationItem element) {
      return element.getNode();
    }

    protected SNode getContainerNode(NodeNavigationItem element) {
      return getLabelNode(element).getTopmostAncestor();
    }
  }

  public static class MethodCellRenderer extends GoToHelper.DefaultNodeNavigationItemCellRenderer {
    public MethodCellRenderer() {
    }

    @Override
    public String getElementText(final NodeNavigationItem element) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          SNode labelNode = getLabelNode(element);
          if (SNodeOperations.isInstanceOf(labelNode, "jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration")) {
            if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(labelNode), "jetbrains.mps.baseLanguage.structure.EnumClass")) {
              return "Enum constant '" + labelNode.getName() + "' in " + SNodeOperations.getParent(labelNode).getPresentation();
            }
          }
          return labelNode.getPresentation();
        }
      });
    }

    protected SNode getLabelNode(NodeNavigationItem element) {
      SNode parentNode = element.getNode().getParent();
      assert (parentNode != null);
      return parentNode;
    }
  }
}
