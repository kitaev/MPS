package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreeTraversalFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.SequenceWithSupplier;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class SnodeDemo {

  public static void main(String[] args) {
    final zClosureContext _zClosureContext3 = new zClosureContext();
    _zClosureContext3.foo = null;
    TreeTraversalFactory.Traverse(TreeTraversalFactory.Traverse(TreeTraversalFactory.Traverse(new SNODE().startTraversal(_zClosureContext3.foo), TreeTraversalFactory.Axis("CHILDREN"), SNODE.child("implements")), TreeTraversalFactory.Axis("CHILDREN"), SNODE.link("intfc")), TreeTraversalFactory.Axis("CHILDREN"), SNODE.child("extends"));
    SLinkOperations.getTargets(SLinkOperations.getTarget(SequenceOperations.getFirst(SLinkOperations.getTargets(_zClosureContext3.foo, "implements", true)), "intfc", false), "extends", true);
    SequenceOperations.map(SequenceOperations.map((new SequenceWithSupplier<SNode>(new zValueSupplier1(null, _zClosureContext3))), new zMapper(null, _zClosureContext3)), new zMapper1(null, _zClosureContext3));
    SNode foo2;
    SequenceOperations.map(SequenceOperations.map((new SequenceWithSupplier<Object>(new zValueSupplier2(null, _zClosureContext3))), new zMapper2(null, _zClosureContext3)), new zMapper3(null, _zClosureContext3));
    SConceptOperations.createNewNode(NameUtil.nodeFQName(SequenceOperations.getFirst((new SequenceWithSupplier<SNode>(new zValueSupplier3(null, _zClosureContext3))))), null);
    SNode bar = null;
    SNodeOperations.getDescendants(SLinkOperations.getTarget(SLinkOperations.getTarget(bar, "childrenBlock", true), "body", true), null, false);
    SNodeOperations.getAncestors(bar, null, false);
    SNodeOperations.getAncestor(bar, null, false, false);
    SNodeOperations.getChildren(bar);
    SNodeOperations.getDescendants(bar, null, false);
    SequenceOperations.map(SNodeOperations.getNextSiblings(bar, false), new zMapper4(null, _zClosureContext3));
    SNodeOperations.getPrevSiblings(bar, false);
    Iterable<SNode> blah = new SequenceWithSupplier<SNode>(new zValueSupplier4(null, _zClosureContext3));
  }

}
