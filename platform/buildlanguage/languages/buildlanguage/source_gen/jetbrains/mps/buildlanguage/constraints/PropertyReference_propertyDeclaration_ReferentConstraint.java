package jetbrains.mps.buildlanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class PropertyReference_propertyDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  PropertyReference_propertyDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.buildlanguage.structure.PropertyReference", "propertyDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.buildlanguage.structure.PropertyReference", "propertyDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    List<SNode> result = new ArrayList<SNode>();
    {
      ICursor<SNode> _zCursor = CursorFactory.createCursor(SNodeOperations.getAncestors(enclosingNode, "jetbrains.mps.buildlanguage.structure.IPropertyHolder", true));
      try {
        while(_zCursor.moveToNext()) {
          SNode holder = _zCursor.getCurrent();
          ListOperations.addAllElements(result, SLinkOperations.getTargets(holder, "propertyList", true));
        }
      } finally {
        _zCursor.release();
      }
    }
    return new SimpleSearchScope(result);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
