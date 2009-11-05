package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BreakStatement_Test extends BaseTransformationTest {
  @Test
  @MPSLaunch
  public void test_noBreaks() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_noBreaks", true);
  }

  @Test
  @MPSLaunch
  public void test_oneBreak() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_oneBreak", true);
  }

  @Test
  @MPSLaunch
  public void test_oneContionue() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_oneContionue", true);
  }

  @Test
  @MPSLaunch
  public void test_breakAndContinue() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_breakAndContinue", true);
  }

  public static class TestBody extends BaseTestBody {
    @MPSLaunch
    public void test_noBreaks() throws Exception {
      this.addNodeById("1230052480264");
      Assert.assertNull(ExtractMethodFabric.getErrors(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480270"), "jetbrains.mps.baseLanguage.structure.WhileStatement"))));
    }

    @MPSLaunch
    public void test_oneBreak() throws Exception {
      this.addNodeById("1230052480264");
      Assert.assertNull(ExtractMethodFabric.getErrors(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480275"), "jetbrains.mps.baseLanguage.structure.IfStatement"))));
    }

    @MPSLaunch
    public void test_oneContionue() throws Exception {
      this.addNodeById("1230052480264");
      Assert.assertNull(ExtractMethodFabric.getErrors(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480282"), "jetbrains.mps.baseLanguage.structure.IfStatement"))));
    }

    @MPSLaunch
    public void test_breakAndContinue() throws Exception {
      this.addNodeById("1230052480264");
      Assert.assertTrue(ExtractMethodFabric.getErrors(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052480275"), "jetbrains.mps.baseLanguage.structure.IfStatement"), SNodeOperations.cast(this.getNodeById("1230052480282"), "jetbrains.mps.baseLanguage.structure.IfStatement"))) != null);
    }
  }
}
