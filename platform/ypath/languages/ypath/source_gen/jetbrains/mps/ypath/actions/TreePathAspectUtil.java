package jetbrains.mps.ypath.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.ArrayList;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.TypeUtil_Collections;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class TreePathAspectUtil {

  public static List<SNode> getTreePathAspects(SNode expression, IScope scope) {
    final zClosureContext _zClosureContext = new zClosureContext();
    List<SNode> treePathAspects = new ArrayList<SNode>();
    _zClosureContext.expType = TypeChecker.getInstance().getTypeOf(expression);
    if((_zClosureContext.expType != null)) {
      SNode sequencetype = TypeUtil_Collections.coerceTo_SequenceType(_zClosureContext.expType);
      if(sequencetype != null && !(SNodeOperations.isInstanceOf(_zClosureContext.expType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"))) {
        _zClosureContext.expType = SLinkOperations.getTarget(sequencetype, "elementType", true);
      }
      SNode concept = (SNode)SConceptOperations.findConceptDeclaration("jetbrains.mps.ypath.structure.TreePathAspect");
      Iterable<SNode> instances = SModelOperations.getRootsIncludingImported(SNodeOperations.getModel(expression), scope, "jetbrains.mps.ypath.structure.TreePathAspect");
      ListOperations.addAllElements(treePathAspects, SequenceOperations.where(instances, new zPredicate(null, _zClosureContext)));
    }
    return treePathAspects;
  }

}
