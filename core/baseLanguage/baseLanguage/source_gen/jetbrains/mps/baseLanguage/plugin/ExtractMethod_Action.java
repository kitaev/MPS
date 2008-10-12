package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ExtractMethod_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ExtractMethod_Action.class);
  public static final Icon ICON = null;

  private List<SNode> nodes;
  public Frame frame;

  public ExtractMethod_Action() {
    super("Extract Method", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt M";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ExtractMethod_Action.this.isExpression(ExtractMethod_Action.this.nodes) || ExtractMethodRefactoringAnalyzer.isStatements(ExtractMethod_Action.this.nodes);
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ExtractMethod", t);
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
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Wrappers._T<ExtractMethodKind> kind = new Wrappers._T<ExtractMethodKind>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          if (ExtractMethodRefactoringAnalyzer.isStatements(ExtractMethod_Action.this.nodes)) {
            kind.value = ExtractMethodKind.FROM_STATEMENTS;
          } else
          {
            kind.value = ExtractMethodKind.FROM_EXPRESSION;
          }
        }

      });
      ExtractMethodDialog dialog = new ExtractMethodDialog(kind.value, event.getData(MPSDataKeys.EDITOR_CONTEXT), ExtractMethod_Action.this.nodes, ExtractMethod_Action.this.frame);
      dialog.showDialog();
      dialog.pack();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ExtractMethod", t);
    }
  }

  /* package */boolean isExpression(List<SNode> nodes) {
    return ListSequence.fromList(nodes).count() == 1 && SNodeOperations.isInstanceOf(ListSequence.fromList(nodes).first(), "jetbrains.mps.baseLanguage.structure.Expression");
  }

}
