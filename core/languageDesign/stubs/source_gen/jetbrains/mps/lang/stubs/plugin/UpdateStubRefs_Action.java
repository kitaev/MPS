package jetbrains.mps.lang.stubs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelId;

public class UpdateStubRefs_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(UpdateStubRefs_Action.class);

  public UpdateStubRefs_Action() {
    super("Upgrade All Stub Refs (3)", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "UpdateStubRefs", t);
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
      for (SModelDescriptor d : SModelRepository.getInstance().getModelDescriptors()) {
        if (!(d instanceof DefaultSModelDescriptor)) {
          continue;
        }
        if (!(SModelStereotype.isUserModel(d))) {
          continue;
        }

        DefaultSModelDescriptor dsmd = (DefaultSModelDescriptor) d;
        List<SModel.ImportElement> toRemove = new ArrayList();
        for (SModel.ImportElement elem : dsmd.getSModel().importedModels()) {
          SModelId id = elem.getModelReference().getSModelId();
          if (!(id instanceof SModelId.ForeignSModelId)) {
            continue;
          }
          String s = ((SModelId.ForeignSModelId) id).getId();
          if (s.lastIndexOf("#") - s.indexOf("#") > 1) {
            continue;
          }

          toRemove.add(elem);
        }

        for (SModel.ImportElement elem : toRemove) {
          dsmd.getSModel().removeModelImport_internal(elem);
        }
        SModelRepository.getInstance().markChanged(dsmd, true);
      }

      SModelRepository.getInstance().saveAll();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "UpdateStubRefs", t);
    }
  }
}
