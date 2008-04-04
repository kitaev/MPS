package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.refactoring.ExtractMethodDialog;
import jetbrains.mps.baseLanguage.refactoring.ExtractMethodKind;

public class ExtractMethod_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(ExtractMethod_Action.class);

  private List<SNode> nodes;
  private boolean isAlwaysVisible = false;

  public  ExtractMethod_Action(MPSProject project) {
    super(project, "Extract Method");
  }

  @NotNull()
  public String getKeyStroke() {
    return "control alt M";
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      for(SNode n : this.nodes) {
        if (!(SNodeOperations.isInstanceOf(n, "jetbrains.mps.baseLanguage.structure.Statement"))) {
          this.setVisible(false);
          return;
        }
      }
      this.setVisible(true);
    } catch (Throwable t) {
      ExtractMethod_Action.LOG.error("User's action doUpdate method failed. Action:" + "ExtractMethod", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      this.nodes = new ArrayList<SNode>(context.getNodes());
      if (this.nodes == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        List<Statement> statementes = new ArrayList<Statement>();
        {
          ICursor<SNode> _zCursor2 = CursorFactory.createCursor(this.nodes);
          try {
            while(_zCursor2.moveToNext()) {
              SNode st = _zCursor2.getCurrent();
              statementes.add(((Statement)SNodeOperations.getAdapter(st)));
            }
          } finally {
            _zCursor2.release();
          }
        }
        ExtractMethodDialog dialog = new ExtractMethodDialog(ExtractMethodKind.FROM_STATEMENTS, context);
        dialog.showDialog();
      }
    } catch (Throwable t) {
      ExtractMethod_Action.LOG.error("User's action execute method failed. Action:" + "ExtractMethod", t);
    }
  }

}
