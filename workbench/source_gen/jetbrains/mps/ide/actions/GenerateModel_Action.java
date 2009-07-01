package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.generator.IGenerationType;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.generator.GeneratorManager;
import java.util.ArrayList;

public class GenerateModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerateModel_Action.class);

  private MPSProject project;
  private IOperationContext context;
  private List<SModelDescriptor> models;
  private SModelDescriptor model;
  private IGenerationType generationType;

  public GenerateModel_Action(IGenerationType generationType_par) {
    super("Generate Model", "", ICON);
    this.generationType = generationType_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        event.getPresentation().setText(GenerateModel_Action.this.generationType.toString());
        boolean applicable = ListSequence.fromList(GenerateModel_Action.this.getModels()).isNotEmpty();
        for(SModelDescriptor model : ListSequence.fromList(GenerateModel_Action.this.getModels())) {
          if (!(GenerateModel_Action.this.generationType.isApplicable(model))) {
            applicable = false;
            break;
          }
        }
        GenerateModel_Action.this.setEnabledState(event.getPresentation(), applicable);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerateModel", t);
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
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.models = event.getData(MPSDataKeys.MODELS);
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      GenerateModel_Action.this.project.getComponentSafe(GeneratorManager.class).generateModelsFromDifferentModules(GenerateModel_Action.this.context, GenerateModel_Action.this.models, GenerateModel_Action.this.generationType);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerateModel", t);
      }
    }
  }

  @NotNull()
  public String getActionId() {
    StringBuilder res = new StringBuilder(500);
    res.append(GenerateModel_Action.class.getName());
    res.append("#");
    res.append(generationType_State((IGenerationType)this.generationType));
    res.append("!");
    return res.toString();
  }

  /* package */List<SModelDescriptor> getModels() {
    List<SModelDescriptor> result = ListSequence.fromList(new ArrayList<SModelDescriptor>());
    if (GenerateModel_Action.this.models != null) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(GenerateModel_Action.this.models));
    }
    if (ListSequence.fromList(result).isEmpty() && GenerateModel_Action.this.model != null) {
      ListSequence.fromList(result).addElement(GenerateModel_Action.this.model);
    }
    return result;
  }


  public static String generationType_State(IGenerationType object) {
    return object.toString();
  }

}
