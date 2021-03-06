package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.openapi.util.Disposer;
import java.util.List;
import java.util.Arrays;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;
import javax.swing.SwingUtilities;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;

public class TestTree extends MPSTree implements TestView, Disposable {
  private final Project myProject;
  private final IOperationContext myOperationContext;
  private final TestRunState myState;
  private TestNameMap<TestCaseTreeNode, TestMethodTreeNode> myMap;
  private boolean isAllTree = true;
  private TestTreeIconAnimator myAnimator;

  public TestTree(Project project, TestRunState state, IOperationContext context, Disposable disposable) {
    Disposer.register(disposable, this);
    this.myProject = project;
    this.myState = state;
    this.myOperationContext = context;
    this.myMap = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
    this.isAllTree = !(this.getPreferences().getStateObject().isHidePassed);
    this.myAnimator = new TestTreeIconAnimator(this);
    this.myAnimator.init(state);
  }

  private void updateState(TestMethodTreeNode methodNode, TestCaseTreeNode testCaseNode, TestState testState) {
    methodNode.setState(testState);
    List<TestState> priorityList = Arrays.asList(TestState.IN_PROGRESS, TestState.PASSED, TestState.FAILED, TestState.ERROR, TestState.TERMINATED);
    TestState oldState = testCaseNode.getState();
    if (ListSequence.fromList(priorityList).indexOf(oldState) < ListSequence.fromList(priorityList).indexOf(testState)) {
      if (TestState.PASSED.equals(testState)) {
        for (MPSTreeNode method : testCaseNode) {
          if (!(TestState.PASSED.equals(((TestMethodTreeNode) method).getState()))) {
            return;
          }
        }
      }
      testCaseNode.setState(testState);
    }
  }

