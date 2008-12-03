package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.BaseAction;
import java.util.HashSet;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.ide.DataManager;
import javax.swing.tree.DefaultMutableTreeNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.ide.projectPane.NamespaceTextNode;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.projectPane.GenerateFilesAction;
import jetbrains.mps.ide.projectPane.RenameAction;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class NamespaceInternalActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NamespaceInternalActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.NamespaceInternalActions";

  private Set<Pair<ActionPlace, Condition<BaseAction>>> myPlaces = new HashSet<Pair<ActionPlace, Condition<BaseAction>>>();

  public NamespaceInternalActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void doUpdate(AnActionEvent event) {
    try {
      NamespaceInternalActions_ActionGroup.this.removeAll();
      DataContext dataContext = DataManager.getInstance().getDataContext();
      DefaultMutableTreeNode selectedNode = MPSDataKeys.PROJECT.getData(dataContext).getComponent(ProjectPane.class).getSelectedNode();
      assert selectedNode instanceof NamespaceTextNode;
      NamespaceTextNode node = (NamespaceTextNode)selectedNode;
      DefaultActionGroup newGroup = node.createNewGroup();
      if (newGroup != null) {
        this.add(newGroup);
        this.addSeparator();
      }
      this.add(new GenerateFilesAction());
      this.addSeparator();
      this.add(new RenameAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
    for(Pair<ActionPlace, Condition<BaseAction>> p : this.myPlaces) {
      super.addPlace(p.first, p.second);
    }
  }

  public void addPlace(ActionPlace place, @Nullable() Condition<BaseAction> cond) {
    SetSequence.fromSet(this.myPlaces).addElement(new Pair<ActionPlace, Condition<BaseAction>>(place, cond));
    super.addPlace(place, cond);
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(NamespaceActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(NamespaceInternalActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = NamespaceActions_ActionGroup.LABEL_ID_namespaceInternal;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
