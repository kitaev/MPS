package jetbrains.mps.bootstrap.structureLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.Set;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

public class NodeUsages_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder");

  public String getDescription() {
    return "Node Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.core.structure.BaseConcept";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    Set<SReference> resRefs = FindUsagesManager.getInstance().findUsages(CollectionUtil.asSet(node), scope, new FindUsagesManager.ProgressAdapter(indicator), false);
    for(SReference reference : resRefs) {
      ListOperations.addElement(_results, reference.getSourceNode());
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Node Usages";
  }

}
