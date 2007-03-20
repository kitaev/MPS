package jetbrains.mps.bootstrap.structureLanguage.constraints;

/*Generated by MPS  */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class AnnotationLinkDeclaration_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public  AnnotationLinkDeclaration_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration", "name", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration", "name");
  }
  public String execPropertyGet(SNode node, String propertyName, IScope scope) {
    return SPropertyOperations.getString(node, "role");
  }
}
