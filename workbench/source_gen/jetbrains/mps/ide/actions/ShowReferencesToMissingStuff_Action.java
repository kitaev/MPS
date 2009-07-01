package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.actions.model.MissingReferencesFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class ShowReferencesToMissingStuff_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ShowReferencesToMissingStuff_Action.class);

  private MPSProject project;
  private IScope scope;
  private SModelDescriptor model;

  public ShowReferencesToMissingStuff_Action() {
    super("Show References To Missing Models/Languages", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ShowReferencesToMissingStuff_Action.this.getTool() != null;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowReferencesToMissingStuff", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.scope = event.getData(MPSDataKeys.SCOPE);
    if (this.scope == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL);
    if (this.model == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      SearchQuery query = new SearchQuery(ShowReferencesToMissingStuff_Action.this.model.getSModel(), GlobalScope.getInstance());
      IResultProvider provider = FindUtils.makeProvider(new MissingReferencesFinder(ShowReferencesToMissingStuff_Action.this.scope, ShowReferencesToMissingStuff_Action.this.model));
      ShowReferencesToMissingStuff_Action.this.getTool().findUsages(provider, query, false, true, true, "No missing models and languages");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowReferencesToMissingStuff", t);
      }
    }
  }

  private UsagesViewTool getTool() {
    return ShowReferencesToMissingStuff_Action.this.project.getComponentSafe(UsagesViewTool.class);
  }

}
