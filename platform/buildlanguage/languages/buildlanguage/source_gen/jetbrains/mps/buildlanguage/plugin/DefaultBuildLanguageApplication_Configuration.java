package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import jetbrains.mps.logging.Logger;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.execution.configurations.RuntimeConfigurationError;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.impl.ConsoleViewImpl;
import jetbrains.mps.debug.info.StacktraceUtil;
import jetbrains.mps.workbench.MPSDataKeys;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.openapi.util.Disposer;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.io.File;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.buildlanguage.behavior.Project_Behavior;
import jetbrains.mps.ide.actions.DefaultProcessHandler;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.execution.configurations.RunnerSettings;
import com.intellij.execution.configurations.ConfigurationPerRunnerSettings;
import com.intellij.openapi.util.JDOMExternalizable;
import com.intellij.execution.configurations.ConfigurationInfoProvider;
import com.intellij.openapi.options.SettingsEditor;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.baseLanguage.util.plugin.run.RunUtil;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class DefaultBuildLanguageApplication_Configuration extends BaseRunConfig {
  private static final Logger LOG = Logger.getLogger(DefaultBuildLanguageApplication_Configuration.class);

  @Tag(value = "state")
  private DefaultBuildLanguageApplication_Configuration.MyState myState = new DefaultBuildLanguageApplication_Configuration.MyState();

  public DefaultBuildLanguageApplication_Configuration(Project p, ConfigurationFactory f, String name) {
    super(p, f, name);
  }

  public RunConfiguration clone() {
    try {
      DefaultBuildLanguageApplication_Configuration result = ((DefaultBuildLanguageApplication_Configuration) super.clone());
      result.myState = ((DefaultBuildLanguageApplication_Configuration.MyState) this.myState.clone());
      return result;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    StringBuilder error = new StringBuilder();
    try {
      String paramsReport = DefaultBuildLanguageApplication_Configuration.this.getStateObject().myJavaRunParameters.getErrorReport();
      if (paramsReport != null) {
        error.append(paramsReport).append("\n");
      }
      final SNode node;
      String errorReport;
      {
        Tuples._2<SNode, String> _tmp_3pf0a9_e0a0b0b = DefaultBuildLanguageApplication_Configuration.this.checkNode();
        node = _tmp_3pf0a9_e0a0b0b._0();
        errorReport = _tmp_3pf0a9_e0a0b0b._1();
      }
      if (node == null) {
        throw new RuntimeConfigurationException(errorReport);
      }
    } catch (Throwable t) {
      if (t instanceof RuntimeConfigurationException) {
        throw (RuntimeConfigurationException) t;
      }
      if (t instanceof RuntimeConfigurationError) {
        throw (RuntimeConfigurationError) t;
      }
      LOG.error(t);
    }
    if (error.length() != 0) {
      throw new RuntimeConfigurationException(error.toString());
    }
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment) throws ExecutionException {
    return new RunProfileState() {
      @Nullable
      public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        final ConsoleViewImpl consoleView = StacktraceUtil.createConsoleView(MPSDataKeys.PROJECT.getData(environment.getDataContext()));
        JComponent consoleComponent = null;
        Runnable consoleDispose = null;
        final List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
        ProcessHandler handler = null;
        Project project = MPSDataKeys.PROJECT.getData(environment.getDataContext());
        IOperationContext context = MPSDataKeys.OPERATION_CONTEXT.getData(environment.getDataContext());

        // user's execute code 
        try {
          final ConfigRunParameters javaRunParameters = DefaultBuildLanguageApplication_Configuration.this.getStateObject().myJavaRunParameters.copy();
          final SNode node = DefaultBuildLanguageApplication_Configuration.this.getNodeForExecution(environment.getProject(), (javaRunParameters).getMake());
          {
            // calculate parameter 

            ListSequence.fromList(actions).addSequence(ListSequence.fromList(new _FunctionTypes._return_P0_E0<List<AnAction>>() {
              public List<AnAction> invoke() {
                {
                  final List<AnAction> actionsList = ListSequence.fromListAndArray(new ArrayList<AnAction>(), consoleView.createConsoleActions());
                  return actionsList;
                }
              }
            }.invoke()));

            // create console component 
            consoleComponent = consoleView.getComponent();
            consoleDispose = new Runnable() {
              public void run() {
                Disposer.dispose(consoleView);
              }
            };

            final Wrappers._T<ExecutionException> ex = new Wrappers._T<ExecutionException>(null);
            // create process handler 
            handler = (ProcessHandler) new _FunctionTypes._return_P0_E0<Object>() {
              public Object invoke() {
                try {
                  AntScriptRunner runner = new AntScriptRunner(javaRunParameters);
                  final Wrappers._T<File> file = new Wrappers._T<File>();
                  ModelAccess.instance().runReadAction(new Runnable() {
                    public void run() {
                      file.value = FileGenerationUtil.getDefaultOutputDir(SNodeOperations.getModel(node), new File(SNodeOperations.getModel(node).getModelDescriptor().getModule().getGeneratorOutputPath()));
                      file.value = new File(file.value, Project_Behavior.call_getFileName_1213877351819(node));
                    }
                  });
                  Process process = runner.run(file.value);
                  return new DefaultProcessHandler(consoleView, process, runner.getCommandString());
                } catch (ExecutionException e) {
                  ex.value = e;
                  return null;
                }
              }
            }.invoke();
            if (ex.value != null) {
              throw ex.value;
            }
          }
        } catch (ExecutionException e) {
          throw e;
        } catch (Throwable t) {
          DefaultBuildLanguageApplication_Configuration.LOG.error(t);
          throw new ExecutionException("Execution code threw an exception: " + t.getMessage(), t);
        }

        final JComponent finalConsoleComponent = consoleComponent;
        final Runnable finalConsoleDispose = consoleDispose;
        final ProcessHandler finalHandler = handler;
        if (finalHandler == null) {
          return null;
        }
        return new ExecutionResult() {
          public ExecutionConsole getExecutionConsole() {
            return new ExecutionConsole() {
              public void dispose() {
                if (finalConsoleDispose == null) {
                  return;
                }
                finalConsoleDispose.run();
              }

              public JComponent getComponent() {
                return finalConsoleComponent;
              }

              public JComponent getPreferredFocusableComponent() {
                return finalConsoleComponent;
              }
            };
          }

          public AnAction[] getActions() {
            return ListSequence.fromList(actions).toGenericArray(AnAction.class);
          }

          public ProcessHandler getProcessHandler() {
            return finalHandler;
          }
        };
      }

      public RunnerSettings getRunnerSettings() {
        return null;
      }

      public ConfigurationPerRunnerSettings getConfigurationSettings() {
        return null;
      }
    };
  }

  public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider p0) {
    return null;
  }

  public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new DefaultBuildLanguageApplication_Configuration.MySettingsEditor();
  }

  @Nullable
  public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner p0) {
    return null;
  }

  public void writeExternal(Element e) throws WriteExternalException {
    e.addContent(XmlSerializer.serialize(this.myState));
  }

  public void readExternal(Element e) throws InvalidDataException {
    XmlSerializer.deserializeInto(this.myState, ((Element) e.getChildren().get(0)));
  }

  public DefaultBuildLanguageApplication_Configuration.MyState getStateObject() {
    return this.myState;
  }

  public SNode getNode() {
    if (DefaultBuildLanguageApplication_Configuration.this.getStateObject().modelId == null || DefaultBuildLanguageApplication_Configuration.this.getStateObject().nodeId == null) {
      return null;
    }
    final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        node.value = new SNodePointer(DefaultBuildLanguageApplication_Configuration.this.getStateObject().modelId, DefaultBuildLanguageApplication_Configuration.this.getStateObject().nodeId).getNode();
      }
    });
    return node.value;
  }

  public void setNode(final SNode node) {
    if (node == null) {
      DefaultBuildLanguageApplication_Configuration.this.getStateObject().modelId = null;
      DefaultBuildLanguageApplication_Configuration.this.getStateObject().nodeId = null;
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        DefaultBuildLanguageApplication_Configuration.this.getStateObject().modelId = node.getModel().getModelDescriptor().getSModelReference().toString();
        DefaultBuildLanguageApplication_Configuration.this.getStateObject().nodeId = node.getId();
      }
    });
  }

  private SNode getNodeForExecution(Project project, boolean make) {
    SNode node = DefaultBuildLanguageApplication_Configuration.this.getNode();
    if (make) {
      RunUtil.makeBeforeRun(project, node);
    }
    return node;
  }

  private Tuples._2<SNode, String> checkNode() {
    if (DefaultBuildLanguageApplication_Configuration.this.getStateObject().modelId != null && DefaultBuildLanguageApplication_Configuration.this.getStateObject().nodeId != null) {
      final SNode node = ModelAccess.instance().runReadAction(new Computable<SNode>() {
        public SNode compute() {
          return DefaultBuildLanguageApplication_Configuration.this.getNode();
        }
      });
      if ((node == null)) {
        return MultiTuple.<SNode,String>from((SNode) null, "node is not selected or does not exist");
      }
      return MultiTuple.<SNode,String>from(node, (String) null);
    } else {
      return MultiTuple.<SNode,String>from((SNode) null, "node is not selected");
    }
  }

  private static class MySettingsEditor extends SettingsEditor<DefaultBuildLanguageApplication_Configuration> {
    private DefaultBuildLanguageApplication_Editor myComponent = null;

    public MySettingsEditor() {
    }

    protected void resetEditorFrom(DefaultBuildLanguageApplication_Configuration c) {
      MySettingsEditor.this.myComponent.reset(c);
      final ConfigRunParameters javaRunParameters = c.getStateObject().myJavaRunParameters;
    }

    protected void applyEditorTo(DefaultBuildLanguageApplication_Configuration c) {
      MySettingsEditor.this.myComponent.apply(c);
      final ConfigRunParameters javaRunParameters = c.getStateObject().myJavaRunParameters;
    }

    @NotNull
    protected JComponent createEditor() {
      this.myComponent = new DefaultBuildLanguageApplication_Editor();
      return this.myComponent;
    }

    protected void disposeEditor() {
      MySettingsEditor.this.myComponent.dispose();
    }
  }

  public static class MyState implements Cloneable {
    public ConfigRunParameters myJavaRunParameters = new ConfigRunParameters();
    public String nodeId;
    public String modelId;

    public MyState() {
    }

    public Object clone() throws CloneNotSupportedException {
      DefaultBuildLanguageApplication_Configuration.MyState object = (DefaultBuildLanguageApplication_Configuration.MyState) super.clone();
      if (this.myJavaRunParameters != null) {
        object.myJavaRunParameters = (ConfigRunParameters) this.myJavaRunParameters.clone();
      }
      return object;
    }
  }
}
