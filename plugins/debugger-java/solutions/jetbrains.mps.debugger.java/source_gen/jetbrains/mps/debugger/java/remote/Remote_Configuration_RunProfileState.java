package jetbrains.mps.debugger.java.remote;

/*Generated by MPS */

import jetbrains.mps.debug.api.run.DebuggerRunProfileState;
import com.intellij.execution.configurations.RunProfileState;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationPerRunnerSettings;
import com.intellij.execution.configurations.RunnerSettings;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.ExecutionException;
import com.intellij.openapi.project.Project;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.impl.ConsoleViewImpl;
import jetbrains.mps.execution.configurations.runtime.ConsoleProcessListener;
import jetbrains.mps.execution.configurations.runtime.DefaultExecutionResult;
import jetbrains.mps.execution.configurations.runtime.DefaultExecutionConsole;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.debug.api.Debuggers;
import jetbrains.mps.debug.api.IDebuggerSettings;
import com.intellij.execution.executors.DefaultDebugExecutor;

public class Remote_Configuration_RunProfileState extends DebuggerRunProfileState implements RunProfileState {
  @NotNull
  private final Remote_Configuration myRunConfiguration;
  @NotNull
  private final ExecutionEnvironment myEnvironment;

  public Remote_Configuration_RunProfileState(@NotNull Remote_Configuration configuration, @NotNull Executor executor, @NotNull ExecutionEnvironment environment) {
    myRunConfiguration = configuration;
    myEnvironment = environment;
  }

  public ConfigurationPerRunnerSettings getConfigurationSettings() {
    return null;
  }

  public RunnerSettings getRunnerSettings() {
    return null;
  }

  @Nullable
  public ExecutionResult execute(Executor executor, @NotNull ProgramRunner runner) throws ExecutionException {
    Project project = myEnvironment.getProject();
    RemoteProcessHandler handler = new RemoteProcessHandler(project);
    {
      ProcessHandler _processHandler = handler;
      final ConsoleViewImpl _consoleView = new ConsoleViewImpl(project, false);
      _processHandler.addProcessListener(new ConsoleProcessListener(_consoleView));
      return new DefaultExecutionResult(_processHandler, new DefaultExecutionConsole(_consoleView.getComponent(), new _FunctionTypes._void_P0_E0() {
        public void invoke() {
          _consoleView.dispose();
        }
      }));
    }
  }

  public IDebugger getDebugger() {
    return Debuggers.getInstance().getDebuggerByName("Java");
  }

  @Nullable
  protected IDebuggerSettings createDebuggerSettings() {
    return myRunConfiguration.getSettings();
  }

  public static boolean canExecute(String executorId) {
    if (DefaultDebugExecutor.EXECUTOR_ID.equals(executorId)) {
      return true;
    }
    return false;
  }
}
