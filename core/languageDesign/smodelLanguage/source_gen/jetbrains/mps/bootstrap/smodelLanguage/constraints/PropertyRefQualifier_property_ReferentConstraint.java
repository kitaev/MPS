package jetbrains.mps.bootstrap.smodelLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.constraints.IOperation_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;

public class PropertyRefQualifier_property_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  PropertyRefQualifier_property_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier", "property", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier", "property");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    SNode dotOperand = IOperation_Behavior.call_getOperand_1197028596169(SNodeOperations.getParent(enclosingNode, null, false, false));
    SNode nodeType = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getTypeOf(dotOperand), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"), true);
    if(nodeType == null) {
      return null;
    }
    return null;
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
