package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;

public class MakeSelection_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(MakeSelection_Action.class);

  private boolean cleanMake;

  public MakeSelection_Action(boolean cleanMake_par) {
    super("Make", "", ICON);
    this.cleanMake = cleanMake_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    if (IMakeService.INSTANCE.get().isSessionActive()) {
      return false;
    }
    String text = new MakeActionParameters(((IOperationContext) MapSequence.fromMap(_params).get("context")), ((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")), ((SModelDescriptor) MapSequence.fromMap(_params).get("cmodel")), ((List<IModule>) MapSequence.fromMap(_params).get("modules")), ((IModule) MapSequence.fromMap(_params).get("cmodule"))).actionText(MakeSelection_Action.this.cleanMake);
    if (text != null) {
      event.getPresentation().setText(text);
      return true;
    }
    return false;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "MakeSelection", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("models", event.getData(MPSDataKeys.MODELS));
    MapSequence.fromMap(_params).put("cmodel", event.getData(MPSDataKeys.CONTEXT_MODEL));
    MapSequence.fromMap(_params).put("modules", event.getData(MPSDataKeys.MODULES));
    MapSequence.fromMap(_params).put("cmodule", event.getData(MPSDataKeys.CONTEXT_MODULE));
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      new MakeActionImpl(((IOperationContext) MapSequence.fromMap(_params).get("context")), new MakeActionParameters(((IOperationContext) MapSequence.fromMap(_params).get("context")), ((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")), ((SModelDescriptor) MapSequence.fromMap(_params).get("cmodel")), ((List<IModule>) MapSequence.fromMap(_params).get("modules")), ((IModule) MapSequence.fromMap(_params).get("cmodule"))), MakeSelection_Action.this.cleanMake).executeAction();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "MakeSelection", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder();
    res.append(super.getActionId());
    res.append("#");
    res.append(((Object) this.cleanMake).toString());
    res.append("!");
    return res.toString();
  }
}
