package jetbrains.mps.ui.modeling.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class HasTemplate_Behavior {
  private static Class[] PARAMETERS_3939571372331676060 = {SNode.class, SModel.class, IScope.class};
  private static Class[] PARAMETERS_262873202871795827 = {SNode.class, SModel.class, IScope.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_findTemplate_262873202871795827(SNode thisNode, SModel model, IScope scope) {
    return HasTemplate_Behavior.call_findTemplate_3939571372331676060(thisNode, model, scope);
  }

  public static SNode call_findTemplate_3939571372331676060(SNode thisNode, SModel model, IScope scope) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.HasTemplate"), "virtual_findTemplate_3939571372331676060", PARAMETERS_3939571372331676060, model, scope);
  }

  public static SNode call_findTemplate_262873202871795827(SNode thisNode, SModel model, IScope scope) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.HasTemplate"), "virtual_findTemplate_262873202871795827", PARAMETERS_262873202871795827, model, scope);
  }

  public static SNode callSuper_findTemplate_3939571372331676060(SNode thisNode, String callerConceptFqName, SModel model, IScope scope) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.HasTemplate"), callerConceptFqName, "virtual_findTemplate_3939571372331676060", PARAMETERS_3939571372331676060, model, scope);
  }

  public static SNode callSuper_findTemplate_262873202871795827(SNode thisNode, String callerConceptFqName, SModel model, IScope scope) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.ui.modeling.structure.HasTemplate"), callerConceptFqName, "virtual_findTemplate_262873202871795827", PARAMETERS_262873202871795827, model, scope);
  }
}
