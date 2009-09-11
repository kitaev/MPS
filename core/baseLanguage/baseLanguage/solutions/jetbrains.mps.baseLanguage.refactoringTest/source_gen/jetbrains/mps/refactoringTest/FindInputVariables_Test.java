package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringAnalyzer;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.plugin.MethodParameter;
import junit.framework.Assert;

public class FindInputVariables_Test extends BaseTransformationTest {
  @Test
  public void test_inputVariablesTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_inputVariablesTest", true);
  }

  public static class TestBody extends BaseTestBody {
    public void test_inputVariablesTest() throws Exception {
      this.addNodeById("1230052444310");
      ExtractMethodRefactoringAnalyzer a = new ExtractMethodRefactoringAnalyzer(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052444319"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), SNodeOperations.cast(this.getNodeById("1230052444324"), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), SNodeOperations.cast(this.getNodeById("1230052444331"), "jetbrains.mps.baseLanguage.structure.ExpressionStatement")));
      List<MethodParameter> vars = a.getInputVariables();
      Assert.assertEquals(1, ListSequence.fromList(vars).count());
      Assert.assertEquals(SNodeOperations.cast(this.getNodeById("1230052444315"), "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), ListSequence.fromList(vars).first().getDeclaration());
    }
  }
}
