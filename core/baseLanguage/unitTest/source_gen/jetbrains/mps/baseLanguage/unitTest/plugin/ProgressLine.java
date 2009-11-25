package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.openapi.progress.util.ColorProgressBar;
import javax.swing.JLabel;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import jetbrains.mps.util.EqualUtil;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestMethod_Behavior;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.application.ApplicationManager;

public class ProgressLine extends JPanel {
  private final ColorProgressBar progressBar = new ColorProgressBar();
  private final JLabel state = new JLabel("Starting...");
  private final ProgressLine.StateInfo stateInfo = new ProgressLine.StateInfo();
  private boolean testsBuilt = false;
  private List<String> testMethods = ListSequence.fromList(new ArrayList<String>());
  private List<String> lostMethods = ListSequence.fromList(new ArrayList<String>());
  private List<String> currentLostMethods = ListSequence.fromList(new ArrayList<String>());

  public ProgressLine() {
    super(new GridLayout(1, 2));
    this.add(this.state);
    final JPanel progress = new JPanel(new GridBagLayout());
    this.add(progress);
    progress.add(this.progressBar, new GridBagConstraints(0, 0, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
    this.testsBuilt = true;
    this.progressBar.setColor(ColorProgressBar.GREEN);
  }

  private boolean isLastTestCase() {
    if (ListSequence.fromList(this.testMethods).count() <= 1) {
      return true;
    }
    String testCaseName = null;
    for (String testMethod : this.testMethods) {
      String nextTestCaseName = testMethod.substring(0, testMethod.lastIndexOf("."));
      if (EqualUtil.equals(testCaseName, nextTestCaseName) || testCaseName == null) {
        testCaseName = nextTestCaseName;
      } else {
        return false;
      }
    }
    return true;
  }

  public void setTests(Map<SNode, List<SNode>> testsMap) {
    for (SNode testCase : MapSequence.fromMap(testsMap).keySet()) {
      for (SNode testMethod : MapSequence.fromMap(testsMap).get(testCase)) {
        ListSequence.fromList(this.testMethods).addElement(ITestCase_Behavior.call_getClassName_1216136193905(testCase) + '.' + ITestMethod_Behavior.call_getTestName_1216136419751(testMethod));
      }
    }
    this.stateInfo.setTotal(ListSequence.fromList(this.testMethods).count());
  }

  public List<String> getCurrentLostTests() {
    List<String> list = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(list).addSequence(ListSequence.fromList(this.currentLostMethods));
    ListSequence.fromList(this.currentLostMethods).clear();
    return list;
  }

  public void onEvent(TestEvent event) {
    this.onEvent(event.getTestCaseName(), event.getTestMethodName(), event.getToken());
  }

  public void onEvent(String testClassName, String testMethodName, String token) {
    String key = testClassName + '.' + testMethodName;
    if (!(ListSequence.fromList(this.testMethods).contains(key))) {
      return;
    }
    if (token.equals(TestEvent.END_TEST_PREFIX) || token.equals(TestEvent.ERROR_TEST_SUFFIX) || token.equals(TestEvent.FAILURE_TEST_SUFFIX)) {
      this.stateInfo.onComplete();
      if (token.equals(TestEvent.ERROR_TEST_SUFFIX) || token.equals(TestEvent.FAILURE_TEST_SUFFIX)) {
        this.stateInfo.onDefect();
        this.progressBar.setColor(ColorProgressBar.RED);
      }
      ListSequence.fromList(this.testMethods).removeElement(key);
      ListSequence.fromList(this.currentLostMethods).clear();
    } else {
      int indexOfMethod = ListSequence.fromList(this.testMethods).indexOf(key);
      if (indexOfMethod > 0) {
        for (int i = 0; i < indexOfMethod; i++) {
          String currentTestMethod = ListSequence.fromList(this.testMethods).getElement(i);
          if (ListSequence.fromList(this.lostMethods).contains(currentTestMethod)) {
            continue;
          }
          String currentClassName = currentTestMethod.substring(0, currentTestMethod.lastIndexOf("."));
          if (currentClassName.equals(testClassName) && !(this.isLastTestCase())) {
            continue;
          }
          ListSequence.fromList(this.currentLostMethods).addElement(currentTestMethod);
          ListSequence.fromList(this.lostMethods).addElement(currentTestMethod);
        }
      }
    }
    this.stateInfo.setTestName(testMethodName, testClassName);
    this.progressBar.setFraction(this.stateInfo.getCompletedPercent());
    this.stateInfo.updateLabel(this.state);
  }

  public void onProcessStarted(final ProcessHandler processHandler) {
    if (this.testsBuilt) {
      return;
    }
    processHandler.addProcessListener(new ProcessAdapter() {
      @Override
      public void processTerminated(ProcessEvent p0) {
        ApplicationManager.getApplication().invokeLater(new Runnable() {
          public void run() {
            if (!(ProgressLine.this.testsBuilt) && ProgressLine.this.progressBar.getFraction() == 0.0) {
              ProgressLine.this.progressBar.setColor(ColorProgressBar.RED);
              ProgressLine.this.progressBar.setFraction(1.0);
              ProgressLine.this.state.setText("Failed to start");
            }
          }
        });
      }
    });
  }

  public static class StateInfo {
    private int total = 0;
    private int completed = 0;
    private int defects = 0;
    private String testName = "";

    public StateInfo() {
    }

    public void onComplete() {
      this.completed++;
    }

    public void onDefect() {
      this.defects++;
    }

    public void setTestName(String name, String className) {
      this.testName = name;
    }

    public void setTotal(int total) {
      this.total = total;
    }

    public double getCompletedPercent() {
      return (double)this.completed / (double)this.total;
    }

    public void updateLabel(final JLabel label) {
      StringBuilder sb = new StringBuilder();
      if (this.total == this.completed) {
        sb.append(" Done: " + this.completed + " of " + this.total + " ");
        this.testName = "";
      }
      if (this.defects > 0) {
        sb.append(" Failed: " + this.defects);
      } else if (sb.length() == 0) {
        sb.append(" Running: " + this.completed + " of " + this.total);
      }
      label.setText(sb + "  " + this.testName);
    }
  }
}
