package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.ide.findusages.view.FindUtils;

public class InterfaceAncestors_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.InterfaceAncestors_Finder");

  public boolean isVisible(SNode node, IScope scope) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "extendedInterface", true)).isNotEmpty();
  }

  public String getDescription() {
    return "Interface Ancestors";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "extendedInterface", true)).isEmpty()) {
      return;
    }
    SNode current = node;
    for(SNode ancestor : Sequence.fromIterable(SLinkOperations.getTargets(current, "extendedInterface", true))) {
      SNode ancestorNode = (SNode)SLinkOperations.getTarget(ancestor, "classifier", false);
      ListOperations.addElement(_results, ancestorNode);
      for(SNode ancestorAncestor : Sequence.fromIterable(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.InterfaceAncestors_Finder", ancestorNode, scope, indicator))) {
        ListOperations.addElement(_results, ancestorAncestor);
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Ancestor";
  }

}
