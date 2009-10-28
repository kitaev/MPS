/*
 * Copyright 2003-2009 JetBrains s.r.o.
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

import com.intellij.ide.util.NodeListCellRenderer;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.PopupChooserBuilder;
import com.intellij.openapi.util.Computable;
import com.intellij.ui.awt.RelativePoint;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.baseLanguage.icons.Icons;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;

import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoToHelper {
  public static void showOverridingMethodsMenu(List<SNode> nodes, RelativePoint point, Project project) {
    String title = "Choose overriding method to navigate to";
    MethodCellRenderer renderer = new MethodCellRenderer();
    showMenu(point, project, title, nodes, renderer);
  }

  public static void showInheritedClassesMenu(List<SNode> nodes, RelativePoint point, Project project) {
    String title = "Choose inherited class to navigate to";
    ClassCellRenderer renderer = new ClassCellRenderer();
    showMenu(point, project, title, nodes, renderer);
  }

  private static void showMenu(RelativePoint point, Project project, String title, List<SNode> nodes, NodeListCellRenderer renderer) {
    if (nodes.isEmpty()) return;

    List<NodeNavigationItem> navigatables = new ArrayList<NodeNavigationItem>();
    MPSProject mpsProject = project.getComponent(MPSProjectHolder.class).getMPSProject();
    ProjectOperationContext context = new ProjectOperationContext(mpsProject);
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

  public static class MethodCellRenderer extends NodeListCellRenderer<NodeNavigationItem> {
    public String getElementText(final NodeNavigationItem element) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          BaseMethodDeclaration methodAdapter = (BaseMethodDeclaration) element.getNode().getAdapter();
          return methodAdapter.toString();
        }
      });
    }

    protected String getContainerText(final NodeNavigationItem element, String name) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          BaseMethodDeclaration methodAdapter = (BaseMethodDeclaration) element.getNode().getAdapter();
          return methodAdapter.getParent(INamedConcept.class, false).getName();
        }
      });
    }

    protected Icon getIcon(NodeNavigationItem element) {
      return Icons.METHOD_ICON;
    }
  }

  public static class ClassCellRenderer extends NodeListCellRenderer<NodeNavigationItem> {
    public String getElementText(final NodeNavigationItem element) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          ClassConcept classAdapter = (ClassConcept) element.getNode().getAdapter();
          return classAdapter.getName();
        }
      });
    }

    protected String getContainerText(final NodeNavigationItem element, String name) {
      return ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          ClassConcept classAdapter = (ClassConcept) element.getNode().getAdapter();
          return classAdapter.getModel().getLongName();
        }
      });
    }

    protected Icon getIcon(NodeNavigationItem element) {
      return Icons.METHOD_ICON;
    }
  }
}
