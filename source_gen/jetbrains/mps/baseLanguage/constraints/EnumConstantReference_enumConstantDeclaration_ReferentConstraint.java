package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS  */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.baseLanguage.BaseLanguageSearchUtil_new;
import jetbrains.mps.baseLanguage.structure.EnumClass;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.EnumConstantReference;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class EnumConstantReference_enumConstantDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  EnumConstantReference_enumConstantDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.EnumConstantReference", "enumConstantDeclaration", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.EnumConstantReference", "enumConstantDeclaration");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return SLinkOperations.getTarget(referenceNode, "enumClass", false) != null;
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return BaseLanguageSearchUtil_new.createClassifierHierarchyScope(((EnumClass)SNodeOperations.getAdapter(SLinkOperations.getTarget(referenceNode, "enumClass", false))), ((EnumConstantReference)SNodeOperations.getAdapter(referenceNode)), IClassifiersSearchScope.ENUM_CONSTANT);
  }
  public String getNodeReferentSearchScopeDescription() {
    return "constants declared in the specified class";
  }
}
