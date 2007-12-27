package jetbrains.mps.ypath.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class TreeNodeKindProperty_default_PropertyConstraint implements IModelConstraints, INodePropertySetter {

  public  TreeNodeKindProperty_default_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertySetter("jetbrains.mps.ypath.structure.TreeNodeKindProperty", "default", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertySetter("jetbrains.mps.ypath.structure.TreeNodeKindProperty", "default");
  }

  public void execPropertySet(SNode node, String propertyName, String propertyValue, IScope scope) {
    if(Boolean.valueOf((SPropertyOperations.getBoolean(node, "default")))) {
      SNode treepath = SNodeOperations.getAncestor(node, "jetbrains.mps.ypath.structure.TreePathAspect", false, false);
      for(SNode desc : SNodeOperations.getDescendants(treepath, null, false)) {
        if(SNodeOperations.isInstanceOf(desc, "jetbrains.mps.ypath.structure.TreeNodeKindProperty")) {
          SPropertyOperations.set(desc, "default", "" + (false));
        }
      }
    }
    SPropertyOperations.set(node, "default", "" + ((SPropertyOperations.getBoolean(node, "default"))));
  }

}
