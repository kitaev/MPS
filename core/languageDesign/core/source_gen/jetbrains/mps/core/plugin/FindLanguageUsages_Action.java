package jetbrains.mps.core.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.LanguageUsagesFinder;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.action.ActionEventData;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class FindLanguageUsages_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(FindLanguageUsages_Action.class);
  public static final Icon ICON = null;

  private IModule module;
  private IOperationContext context;
  private IScope scope;

  public FindLanguageUsages_Action() {
    super("Find Usages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt F7";
  }

  public boolean isApplicable(AnActionEvent event) {
    return this.module instanceof Language;
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "FindLanguageUsages", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.module = new ActionEventData(event).getModule();
      if (this.module == null) {
        return false;
      }
      this.context = new ActionEventData(event).getOperationContext();
      if (this.context == null) {
        return false;
      }
      this.scope = new ActionEventData(event).getScope();
      if (this.scope == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final SearchQuery[] query = new SearchQuery[1];
      final IResultProvider[] provider = new IResultProvider[1];
      final IModule module = this.module;
      final IScope scope = this.scope;
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          query[0] = new SearchQuery(module, scope);
          provider[0] = FindUtils.makeProvider(new LanguageUsagesFinder());
        }

      });
      this.context.getComponent(UsagesViewTool.class).findUsages(provider[0], query[0], true, true, false);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindLanguageUsages", t);
    }
  }

}
