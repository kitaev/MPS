package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ypath.runtime.TreeTraversalFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class SnodeDemo {

  public static void main(String[] args) {
    SNode foo = null;
    TreeTraversalFactory.Traverse(TreeTraversalFactory.Traverse(TreeTraversalFactory.Traverse(new SNODE().startTraversal(foo), TreeTraversalFactory.Axis("CHILDREN"), SNODE.child("implements")), TreeTraversalFactory.Axis("CHILDREN"), SNODE.link("intfc")), TreeTraversalFactory.Axis("CHILDREN"), SNODE.child("extends"));
    SLinkOperations.getTargets(SLinkOperations.getTarget(SequenceOperations.getFirst(SLinkOperations.getTargets(foo, "implements", true)), "intfc", false), "extends", true);
    SequenceOperations.map(SequenceOperations.map((SLinkOperations.getTargets(foo, "implements", true)), new zMapper(null, null)), new zMapper1(null, null));
    // The following ypath construct should result in the same expression as above
    SequenceOperations.map(SequenceOperations.map(SLinkOperations.getTargets(foo, "implements", true), new zMapper2(null, null)), new zMapper3(null, null));
    SequenceOperations.map(ListOperations.createList(new SNode[]{SNodeOperations.getParent(foo, null, false, false)}), new zMapper4(null, null));
  }

}
