package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CommentStatements_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CommentStatements_Action.class);
  public static final Icon ICON = null;

  private List<SNode> nodes;

  public CommentStatements_Action() {
    super("Comment Statements", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift SLASH";
  }

  public boolean isApplicable(AnActionEvent event) {
    return (SNodeOperations.getAncestor(ListSequence.fromList(CommentStatements_Action.this.nodes).getElement(0), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock", false, false) == null);
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CommentStatements", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      List<SNode> nodes = event.getData(MPSDataKeys.SNODES);
      boolean error = false;
      if (nodes != null) {
        for(SNode node : nodes) {
          if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Statement"))) {
            error = true;
            break;
          }
        }
      }
      if (error || nodes == null) {
        this.nodes = null;
      } else
      {
        this.nodes = new ArrayList<SNode>(nodes);
      }
    }
    if (this.nodes == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SNode commentedStatementsBlock = SNodeOperations.insertNewPrevSiblingChild(ListSequence.fromList(CommentStatements_Action.this.nodes).first(), "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock");
      SLinkOperations.addAll(commentedStatementsBlock, "statement", CommentStatements_Action.this.nodes);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CommentStatements", t);
    }
  }

}
