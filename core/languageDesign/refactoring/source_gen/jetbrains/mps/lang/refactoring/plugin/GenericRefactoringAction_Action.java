package jetbrains.mps.lang.refactoring.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.refactoring.framework.IRefactoring;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import java.util.List;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.refactoring.RefactoringFacade;

public class GenericRefactoringAction_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GenericRefactoringAction_Action.class);

  private IRefactoring refactoring;

  public GenericRefactoringAction_Action(IRefactoring refactoring_par) {
    super("<caption>", "", ICON);
    this.refactoring = refactoring_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        String text = ("".equals(GenericRefactoringAction_Action.this.refactoring.getUserFriendlyName()) ?
          GenericRefactoringAction_Action.this.refactoring.getClass().getName() :
          GenericRefactoringAction_Action.this.refactoring.getUserFriendlyName()
        );
        event.getPresentation().setText(text);

        IRefactoringTarget refTarget = GenericRefactoringAction_Action.this.refactoring.getRefactoringTarget();
        boolean oneEntity = !(refTarget.allowMultipleTargets());
        List entities;
        switch (refTarget.getTarget()) {
          case NODE:
            entities = GenericRefactoringHelper.getNodes(event, oneEntity);
            break;
          case MODEL:
            entities = GenericRefactoringHelper.getModels(event, oneEntity);
            break;
          case MODULE:
            entities = GenericRefactoringHelper.getModules(event, oneEntity);
            break;
          default:
            throw new IllegalArgumentException("Wrong refactoring type " + refTarget.getTarget().getClass().getName());
        }
        boolean disabled = entities.isEmpty() || RefactoringUtil.getApplicability(GenericRefactoringAction_Action.this.refactoring, entities).lessThan(GenericRefactoringHelper.getMinApplicabilityLevel());

        GenericRefactoringAction_Action.this.setEnabledState(event.getPresentation(), !(disabled));
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GenericRefactoringAction", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          SModelRepository.getInstance().saveAll();
        }
      });
      boolean isOneTarget = !(GenericRefactoringAction_Action.this.refactoring.getRefactoringTarget().allowMultipleTargets());
      final RefactoringContext context = new RefactoringContext(GenericRefactoringAction_Action.this.refactoring);
      context.setCurrentOperationContext(event.getData(MPSDataKeys.OPERATION_CONTEXT));
      context.setSelectedNode(event.getData(MPSDataKeys.NODE));
      context.setSelectedNodes(GenericRefactoringHelper.getNodes(event, isOneTarget));
      context.setSelectedModel(event.getData(MPSDataKeys.CONTEXT_MODEL));
      context.setSelectedModels(GenericRefactoringHelper.getModels(event, isOneTarget));
      context.setSelectedModule(event.getData(MPSDataKeys.MODULE));
      context.setSelectedModules(GenericRefactoringHelper.getModules(event, isOneTarget));
      context.setSelectedProject(event.getData(PlatformDataKeys.PROJECT));
      context.setCurrentScope(event.getData(MPSDataKeys.SCOPE));
      new Thread() {
        public void run() {
          new RefactoringFacade().execute(GenericRefactoringAction_Action.this.refactoring, context);
        }
      }.start();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GenericRefactoringAction", t);
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder();
    res.append(super.getActionId());
    res.append("#");
    res.append(refactoring_State((IRefactoring) this.refactoring));
    res.append("!");
    return res.toString();
  }

  public static String refactoring_State(IRefactoring object) {
    return GenericRefactoringHelper.getRefactoringClassName(object);
  }
}