  public void update() {
    if (this.myState.getAvailableText() != null) {
      return;
    }
    String loseTest = this.myState.getLoseClass();
    String loseMethod = this.myState.getLoseMethod();
    String test = this.myState.getCurrentClass();
    String method = this.myState.getCurrentMethod();
    final Wrappers._T<TestMethodTreeNode> methodNode = new Wrappers._T<TestMethodTreeNode>();
    if (loseTest != null && loseMethod != null) {
      methodNode.value = this.get(loseTest, loseMethod);
      TestCaseTreeNode testCaseNode = this.get(loseTest);
      if (methodNode.value != null && testCaseNode != null) {
        this.updateState(methodNode.value, testCaseNode, TestState.ERROR);
      }
    } else {
      TestCaseTreeNode testCaseNode = this.get(test);
      methodNode.value = this.get(test, method);
      if (methodNode.value != null && testCaseNode != null) {
        if (this.myState.isTerminated()) {
          this.updateState(methodNode.value, testCaseNode, TestState.TERMINATED);
          this.myAnimator.stopMovie();
        } else if (TestEvent.START_TEST_PREFIX.equals(this.myState.getToken())) {
          this.updateState(methodNode.value, testCaseNode, TestState.IN_PROGRESS);
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              TestTree.this.myAnimator.scheduleRepaint();
            }
          });
          if (this.getPreferences().getStateObject().isTrackRunning) {
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                TestTree.this.setCurrentNode(methodNode.value);
              }
            });
          }
        } else if (TestEvent.END_TEST_PREFIX.equals(this.myState.getToken())) {
          if (TestState.IN_PROGRESS.equals(methodNode.value.getState())) {
            this.updateState(methodNode.value, testCaseNode, TestState.PASSED);
          }
        } else if (TestEvent.FAILURE_TEST_PREFIX.equals(this.myState.getToken())) {
          this.updateState(methodNode.value, testCaseNode, TestState.FAILED);
        } else if (TestEvent.ERROR_TEST_PREFIX.equals(this.myState.getToken())) {
          methodNode.value.setState(TestState.ERROR);
          this.updateState(methodNode.value, testCaseNode, TestState.ERROR);
        }
      }
    }
    if (isFailed(methodNode.value) && this.getPreferences().getStateObject().isSelectFirstFailed) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          TestTree.this.selectFirstDefectNode();
        }
      });
    }
    if (this.getPreferences().getStateObject().isHidePassed) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          TestTree.this.hidePassed(true);
        }
      });
    }
  }

  @Override
  public void dispose() {
    if (!(this.isDisposed())) {
      super.dispose();
    }
    this.myAnimator.dispose();
  }

  public void init() {
    this.rebuildNow();
    this.expandAll();
  }

  public MPSTreeNode rebuild() {
    MPSTreeNode root = new TextTreeNode("Tests");
    this.setRootVisible(false);
    TestNameMap<TestCaseTreeNode, TestMethodTreeNode> temp = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
    for (ITestNodeWrapper testCase : SetSequence.fromSet(MapSequence.fromMap(this.myState.getTestsMap()).keySet())) {
      if (testCase == null) {
        continue;
      }
      TestCaseTreeNode testCaseTreeNode = this.myMap.get(testCase.getFqName());
      if (testCaseTreeNode == null) {
        testCaseTreeNode = new TestCaseTreeNode(this.myOperationContext, testCase);
      }
      testCaseTreeNode.removeAllChildren();
      boolean hasFailedTest = false;
      for (ITestNodeWrapper method : ListSequence.fromList(MapSequence.fromMap(this.myState.getTestsMap()).get(testCase))) {
        TestMethodTreeNode oldMethodTreeNode = this.myMap.get(testCase.getFqName(), method.getName());
        TestMethodTreeNode newMethodTreeNode = new TestMethodTreeNode(this.myOperationContext, method);
        TestMethodTreeNode methodTreeNode = (oldMethodTreeNode == null ?
          newMethodTreeNode :
          oldMethodTreeNode
        );
        boolean isFailedMethod = isFailed(methodTreeNode);
        hasFailedTest = hasFailedTest || isFailedMethod;
        if (this.isAllTree || isFailedMethod) {
          if (methodTreeNode == null) {
            continue;
          }
          testCaseTreeNode.add(methodTreeNode);
          temp.put(testCase, method, methodTreeNode);
        } else {
          temp.put(testCase, method, methodTreeNode);
        }
      }
      if (this.isAllTree || hasFailedTest) {
        root.add(testCaseTreeNode);
        temp.put(testCase, testCaseTreeNode);
      } else {
        temp.put(testCase, testCaseTreeNode);
      }
    }
    this.myMap = temp;
    return root;
  }

  public boolean hasFailedTests() {
    for (final ITestNodeWrapper testCase : SetSequence.fromSet(MapSequence.fromMap(this.myState.getTestsMap()).keySet())) {
      if (testCase == null) {
        continue;
      }
      for (final ITestNodeWrapper method : ListSequence.fromList(MapSequence.fromMap(this.myState.getTestsMap()).get(testCase))) {
        final Wrappers._T<String> className = new Wrappers._T<String>();
        final Wrappers._T<String> methodName = new Wrappers._T<String>();
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            className.value = testCase.getFqName();
            methodName.value = method.getName();
          }
        });
        TestMethodTreeNode treeNode = this.myMap.get(className.value, methodName.value);
        if (method == null) {
          continue;
        }
        if (!(isPassed(treeNode))) {
          return true;
        }
      }
    }
    return false;
  }

  public void hidePassed(boolean hide) {
    this.isAllTree = !(hide);
    this.rebuildNow();
    this.expandAll();
  }

  public void buildFailedTestTree() {
    this.isAllTree = false;
    this.rebuildNow();
  }

  public List<String> getMethodName() {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    for (List<ITestNodeWrapper> values : MapSequence.fromMap(this.myState.getTestsMap()).values()) {
      for (ITestNodeWrapper value : values) {
        ListSequence.fromList(result).addElement(value.getName());
      }
    }
    return result;
  }

  public TestCaseTreeNode get(String className) {
    return this.myMap.get(className);
  }

  public TestMethodTreeNode get(String className, String methodName) {
    return this.myMap.get(className, methodName);
  }

  public void selectFirstDefectNode() {
    for (final ITestNodeWrapper testCase : SetSequence.fromSet(MapSequence.fromMap(this.myState.getTestsMap()).keySet())) {
      for (final ITestNodeWrapper method : ListSequence.fromList(MapSequence.fromMap(this.myState.getTestsMap()).get(testCase))) {
        final Wrappers._T<String> className = new Wrappers._T<String>();
        final Wrappers._T<String> methodName = new Wrappers._T<String>();
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            className.value = testCase.getFqName();
            methodName.value = method.getName();
          }
        });
        TestMethodTreeNode testMethodTreeNode = this.myMap.get(className.value, methodName.value);
        if (isFailed(testMethodTreeNode)) {
          this.setCurrentNode(testMethodTreeNode);
          return;
        }
      }
    }
  }

  public JUnitTestActionOptions_PreferencesComponent getPreferences() {
    return this.myProject.getComponent(ProjectPluginManager.class).getPrefsComponent(JUnitTestActionOptions_PreferencesComponent.class);
  }

  public static boolean isFailed(MPSTreeNode node) {
    if (node == null || !(node.isLeaf())) {
      return false;
    }
    TestMethodTreeNode leaf = (TestMethodTreeNode) node;
    TestState state = leaf.getState();
    return state.equals(TestState.ERROR) || state.equals(TestState.FAILED);
  }

  public static boolean isPassed(TestMethodTreeNode method) {
    if (method == null) {
      return true;
    }
    return method.getState() != null && method.getState().equals(TestState.PASSED);
  }
}
