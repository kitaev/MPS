package jetbrains.mps.lang.core.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.presentation.ReferenceConceptUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class BaseConcept_Behavior {
  private static Class[] PARAMETERS_1213877396640 = {SNode.class};
  private static Class[] PARAMETERS_1213877396707 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean call_isInTemplates_1213877396627(SNode thisNode) {
    return SModelStereotype.isGeneratorModel(SNodeOperations.getModel(thisNode));
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(thisNode, "jetbrains.mps.lang.core.structure.INamedConcept")) {
      String name = SPropertyOperations.getString(SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.INamedConcept"), "name");
      if (name != null) {
        return name;
      }
      return "<no name>[" + SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "name") + "]";
    }
    // --
    String smartRefPresentation = ReferenceConceptUtil.getPresentation(thisNode);
    if (smartRefPresentation != null) {
      return smartRefPresentation;
    }
    // --
    String conceptAlias = SConceptPropertyOperations.getString(thisNode, "alias");
    if (conceptAlias != null) {
      return conceptAlias;
    }
    // --
    return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(thisNode), "name");
  }

  public static boolean virtual_useHorizontalInspector_1213877396707(SNode thisNode) {
    return false;
  }

  public static String call_getPresentation_1213877396640(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", PARAMETERS_1213877396640);
  }

  public static boolean call_useHorizontalInspector_1213877396707(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_useHorizontalInspector_1213877396707", PARAMETERS_1213877396707);
  }

  public static String callSuper_getPresentation_1213877396640(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.BaseConcept"), callerConceptFqName, "virtual_getPresentation_1213877396640", PARAMETERS_1213877396640);
  }

  public static boolean callSuper_useHorizontalInspector_1213877396707(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.core.structure.BaseConcept"), callerConceptFqName, "virtual_useHorizontalInspector_1213877396707", PARAMETERS_1213877396707);
  }

}
