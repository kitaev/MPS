package jetbrains.mps.bootstrap.structureLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

import java.util.List;
import java.util.Set;

import jetbrains.mps.smodel.SReference;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import org.jetbrains.annotations.Nullable;

public class NodeUsages_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Node Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.core.structure.BaseConcept";
  }

  public boolean isApplicable(SNode node) {
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results) {
    Set<SReference> resRefs = FindUsagesManager.getInstance().findUsages(node, scope);
    for (SReference reference : resRefs) {
      ListOperations.addElement(_results, reference.getSourceNode());
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Node Usages";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}
