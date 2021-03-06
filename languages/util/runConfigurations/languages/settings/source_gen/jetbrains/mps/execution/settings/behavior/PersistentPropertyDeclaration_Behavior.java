package jetbrains.mps.execution.settings.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass_Behavior;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PersistentPropertyDeclaration_Behavior {
  private static Class[] PARAMETERS_946964771156066897 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_isTemplate_946964771156066860(SNode thisNode) {
    return TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(thisNode, "type", true), new PersistentPropertyDeclaration_Behavior.QuotationClass_ex141d_a1a0a0b().createNode());
  }

  public static String call_getAccessorName_946964771156066871(SNode thisNode) {
    String name = PersistentPropertyDeclaration_Behavior.removeMyPrefixInternal_946964771156066931(SPropertyOperations.getString(thisNode, "name"));
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }

  public static boolean virtual_isInitializable_1213877517488(SNode thisNode) {
    return true;
  }

  public static String call_getTypeFqName_946964771156066903(SNode thisNode) {
    SNode template = PersistentPropertyDeclaration_Behavior.call_getTemplate_946964771156066964(thisNode);
    return IGeneratedToClass_Behavior.call_getFullName_946964771156905503(template);
  }

  public static String call_getTypeEditorFqName_946964771156066917(SNode thisNode) {
    SNode template = PersistentPropertyDeclaration_Behavior.call_getTemplate_946964771156066964(thisNode);
    return PersistentConfiguration_Behavior.call_getFullEditorName_946964771156066491(template);
  }

  public static SNode call_getTemplate_946964771156066964(SNode thisNode) {
    assert PersistentPropertyDeclaration_Behavior.call_isTemplate_946964771156066860(thisNode);
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(SLinkOperations.getTarget(thisNode, "type", true), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType"), true), "persistentConfiguration", false);
  }

  public static boolean call_isInitializable_946964771156066897(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration"), "virtual_isInitializable_1213877517488", PARAMETERS_946964771156066897);
  }

  public static boolean callSuper_isInitializable_946964771156066897(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.settings.structure.PersistentPropertyDeclaration"), callerConceptFqName, "virtual_isInitializable_1213877517488", PARAMETERS_946964771156066897);
  }

  public static String removeMyPrefix_946964771156066836(String name) {
    name = PersistentPropertyDeclaration_Behavior.removeMyPrefixInternal_946964771156066931(name);
    return name.substring(0, 1).toLowerCase() + name.substring(1);
  }

  public static String removeMyPrefixInternal_946964771156066931(String name) {
    String prefix = "my";
    if (name.startsWith(prefix) && name.length() > 2) {
      name = name.substring(prefix.length());
    }
    return name;
  }

  public static String addMyPrefix_6314556899428615272(String name) {
    String prefix = "my";
    if (!(name.startsWith(prefix))) {
      if (name.length() > 1) {
        name = "my" + name.substring(0, 1).toUpperCase() + name.substring(1);
      } else {
        name = "my" + name;
      }
    }
    return name;
  }

  public static class QuotationClass_ex141d_a1a0a0b {
    public QuotationClass_ex141d_a1a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
