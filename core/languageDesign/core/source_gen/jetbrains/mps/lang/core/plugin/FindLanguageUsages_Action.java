package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.LanguageUsagesFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FindLanguageUsages_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(FindLanguageUsages_Action.class);

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
    return FindLanguageUsages_Action.this.module instanceof Language;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
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
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.scope = event.getData(MPSDataKeys.SCOPE);
    if (this.scope == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final SearchQuery[] query = new SearchQuery[1];
      final IResultProvider[] provider = new IResultProvider[1];
      final IModule module = FindLanguageUsages_Action.this.module;
      final IScope scope = FindLanguageUsages_Action.this.scope;
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          query[0] = new SearchQuery(module, scope);
          provider[0] = FindUtils.makeProvider(new LanguageUsagesFinder());
        }
      });
      FindLanguageUsages_Action.this.context.getComponent(UsagesViewTool.class).findUsages(provider[0], query[0], true, true, false, "Language has no usages");
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindLanguageUsages", t);
    }
  }

}
