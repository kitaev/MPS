package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureParameters;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.refactoringTest._Quotations;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureRefactoring;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.smodel.SNode;

public class ChangeParameterType_Test extends BaseTransformationTest {

  @Test()
  public void test_ChangeParameterType() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_ChangeParameterType", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_ChangeParameterType() throws Exception {
      this.addNodeById("1230052943884");
      this.addNodeById("1230052943897");
      ChangeMethodSignatureParameters params = new ChangeMethodSignatureParameters(SNodeOperations.cast(this.getNodeById("1230052943886"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
      SLinkOperations.setTarget(ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).getElement(0), "type", new _Quotations.QuotationClass_2().createNode(), true);
      ChangeMethodSignatureRefactoring ref = new ChangeMethodSignatureRefactoring(params, SNodeOperations.cast(this.getNodeById("1230052943886"), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"));
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052943885"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.<SNode>fromArray(SNodeOperations.cast(this.getNodeById("1230052943898"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }

}

}
