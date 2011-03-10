package jetbrains.mps.runConfigurations.runtime;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.process.ProcessAdapter;
import java.io.File;
import com.intellij.execution.process.ProcessListener;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.io.IOException;

public class ProcessHandlerBuilder {
  private final List<String> myCommandLine = ListSequence.fromList(new ArrayList<String>());

  public ProcessHandlerBuilder() {
  }

  public ProcessHandlerBuilder append(@Nullable String command) {
    if (!(StringUtils.isEmpty(command))) {
      String[] commandParts = splitCommandInParts(command);
      ListSequence.fromList(myCommandLine).addSequence(Sequence.fromIterable(Sequence.fromArray(commandParts)).where(new IWhereFilter<String>() {
        public boolean accept(String it) {
          return StringUtils.isNotEmpty(it);
        }
      }));
    }
    return this;
  }

  public ProcessHandlerBuilder append(String... command) {
    for (String commandPart : Sequence.fromIterable(Sequence.fromArray(command))) {
      append(commandPart);
    }
    return this;
  }

  public ProcessHandlerBuilder append(@NotNull List<String> command) {
    for (String commandPart : ListSequence.fromList(command)) {
      append(commandPart);
    }
    return this;
  }

  public ProcessHandlerBuilder appendKey(@Nullable String key, @Nullable String parameter) {
    if (StringUtils.isNotEmpty(key) && StringUtils.isNotEmpty(parameter)) {
      return append("-" + key).append(parameter);
    }
    return this;
  }

  public ProcessHandlerBuilder appendKey(@Nullable String key, String... parameter) {
    if (StringUtils.isNotEmpty(key) && parameter.length > 0) {
      return append("-" + key).append(parameter);
    }
    return this;
  }

  public ProcessHandlerBuilder appendKey(@Nullable String key, @NotNull List<String> parameters) {
    if (StringUtils.isNotEmpty(key) && ListSequence.fromList(parameters).isNotEmpty()) {
      return append("-" + key).append(parameters);
    }
    return this;
  }

  public ProcessHandler build() throws ExecutionException {
    return build(new ProcessAdapter() {}, new File(System.getProperty("user.dir")));
  }

  public ProcessHandler build(@NotNull ProcessListener listener) throws ExecutionException {
    return build(listener, new File(System.getProperty("user.dir")));
  }

  public ProcessHandler build(@NotNull File workingDirectory) throws ExecutionException {
    return build(new ProcessAdapter() {}, workingDirectory);
  }

  public ProcessHandler build(@NotNull ProcessListener listener, @NotNull File workingDirectory) throws ExecutionException {
    if (!(workingDirectory.exists())) {
      throw new ExecutionException("Working directory " + workingDirectory + " does not exist.");
    }
    ProcessBuilder builder = new ProcessBuilder(ListSequence.fromList(myCommandLine).toGenericArray(String.class));
    builder.directory(workingDirectory);
    try {
      Process process = builder.start();
      DefaultProcessHandler processHandler = new DefaultProcessHandler(process, ListSequence.fromList(myCommandLine).foldLeft("", new ILeftCombinator<String, String>() {
        public String combine(String s, String it) {
          return (StringUtils.isEmpty(s) ?
            it :
            s + " " + it
          );
        }
      }), listener);
      return processHandler;
    } catch (IOException e) {
      throw new ExecutionException("Start process failed", e);
    }
  }

  private String[] splitCommandInParts(@NotNull String command) {
    return command.split("(\\s)+");
  }
}
