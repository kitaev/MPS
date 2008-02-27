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
import jetbrains.mps.ide.findusages.model.result.SearchResult;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class DerivedInterfaces_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Derived Interfaces";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  public boolean isApplicable(SNode node) {
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
      List<SearchResult> nodeUsagesRes = new ArrayList<SearchResult>();
      try {
        GeneratedFinder _finder = (GeneratedFinder) Class.forName("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder").newInstance();
        SNode _node = SequenceOperations.getFirst(derived);
        IScope _scope;
        _scope = searchQuery.getScope();
        boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.core.structure.BaseConcept");
        if (!(rightConcept)) {
          DerivedInterfaces_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
        } else {
          boolean isApplicable = _finder.isApplicable(_node);
          if (!(isApplicable)) {
            DerivedInterfaces_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
          } else {
            SearchResults results_4 = _finder.find(new SearchQuery(_node, _scope));
            for (SearchResult result : results_4.getSearchResults()) {
              nodeUsagesRes.add(result);
            }
          }
        }
      } catch (Throwable t) {
        DerivedInterfaces_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder" + "\"  Message:" + t.getMessage());
      }
      for (SearchResult result : nodeUsagesRes) {
        SNode node = result.getNode();
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
