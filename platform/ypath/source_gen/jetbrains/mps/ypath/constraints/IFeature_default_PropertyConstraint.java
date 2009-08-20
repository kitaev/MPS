package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IFeature_default_PropertyConstraint implements IModelConstraints, INodePropertySetter {
  public IFeature_default_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertySetter("jetbrains.mps.ypath.structure.IFeature", "default", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertySetter("jetbrains.mps.ypath.structure.IFeature", "default");
  }

  public void execPropertySet(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
    if ((SPropertyOperations.getBoolean(propertyValue))) {
      for (SNode foo : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.ypath.structure.TreePathAspect"), "features", true))) {
        if (foo != node) {
          SPropertyOperations.set(foo, "default", "" + (false));
        }
      }
    }
    node.setProperty("default", String.valueOf((SPropertyOperations.getBoolean(propertyValue))), false);
  }
}
