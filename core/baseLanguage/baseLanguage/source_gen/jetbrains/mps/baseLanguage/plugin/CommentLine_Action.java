package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.MPSDataKeys;

public class CommentLine_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(CommentLine_Action.class);

  private SNode selectedNode;
  private EditorComponent editorComponent;

  public CommentLine_Action() {
    super("Comment Line", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl SLASH";
  }

  public boolean isApplicable(AnActionEvent event) {
    if (CommentLine_Action.this.editorComponent.isReadOnly()) {
      return false;
    }
    SNode singleLineComment = CommentLine_Action.this.getSingleLineComment();
    if (singleLineComment != null) {
      return ListSequence.fromList(SLinkOperations.getTargets(singleLineComment, "commentPart", true)).count() == 1 && SNodeOperations.isInstanceOf(ListSequence.fromList(SLinkOperations.getTargets(singleLineComment, "commentPart", true)).first(), "jetbrains.mps.baseLanguage.structure.StatementCommentPart");
    }
    SNode statement = CommentLine_Action.this.getStatement();
    if (statement == null) {
      return false;
    }
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(statement), "jetbrains.mps.baseLanguage.structure.StatementList");
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CommentLine", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.selectedNode = node;
    }
    if (this.selectedNode == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.selectedNode = null;
    this.editorComponent = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      SNode singleLineComment = CommentLine_Action.this.getSingleLineComment();
      if (singleLineComment != null) {
        // uncommenting 
        SNode innerStatement = SLinkOperations.getTarget(SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(singleLineComment, "commentPart", true)).first(), "jetbrains.mps.baseLanguage.structure.StatementCommentPart"), "commentedStatement", true);
        SNodeOperations.replaceWithAnother(singleLineComment, innerStatement);
        SNodeOperations.deleteNode(singleLineComment);
      } else {
        SNode statement = CommentLine_Action.this.getStatement();
        assert statement != null : "Statement should not be null due to the isApplicable() constraints";
        // commenting 
        SNode comment = SNodeOperations.replaceWithNewChild(statement, "jetbrains.mps.baseLanguage.structure.SingleLineComment");
        SNode commentPart = SLinkOperations.addNewChild(comment, "commentPart", "jetbrains.mps.baseLanguage.structure.StatementCommentPart");
        SLinkOperations.setTarget(commentPart, "commentedStatement", statement, true);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CommentLine", t);
    }
  }

  private SNode getStatement() {
    return SNodeOperations.getAncestor(CommentLine_Action.this.selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false);
  }

  private SNode getSingleLineComment() {
    return SNodeOperations.getAncestor(CommentLine_Action.this.selectedNode, "jetbrains.mps.baseLanguage.structure.SingleLineComment", true, false);
  }
}
