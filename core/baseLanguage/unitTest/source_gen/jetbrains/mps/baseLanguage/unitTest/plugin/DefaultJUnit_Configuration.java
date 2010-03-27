package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunConfig;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.Executor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.plugins.pluginparts.runconfigs.BaseRunProfileState;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.impl.ConsoleViewImpl;
import jetbrains.mps.debug.info.StacktraceUtil;
import javax.swing.JComponent;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;
import com.intellij.execution.executors.DefaultDebugExecutor;
import jetbrains.mps.debug.DebuggerKeys;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.util.plugin.run.RunUtil;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
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
import jetbrains.mps.project.IModule;

public class DefaultJUnit_Configuration extends BaseRunConfig {
  @Tag(value = "state")
  private DefaultJUnit_Configuration.MyState myState = new DefaultJUnit_Configuration.MyState();

  public DefaultJUnit_Configuration(Project p, ConfigurationFactory f, String name) {
    super(p, f, name);
  }

  public RunConfiguration clone() {
    try {
      DefaultJUnit_Configuration result = ((DefaultJUnit_Configuration) super.clone());
      result.myState = ((DefaultJUnit_Configuration.MyState) this.myState.clone());
      return result;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
    StringBuilder error = new StringBuilder();
    {
      String paramsReport = DefaultJUnit_Configuration.this.getStateObject().myJavaRunParameters.getErrorReport();
      if (paramsReport != null) {
        error.append(paramsReport).append("\n");
      }
      if (DefaultJUnit_Configuration.this.getStateObject().type != null) {
        final Wrappers._T<String> errorReport = new Wrappers._T<String>(null);
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.METHOD) {
              if (ListSequence.fromList(TestRunUtil.getValues(DefaultJUnit_Configuration.this.getStateObject().method, DefaultJUnit_Configuration.this.getStateObject().methods)).isEmpty()) {
                errorReport.value = "methods list is empty";
              } else if (!(TestRunUtil.validateMethods(DefaultJUnit_Configuration.this.getStateObject().node, DefaultJUnit_Configuration.this.getStateObject().nodes, DefaultJUnit_Configuration.this.getStateObject().method, DefaultJUnit_Configuration.this.getStateObject().methods))) {
                errorReport.value = "methods is not valid";
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.NODE) {
              if (ListSequence.fromList(TestRunUtil.getValues(DefaultJUnit_Configuration.this.getStateObject().node, DefaultJUnit_Configuration.this.getStateObject().nodes)).isEmpty()) {
                errorReport.value = "classes list is empty";
              } else if (!(TestRunUtil.validateNodes(DefaultJUnit_Configuration.this.getStateObject().node, DefaultJUnit_Configuration.this.getStateObject().nodes))) {
                errorReport.value = "nodes is not valid";
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODEL) {
              if (DefaultJUnit_Configuration.this.getStateObject().model == null) {
                errorReport.value = "model is not selected or does not exist";
              } else if (!(TestRunUtil.validateModel(DefaultJUnit_Configuration.this.getStateObject().model))) {
                errorReport.value = "model is not valid";
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODULE) {
              if (DefaultJUnit_Configuration.this.getStateObject().module == null) {
                errorReport.value = "module is not selected or does not exist";
              } else if (!(TestRunUtil.validateModule(DefaultJUnit_Configuration.this.getStateObject().module))) {
                errorReport.value = "module is not valid";
              }
            } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.PROJECT) {
              MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext());
              if (mpsProject != null) {
                if (!(TestRunUtil.containsTest(mpsProject))) {
                  errorReport.value = "project does not contain tests";
                }
              }
            }
          }
        });
        if (errorReport.value != null) {
          error.append(errorReport.value).append("\n");
        }
      }
    }
    if (error.length() != 0) {
      throw new RuntimeConfigurationException(error.toString());
    }
  }

  public RunProfileState getState(@NotNull final Executor executor, @NotNull final ExecutionEnvironment environment) throws ExecutionException {
    return new BaseRunProfileState() {
      @Nullable
      public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
        final ConsoleViewImpl consoleView = StacktraceUtil.createConsoleView(MPSDataKeys.PROJECT.getData(environment.getDataContext()));
        JComponent consoleComponent = null;
        Runnable consoleDispose = null;
        final List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
        ProcessHandler handler = null;
        final MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(environment.getDataContext());
        final IOperationContext operationContext = MPSDataKeys.OPERATION_CONTEXT.getData(environment.getDataContext());
        {
          final ConfigRunParameters javaRunParameters = DefaultJUnit_Configuration.this.getStateObject().myJavaRunParameters.copy();
          // add debug arguments if runned under debug 
          if (executor.getId().equals(DefaultDebugExecutor.EXECUTOR_ID)) {
            String args = this.getUserData(DebuggerKeys.CONNECTION_SETTINGS);
            String oldVmParams = javaRunParameters.getVMParameters();
            if (StringUtils.isNotEmpty(oldVmParams)) {
              oldVmParams += " ";
            }
            javaRunParameters.setVMParameters(oldVmParams + args);
          }
          {
            // calculate parameter 
            final UnitTestExecutionController parameter = new _FunctionTypes._return_P0_E0<UnitTestExecutionController>() {
              public UnitTestExecutionController invoke() {
                List<SNode> stuffToTest = DefaultJUnit_Configuration.this.collectWhatToTest(mpsProject);

                if (javaRunParameters.getMake()) {
                  RunUtil.makeBeforeRun(mpsProject, stuffToTest);
                }

                return new UnitTestExecutionController(stuffToTest, javaRunParameters);
              }
            }.invoke();

            // set actions 

            // create console component 
            final Tuples._2<JComponent, Runnable> executeConsoleTmp = MultiTuple.<JComponent, Runnable>empty2().assign((Tuples._2<JComponent, Runnable>) new _FunctionTypes._return_P0_E0<Tuples._2<JComponent, Runnable>>() {
              public Tuples._2<JComponent, Runnable> invoke() {
                final UnitTestViewComponent runComponent = new UnitTestViewComponent(mpsProject, operationContext, consoleView, parameter);
                return MultiTuple.<JComponent,Runnable>from((JComponent) runComponent, new Runnable() {
                  public void run() {
                    runComponent.dispose();
                  }
                });
              }
            }.invoke());
            consoleComponent = executeConsoleTmp._0();
            consoleDispose = new Runnable() {
              public void run() {
                executeConsoleTmp._1().run();
              }
            };

            // create process handler 
            handler = (ProcessHandler) new _FunctionTypes._return_P0_E0<ProcessHandler>() {
              public ProcessHandler invoke() {
                return parameter.execute();
              }
            }.invoke();
          }
        }
        final JComponent finalConsoleComponent = consoleComponent;
        final Runnable finalConsoleDispose = consoleDispose;
        final ProcessHandler finalHandler = handler;
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
    return new DefaultJUnit_Configuration.MySettingsEditor();
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

  public DefaultJUnit_Configuration.MyState getStateObject() {
    return this.myState;
  }

  private List<SNode> collectWhatToTest(final MPSProject mpsProject) {
    final List<SNode> all = new ArrayList<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (DefaultJUnit_Configuration.this.getStateObject().type != null) {
          if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.METHOD) {
            if (DefaultJUnit_Configuration.this.getStateObject().node != null) {
              ListSequence.fromList(all).addElement(TestRunUtil.getTestMethod(DefaultJUnit_Configuration.this.getStateObject().node, DefaultJUnit_Configuration.this.getStateObject().method));
            }
            if (DefaultJUnit_Configuration.this.getStateObject().nodes != null) {
              for (int i = 0; i < DefaultJUnit_Configuration.this.getStateObject().nodes.size(); i++) {
                ListSequence.fromList(all).addElement(TestRunUtil.getTestMethod(DefaultJUnit_Configuration.this.getStateObject().nodes.get(i), DefaultJUnit_Configuration.this.getStateObject().methods.get(i)));
              }
            }
          } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.NODE) {
            if (DefaultJUnit_Configuration.this.getStateObject().node != null) {
              ListSequence.fromList(all).addElement(TestRunUtil.getTestNode(DefaultJUnit_Configuration.this.getStateObject().node));
            }
            if (DefaultJUnit_Configuration.this.getStateObject().nodes != null) {
              for (int i = 0; i < DefaultJUnit_Configuration.this.getStateObject().nodes.size(); i++) {
                ListSequence.fromList(all).addElement(TestRunUtil.getTestNode(DefaultJUnit_Configuration.this.getStateObject().nodes.get(i)));
              }
            }
          } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODEL) {
            ListSequence.fromList(all).addSequence(ListSequence.fromList(TestRunUtil.getModelTests(TestRunUtil.getModel(DefaultJUnit_Configuration.this.getStateObject().model))));
          } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.MODULE) {
            ListSequence.fromList(all).addSequence(ListSequence.fromList(TestRunUtil.getModuleTests(DefaultJUnit_Configuration.this.getStateObject().module)));
          } else if (DefaultJUnit_Configuration.this.getStateObject().type == JUnitRunTypes.PROJECT) {
            for (IModule projectModule : mpsProject.getModules()) {
              ListSequence.fromList(all).addSequence(ListSequence.fromList(TestRunUtil.getModuleTests(projectModule)));
            }
          }
        }
      }
    });
    return all;
  }

  private static class MySettingsEditor extends SettingsEditor<DefaultJUnit_Configuration> {
    private DefaultJUnit_Editor myComponent = null;

    public MySettingsEditor() {
    }

    protected void resetEditorFrom(DefaultJUnit_Configuration c) {
      MySettingsEditor.this.myComponent.reset(c);
      MySettingsEditor.this.myComponent.getUsersComponent().reset(c);
    }

    protected void applyEditorTo(DefaultJUnit_Configuration c) {
      MySettingsEditor.this.myComponent.apply(c);
      MySettingsEditor.this.myComponent.getUsersComponent().apply(c);
    }

    @NotNull
    protected JComponent createEditor() {
      this.myComponent = new DefaultJUnit_Editor();
      return this.myComponent;
    }

    protected void disposeEditor() {
      MySettingsEditor.this.myComponent.dispose();
      MySettingsEditor.this.myComponent.getUsersComponent().dispose();
    }
  }

  public static class MyState implements Cloneable {
    public ConfigRunParameters myJavaRunParameters = new ConfigRunParameters();
    public String node;
    public ClonableList<String> nodes = new ClonableList<String>();
    public String model;
    public String module;
    public String method;
    public ClonableList<String> methods = new ClonableList<String>();
    public JUnitRunTypes type;

    public MyState() {
    }

    public Object clone() throws CloneNotSupportedException {
      DefaultJUnit_Configuration.MyState object = (DefaultJUnit_Configuration.MyState) super.clone();
      if (this.myJavaRunParameters != null) {
        object.myJavaRunParameters = (ConfigRunParameters) this.myJavaRunParameters.clone();
      }
      if (this.nodes != null) {
        object.nodes = (ClonableList) this.nodes.clone();
      }
      if (this.methods != null) {
        object.methods = (ClonableList) this.methods.clone();
      }
      return object;
    }
  }
}
