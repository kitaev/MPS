package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ClassConcept_Behavior {
  private static Class[] PARAMETERS_7941158526576616766 = {SNode.class};
  private static Class[] PARAMETERS_1240936569950 = {SNode.class};
  private static Logger LOG = Logger.getLogger(ClassConcept_Behavior.class);

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getMembers_1213877531970(SNode thisNode) {
    List<SNode> members = IMemberContainer_Behavior.callSuper_getMembers_1213877531970(thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "field", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticMethod", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "constructor", true)));
    ListSequence.fromList(members).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticInnerClassifiers", true)));
    return members;
  }

  public static boolean virtual_isRunnable_7941158526576616752(SNode thisNode) {
    return (ClassConcept_Behavior.call_getMainMethod_1213877355884(thisNode) != null);
  }

  public static boolean virtual_isDescendant_checkLoops_7165541881557222950(SNode thisNode, SNode nodeToCompare, Set<SNode> visited) {
    if (SetSequence.fromSet(visited).contains(thisNode)) {
      LOG.error("circular hierarchy in class " + INamedConcept_Behavior.call_getFqName_1213877404258(thisNode));
      return false;
    }
    if (thisNode == nodeToCompare) {
      return true;
    }
    if (SLinkOperations.getTarget(thisNode, "superclass", true) == null) {
      return false;
    }
    SetSequence.fromSet(visited).addElement(thisNode);
    return Classifier_Behavior.call_isDescendant_checkLoops_7165541881557222950(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "superclass", true), "classifier", false), nodeToCompare, visited);
  }

  public static SNode call_getMainMethod_1213877355884(SNode thisNode) {
    return ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticMethod", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return StaticMethodDeclaration_Behavior.call_isMainMethod_1213877536670(it);
      }
    }).first();
  }

  public static boolean virtual_hasStaticMemebers_1214840444586(SNode thisNode) {
    return Classifier_Behavior.callSuper_hasStaticMemebers_1214840444586(thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept") || ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticMethod", true)).count() > 0;
  }

  public static List<SNode> virtual_getMethodsToImplement_5418393554803775106(SNode thisNode) {
    List<SNode> methods = new ArrayList<SNode>();
    ClassifierAndSuperClassifiersScope scope = new ClassifierAndSuperClassifiersScope(((ClassConcept) SNodeOperations.getAdapter(thisNode)), IClassifiersSearchScope.INSTANCE_METHOD);
    // todo do not show already implemented methods 
    for (SNode method : ((List<SNode>) scope.getNodes())) {
      boolean isOverridden = false;
      List<SNode> overridenMethods = BaseAdapter.toNodes(scope.getOverriddenMethods(((InstanceMethodDeclaration) SNodeOperations.getAdapter(method))));
      for (SNode overridingMethod : ((List<SNode>) overridenMethods)) {
        isOverridden = isOverridden || (SNodeOperations.isInstanceOf(overridingMethod, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SConceptPropertyOperations.getBoolean(SNodeOperations.cast(overridingMethod, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), "abstract"));
      }
      if (isOverridden) {
        continue;
      }

      SNode container = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if (container == thisNode || container == null) {
        continue;
      }
      if (SNodeOperations.isInstanceOf(container, "jetbrains.mps.baseLanguage.structure.Interface") || SPropertyOperations.getBoolean(method, "isAbstract")) {
        ListSequence.fromList(methods).addElement(method);
      }
    }
    return methods;
  }

  public static List<SNode> virtual_getMethodsToOverride_5418393554803767537(SNode thisNode) {
    List<SNode> methods = new ArrayList<SNode>();
    ClassifierAndSuperClassifiersScope scope = new ClassifierAndSuperClassifiersScope(((ClassConcept) SNodeOperations.getAdapter(thisNode)), IClassifiersSearchScope.INSTANCE_METHOD);
    List<SNode> methodDeclarations = BaseAdapter.toNodes(scope.getAdapters(InstanceMethodDeclaration.class));
    for (SNode method : ((List<SNode>) methodDeclarations)) {
      SNode cls = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if (cls == thisNode) {
        continue;
      }
      if (!(SNodeOperations.isInstanceOf(cls, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
        continue;
      }
      if (SPropertyOperations.getBoolean(method, "isFinal")) {
        continue;
      }
      if (SPropertyOperations.getBoolean(method, "isAbstract")) {
        continue;
      }

      ListSequence.fromList(methods).addElement(method);
    }
    return methods;
  }

  public static SNode virtual_getSuperclass_1240936569950(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "superclass", true) != null ?
      SLinkOperations.getTarget(thisNode, "superclass", true) :
      new ClassConcept_Behavior.QuotationClass_xjj00_a0a0a8().createNode()
    );
  }

  public static List<SNode> virtual_getOwnMethods_1906502351318572840(SNode thisNode) {
    List<SNode> baseMethodDeclarations = new ArrayList<SNode>();
    ListSequence.fromList(baseMethodDeclarations).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "method", true)));
    ListSequence.fromList(baseMethodDeclarations).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "staticMethod", true)));
    return baseMethodDeclarations;
  }

  public static boolean call_isRunnable_7941158526576616766(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "virtual_isRunnable_7941158526576616752", PARAMETERS_7941158526576616766);
  }

  public static SNode call_getSuperclass_1240936569950(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "virtual_getSuperclass_1240936569950", PARAMETERS_1240936569950);
  }

  public static boolean callSuper_isRunnable_7941158526576616766(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), callerConceptFqName, "virtual_isRunnable_7941158526576616752", PARAMETERS_7941158526576616766);
  }

  public static SNode callSuper_getSuperclass_1240936569950(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), callerConceptFqName, "virtual_getSuperclass_1240936569950", PARAMETERS_1240936569950);
  }

  public static SNode getContextClass_8008512149545173402(SNode expr) {
    SNode contextNode = expr;
    SNode parent = SNodeOperations.getAncestor(expr, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
      List<SNode> args = new ArrayList<SNode>();
      ListSequence.fromList(args).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "parameter", true)));
      ListSequence.fromList(args).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parent, "jetbrains.mps.baseLanguage.structure.AnonymousClass"), "actualArgument", true)));
      for (SNode param : args) {
        if (ListSequence.fromList(SNodeOperations.getDescendants(param, null, true, new String[]{})).contains(((SNode) expr))) {
          contextNode = parent;
          break;
        }
      }
    }
    return SNodeOperations.getAncestor(contextNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
  }

  public static class QuotationClass_xjj00_a0a0a8 {
    public QuotationClass_xjj00_a0a0a8() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
