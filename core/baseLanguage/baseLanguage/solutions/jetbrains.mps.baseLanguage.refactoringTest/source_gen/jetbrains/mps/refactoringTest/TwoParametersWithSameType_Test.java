package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureParameters;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureRefactoring;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;

public class TwoParametersWithSameType_Test extends BaseTransformationTest {
  @Test
  public void test_TwoParametersWithSameType() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/plugin/plugin.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_TwoParametersWithSameType", true);
  }

  public static class TestBody extends BaseTestBody {
    public void test_TwoParametersWithSameType() throws Exception {
      this.addNodeById("1230052944133");
      this.addNodeById("1230052944148");
      ChangeMethodSignatureParameters params = new ChangeMethodSignatureParameters(SNodeOperations.cast(this.getNodeById("1230052944135"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
      SPropertyOperations.set(ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).first(), "name", "arg1");
      SPropertyOperations.set(ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).getElement(1), "name", "arg2");
      ChangeMethodSignatureRefactoring ref = new ChangeMethodSignatureRefactoring(params, SNodeOperations.cast(this.getNodeById("1230052944135"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052944134"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052944149"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
