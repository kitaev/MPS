package jetbrains.mps.debug.evaluation.tests;

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
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_lowLevelVariable", true);
  }

  @Test
  public void test_evaluatorsThisExpression() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_evaluatorsThisExpression", true);
  }

  @Test
  public void test_field() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_field", true);
  }

  @Test
  public void test_localField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_localField", true);
  }

  @Test
  public void test_staticField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_staticField", true);
  }

  @Test
  public void test_localStaticField() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_localStaticField", true);
  }

  @Test
  public void test_method() throws Throwable {
    this.initTest("${mps_home}/core/kernel/debug/debugProject/debugProject.mpr", "r:c2a874f9-f22c-434b-9891-d2201e5ad476(jetbrains.mps.debug.evaluation.tests)");
    this.runTest("jetbrains.mps.debug.evaluation.tests.TransformationUtil_Test$TestBody", "test_method", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_lowLevelVariable() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("4132821723673811065"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("4132821723673811065"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("4132821723673770120"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_evaluatorsThisExpression() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("7441344928576573363"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576573363"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576488062"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_field() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("7441344928576729107"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576729107"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576729098"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localField() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      SNode fieldDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.cast(this.getNodeById("7441344928576729113"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true), "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"), "fieldDeclaration", false);
      SNode instanceFieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", null);
      SLinkOperations.setTarget(instanceFieldReference, "variableDeclaration", fieldDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("7441344928576729113"), "jetbrains.mps.baseLanguage.structure.DotExpression"), instanceFieldReference);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("7441344928576729107"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576729107"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576729098"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_staticField() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("7441344928576765207"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576765207"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576765192"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_localStaticField() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      SNode fieldDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(this.getNodeById("7441344928576765218"), "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), "variableDeclaration", false);
      SNode staticFieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference", null);
      SLinkOperations.setTarget(staticFieldReference, "variableDeclaration", fieldDeclaration, false);
      SNodeOperations.replaceWithAnother(SNodeOperations.cast(this.getNodeById("7441344928576765218"), "jetbrains.mps.baseLanguage.structure.StaticFieldReference"), staticFieldReference);
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("7441344928576765207"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576765207"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576765192"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }

    public void test_method() throws Exception {
      this.addNodeById("4132821723673811061");
      this.addNodeById("4132821723673770084");
      this.addNodeById("7441344928576488073");
      this.addNodeById("7441344928576573361");
      this.addNodeById("7441344928576488061");
      this.addNodeById("7441344928576729105");
      this.addNodeById("7441344928576729097");
      this.addNodeById("7441344928576765205");
      this.addNodeById("7441344928576765191");
      this.addNodeById("7441344928576825737");
      this.addNodeById("7441344928576825748");
      TransformationUtil.transformInternal(SNodeOperations.cast(this.getNodeById("7441344928576825739"), "jetbrains.mps.baseLanguage.structure.BlockStatement"));
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576825739"), "jetbrains.mps.baseLanguage.structure.BlockStatement")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7441344928576825749"), "jetbrains.mps.baseLanguage.structure.BlockStatement"))));
    }
  }
}
