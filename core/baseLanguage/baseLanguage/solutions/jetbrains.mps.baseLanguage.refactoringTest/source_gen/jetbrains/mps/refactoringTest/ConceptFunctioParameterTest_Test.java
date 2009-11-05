package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringAnalyzer;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;

public class ConceptFunctioParameterTest_Test extends BaseTransformationTest {
  @Test
  @MPSLaunch
  public void test_ConceptFunctioParameterTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_ConceptFunctioParameterTest", true);
  }

  public static class TestBody extends BaseTestBody {
    @MPSLaunch
    public void test_ConceptFunctioParameterTest() throws Exception {
      this.addNodeById("1230052406742");
      ExtractMethodRefactoringAnalyzer analyzer = new ExtractMethodRefactoringAnalyzer(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052406746"), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), SNodeOperations.cast(this.getNodeById("1230052406751"), "jetbrains.mps.baseLanguage.structure.IfStatement")));
      Assert.assertEquals(1, ListSequence.fromList(analyzer.getInputVariables()).count());
    }
  }
}
