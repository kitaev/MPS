package jetbrains.mps.execution.configurations.runtime;

/*Generated by MPS */

import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.openapi.project.Project;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.executors.DefaultRunExecutor;

public abstract class BaseMpsRunConfiguration extends RunConfigurationBase {
  public BaseMpsRunConfiguration(Project project, ConfigurationFactory factory, String name) {
    super(project, factory, name);
  }

  public boolean canExecute(String executorId) {
    return DefaultRunExecutor.EXECUTOR_ID.equals(executorId);
  }
}
