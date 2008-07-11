package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.helgins.uiActions.RefactorModelUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.action.ActionEventData;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class RefactorModel_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(RefactorModel_Action.class);
  public static final Icon ICON = null;

  private SModelDescriptor model;

  public RefactorModel_Action() {
    super("Refactor Helgins Model", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    LanguageAspect languageAspect = Language.getModelAspect(this.model);
    return languageAspect == LanguageAspect.HELGINS_TYPESYSTEM;
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RefactorModel", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.model = new ActionEventData(event).getModelDescriptor();
      if (this.model == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      RefactorModelUtil.refactorModel(this.model);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RefactorModel", t);
    }
  }

}
