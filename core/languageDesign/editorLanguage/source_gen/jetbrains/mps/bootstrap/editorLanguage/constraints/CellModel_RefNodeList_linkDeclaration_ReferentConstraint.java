package jetbrains.mps.bootstrap.editorLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.bootstrap.structureLanguage.behavior.LinkDeclaration_Behavior;

public class CellModel_RefNodeList_linkDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public CellModel_RefNodeList_linkDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList", "relationDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList", "relationDeclaration");
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode editorComponent = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.bootstrap.editorLanguage.structure.BaseEditorComponent", true, false);
    SNode editedConcept = SLinkOperations.getTarget(editorComponent, "conceptDeclaration", false);
    List<SNode> links = AbstractConceptDeclaration_Behavior.call_getAggregationLinkDeclarations_1213877394521(editedConcept);
    return new SimpleSearchScope(ListSequence.fromList(links).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return !(LinkDeclaration_Behavior.call_isSingular_1213877254557(it));
      }

    }).toListSequence());
  }

}
