package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.InlineMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;

public class CheckVisibility_Test extends BaseTransformationTest {

  @Test()
  public void test_CheckVisibility() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/findUsages/findUsages.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_CheckVisibility", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_CheckVisibility() throws Exception {
      this.addNodeById("1230053114874");
      this.addNodeById("1230053114900");
      InlineMethodRefactoring ref = new InlineMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053114888"), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"));
      Assert.assertTrue(ref.getProblems().length() > 0);
      ref = new InlineMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053114893"), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"));
      Assert.assertTrue(ref.getProblems().length() > 0);
      ref = new InlineMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053114898"), "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"));
      Assert.assertTrue(ref.getProblems().length() == 0);
    }

}

}
