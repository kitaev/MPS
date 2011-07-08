package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import java.io.File;
import com.intellij.execution.process.ProcessHandler;
import java.util.List;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.JavaRunParameters;
import com.intellij.execution.ExecutionException;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import jetbrains.mps.execution.lib.Java_Command;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.LinkedHashSet;
import jetbrains.mps.debug.api.run.IDebuggerConfiguration;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.debug.api.IDebuggerSettings;
import jetbrains.mps.debug.runtime.settings.LocalConnectionSettings;
import jetbrains.mps.debug.api.Debuggers;

public class Junit_Command {
  private String myDebuggerSettings;
  private String myVirtualMachineParameter;
  private String myJrePath;
  private File myWorkingDirectory = new File(System.getProperty("user.home"));

  public Junit_Command() {
  }

  public Junit_Command setDebuggerSettings(String debuggerSettings) {
    if (debuggerSettings != null) {
      myDebuggerSettings = debuggerSettings;
    }
    return this;
  }

  public Junit_Command setVirtualMachineParameter(String virtualMachineParameter) {
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter = virtualMachineParameter;
    }
    return this;
  }

  public Junit_Command setJrePath(String jrePath) {
    if (jrePath != null) {
      myJrePath = jrePath;
    }
    return this;
  }

  public Junit_Command setWorkingDirectory(File workingDirectory) {
    if (workingDirectory != null) {
      myWorkingDirectory = workingDirectory;
    }
    return this;
  }

  public ProcessHandler createProcess(List<ITestNodeWrapper> tests, JavaRunParameters javaRunParameters) throws ExecutionException {
    return new Junit_Command().setVirtualMachineParameter(check_u7m9j_a1a0a0a(javaRunParameters)).setJrePath((check_u7m9j_a0c0a0a0(javaRunParameters) ?
      javaRunParameters.jrePath() :
      null
    )).setWorkingDirectory((StringUtils.isEmpty(check_u7m9j_a0a3a0a0a(javaRunParameters)) ?
      null :
      new File(javaRunParameters.workingDirectory())
    )).setDebuggerSettings(myDebuggerSettings).createProcess(tests);
  }

  public ProcessHandler createProcess(List<ITestNodeWrapper> tests) throws ExecutionException {
    Tuples._2<List<ITestNodeWrapper>, TestRunParameters> testsToRun = Junit_Command.getTestsToRunWithParameters(tests);
    return new Java_Command().setVirtualMachineParameter(IterableUtils.join(ListSequence.fromList(testsToRun._1().getVmParameters()), " ")).setDebuggerSettings(myDebuggerSettings).setClassPath(ListSequence.fromList(testsToRun._1().getClassPath()).union(ListSequence.fromList(Junit_Command.getClasspath(testsToRun._0()))).toListSequence()).setJrePath(myJrePath).setWorkingDirectory(myWorkingDirectory).setProgramParameter(Junit_Command.getProgramParameters(testsToRun._0())).createProcess(testsToRun._1().getTestRunner());
  }

  public static IDebugger getDebugger() {
    return getDebuggerConfiguration().getDebugger();
  }

  private static String getProgramParameters(final List<ITestNodeWrapper> tests) {
    final Wrappers._T<List<String>> testsCommandLine = new Wrappers._T<List<String>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        testsCommandLine.value = ListSequence.fromList(new ArrayList<String>(ListSequence.fromList(tests).count()));
        for (ITestNodeWrapper test : ListSequence.fromList(tests)) {
          List<String> parametersPart = ListSequence.fromListAndArray(new ArrayList<String>(), (test.isTestCase() ?
            "-c" :
            "-m"
          ), test.getFqName());
          ListSequence.fromList(testsCommandLine.value).addSequence(ListSequence.fromList(parametersPart));
        }
      }
    });
    return IterableUtils.join(ListSequence.fromList(testsCommandLine.value), " ");
  }

  private static Tuples._2<List<ITestNodeWrapper>, TestRunParameters> getTestsToRunWithParameters(final List<ITestNodeWrapper> tests) throws ExecutionException {
    final Wrappers._T<TestRunParameters> runParams = new Wrappers._T<TestRunParameters>();
    final Wrappers._T<List<ITestNodeWrapper>> testsToRun = new Wrappers._T<List<ITestNodeWrapper>>();
    final Wrappers._boolean ok = new Wrappers._boolean(true);
    if (ListSequence.fromList(tests).isEmpty()) {
      return MultiTuple.<List<ITestNodeWrapper>,TestRunParameters>from(ListSequence.fromList(new ArrayList<ITestNodeWrapper>()), new TestRunParameters());
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        runParams.value = ListSequence.fromList(tests).first().getTestRunParameters();
        testsToRun.value = ListSequence.fromList(tests).where(new IWhereFilter<ITestNodeWrapper>() {
          public boolean accept(ITestNodeWrapper it) {
            return eq_yo2c7x_a0a0a0a0a0a0b0a0a0a0e0c(check_u7m9j_a0a0a0a0a1a0e0b(it), runParams.value);
          }
        }).toListSequence();
        ListSequence.fromList(tests).visitAll(new IVisitor<ITestNodeWrapper>() {
          public void visit(ITestNodeWrapper it) {
            if (!(eq_yo2c7x_a0a0a0a0a0a2a0a0a0a4a2(check_u7m9j_a0a0a0a0c0a4a1(it), runParams.value))) {
              ok.value = false;
            }
          }
        });
      }
    });
    if (!(ok.value)) {
      throw new ExecutionException("Can not execute tests " + ": run parameters does not match.");
    }
    return MultiTuple.<List<ITestNodeWrapper>,TestRunParameters>from(testsToRun.value, runParams.value);
  }

  private static List<String> getClasspath(final List<ITestNodeWrapper> tests) {
    final Set<IModule> uniqueModules = SetSequence.fromSet(new HashSet<IModule>());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (ITestNodeWrapper testable : tests) {
          IModule module = SNodeOperations.getModel(testable.getNode()).getModelDescriptor().getModule();
          SetSequence.fromSet(uniqueModules).addElement(module);
        }
      }
    });
    Set<String> classpath = SetSequence.fromSet(new LinkedHashSet<String>());
    for (IModule module : uniqueModules) {
      SetSequence.fromSet(classpath).addSequence(ListSequence.fromList(Java_Command.getClasspath(module, true)));
    }
    return SetSequence.fromSet(classpath).toListSequence();
  }

  public static IDebuggerConfiguration getDebuggerConfiguration() {
    return new IDebuggerConfiguration() {
      @Nullable
      public IDebuggerSettings createDebuggerSettings() {
        return new LocalConnectionSettings(true);
      }

      public IDebugger getDebugger() {
        return Debuggers.getInstance().getDebuggerByName("Java");
      }
    };
  }

  private static String check_u7m9j_a1a0a0a(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.vmOptions();
    }
    return null;
  }

  private static boolean check_u7m9j_a0c0a0a0(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return (boolean) checkedDotOperand.useAlternativeJre();
    }
    return false;
  }

  private static String check_u7m9j_a0a3a0a0a(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.workingDirectory();
    }
    return null;
  }

  private static TestRunParameters check_u7m9j_a0a0a0a0a1a0e0b(ITestNodeWrapper checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTestRunParameters();
    }
    return null;
  }

  private static TestRunParameters check_u7m9j_a0a0a0a0c0a4a1(ITestNodeWrapper checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTestRunParameters();
    }
    return null;
  }

  private static boolean eq_yo2c7x_a0a0a0a0a0a0b0a0a0a0e0c(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_yo2c7x_a0a0a0a0a0a2a0a0a0a4a2(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
