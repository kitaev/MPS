package jetbrains.mps.ide.hierarchy;

/*Generated by MPS */

import jetbrains.mps.workbench.tools.BaseProjectTool;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JScrollPane;
import com.intellij.openapi.project.Project;
import javax.swing.Icon;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.ui.ScrollPaneFactory;
import javax.swing.SwingUtilities;
import javax.swing.JComponent;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.hierarchy.toggle.GroupedToggleAction;
import jetbrains.mps.ide.hierarchy.icons.Icons;
import jetbrains.mps.ide.hierarchy.toggle.ToggleActionGroup;
import com.intellij.openapi.actionSystem.ToggleAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.BaseAction;
import java.util.Map;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionGroup;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.dialogs.choosers.CommonChoosers;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.smodel.ModelAccess;

public abstract class AbstractHierarchyView extends BaseProjectTool {
  protected AbstractHierarchyTree myHierarchyTree;
  protected HierarchyTreeNode myTreeNode;
  protected JPanel myComponent = new JPanel(new BorderLayout());
  protected ButtonGroup myButtonGroup = new ButtonGroup();
  protected IOperationContext myContext;
  public JScrollPane myScrollPane;

  public AbstractHierarchyView(Project project, String id, int number, Icon icon) {
    super(project, id, number, icon, ToolWindowAnchor.RIGHT, true);
  }

  public void initComponent() {
    super.initComponent();
    myHierarchyTree = createHierarchyTree(false);
    myHierarchyTree.setRootVisible(true);
    final JPanel panel = new JPanel(new BorderLayout());
    myComponent.add(panel, BorderLayout.NORTH);
    myScrollPane = ScrollPaneFactory.createScrollPane(myHierarchyTree);
    myComponent.add(myScrollPane, BorderLayout.CENTER);
    showItemInHierarchy(null, null);
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JComponent buttonsPanel = ActionManager.getInstance().createActionToolbar(ActionPlaces.TYPE_HIERARCHY_VIEW_TOOLBAR, createButtonsGroup(), true).getComponent();
        panel.add(buttonsPanel, BorderLayout.WEST);
      }
    });
  }

  protected abstract AbstractHierarchyTree createHierarchyTree(boolean isParentHierarchy);

  public void openNode(SNode node, IOperationContext context) {
    context.getComponent(MPSEditorOpener.class).openNode(node, context, true, true);
  }

  protected DefaultActionGroup createButtonsGroup() {
    GroupedToggleAction childrenAction = new GroupedToggleAction("Children Hierarchy", "Show children hierarchy", Icons.CHILDREN_ICON, true) {
      public void select() {
        myHierarchyTree.setParentHierarchy(false);
        myHierarchyTree.rebuildNow();
      }
    };
    GroupedToggleAction parentAction = new GroupedToggleAction("Parent Hierarchy", "Show parent hierarchy", Icons.PARENT_ICON, false) {
      public void select() {
        myHierarchyTree.setParentHierarchy(true);
        myHierarchyTree.rebuildNow();
      }
    };
    ToggleActionGroup toggleGroup = new ToggleActionGroup();
    toggleGroup.add(childrenAction);
    toggleGroup.add(parentAction);
    ToggleAction thisModelAction = new ToggleAction("Only This Model", "Show hierarchy only for model", Icons.THIS_MODEL_ICON) {
      private boolean mySelected = false;

      public boolean isSelected(AnActionEvent e) {
        return mySelected;
      }

      public void setSelected(AnActionEvent e, boolean state) {
        mySelected = state;
        myHierarchyTree.setIsOnlyInOneModel(mySelected);
      }
    };
    ToggleAction generatorModelsAction = new ToggleAction("Show Generator Classes", "Show classes from generator models in hierarchy", Icons.GENERATOR_ICON) {
      private boolean mySelected = false;

      public boolean isSelected(AnActionEvent e) {
        return mySelected;
      }

      public void setSelected(AnActionEvent e, boolean state) {
        mySelected = state;
        myHierarchyTree.setShowGeneratorModels(mySelected);
      }
    };
    BaseAction expandAllAction = new BaseAction("Expand all", "Expand all nodes", jetbrains.mps.ide.findusages.view.icons.Icons.EXPAND_ICON) {
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        myHierarchyTree.expandAll();
      }
    };
    BaseAction collapseAllAction = new BaseAction("Collapse all", "Collapse all nodes", jetbrains.mps.ide.findusages.view.icons.Icons.COLLAPSE_ICON) {
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        myHierarchyTree.collapseAll();
      }
    };
    BaseAction refreshAction = new BaseAction("Refresh", "Refresh", Icons.REFRESH_ICON) {
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        myHierarchyTree.rebuildNow();
      }
    };
    return ActionUtils.groupFromActions(childrenAction, parentAction, thisModelAction, generatorModelsAction, expandAllAction, collapseAllAction, refreshAction, createCloseAction());
  }

  protected ActionGroup getHierarchyForFoundConceptActionGroup(final String conceptFqName) {
    BaseAction action = new BaseAction("Show Hierarchy For Concept") {
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        List<SNode> nodes = new ArrayList<SNode>();
        for (SModelDescriptor modelDescriptor : myContext.getScope().getModelDescriptors()) {
          if (SModelStereotype.isStubModelStereotype(modelDescriptor.getStereotype())) {
            continue;
          }
          SNode decl = SModelUtil.findConceptDeclaration(conceptFqName, GlobalScope.getInstance());
          String name = NameUtil.nodeFQName(decl);
          for (SNode node : modelDescriptor.getSModel().roots()) {
            if (node.isInstanceOfConcept(name)) {
              nodes.add(node);
            }
          }
        }
        CommonChoosers.showSimpleNodeChooser(nodes, new CommonChoosers.ChooserCallback<SNode>() {
          public void execute(SNode node) {
            final IOperationContext operationContext = ProjectOperationContext.get(getProject());
            showItemInHierarchy(node, operationContext);
          }
        });
      }
    };
    return ActionUtils.groupFromActions(action);
  }

  public void showItemInHierarchy(SNode node, IOperationContext _context) {
    myHierarchyTree.setOperationContext(_context);
    myContext = _context;
    myHierarchyTree.myHierarchyNode = node;
    ModelAccess.instance().runReadInEDT(new Runnable() {
      public void run() {
        Project project = getProject();
        if (project == null || project.isDisposed()) {
          return;
        }
        myHierarchyTree.rebuildNow();
        if (myTreeNode != null) {
          myHierarchyTree.selectNode(myTreeNode);
        }
        if (!(isTreeInfinite())) {
          myHierarchyTree.expandAll();
        }
      }
    });
  }

  protected boolean isTreeInfinite() {
    return false;
  }

  public JComponent getComponent() {
    return myComponent;
  }
}
