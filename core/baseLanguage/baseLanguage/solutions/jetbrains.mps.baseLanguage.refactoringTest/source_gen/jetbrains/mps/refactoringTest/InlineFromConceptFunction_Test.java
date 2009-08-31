package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.InlineVariableRefactoring;
import jetbrains.mps.baseLanguage.plugin.InlineVariableAssignmentRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.plugin.InlineVariableReferenceRefactoring;

public class InlineFromConceptFunction_Test extends BaseTransformationTest {
  @Test
  public void test_deinition() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/plugin/plugin.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_deinition", true);
  }

  @Test
  public void test_reference() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/plugin/plugin.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_reference", true);
  }

  public static class TestBody extends BaseTestBody {
    public void test_deinition() throws Exception {
      this.addNodeById("1230053266366");
      this.addNodeById("1230053266380");
      InlineVariableRefactoring ref = new InlineVariableAssignmentRefactoring(SNodeOperations.cast(this.getNodeById("1230053266370"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053266367"), "jetbrains.mps.baseLanguage.structure.ConceptFunction")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053266381"), "jetbrains.mps.baseLanguage.structure.ConceptFunction"))));
    }

    public void test_reference() throws Exception {
      this.addNodeById("1230053266366");
      this.addNodeById("1230053266380");
      InlineVariableRefactoring ref = new InlineVariableReferenceRefactoring(SNodeOperations.cast(this.getNodeById("1230053266377"), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053266367"), "jetbrains.mps.baseLanguage.structure.ConceptFunction")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053266381"), "jetbrains.mps.baseLanguage.structure.ConceptFunction"))));
    }
  }
}
