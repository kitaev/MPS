package jetbrains.mps.baseLanguage.unitTest.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import jetbrains.mps.lang.test.behavior.NodesTestCase_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.IMemberContainer_Behavior;

public class BTestCase_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<String> virtual_getParametersPart_1215620460293(SNode thisNode) {
    List<String> ret = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(ret).addElement("-c");
    ListSequence.fromList(ret).addElement(INamedConcept_Behavior.call_getFqName_1213877404258(thisNode));
    return ret;
  }

  public static List<SNode> virtual_getTestSet_1216130724401(SNode thisNode) {
    SNode node = thisNode;
    List<SNode> methods = new ArrayList<SNode>();
    if ((SLinkOperations.getTarget(node, "superclass", true) != null) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase")) {
      List<SNode> superMethods = ITestCase_Behavior.call_getTestSet_1216130724401(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"));
      ListSequence.fromList(methods).addSequence(ListSequence.fromList(superMethods));
    }
    ListSequence.fromList(methods).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "testMethodList", true), "testMethod", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode method) {
        return (ListSequence.fromList(SLinkOperations.getTargets(method, "annotation", true)).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode annotation) {
            return SLinkOperations.getTarget(annotation, "annotation", false).equals(SNodeOperations.getNode("f:java_stub#org.junit(org.junit@java_stub)", "~Ignore"));
          }
        }) == null);
      }
    }));
    return methods;
  }

  public static String virtual_getClassName_1216136193905(SNode thisNode) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(thisNode);
  }

  public static TestRunParameters virtual_getTestRunParameters_1216045139515(SNode thisNode) {
    for (SNode method : SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "testMethodList", true), "testMethod", true)) {
      for (SNode annotationInstance : SLinkOperations.getTargets(method, "annotation", true)) {
        if (SLinkOperations.getTarget(annotationInstance, "annotation", false).equals(SNodeOperations.getNode("r:f144b87b-8ea5-4a8a-bb79-78fd4663e93c(jetbrains.mps.baseLanguage.util.plugin.run)", "8492459591399146889"))) {
          return NodesTestCase_Behavior.getTestRunParameters_1217424543047();
        }
      }
    }
    return new TestRunParameters();
  }

  public static List<SNode> virtual_getTestMethods_2148145109766218395(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    if (!(SPropertyOperations.getBoolean(thisNode, "abstractClass"))) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "testMethodList", true), "testMethod", true)));
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase")) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(ITestCase_Behavior.call_getTestMethods_2148145109766218395(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.unitTest.structure.ITestCase"))));
      }
    }
    return result;
  }

  public static List<SNode> virtual_getMembers_1213877531970(SNode thisNode) {
    List<SNode> members = IMemberContainer_Behavior.callSuper_getMembers_1213877531970(thisNode, "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase");
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(thisNode, "testMethodList", true), "testMethod", true)));
    return members;
  }
}
