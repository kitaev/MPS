package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.buildlanguage.behavior.IAntScript_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class Layout_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements ILayoutComponent_BehaviorDescriptor, INamedConcept_BehaviorDescriptor, IVariableHolder_BehaviorDescriptor, IMacroHolder_BehaviorDescriptor, IAntScript_BehaviorDescriptor {
  public Layout_BehaviorDescriptor() {
  }

  public String virtual_getPath_1234976932856(SNode thisNode) {
    return Layout_Behavior.virtual_getPath_1234976932856(thisNode);
  }

  public List<SNode> virtual_getAllVariable_1234864693585(SNode thisNode) {
    return Layout_Behavior.virtual_getAllVariable_1234864693585(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public List<String> virtual_getAllMacroNames_1234975567387(SNode thisNode, boolean addBasedir) {
    return IMacroHolder_Behavior.virtual_getAllMacroNames_1234975567387(thisNode, addBasedir);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.build.packaging.structure.Layout";
  }
}
