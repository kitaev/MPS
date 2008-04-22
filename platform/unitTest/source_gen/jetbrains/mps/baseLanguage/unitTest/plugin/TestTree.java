package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.smodel.IOperationContext;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.LinkedHashMap;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.MapOperations;

public class TestTree extends MPSTree {

  private IOperationContext operationContext;
  private Map<SNode, List<SNode>> tests;
  private TestNameMap<TestCaseTreeNode, TestMethodTreeNode> map;

  public  TestTree() {
    this.tests = new LinkedHashMap<SNode, List<SNode>>();
    this.map = new TestNameMap<TestCaseTreeNode, TestMethodTreeNode>();
  }

  public MPSTreeNode rebuild() {
    MPSTreeNode root = new TextTreeNode("Tests");
    this.map.clear();
    {
      ICursor<SNode> _zCursor3 = CursorFactory.createCursor(MapOperations.keys(this.tests));
      try {
        while(_zCursor3.moveToNext()) {
          SNode testCase = _zCursor3.getCurrent();
          {
            TestCaseTreeNode testCaseTreeNode = new TestCaseTreeNode(this.operationContext, testCase);
            root.add(testCaseTreeNode);
            this.map.put(testCase, testCaseTreeNode);
            {
              ICursor<SNode> _zCursor4 = CursorFactory.createCursor(this.tests.get(testCase));
              try {
                while(_zCursor4.moveToNext()) {
                  SNode method = _zCursor4.getCurrent();
                  {
                    TestMethodTreeNode testMethodTreeNode = new TestMethodTreeNode(this.operationContext, method);
                    testCaseTreeNode.add(testMethodTreeNode);
                    this.map.put(testCase, method, testMethodTreeNode);
                  }
                }
              } finally {
                _zCursor4.release();
              }
            }
          }
        }
      } finally {
        _zCursor3.release();
      }
    }
    return root;
  }

  public void setTests(IOperationContext operationContext, Map<SNode, List<SNode>> tests) {
    this.operationContext = operationContext;
    this.tests = tests;
    this.rebuildNow();
  }

  public TestCaseTreeNode get(String className) {
    return this.map.get(className);
  }

  public TestMethodTreeNode get(String className, String methodName) {
    return this.map.get(className, methodName);
  }

}
