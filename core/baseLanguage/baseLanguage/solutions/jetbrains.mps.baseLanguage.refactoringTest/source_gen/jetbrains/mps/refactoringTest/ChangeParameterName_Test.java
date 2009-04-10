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
import jetbrains.mps.smodel.SNode;

public class ChangeParameterName_Test extends BaseTransformationTest {

  @Test()
  public void test_ChangeParameterName() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_ChangeParameterName", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_ChangeParameterName() throws Exception {
      this.addNodeById("1230052943818");
      this.addNodeById("1230052943833");
      ChangeMethodSignatureParameters params = new ChangeMethodSignatureParameters(SNodeOperations.cast(this.getNodeById("1230052943820"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
      SPropertyOperations.set(ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).getElement(0), "name", "b");
      ChangeMethodSignatureRefactoring ref = new ChangeMethodSignatureRefactoring(params, SNodeOperations.cast(this.getNodeById("1230052943820"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052943819"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052943834"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }

}

}
