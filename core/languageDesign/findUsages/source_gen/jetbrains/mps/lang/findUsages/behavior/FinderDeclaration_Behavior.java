package jetbrains.mps.lang.findUsages.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class FinderDeclaration_Behavior {
  private static Class[] PARAMETERS_8952337903384724634 = {SNode.class};
  private static Class[] PARAMETERS_6261424444345979396 = {SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedClassName_1213877240101(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Finder";
  }

  public static String call_getConceptName_1213877240111(SNode thisNode) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(thisNode, "forConcept", false));
  }

  public static String call_getGeneratedClassLongName_1213877240120(SNode thisNode) {
    return ((SModel) SNodeOperations.getModel(thisNode)).getModelDescriptor().getLongName() + "." + FinderDeclaration_Behavior.call_getGeneratedClassName_1213877240101(thisNode);
  }

  public static PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return new PropertyReference(thisNode, "description");
  }

  public static SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "forConcept", false);
  }

  public static void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    SLinkOperations.setTarget(thisNode, "forConcept", baseConcept, false);
  }

  public static SNode call_getBaseConcept_8952337903384724634(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), "virtual_getBaseConcept_2621449412040133768", PARAMETERS_8952337903384724634);
  }

  public static void call_setBaseConcept_6261424444345979396(SNode thisNode, SNode baseConcept) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345979396, baseConcept);
  }

  public static SNode callSuper_getBaseConcept_8952337903384724634(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), callerConceptFqName, "virtual_getBaseConcept_2621449412040133768", PARAMETERS_8952337903384724634);
  }

  public static void callSuper_setBaseConcept_6261424444345979396(SNode thisNode, String callerConceptFqName, SNode baseConcept) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.findUsages.structure.FinderDeclaration"), callerConceptFqName, "virtual_setBaseConcept_6261424444345963020", PARAMETERS_6261424444345979396, baseConcept);
  }
}
