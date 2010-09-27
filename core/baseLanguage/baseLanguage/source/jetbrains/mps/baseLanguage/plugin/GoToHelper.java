/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.baseLanguage.plugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.PopupChooserBuilder;
import com.intellij.openapi.util.Computable;
import com.intellij.ui.awt.RelativePoint;
import jetbrains.mps.baseLanguage.structure.*;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;

import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoToHelper {
  public static void showOverridingMethodsMenu(List<SNode> nodes, RelativePoint point, Project project, String methodName) {
    String title = "Choose overriding method of " + methodName + "() to navigate to";
    MethodCellRenderer renderer = new MethodCellRenderer();
    showMenu(point, project, title, nodes, renderer);
  }

  public static void showOverridenMethodsMenu(List<SNode> nodes, RelativePoint point, Project project, String methodName) {
    String title = "Choose super method of" + methodName + "()";
    MethodCellRenderer renderer = new MethodCellRenderer();
    showMenu(point, project, title, nodes, renderer);
  }

  public static void showInheritedClassesMenu(List<SNode> nodes, RelativePoint point, Project project) {
    String title = "Choose inherited class to navigate to";
    DefaultNodeNavigationItemCellRenderer renderer = new DefaultNodeNavigationItemCellRenderer();
    showMenu(point, project, title, nodes, renderer);
  }

  private static void showMenu(RelativePoint point, Project project, String title, List<SNode> nodes, NodeListCellRenderer renderer) {
    if (nodes.isEmpty()) return;

    List<NodeNavigationItem> navigatables = new ArrayList<NodeNavigationItem>();
    ProjectOperationContext context = ProjectOperationContext.get(project);
    for (SNode node : nodes) {
      navigatables.add(new NodeNavigationItem(node, context, project));
    }

    Collections.sort(navigatables, renderer.getComparator());
    openTargets(point, navigatables, title, renderer);
  }

  public static void openTargets(RelativePoint p, List<NodeNavigationItem> targets, String title, ListCellRenderer listRenderer) {
    if (targets.isEmpty()) return;
    if (targets.size() == 1) {
      targets.get(0).navigate();
    } else {
      final JList list = new JList(targets.toArray());
      list.setCellRenderer(listRenderer);
      new PopupChooserBuilder(list).
        setTitle(title).
        setMovable(true).
        setItemChoosenCallback(new Runnable() {
          public void run() {
            int[] ids = list.getSelectedIndices();
            if (ids == null || ids.length == 0) return;
            Object[] selectedElements = list.getSelectedValues();
            for (Object element : selectedElements) {
              NodeNavigationItem selected = (NodeNavigationItem) element;
              selected.navigate();
            }
          }
        }).createPopup().
        show(p);
    }
  }

  public static class DefaultNodeNavigationItemCellRenderer extends NodeListCellRenderer<NodeNavigationItem> {
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

  public static class MethodCellRenderer extends DefaultNodeNavigationItemCellRenderer {
    @Override
    public String getElementText(final NodeNavigationItem element) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          SNode labelNode = getLabelNode(element);
          if (labelNode.getAdapter() instanceof EnumConstantDeclaration) {
            if (labelNode.getParent().getAdapter() instanceof EnumClass) {
              return "Enum constant '" + labelNode.getName() + "' in " + labelNode.getParent().getPresentation();
            }
          }
          return labelNode.getPresentation();
        }
      });
    }

    protected SNode getLabelNode(NodeNavigationItem element) {
      SNode parentNode = element.getNode().getParent();
      assert parentNode != null;
      return parentNode;
    }
  }
}
