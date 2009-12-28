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
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class OneReturnTransformation_Test extends BaseTransformationTest {
  @Test
  public void test_oneReturnTransformation() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.OneReturnTransformation_Test$TestBody", "test_oneReturnTransformation", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_oneReturnTransformation() throws Exception {
      this.addNodeById("1230052642256");
      this.addNodeById("1230052642278");
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052642262"), "jetbrains.mps.baseLanguage.structure.IfStatement")));
      params.setName("foo");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052642257"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052642279"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
