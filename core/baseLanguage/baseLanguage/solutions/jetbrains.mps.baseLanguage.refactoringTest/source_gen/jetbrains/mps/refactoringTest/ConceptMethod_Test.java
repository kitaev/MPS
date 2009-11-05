package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ConceptMethod_Test extends BaseTransformationTest {
  @Test
  @MPSLaunch
  public void test_conceptMethod() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_conceptMethod", true);
  }

  public static class TestBody extends BaseTestBody {
    @MPSLaunch
    public void test_conceptMethod() throws Exception {
      this.addNodeById("1230052406798");
      this.addNodeById("1230052406829");
      SLinkOperations.setTarget(SNodeOperations.cast(this.getNodeById("1230052406839"), "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall"), "baseMethodDeclaration", SNodeOperations.cast(this.getNodeById("1230052406844"), "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration"), false);
      ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052406805"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")));
      params.setName("foo");
      ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
      this.fff(ref);
      params = new ExtractMethodRefactoringParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052406818"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")));
      params.setName("bar");
      ref = ExtractMethodFabric.createRefactoring(params);
      ref.doRefactor();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052406799"), "jetbrains.mps.lang.behavior.structure.ConceptBehavior")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052406830"), "jetbrains.mps.lang.behavior.structure.ConceptBehavior"))));
    }

    public void fff(ExtractMethodRefactoring ref) {
      ref.doRefactor();
    }
  }
}
