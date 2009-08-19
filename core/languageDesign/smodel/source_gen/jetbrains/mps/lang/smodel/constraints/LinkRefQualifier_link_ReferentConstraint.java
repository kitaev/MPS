package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class LinkRefQualifier_link_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public LinkRefQualifier_link_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.LinkRefQualifier", "link", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.LinkRefQualifier", "link");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode dotOperand = IOperation_Behavior.call_getOperand_1213877410070(SNodeOperations.cast(SNodeOperations.getParent(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.lang.smodel.structure.LinkAttributeAccessQualifier")), "jetbrains.mps.baseLanguage.structure.IOperation"));
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(dotOperand), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), true);
    if (nodeType == null) {
      return null;
    }
    SNode dotOperandConcept = SLinkOperations.getTarget(nodeType, "concept", false);
    if (dotOperandConcept == null) {
      dotOperandConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
    }
    List<SNode> links = AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(dotOperandConcept);
    // reference only?
    links = ListSequence.fromList(links).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.hasValue(it, "metaClass", "reference", "reference");
      }
    }).toListSequence();
    return links;
  }
}
