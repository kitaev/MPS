package jetbrains.mps.build.custommps.behavior;

/*Generated by MPS */

import jetbrains.mps.build.packaging.behavior.AbstractProjectComponent_BehaviorDescriptor;
import jetbrains.mps.build.packaging.behavior.ICompositeComponent_BehaviorDescriptor;
import jetbrains.mps.build.packaging.behavior.INotBuildableComponent_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.behavior.ICompositeComponent_Behavior;

public class MPSBuild_BehaviorDescriptor extends AbstractProjectComponent_BehaviorDescriptor implements ICompositeComponent_BehaviorDescriptor, INotBuildableComponent_BehaviorDescriptor {
  public MPSBuild_BehaviorDescriptor() {
  }

  public String virtual_getExcludes_1213877279373(SNode thisNode) {
    return ICompositeComponent_Behavior.virtual_getExcludes_1213877279373(thisNode);
  }

  public String virtual_getIncludes_1213877279430(SNode thisNode) {
    return ICompositeComponent_Behavior.virtual_getIncludes_1213877279430(thisNode);
  }

  public String virtual_getChildrenTargetDir_1237389224202(SNode thisNode) {
    return MPSBuild_Behavior.virtual_getChildrenTargetDir_1237389224202(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.build.custommps.structure.MPSBuild";
  }
}
