package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.MoveMethodRefactoring;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class MoveMethodWithUssages_Test extends BaseTransformationTest {
  @Test
  @MPSLaunch
  public void test_check() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_check", true);
  }

  public static class TestBody extends BaseTestBody {
    @MPSLaunch
    public void test_check() throws Exception {
      this.addNodeById("1230053302653");
      this.addNodeById("1230053302662");
      this.addNodeById("1230053302673");
      this.addNodeById("1230053302677");
      MoveMethodRefactoring ref = new MoveMethodRefactoring(SNodeOperations.cast(this.getNodeById("1230053302655"), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"), SNodeOperations.cast(this.getNodeById("1230053302663"), "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      ref.setUssages(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053302669"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall")));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053302654"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(this.getNodeById("1230053302663"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230053302674"), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(this.getNodeById("1230053302678"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
