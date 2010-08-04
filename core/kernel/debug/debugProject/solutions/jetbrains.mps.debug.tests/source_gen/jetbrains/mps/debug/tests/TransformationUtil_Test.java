package jetbrains.mps.debug.tests;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.debug.evaluation.ui.TransformationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

@MPSLaunch
public class TransformationUtil_Test extends BaseTransformationTest {
  @Test
  public void test_lowLevelVariable() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_lowLevelVariable", true);
  }

  @Test
  public void test_evaluatorsThisExpression() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_evaluatorsThisExpression", true);
  }

  @Test
  public void test_field() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_field", true);
  }

  @Test
  public void test_localField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_localField", true);
  }

  @Test
  public void test_staticField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_staticField", true);
  }

  @Test
  public void test_localStaticField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_localStaticField", true);
  }

  @Test
  public void test_method() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:29a1b5f5-cf76-4978-a4ac-fe622e0f96ff(jetbrains.mps.debug.tests)");
    this.runTest("jetbrains.mps.debug.tests.TransformationUtil_Test$TestBody", "test_method", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_lowLevelVariable() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550173"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550173"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550179"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_evaluatorsThisExpression() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550219"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550219"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550226"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_field() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550245"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localField() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      SNode fieldDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.cast(this.getNodeById("5543996881668550238"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"), "fieldDeclaration", false);
      SNode instanceFieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", null);
      SLinkOperations.setTarget(instanceFieldReference, "variableDeclaration", fieldDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("5543996881668550238"), "jetbrains.mps.baseLanguage.structure.DotExpression"), instanceFieldReference);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550235"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550245"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_staticField() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550269"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localStaticField() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      SNode fieldDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(this.getNodeById("5543996881668550263"), "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), "variableDeclaration", false);
      SNode staticFieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference", null);
      SLinkOperations.setTarget(staticFieldReference, "variableDeclaration", fieldDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("5543996881668550263"), "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), staticFieldReference);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550260"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550269"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_method() throws Exception {
      this.addNodeById("5543996881668550169");
      this.addNodeById("5543996881668550178");
      this.addNodeById("5543996881668550190");
      this.addNodeById("5543996881668550217");
      this.addNodeById("5543996881668550225");
      this.addNodeById("5543996881668550233");
      this.addNodeById("5543996881668550244");
      this.addNodeById("5543996881668550258");
      this.addNodeById("5543996881668550268");
      this.addNodeById("5543996881668550283");
      this.addNodeById("5543996881668550295");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("5543996881668550285"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550285"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("5543996881668550296"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }
  }
}
