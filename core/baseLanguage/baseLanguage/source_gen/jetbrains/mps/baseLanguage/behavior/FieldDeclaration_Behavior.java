package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import javax.swing.Icon;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FieldDeclaration_Behavior {
  private static Class[] PARAMETERS_8884554759541377970 = {SNode.class};
  private static Class[] PARAMETERS_4025276038182459890 = {SNode.class};

  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "visibility", "jetbrains.mps.baseLanguage.structure.PrivateVisibility");
  }

  public static String call_getGetterName_1213877243782(SNode thisNode) {
    String prefix = "get";
    if (TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(thisNode, "type", true), new FieldDeclaration_Behavior.QuotationClass_9617_0().createNode())) {
      prefix = "is";
    }
    return prefix + NameUtil.capitalize(SPropertyOperations.getString(thisNode, "name"));
  }

  public static Icon virtual_getAdditionalIcon_5017341185733863694(SNode thisNode) {
    return IVisible_Behavior.call_getVisibilityIcon_5017341185733869581(thisNode);
  }

  public static List<SNode> virtual_getChildrenToDisplayIntention_4025276038182325660(SNode thisNode) {
    List<SNode> result = HasAnnotation_Behavior.callSuper_getChildrenToDisplayIntention_4025276038182319200(thisNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration");
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "visibility", true));
    return result;
  }

  public static boolean call_hasGetter_1213877243808(SNode thisNode, SNode classConcept) {
    final SNode fieldDeclaration = thisNode;
    return ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return FieldDeclaration_Behavior.call_isGetter_1213877243833(fieldDeclaration, it);
      }
    }).isNotEmpty();
  }

  public static boolean call_isGetter_1213877243833(SNode thisNode, SNode method) {
    return ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty() && FieldDeclaration_Behavior.call_getGetterName_1213877243782(thisNode).equals(SPropertyOperations.getString(method, "name")) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(thisNode, "type", true), SLinkOperations.getTarget(method, "returnType", true));
  }

  public static String call_getSetterName_1213877243861(SNode thisNode) {
    return "set" + NameUtil.capitalize(SPropertyOperations.getString(thisNode, "name"));
  }

  public static boolean call_hasSetter_1213877243871(SNode thisNode, SNode classConcept) {
    final SNode fieldDeclaration = thisNode;
    return ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return FieldDeclaration_Behavior.call_isSetter_1213877243896(fieldDeclaration, it);
      }
    }).isNotEmpty();
  }

  public static boolean call_isSetter_1213877243896(SNode thisNode, SNode method) {
    return ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1 && FieldDeclaration_Behavior.call_getSetterName_1213877243861(thisNode).equals(SPropertyOperations.getString(method, "name")) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).first(), "type", true), SLinkOperations.getTarget(thisNode, "type", true));
  }

  public static boolean virtual_isInitializable_1213877517488(SNode thisNode) {
    return true;
  }

  public static Icon call_getAdditionalIcon_8884554759541377970(SNode thisNode) {
    return (Icon) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"), "virtual_getAdditionalIcon_5017341185733863694", PARAMETERS_8884554759541377970);
  }

  public static List<SNode> call_getChildrenToDisplayIntention_4025276038182459890(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"), "virtual_getChildrenToDisplayIntention_4025276038182325660", PARAMETERS_4025276038182459890);
  }

  public static Icon callSuper_getAdditionalIcon_8884554759541377970(SNode thisNode, String callerConceptFqName) {
    return (Icon) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"), callerConceptFqName, "virtual_getAdditionalIcon_5017341185733863694", PARAMETERS_8884554759541377970);
  }

  public static List<SNode> callSuper_getChildrenToDisplayIntention_4025276038182459890(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration"), callerConceptFqName, "virtual_getChildrenToDisplayIntention_4025276038182325660", PARAMETERS_4025276038182459890);
  }

  public static class QuotationClass_9617_0 {
    public QuotationClass_9617_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_9617_0 = null;
      {
        quotedNode_9617_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_9617_0 = quotedNode_9617_0;
        result = quotedNode1_9617_0;
      }
      return result;
    }
  }
}
