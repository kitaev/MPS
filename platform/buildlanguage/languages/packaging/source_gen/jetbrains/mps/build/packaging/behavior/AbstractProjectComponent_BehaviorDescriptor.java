package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import java.io.File;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public abstract class AbstractProjectComponent_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor {
  public AbstractProjectComponent_BehaviorDescriptor() {
  }

  public File virtual_getPath_1213877333777(SNode thisNode) {
    return AbstractProjectComponent_Behavior.virtual_getPath_1213877333777(thisNode);
  }

  public boolean virtual_equals_1213877333900(SNode thisNode, SNode snode) {
    return AbstractProjectComponent_Behavior.virtual_equals_1213877333900(thisNode, snode);
  }

  public List<SNode> virtual_getPostProcessingTasks_1213877333861(SNode thisNode) {
    return AbstractProjectComponent_Behavior.virtual_getPostProcessingTasks_1213877333861(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }
}
