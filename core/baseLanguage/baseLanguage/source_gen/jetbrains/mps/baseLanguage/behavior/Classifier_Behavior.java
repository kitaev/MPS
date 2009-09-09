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
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class Classifier_Behavior {
  private static Class[] PARAMETERS_1214840444586 = {SNode.class};

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
    return SLinkOperations.getCount(thisNode, "staticField") > 0;
  }

  public static String call_getNestedName_8540045600162184125(SNode thisNode) {
    return Classifier_Behavior.call_getNestedNameInContext_8540045600162183880(thisNode, null);
  }

  public static String call_getNestedNameInContext_8540045600162183880(SNode thisNode, SNode context) {
    List<SNode> containers = ListSequence.fromList(SNodeOperations.getAncestors(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier", true)).reversedList();
    List<SNode> contextContainers = SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguage.structure.Classifier", true);

    List<SNode> ancestors = SNodeOperations.getAncestors(context, null, true);
    if (ListSequence.fromList(ancestors).contains(SNodeOperations.getParent(thisNode)) || ListSequence.fromList(ancestors).contains(thisNode)) {
      return SPropertyOperations.getString(thisNode, "name");
    }

    int index = -1;
    for (SNode ctxCls : contextContainers) {
      index = ListSequence.fromList(containers).indexOf(ctxCls);
      if (index != -1) {
        break;
      }
    }
    if (index != -1) {
      List<SNode> newContainers = new ArrayList<SNode>();
      for (int i = index + 1 ; i < ListSequence.fromList(containers).count() ; i++ ) {
        ListSequence.fromList(newContainers).addElement(ListSequence.fromList(containers).getElement(i));
      }
      containers = newContainers;
    }

    StringBuilder result = new StringBuilder();
    boolean first = true;
    for (SNode c : containers) {
      if (first) {
        first = false;
      } else {
        result.append(".");
      }
      result.append(SPropertyOperations.getString(c, "name"));
    }
    return result.toString();
  }

  public static boolean call_isStatic_521412098689998668(SNode thisNode) {
    return !(SPropertyOperations.getBoolean(thisNode, "nonStatic")) && !(SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"));
  }

  public static boolean call_isInner_521412098689998677(SNode thisNode) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.Classifier");
  }

  public static boolean call_canInstantiateIn_6935810692634457550(SNode thisNode, SNode context) {
    List<SNode> contextClassifiers = Classifier_Behavior.getNonStaticContextClassifiers_6775591514230482802(context);
    List<SNode> required = Classifier_Behavior.getNonStaticContextClassifiers_6775591514230482802(thisNode);
    ListSequence.fromList(required).removeElement(thisNode);
    for (SNode req : required) {
      if (!(ListSequence.fromList(contextClassifiers).contains(req))) {
        return false;
      }
    }
    return true;
  }

  public static boolean call_hasStaticMemebers_1214840444586(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_hasStaticMemebers_1214840444586", PARAMETERS_1214840444586);
  }

  public static boolean callSuper_hasStaticMemebers_1214840444586(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_hasStaticMemebers_1214840444586", PARAMETERS_1214840444586);
  }

  public static List<SNode> getNonStaticContextClassifiers_6775591514230482802(SNode context) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode current : ListSequence.fromList(SNodeOperations.getAncestors(context, "jetbrains.mps.baseLanguage.structure.Classifier", true))) {
      if (SNodeOperations.isInstanceOf(current, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
        SNode classifier = SLinkOperations.getTarget(SNodeOperations.cast(current, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "classifier", false);
        if ((classifier == null)) {
          continue;
        }
        ListSequence.fromList(result).addElement(classifier);
      } else {
        ListSequence.fromList(result).addElement(current);
        if (Classifier_Behavior.call_isStatic_521412098689998668(current)) {
          // according to Java rules static inner classifiers can be only on the second level so we can
          // safely break here
          break;
        }
      }
    }
    return result;
  }

  public static List<SNode> getAssesableMembers_669019847198843527(SNode contextNode, int constraint) {
    SNode classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(contextNode);
    List<SNode> result = new ArrayList<SNode>();
    while (classifier != null) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList((List<SNode>)Classifier_Behavior.call_getVisibleMembers_1213877306257(classifier, contextNode, constraint)));
      if (!(Classifier_Behavior.call_isStatic_521412098689998668(classifier)) || (constraint & IClassifiersSearchScope.STATIC_MEMBER) != 0) {
        classifier = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      } else {
        break;
      }
    }
    return result;
  }
}
