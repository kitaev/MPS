package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.baseLanguage.refactoring.extractMethod.ExtractMethodDialog;
import jetbrains.mps.baseLanguage.refactoring.extractMethod.ExtractMethodKind;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.action.ActionEventData;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.util.ArrayList;
import java.util.List;

public class ExtractMethod_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ExtractMethod_Action.class);
  public static final Icon ICON = null;

  private List<SNode> nodes;

  public ExtractMethod_Action() {
    super("Extract Method", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt M";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      if (!(this.isExpression(this.nodes)) && !(this.isStatements(this.nodes))) {
        this.setVisible(event.getPresentation(), false);
      } else {
        this.setVisible(event.getPresentation(), true);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ExtractMethod", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      {
        List<SNode> nodes = new ActionEventData(event).getNodes();
        boolean error = false;
        if (nodes != null) {
        }
        if (error) {
          this.nodes = null;
        } else {
          this.nodes = new ArrayList<SNode>(nodes);
        }
      }
      if (this.nodes == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ExtractMethodKind kind;
      if (this.isStatements(this.nodes)) {
        kind = ExtractMethodKind.FROM_STATEMENTS;
      } else {
        kind = ExtractMethodKind.FROM_EXPRESSION;
      }
      ExtractMethodDialog dialog = new ExtractMethodDialog(kind, new ActionEventData(event));
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ExtractMethod", t);
    }
  }

  /* package */boolean isStatements(List<SNode> statements) {
    for (SNode node : statements) {
      if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Statement"))) {
        return false;
      }
    }
    return true;
  }

  /* package */boolean isExpression(List<SNode> nodes) {
    return ListSequence.fromList(nodes).count() == 1 && SNodeOperations.isInstanceOf(ListSequence.fromList(nodes).first(), "jetbrains.mps.baseLanguage.structure.Expression");
  }

}
