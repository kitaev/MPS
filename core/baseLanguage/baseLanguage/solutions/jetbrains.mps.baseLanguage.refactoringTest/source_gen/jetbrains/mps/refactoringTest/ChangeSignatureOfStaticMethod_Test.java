package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureParameters;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.plugin.ChangeMethodSignatureRefactoring;
import java.util.List;
import java.util.ArrayList;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ChangeSignatureOfStaticMethod_Test extends BaseTransformationTest {

  @Test()
  public void test_ChangeSignatureOfStaticMethod() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_ChangeSignatureOfStaticMethod", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_ChangeSignatureOfStaticMethod() throws Exception {
      this.addNodeById("1230052903079");
      this.addNodeById("1230052903110");
      ChangeMethodSignatureParameters params = new ChangeMethodSignatureParameters(SNodeOperations.cast(this.getNodeById("1230052903099"), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"));
      SNode p1 = ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).first();
      SNode p0 = ListSequence.fromList(SLinkOperations.getTargets(params.getDeclaration(), "parameter", true)).getElement(1);
      SLinkOperations.removeAllChildren(params.getDeclaration(), "parameter");
      SLinkOperations.addChild(params.getDeclaration(), "parameter", p0);
      SLinkOperations.addChild(params.getDeclaration(), "parameter", p1);
      ChangeMethodSignatureRefactoring ref = new ChangeMethodSignatureRefactoring(params, SNodeOperations.cast(this.getNodeById("1230052903099"), "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"));
      List<SNode> ussages = ListSequence.fromList(new ArrayList<SNode>());
      ListSequence.fromList(ussages).addElement(SNodeOperations.cast(this.getNodeById("1230052903086"), "jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall"));
      ListSequence.fromList(ussages).addElement(SNodeOperations.cast(this.getNodeById("1230052903093"), "jetbrains.mps.baseLanguage.structure.StaticMethodCall"));
      ref.setUsages(ussages);
      ref.doRefactoring();
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052903080"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1230052903111"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }

}

}
