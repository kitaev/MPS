package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.codeStyle.CodeStyleSettings;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ParameterDeclaration_Behavior {
  private static Class[] PARAMETERS_3012473318495506887 = {SNode.class ,Project.class};
  private static Class[] PARAMETERS_3012473318495506881 = {SNode.class ,Project.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createReference_1213877517482(SNode thisNode) {
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ParameterReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", thisNode, false);
    return ref;
  }

  public static boolean virtual_isCanBeUnused_1223985713603(SNode thisNode) {
    SNode method = SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");

    if (SPropertyOperations.getBoolean(method, "isFinal") && !(BaseMethodDeclaration_Behavior.call_hasAnnotation_5499146221535822693(method, SNodeOperations.getNode("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)", "~Override"))) || SNodeOperations.isInstanceOf(method, "jetbrains.mps.baseLanguage.structure.IVisible") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(method, "jetbrains.mps.baseLanguage.structure.IVisible"), "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
      return true;
    }
    return false;
  }

  public static String virtual_getSuffix_3012473318495499856(SNode thisNode, Project project) {
    CodeStyleSettings settings = CodeStyleSettings.getInstance(project);
    if (settings == null) {
      return "";
    }
    return (settings.getParameterSettings().o2 == null ?
      "" :
      settings.getParameterSettings().o2
    );
  }

  public static String virtual_getPrefix_3012473318495495520(SNode thisNode, Project project) {
    CodeStyleSettings settings = CodeStyleSettings.getInstance(project);
    if (settings == null) {
      return "";
    }
    return (settings.getParameterSettings().o1 == null ?
      "" :
      settings.getParameterSettings().o1
    );
  }

  public static boolean call_hasAnnotation_5499146221535981742(SNode thisNode, SNode annotation) {
    for (SNode annotationInstance : SLinkOperations.getTargets(thisNode, "annotation", true)) {
      if (SLinkOperations.getTarget(annotationInstance, "annotation", false) == annotation) {
        return true;
      }
    }
    return false;
  }

  public static String call_getSuffix_3012473318495506887(SNode thisNode, Project project) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), "virtual_getSuffix_3012473318495499856", PARAMETERS_3012473318495506887, project);
  }

  public static String call_getPrefix_3012473318495506881(SNode thisNode, Project project) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), "virtual_getPrefix_3012473318495495520", PARAMETERS_3012473318495506881, project);
  }

  public static String callSuper_getSuffix_3012473318495506887(SNode thisNode, String callerConceptFqName, Project project) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), callerConceptFqName, "virtual_getSuffix_3012473318495499856", PARAMETERS_3012473318495506887, project);
  }

  public static String callSuper_getPrefix_3012473318495506881(SNode thisNode, String callerConceptFqName, Project project) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"), callerConceptFqName, "virtual_getPrefix_3012473318495495520", PARAMETERS_3012473318495506881, project);
  }
}
