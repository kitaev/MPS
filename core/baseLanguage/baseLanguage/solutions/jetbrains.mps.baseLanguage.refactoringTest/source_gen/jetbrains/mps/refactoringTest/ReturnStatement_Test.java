package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ReturnStatement_Test extends BaseTransformationTest {

  @Test()
  public void test_alwaysReturn() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_alwaysReturn", true);
  }

  @Test()
  public void test_retunInAnonymousClass() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_retunInAnonymousClass", true);
  }

  @Test()
  public void test_notAlwaysReturn() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_notAlwaysReturn", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_alwaysReturn() throws Exception {
      this.addNodeById("1230052642345");
      Assert.assertNull(ExtractMethodFabric.getErrors(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642367"), "jetbrains.mps.baseLanguage.structure.IfStatement"))));
      Assert.assertNull(ExtractMethodFabric.getErrors(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642367"), "jetbrains.mps.baseLanguage.structure.IfStatement"), SNodeOperations.cast(this.getNodeById("1230052642388"), "jetbrains.mps.baseLanguage.structure.ReturnStatement"))));
    }

    public void test_retunInAnonymousClass() throws Exception {
      this.addNodeById("1230052642345");
      Assert.assertNull(ExtractMethodFabric.getErrors(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642353"), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"))));
    }

    public void test_notAlwaysReturn() throws Exception {
      this.addNodeById("1230052642345");
      Assert.assertTrue(ExtractMethodFabric.getErrors(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642395"), "jetbrains.mps.baseLanguage.structure.IfStatement"))) != null);
    }

}

}
