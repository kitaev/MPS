package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.helgins.inference.NodeTypesComponent;
import jetbrains.mps.helgins.inference.NodeTypesComponentsRepository;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import jetbrains.mps.util.Pair;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.helgins.uiActions.MyMenu;

public class ShowRulesWhichAffectNodeType_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowRulesWhichAffectNodeType_Action.class);
  public static final Icon ICON = null;

  private SNode node;
  private IOperationContext operationContext;
  private MPSProject project;
  private EditorCell cell;
  private Frame frame;

  public ShowRulesWhichAffectNodeType_Action() {
    super("Show Rules Which Affect Node's Type", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift T";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
      this.operationContext = new ActionEventData(event).getOperationContext();
      if (this.operationContext == null) {
        return false;
      }
      this.project = new ActionEventData(event).getMPSProject();
      if (this.project == null) {
        return false;
      }
      this.cell = new ActionEventData(event).getEditorCell();
      if (this.cell == null) {
        return false;
      }
      this.frame = new ActionEventData(event).getFrame();
      if (this.frame == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      NodeTypesComponent component = NodeTypesComponentsRepository.getInstance().getNodeTypesComponent(SNodeOperations.getContainingRoot(this.node));
      if (component == null) {
        return;
      }
      Set<Pair<String, String>> rulesIds = component.getRulesWhichAffectNodeType(this.node);
      if (rulesIds == null) {
        return;
      }
      List<SNode> rules = new ArrayList<SNode>();
      for(Pair<String, String> ruleId : rulesIds) {
        SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString(ruleId.o1));
        if (modelDescriptor == null) {
          continue;
        }
        SNode rule = modelDescriptor.getSModel().getNodeById(ruleId.o2);
        if (rule != null) {
          rules.add(rule);
        }
      }
      // single rule
      if (rules.size() == 1) {
        this.operationContext.getComponent(MPSEditorOpener.class).openNode(rules.get(0));
        return;
      }
      // multiple rules
      MyMenu m = new MyMenu(rules, this.operationContext);
      int x = 0;
      int y = 0;
      if (this.cell != null) {
        x = this.cell.getX();
        y = this.cell.getY();
      }
      m.show(this.frame, x, y);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
    }
  }

}
