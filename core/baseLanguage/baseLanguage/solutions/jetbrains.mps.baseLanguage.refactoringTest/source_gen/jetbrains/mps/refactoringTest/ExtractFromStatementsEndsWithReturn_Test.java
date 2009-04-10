package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ExtractFromStatementsEndsWithReturn_Test extends BaseTransformationTest {

  @Test()
  public void test_extractFromStatementsEndsWithReturn() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/findUsages/findUsages.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_extractFromStatementsEndsWithReturn", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_extractFromStatementsEndsWithReturn() throws Exception {
      this.addNodeById("1230052642040");
      this.addNodeById("1230052642053");
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642046"), "jetbrains.mps.baseLanguage.structure.ReturnStatement")));
      params.setName("foo");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642041"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052642054"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }

}

}
