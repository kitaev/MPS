package jetbrains.mps.ypath.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.collections.typesystem.TypeUtil_Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.ypath.behavior.TreePath_Behavior;

public class TreePathAspectUtil {

  public static List<SNode> getTreePathAspects(SNode expression, IScope scope) {
    List<SNode> treePathAspects = ListOperations.<SNode>createList();
    final Wrappers._T<SNode> expType = new Wrappers._T<SNode>(TypeChecker.getInstance().getTypeOf(expression));
    if ((expType.value != null)) {
      SNode sequencetype = TypeUtil_Collections.coerceTo_SequenceType(expType.value);
      if (sequencetype != null && !(SNodeOperations.isInstanceOf(expType.value, "jetbrains.mps.lang.smodel.structure.SNodeType"))) {
        expType.value = SLinkOperations.getTarget(sequencetype, "elementType", true);
      }
      SNode concept = (SNode)SConceptOperations.findConceptDeclaration("jetbrains.mps.ypath.structure.TreePathAspect");
      Iterable<SNode> instances = SModelOperations.getRootsIncludingImported(SNodeOperations.getModel(expression), scope, "jetbrains.mps.ypath.structure.TreePathAspect");
      ListSequence.fromList(treePathAspects).addSequence(Sequence.fromIterable(instances).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          SNode type = TreePath_Behavior.call_getNodeType_1213877481303(it);
          boolean result = false;
          if ((type != null)) {
            result = TypeChecker.getInstance().getSubtypingManager().isSubtype(expType.value, type, false);
          }
          return result;
        }

      }));
    }
    return treePathAspects;
  }

}
