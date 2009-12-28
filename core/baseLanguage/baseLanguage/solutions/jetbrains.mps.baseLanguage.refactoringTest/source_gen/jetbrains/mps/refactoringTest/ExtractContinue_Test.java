package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodWithExitPoints;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class ExtractContinue_Test extends BaseTransformationTest {
  @Test
  public void test_ExtractContinue() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.ExtractContinue_Test$TestBody", "test_ExtractContinue", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_ExtractContinue() throws Exception {
      this.addNodeById("1230052480439");
      this.addNodeById("1230052480459");
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480448"), "jetbrains.mps.baseLanguage.structure.IfStatement")));
      params.setName("foo");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      Assert.assertTrue(ref instanceof ExtractMethodWithExitPoints);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480440"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480460"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
