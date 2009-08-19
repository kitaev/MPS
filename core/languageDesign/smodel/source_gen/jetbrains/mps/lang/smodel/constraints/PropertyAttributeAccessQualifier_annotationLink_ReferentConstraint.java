package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class PropertyAttributeAccessQualifier_annotationLink_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public PropertyAttributeAccessQualifier_annotationLink_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.PropertyAttributeAccessQualifier", "annotationLink", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.PropertyAttributeAccessQualifier", "annotationLink");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // all 'property' annotation links
    SNode ald = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration");
    List<SNode> annotationLinks = SConceptOperations.findConceptInstances(ald, operationContext.getScope());
    List<SNode> propertyAttrLinks = ListSequence.fromList(annotationLinks).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "stereotype", "property", "node");
      }
    }).toListSequence();
    return propertyAttrLinks;
  }
}
