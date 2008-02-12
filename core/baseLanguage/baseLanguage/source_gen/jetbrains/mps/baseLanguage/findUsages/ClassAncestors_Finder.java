package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.ide.findusages.model.result.SearchResult;

public class ClassAncestors_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Ancestors";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isApplicable(SNode node) {
    return SLinkOperations.getTarget(node, "superclass", true) != null;
  }

  public void doFind(SearchQuery searchQuery, SearchResults results) {
    results.getSearchedNodePointers().add(new SNodePointer(searchQuery.getNode()));
    SNode current = (SNode) searchQuery.getNode();
    while (current != null) {
      current = SLinkOperations.getTarget(SLinkOperations.getTarget(current, "superclass", true), "classifier", false);
      if (current != null) {
        results.getSearchResults().add(new SearchResult(new SNodePointer(current), "Ancestor"));
      }
    }
  }

}
