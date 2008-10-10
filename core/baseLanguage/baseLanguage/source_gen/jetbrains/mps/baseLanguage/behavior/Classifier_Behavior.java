package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleMembersScope;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class Classifier_Behavior {
  public static Class[] PARAMETERS_1214840444586 = {SNode.class};

  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "visibility", "jetbrains.mps.baseLanguage.structure.PublicVisibility");
  }

  public static List<SNode> call_getVisibleMembers_1213877306257(SNode thisNode, SNode contextNode, int constraint) {
    SNode ct = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(ct, "classifier", thisNode, false);
    ISearchScope ss = new ClassifierVisibleMembersScope(((ClassifierType)SNodeOperations.getAdapter(ct)), contextNode, constraint);
    return (List<SNode>)ss.getNodes();
  }

  public static String virtual_getFqName_1213877404258(SNode thisNode) {
    SNode parentClassifier = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (parentClassifier != null) {
      return INamedConcept_Behavior.call_getFqName_1213877404258(parentClassifier) + "." + SPropertyOperations.getString(thisNode, "name");
    }
    return INamedConcept_Behavior.callSuper_getFqName_1213877404258(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier");
  }

  public static List<SNode> virtual_getMembers_1213877531970(SNode thisNode) {
    List<SNode> members = new ArrayList<SNode>();
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticField", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "method", true)));
    return members;
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    return SPropertyOperations.getString(thisNode, "nestedName");
  }

  public static boolean virtual_hasStaticMemebers_1214840444586(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticField", true)).count() > 0;
  }

  public static boolean call_hasStaticMemebers_1214840444586(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, thisNode, "virtual_hasStaticMemebers_1214840444586", PARAMETERS_1214840444586);
  }

  public static boolean callSuper_hasStaticMemebers_1214840444586(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, thisNode, callerConceptFqName, "virtual_hasStaticMemebers_1214840444586", PARAMETERS_1214840444586);
  }

}
