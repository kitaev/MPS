package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import javax.swing.Icon;
import java.util.ArrayList;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleMembersScope;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.lang.pattern.IMatchingPattern;

public class Classifier_Behavior {
  private static Class[] PARAMETERS_5039675756633081868 = {SNode.class};
  private static Class[] PARAMETERS_1214840444586 = {SNode.class};
  private static Class[] PARAMETERS_8540045600162184125 = {SNode.class};
  private static Class[] PARAMETERS_7165541881557222913 = {SNode.class, SNode.class};
  private static Class[] PARAMETERS_7165541881557222950 = {SNode.class, SNode.class, Set.class};
  private static Class[] PARAMETERS_1906502351318572840 = {SNode.class};
  private static Class[] PARAMETERS_5017341185733869650 = {SNode.class};
  private static Class[] PARAMETERS_3305065273710880775 = {SNode.class};

  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "visibility", "jetbrains.mps.baseLanguage.structure.PublicVisibility");
  }

  public static List<Icon> virtual_getMarkIcons_3923831204883340393(SNode thisNode) {
    List<Icon> markIcons = new ArrayList<Icon>(BaseConcept_Behavior.callSuper_getMarkIcons_3923831204883340393(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"));
    if ((SNodeOperations.getParent(thisNode) != null) && Classifier_Behavior.call_isStatic_521412098689998668(thisNode)) {
      markIcons.add(IconContainer.ICON_a0a0a1a0);
    }
    return markIcons;
  }

  public static List<SNode> call_getVisibleMembers_1213877306257(SNode thisNode, SNode contextNode, int constraint) {
    SNode ct = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(ct, "classifier", thisNode, false);
    ISearchScope ss = new ClassifierVisibleMembersScope(ct, contextNode, constraint);
    return (List<SNode>) ss.getNodes();
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

  public static String virtual_getNestedName_8540045600162184125(SNode thisNode) {
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
      for (int i = index + 1; i < ListSequence.fromList(containers).count(); i++) {
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
    return (!(SPropertyOperations.getBoolean(thisNode, "nonStatic")) && !(SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.baseLanguage.structure.AnonymousClass"))) || SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.Interface");
  }

  public static boolean call_isInner_521412098689998677(SNode thisNode) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.Classifier");
  }

  public static boolean virtual_isDescendant_7165541881557222913(SNode thisNode, SNode nodeToCompare) {
    return Classifier_Behavior.call_isDescendant_checkLoops_7165541881557222950(thisNode, nodeToCompare, SetSequence.fromSet(new HashSet<SNode>()));
  }

  public static boolean virtual_isDescendant_checkLoops_7165541881557222950(SNode thisNode, SNode nodeToCompare, Set<SNode> visited) {
    return false;
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

  public static List<SNode> virtual_getOwnMethods_1906502351318572840(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "method", true)));
    return result;
  }

  public static Icon virtual_getAdditionalIcon_5017341185733863694(SNode thisNode) {
    return IVisible_Behavior.call_getVisibilityIcon_5017341185733869581(thisNode);
  }

  public static SNode virtual_getThisType_3305065273710880775(SNode thisNode) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(result, "classifier", thisNode, false);
    for (SNode decl : SLinkOperations.getTargets(thisNode, "typeVariableDeclaration", true)) {
      SNode reference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.TypeVariableReference", null);
      SLinkOperations.setTarget(reference, "typeVariableDeclaration", decl, false);
      ListSequence.fromList(SLinkOperations.getTargets(result, "parameter", true)).addElement(reference);
    }
    return result;
  }

  public static SNode call_getWithResolvedTypevars_3305065273710852527(SNode thisNode, SNode t, SNode ancestor) {
    SNode coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce_(Classifier_Behavior.call_getThisType_3305065273710880775(thisNode), new Classifier_Behavior.Pattern_qw8l7c_a1a0a0a71(ancestor), true);
    if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      return Classifier_Behavior.call_getResolvedVar_3305065273710881245(thisNode, SNodeOperations.cast(t, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), ancestor, coercedType);
    } else {
      SNode result = SNodeOperations.copyNode(t);
      for (SNode reference : SNodeOperations.getDescendants(result, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{})) {
        SNode resolvedVar = Classifier_Behavior.call_getResolvedVar_3305065273710881245(thisNode, reference, ancestor, coercedType);
        if (reference != resolvedVar) {
          SNodeOperations.replaceWithAnother(reference, resolvedVar);
        }
      }
      return result;
    }
  }

  public static SNode call_getResolvedVar_3305065273710881245(SNode thisNode, SNode reference, SNode ancestor, SNode coercedType) {
    SNode decl = SLinkOperations.getTarget(reference, "typeVariableDeclaration", false);
    int i = ListSequence.fromList(SLinkOperations.getTargets(ancestor, "typeVariableDeclaration", true)).indexOf(decl);
    SNode resolvedVar;
    if (i < 0) {
      resolvedVar = reference;
      // todo method vars 
    } else if (ListSequence.fromList(SLinkOperations.getTargets(coercedType, "parameter", true)).count() > 0) {
      resolvedVar = SNodeOperations.copyNode(ListSequence.fromList(SLinkOperations.getTargets(coercedType, "parameter", true)).getElement(i));
    } else {
      resolvedVar = TypeVariableDeclaration_Behavior.call_getConcreteUpperBound_4346214032091509920(decl);
    }
    return resolvedVar;
  }

  public static List<Icon> call_getMarkIcons_5039675756633081868(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (List<Icon>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_getMarkIcons_3923831204883340393", PARAMETERS_5039675756633081868);
  }

  public static boolean call_hasStaticMemebers_1214840444586(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_hasStaticMemebers_1214840444586", PARAMETERS_1214840444586);
  }

  public static String call_getNestedName_8540045600162184125(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_getNestedName_8540045600162184125", PARAMETERS_8540045600162184125);
  }

  public static boolean call_isDescendant_7165541881557222913(SNode thisNode, SNode nodeToCompare) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_isDescendant_7165541881557222913", PARAMETERS_7165541881557222913, nodeToCompare);
  }

  public static boolean call_isDescendant_checkLoops_7165541881557222950(SNode thisNode, SNode nodeToCompare, Set<SNode> visited) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_isDescendant_checkLoops_7165541881557222950", PARAMETERS_7165541881557222950, nodeToCompare, visited);
  }

  public static List<SNode> call_getOwnMethods_1906502351318572840(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_getOwnMethods_1906502351318572840", PARAMETERS_1906502351318572840);
  }

  public static Icon call_getAdditionalIcon_5017341185733869650(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (Icon) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_getAdditionalIcon_5017341185733863694", PARAMETERS_5017341185733869650);
  }

  public static SNode call_getThisType_3305065273710880775(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), "virtual_getThisType_3305065273710880775", PARAMETERS_3305065273710880775);
  }

  public static List<Icon> callSuper_getMarkIcons_5039675756633081868(SNode thisNode, String callerConceptFqName) {
    return (List<Icon>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_getMarkIcons_3923831204883340393", PARAMETERS_5039675756633081868);
  }

  public static boolean callSuper_hasStaticMemebers_1214840444586(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_hasStaticMemebers_1214840444586", PARAMETERS_1214840444586);
  }

  public static String callSuper_getNestedName_8540045600162184125(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_getNestedName_8540045600162184125", PARAMETERS_8540045600162184125);
  }

  public static boolean callSuper_isDescendant_7165541881557222913(SNode thisNode, String callerConceptFqName, SNode nodeToCompare) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_isDescendant_7165541881557222913", PARAMETERS_7165541881557222913, nodeToCompare);
  }

  public static boolean callSuper_isDescendant_checkLoops_7165541881557222950(SNode thisNode, String callerConceptFqName, SNode nodeToCompare, Set<SNode> visited) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_isDescendant_checkLoops_7165541881557222950", PARAMETERS_7165541881557222950, nodeToCompare, visited);
  }

  public static List<SNode> callSuper_getOwnMethods_1906502351318572840(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_getOwnMethods_1906502351318572840", PARAMETERS_1906502351318572840);
  }

  public static Icon callSuper_getAdditionalIcon_5017341185733869650(SNode thisNode, String callerConceptFqName) {
    return (Icon) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_getAdditionalIcon_5017341185733863694", PARAMETERS_5017341185733869650);
  }

  public static SNode callSuper_getThisType_3305065273710880775(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.Classifier"), callerConceptFqName, "virtual_getThisType_3305065273710880775", PARAMETERS_3305065273710880775);
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

  public static List<SNode> getAccessibleMembers_669019847198843527(SNode contextNode, int constraint) {
    SNode classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(contextNode);
    List<SNode> result = new ArrayList<SNode>();
    while (classifier != null) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(Classifier_Behavior.call_getVisibleMembers_1213877306257(classifier, contextNode, constraint)));
      if (!(Classifier_Behavior.call_isStatic_521412098689998668(classifier)) || (constraint & IClassifiersSearchScope.STATIC_MEMBER) != 0) {
        classifier = SNodeOperations.getAncestor(classifier, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      } else {
        break;
      }
    }
    return result;
  }

  public static SNode getContextClassifier_6172562527426750080(SNode expr) {
    SNode concept = ClassConcept_Behavior.getContextClass_8008512149545173402(expr);
    if (concept != null) {
      return concept;
    }
    return SNodeOperations.getAncestor(expr, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
  }

  public static class Pattern_qw8l7c_a1a0a0a71 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> patternVar_l;
    /*package*/ SNode patternVar_foo;
    /*package*/ Object AntiquotationField_qw8l7c_a0a0a0a0a61;

    public Pattern_qw8l7c_a1a0a0a71(Object parameter_qw8l7c_a0a0a0a0a61) {
      this.AntiquotationField_qw8l7c_a0a0a0a0a61 = parameter_qw8l7c_a0a0a0a0a61;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_3305065273710923098;
        nodeToMatch_3305065273710923098 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_3305065273710923098.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField_qw8l7c_a0a0a0a0a61;
          if (nodeToMatch_3305065273710923098.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_3305065273710923098 = "parameter";
          this.patternVar_l = ListSequence.fromList(new ArrayList<SNode>());
          patternVar_foo = null;
          for (SNode childVar : nodeToMatch_3305065273710923098.getChildren(childRole_3305065273710923098)) {
            patternVar_foo = childVar;
            ListSequence.fromList(this.patternVar_l).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_l = (List<SNode>) pattern.getFieldValue("patternVar_l");
        patternVar_foo = (SNode) pattern.getFieldValue("patternVar_foo");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_l".equals(fieldName)) {
        return patternVar_l;
      }
      if ("patternVar_foo".equals(fieldName)) {
        return patternVar_foo;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
