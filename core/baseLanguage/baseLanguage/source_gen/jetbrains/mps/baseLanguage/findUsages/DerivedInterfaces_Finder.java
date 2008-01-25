package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.smodel.SNodePointer;

import java.util.List;
import java.util.ArrayList;

import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

import java.util.Set;

import jetbrains.mps.smodel.SReference;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.result.SearchResult;

public class DerivedInterfaces_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  public String getDescription() {
    return "Derived Interfaces";
  }

  public boolean isApplicable(SNode node) {
    return true;
  }

  public boolean isVisible() {
    return true;
  }

  public void doFind(SearchQuery searchQuery, SearchResults results) {
    // TODO: Quadratish , no gut
    SNode searchedNode = searchQuery.getNode();
    results.getSearchedNodePointers().add(new SNodePointer(searchedNode));
    // null
    List<SNode> derived = new ArrayList<SNode>();
    ListOperations.addElement(derived, (SNode) searchedNode);
    // null
    while (!(SequenceOperations.isEmpty(derived))) {
      // TODO: replace with finder from structure language
      Set<SReference> resRefs = FindUsagesManager.getInstance().findUsages(SequenceOperations.getFirst(derived), searchQuery.getScope());
      for (SReference reference : resRefs) {
        SNode node = reference.getSourceNode();
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "jetbrains.mps.baseLanguage.structure.Interface")) {
          if (SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface")) {
            ListOperations.addElement(derived, SNodeOperations.getParent(node, null, false, false));
          }
        }
      }
      if (SequenceOperations.getFirst(derived) != searchedNode) {
        results.getSearchResults().add(new SearchResult(new SNodePointer(SequenceOperations.getFirst(derived)), "Derived Interfaces"));
      }
      ListOperations.removeElement(derived, SequenceOperations.getFirst(derived));
    }
  }

}
