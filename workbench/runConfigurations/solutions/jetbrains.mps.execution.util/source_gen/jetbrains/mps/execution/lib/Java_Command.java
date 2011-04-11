package jetbrains.mps.execution.lib;

/*Generated by MPS */

import java.io.File;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.util.FileUtil;
import java.io.PrintWriter;
import jetbrains.mps.execution.runtime.ProcessHandlerBuilder;
import java.io.FileNotFoundException;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.debug.api.Debuggers;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.reloading.ClasspathStringCollector;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.reloading.CommonPaths;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import org.apache.commons.lang.StringUtils;

public class Java_Command {
  private File myWorkingDirectory = new File(System.getProperty("user.home"));
  private String myJrePath = Java_Command.getJdkHome();
  private String myProgramParameter;
  private String myVirtualMachineParameter;
  private String myClassName;
  private List<String> myClassPath = ListSequence.fromList(new ArrayList<String>());

  public Java_Command() {
  }

  public Java_Command setWorkingDirectory(File workingDirectory) {
    if (workingDirectory != null) {
      myWorkingDirectory = workingDirectory;
    }
    return this;
  }

  public Java_Command setJrePath(String jrePath) {
    if (jrePath != null) {
      myJrePath = jrePath;
    }
    return this;
  }

  public Java_Command setProgramParameter(String programParameter) {
    if (programParameter != null) {
      myProgramParameter = programParameter;
    }
    return this;
  }

  public Java_Command setVirtualMachineParameter(String virtualMachineParameter) {
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter = virtualMachineParameter;
    }
    return this;
  }

  public Java_Command setClassName(String className) {
    if (className != null) {
      myClassName = className;
    }
    return this;
  }

  public Java_Command setClassPath(List<String> classPath) {
    if (classPath != null) {
      myClassPath = classPath;
    }
    return this;
  }

  public ProcessHandler createProcess() throws ExecutionException {
    String java = Java_Command.getJavaCommand(myJrePath);
    String classPathString = IterableUtils.join(ListSequence.fromList(myClassPath), Java_Command.ps());
    if (check_yvpt_a0c0a(myProgramParameter) >= Java_Command.getMaxCommandLine()) {
      File tmpFile = FileUtil.createTmpFile();
      // we want to be sure that file is deleted, even when process is not started 
      tmpFile.deleteOnExit();
      try {
        PrintWriter writer = new PrintWriter(tmpFile);
        writer.append(myProgramParameter);
        writer.flush();
        writer.close();
        return new ProcessHandlerBuilder().append(java).append(myVirtualMachineParameter).appendKey("classpath", classPathString).append(ClassRunner.class.getName()).appendKey(ClassRunner.CLASS_PREFIX, myClassPath).appendKey(ClassRunner.FILE_PREFIX, tmpFile.getAbsolutePath()).build(myWorkingDirectory);
      } catch (FileNotFoundException e) {
        throw new ExecutionException("Could not create temporal file for program parameters.", e);
      }
    } else {
      return new ProcessHandlerBuilder().append(java).append(myVirtualMachineParameter).appendKey("classpath", classPathString).append(myClassName).append(myProgramParameter).build(myWorkingDirectory);
    }
  }

  public static IDebugger getDebugger() {
    return Debuggers.getInstance().getDebuggerByName("Java");
  }

  private static int getMaxCommandLine() {
    return 16384;
  }

  public static List<String> getClasspath(final SNode node) {
    final Wrappers._T<IModule> module = new Wrappers._T<IModule>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        module.value = SNodeOperations.getModel(node).getModelDescriptor().getModule();
      }
    });
    return Java_Command.getClasspath(module.value, true);
  }

  public static List<String> getClasspath(final IModule module, boolean withDependencies) {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    if (module.getClassesGen() != null) {
      ListSequence.fromList(result).addElement(module.getClassesGen().getAbsolutePath());
    }

    final ClasspathStringCollector visitor = new ClasspathStringCollector(result);
    module.getClassPathItem().accept(visitor);
    if (withDependencies) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          AbstractModule.getDependenciesClasspath(CollectionUtil.set(module), true).accept(visitor);
        }
      });
    }

    List<String> visited = visitor.getResultAndReInit();
    visited.removeAll(CommonPaths.getJDKPath());

    return visited;
  }

  public static String getJavaCommand(String javaHome) {
    String result = javaHome + Java_Command.fs() + "bin" + Java_Command.fs();
    String osName = System.getProperty("os.name");
    if (osName.startsWith("Mac OS")) {
      return result + "java";
    } else
    if (osName.startsWith("Windows")) {
      return result + "java.exe";
    } else {
      return result + "java";
    }

  }

  public static String fs() {
    return System.getProperty("file.separator");
  }

  public static String ps() {
    return System.getProperty("path.separator");
  }

  public static List<String> getJavaHomes() {
    String systemJavaHome = System.getProperty("java.home");
    List<String> homes = ListSequence.fromList(new LinkedList<String>());
    String systemJdkHome = systemJavaHome.substring(0, systemJavaHome.length() - "/jre".length());
    if (systemJavaHome.endsWith("jre") && new File(systemJdkHome + File.separator + "bin").exists()) {
      ListSequence.fromList(homes).addElement(systemJdkHome);
    }
    if (StringUtils.isNotEmpty(System.getenv("JAVA_HOME"))) {
      ListSequence.fromList(homes).addElement(System.getenv("JAVA_HOME"));
    }
    ListSequence.fromList(homes).addElement(systemJavaHome);
    return homes;
  }

  public static String getJdkHome() {
    List<String> homes = Java_Command.getJavaHomes();
    for (String javaHome : ListSequence.fromList(homes)) {
      if (new File(Java_Command.getJavaCommand(javaHome)).exists()) {
        return javaHome;
      }
    }
    return ListSequence.fromList(homes).first();
  }

  private static int check_yvpt_a0c0a(String checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.length();
    }
    return 0;
  }
}
