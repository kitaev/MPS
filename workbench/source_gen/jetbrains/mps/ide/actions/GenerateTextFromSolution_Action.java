package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.project.Solution;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.genconf.GenParameters;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.structure.project.testconfigurations.ModuleTestConfiguration;
import jetbrains.mps.generator.IllegalGeneratorConfigurationException;
import javax.swing.JOptionPane;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.generationTypes.OutputViewGenerationHandler;

public class GenerateTextFromSolution_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerateTextFromSolution_Action.class);

  private Project project;
  private IOperationContext context;
  private IModule module;
  private Frame frame;

  public GenerateTextFromSolution_Action() {
    super("Generate Text from Solution", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return GenerateTextFromSolution_Action.this.module instanceof Solution;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerateTextFromSolution", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<GenParameters> params = new Wrappers._T<GenParameters>(null);
      final Wrappers._T<String> exceptionMsg = new Wrappers._T<String>(null);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          ModuleTestConfiguration conf = new ModuleTestConfiguration();
          conf.setModuleRef(GenerateTextFromSolution_Action.this.module.getModuleReference());
          conf.setName("tmp");
          try {
            params.value = conf.getGenParams(GenerateTextFromSolution_Action.this.project, true);
          } catch (IllegalGeneratorConfigurationException e) {
            exceptionMsg.value = e.getMessage();
          }
        }
      });
      if (exceptionMsg.value != null) {
        JOptionPane.showMessageDialog(GenerateTextFromSolution_Action.this.frame, exceptionMsg.value);
        return;
      }
      GeneratorManager manager = GenerateTextFromSolution_Action.this.context.getComponent(GeneratorManager.class);
      manager.generateModelsWithProgressWindow(params.value.getModelDescriptors(), GenerateTextFromSolution_Action.this.context, new OutputViewGenerationHandler(), false);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerateTextFromSolution", t);
      }
    }
  }
}
