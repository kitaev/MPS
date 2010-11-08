package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.make.runtime.script.ScriptBuilder;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.script.IVariablesPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.make.runtime.script.UIQueryRelayStrategy;
import jetbrains.mps.internal.make.runtime.script.LoggingProgressStrategy;
import jetbrains.mps.internal.make.runtime.script.LoggingFeedbackStrategy;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.make.script.IProgress;

public class MakeModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(MakeModel_Action.class);

  private IOperationContext context;
  private List<SModelDescriptor> models;

  public MakeModel_Action() {
    super("_Make", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "MakeModel", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.models = event.getData(MPSDataKeys.MODELS);
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.context = null;
    this.models = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      ScriptBuilder scb = new ScriptBuilder();
      IScript scr = scb.withFacets(new IFacet.Name("Generator"), new IFacet.Name("TextGen"), new IFacet.Name("JavaCompilator"), new IFacet.Name("Make")).withTarget(new ITarget.Name("make")).withInit(new _FunctionTypes._void_P1_E0<IVariablesPool>() {
        public void invoke(IVariablesPool pool) {
          Tuples._3<Project, IOperationContext, Iterable<SModelDescriptor>> vars = (Tuples._3<Project, IOperationContext, Iterable<SModelDescriptor>>) pool.variables(new ITarget.Name("Parameters"), Object.class);
          vars._0(MakeModel_Action.this.context.getProject());
          vars._1(MakeModel_Action.this.context);
          vars._2(MakeModel_Action.this.models);
        }
      }).toScript();
      final UIQueryRelayStrategy relayStrat = new UIQueryRelayStrategy();
      final LoggingProgressStrategy logStrat = new LoggingProgressStrategy();
      final LoggingFeedbackStrategy feedbackStrat = new LoggingFeedbackStrategy();
      IResult res = scr.execute(new IMonitor() {
        public boolean pleaseStop() {
          return false;
        }

        public <T extends IOption> T relayQuery(IQuery<T> query) {
          return relayStrat.relayQuery(query, MakeModel_Action.this.context);
        }

        public void reportFeedback(IFeedback feedback) {
          feedbackStrat.reportFeedback(feedback);
        }

        public IProgress currentProgress() {
          return logStrat.currentProgress();
        }
      });
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "MakeModel", t);
    }
  }
}
