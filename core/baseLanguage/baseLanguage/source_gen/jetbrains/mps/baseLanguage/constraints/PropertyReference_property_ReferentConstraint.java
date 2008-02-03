package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersCache;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.search.VisibilityUtil;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class PropertyReference_property_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  PropertyReference_property_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.PropertyReference", "property", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.PropertyReference", "property");
  }

  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    if(!(SNodeOperations.isInstanceOf(enclosingNode, "jetbrains.mps.baseLanguage.structure.OperationExpression"))) {
      return false;
    }
    return (OperationExpression_Behavior.call_getClassifier_1201997214164(enclosingNode) != null);
  }

  public ISearchScope createNodeReferentSearchScope(final SModel model, final SNode enclosingNode, final SNode referenceNode, final IScope scope) {
    List<SNode> resultProperties = ListOperations.<SNode>createList();
    SNode opClassifier = OperationExpression_Behavior.call_getClassifier_1201997214164(enclosingNode);
    List<SNode> classifiers = ClassifierAndSuperClassifiersCache.getInstance(opClassifier).getClassifierNodes();
    {
      ICursor<SNode> _zCursor4 = CursorFactory.createCursor(classifiers);
      try {
        while(_zCursor4.moveToNext()) {
          SNode classifier = _zCursor4.getCurrent();
          if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
            SNode classConcept = classifier;
            List<SNode> properties = SLinkOperations.getTargets(classConcept, "property", true);
            {
              ICursor<SNode> _zCursor5 = CursorFactory.createCursor(properties);
              try {
                while(_zCursor5.moveToNext()) {
                  SNode property = _zCursor5.getCurrent();
                  if(VisibilityUtil.isVisible(enclosingNode, property)) {
                    ListOperations.addElement(resultProperties, property);
                  }
                }
              } finally {
                _zCursor5.release();
              }
            }
          }
        }
      } finally {
        _zCursor4.release();
      }
    }
    return new SimpleSearchScope(resultProperties);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
