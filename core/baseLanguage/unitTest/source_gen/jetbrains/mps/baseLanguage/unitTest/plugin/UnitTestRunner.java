package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.BaseRunner;
import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.util.plugin.run.ConfigRunParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.execution.process.ProcessNotCreatedException;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestable_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.io.File;
import jetbrains.mps.util.FileUtil;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.LinkedHashSet;

public class UnitTestRunner extends BaseRunner {
  private static final int MAX_COMMAND_LINE = 16384;
  private static Logger LOG = Logger.getLogger(UnitTestRunner.class);

  private ProcessBuilder myProcessBuilder;
  private final List<SNode> myTestable = new ArrayList<SNode>();

  public UnitTestRunner(List<SNode> testable, ConfigRunParameters parameters) {
    super(parameters);
    ListSequence.fromList(this.myTestable).addSequence(ListSequence.fromList(testable));
  }

  public Process run() throws ProcessNotCreatedException {
    return this.run(this.myTestable);
  }

  @Nullable
  public Process run(final List<SNode> tests) throws ProcessNotCreatedException {
    if (ListSequence.fromList(tests).isEmpty()) {
      return null;
    }

    final Wrappers._T<TestRunParameters> runParams = new Wrappers._T<TestRunParameters>();
    final Wrappers._T<List<SNode>> testsToRun = new Wrappers._T<List<SNode>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        runParams.value = ITestable_Behavior.call_getTestRunParameters_1216045139515(ListSequence.fromList(tests).first());
        testsToRun.value = ListSequence.fromList(tests).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return eq_y7hhub_a0a0a0a0a0a0b0a0a0a0e0b(check_y7hhub_a0a0a0a0a1a0e0b(it), runParams.value);
          }
        }).toListSequence();
        ListSequence.fromList(tests).visitAll(new IVisitor<SNode>() {
          public void visit(SNode it) {
            if (!(eq_y7hhub_a0a0a0a0a0a2a0a0a0a4a1(check_y7hhub_a0a0a0a0c0a4a1(it), runParams.value))) {
              LOG.error("Can not execute " + it + ": run parameters does not match.");
            }
          }
        });
      }
    });
    return this.runTestWithParameters(runParams.value, testsToRun.value);
  }

  private Process runTestWithParameters(final TestRunParameters parameters, final List<SNode> tests) throws ProcessNotCreatedException {
    final List<String> params = ListSequence.fromList(new ArrayList<String>());
    final Wrappers._T<String> workingDir = new Wrappers._T<String>(null);
    final Wrappers._T<String> programParams = new Wrappers._T<String>(null);
    final Wrappers._T<String> vmParams = new Wrappers._T<String>(null);
    final Wrappers._T<String> classpathString = new Wrappers._T<String>();
    final Wrappers._T<List<String>> testsCommandLine = new Wrappers._T<List<String>>();
    final Wrappers._long testCommandLineLength = new Wrappers._long(0);

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (UnitTestRunner.this.myRunParameters != null) {
          workingDir.value = UnitTestRunner.this.myRunParameters.getWorkingDirectory();
          programParams.value = UnitTestRunner.this.myRunParameters.getProgramParameters();
          vmParams.value = UnitTestRunner.this.myRunParameters.getVMParameters();
        }

        UnitTestRunner.this.addJavaCommand(params);

        ListSequence.fromList(params).addSequence(ListSequence.fromList(parameters.getVmParameters()));
        if (vmParams.value != null && StringUtils.isNotEmpty(vmParams.value)) {
          String[] paramList = UnitTestRunner.this.splitParams(vmParams.value);
          ListSequence.fromList(params).addSequence(Sequence.fromIterable(Sequence.fromArray(paramList)));
        }

        classpathString.value = UnitTestRunner.this.getClasspathString(tests, parameters.getClassPath());
        UnitTestRunner.this.addClassPath(params, classpathString.value);

        ListSequence.fromList(params).addElement(parameters.getTestRunner());

        testsCommandLine.value = ListSequence.fromList(new ArrayList<String>(ListSequence.fromList(tests).count()));
        for (SNode test : ListSequence.fromList(tests)) {
          List<String> parametersPart = ITestable_Behavior.call_getParametersPart_1215620460293(test);
          testCommandLineLength.value = ListSequence.fromList(parametersPart).foldLeft(testCommandLineLength.value, new ILeftCombinator<String, Long>() {
            public Long combine(Long s, String it) {
              return s + it.length();
            }
          });
          ListSequence.fromList(testsCommandLine.value).addSequence(ListSequence.fromList(parametersPart));
        }
      }
    });

    // on win command line length is restricted to 32767=2**15-1 symbols 
    // according to http://blogs.msdn.com/b/oldnewthing/archive/2003/12/10/56028.aspx 
    // so I use nice and round number 16384=2**14-1 as an upper bound 
    if (classpathString.value.length() + testCommandLineLength.value < MAX_COMMAND_LINE) {
      ListSequence.fromList(params).addSequence(ListSequence.fromList(testsCommandLine.value));
    } else {
      // if we are to long, we have to write everything into the tmp file 
      File tmpFile = FileUtil.createTmpFile();
      // we want to be sure that file is deleted, even when process is not started 
      tmpFile.deleteOnExit();
      try {
        PrintWriter writer = new PrintWriter(tmpFile);
        for (String commandLinePiece : ListSequence.fromList(testsCommandLine.value)) {
          writer.append(commandLinePiece);
          writer.append("\n");
        }
        writer.flush();
        writer.close();
        ListSequence.fromList(params).addElement("-f");
        ListSequence.fromList(params).addElement(tmpFile.getAbsolutePath());
      } catch (FileNotFoundException e) {
        throw new ProcessNotCreatedException("Could not output run parameters to file " + tmpFile, this.getCommandLine(this.myRunParameters.getWorkingDirectory()));
      }
    }

    if (programParams.value != null && StringUtils.isNotEmpty(programParams.value)) {
      String[] paramList = this.splitParams(programParams.value);
      ListSequence.fromList(params).addSequence(Sequence.fromIterable(Sequence.fromArray(paramList)));
    }

    this.myProcessBuilder = new ProcessBuilder(params);

    if (workingDir.value != null && StringUtils.isNotEmpty(workingDir.value)) {
      this.myProcessBuilder.directory(new File(workingDir.value));
    }


    try {
      return this.myProcessBuilder.start();
    } catch (Throwable e) {
      LOG.error("Can't run tests: " + e.getMessage(), e);
      throw new ProcessNotCreatedException(e.getMessage(), e, this.getCommandLine(this.myRunParameters.getWorkingDirectory()));
    }
  }

  public String getCommandString() {
    if (this.myProcessBuilder == null) {
      return null;
    }
    return this.getCommandString(this.myProcessBuilder);
  }

  public String getClasspathString(List<SNode> list, List<String> additionalClassPath) {
    Set<IModule> uniqModules = SetSequence.fromSet(new HashSet<IModule>());
    for (SNode testable : list) {
      IModule module = SNodeOperations.getModel(testable).getModelDescriptor().getModule();
      SetSequence.fromSet(uniqModules).addElement(module);
    }
    Set<String> classpath = SetSequence.fromSet(new LinkedHashSet<String>());
    for (IModule module : uniqModules) {
      SetSequence.fromSet(classpath).addSequence(SetSequence.fromSet(BaseRunner.getModuleClasspath(module, true)));
    }
    ListSequence.fromList(additionalClassPath).addSequence(SetSequence.fromSet(classpath));

    StringBuffer buff = new StringBuffer();
    for (String path : additionalClassPath) {
      buff.append(path).append(BaseRunner.ps());
    }
    return buff.toString();
  }

  private static TestRunParameters check_y7hhub_a0a0a0a0a1a0e0b(SNode p) {
    if (null == p) {
      return null;
    }
    return ITestable_Behavior.call_getTestRunParameters_1216045139515(p);
  }

  private static TestRunParameters check_y7hhub_a0a0a0a0c0a4a1(SNode p) {
    if (null == p) {
      return null;
    }
    return ITestable_Behavior.call_getTestRunParameters_1216045139515(p);
  }

  private static boolean eq_y7hhub_a0a0a0a0a0a0b0a0a0a0e0b(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_y7hhub_a0a0a0a0a0a2a0a0a0a4a1(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
