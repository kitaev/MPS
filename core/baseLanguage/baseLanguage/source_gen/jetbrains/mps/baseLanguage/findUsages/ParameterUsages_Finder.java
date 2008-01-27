package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import java.util.List;
import jetbrains.mps.ide.findusages.model.result.SearchResult;
import java.util.ArrayList;
import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ParameterUsages_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ParameterUsages_Finder");

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ParameterDeclaration";
  }

  public String getDescription() {
    return "Parameter Usages";
  }

  public boolean isApplicable(SNode node) {
    if(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false) == null && SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", false, false) == null) {
      return false;
    }
    return true;
  }

  public boolean isVisible() {
    return true;
  }

  public void doFind(SearchQuery searchQuery, SearchResults results) {
    SNode node = (SNode)searchQuery.getNode();
    SNode nodeParentMethod;
    if(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false) != null) {
      nodeParentMethod = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    } else
    {
      nodeParentMethod = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", false, false);
    }
    // null
    List<SearchResult> overridingMethods = new ArrayList<SearchResult>();
    overridingMethods.add(new SearchResult(nodeParentMethod, ""));
    try {
      BaseFinder _finder = (BaseFinder)Class.forName("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder").newInstance();
      SNode _node = nodeParentMethod;
      IScope _scope;
      _scope = searchQuery.getScope();
      boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
      if(!(rightConcept)) {
        ParameterUsages_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
      } else
      {
        boolean isApplicable = _finder.isApplicable(_node);
        if(!(isApplicable)) {
          ParameterUsages_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
        } else
        {
          SearchResults results_12 = _finder.find(new SearchQuery(_node, _scope));
          for(SearchResult result : results_12.getSearchResults()) {
            overridingMethods.add(result);
          }
        }
      }
    } catch (Throwable t) {
      ParameterUsages_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder" + "\"  Message:" + t.getMessage());
    }
    // null
    List<SearchResult> parameterUsages = new ArrayList<SearchResult>();
    {
      ICursor<SearchResult> _zCursor9 = CursorFactory.createCursor(overridingMethods);
      try {
        while(_zCursor9.moveToNext()) {
          SearchResult methodResult = _zCursor9.getCurrent();
          {
            SNode methodNode = (SNode)methodResult.getNode();
            SNode parameterNode = ListOperations.getElement(SLinkOperations.getTargets(methodNode, "parameter", true), SNodeOperations.getIndexInParent(node));
            results.getSearchedNodePointers().add(new SNodePointer(parameterNode));
            try {
              BaseFinder _finder = (BaseFinder)Class.forName("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder").newInstance();
              SNode _node = parameterNode;
              IScope _scope;
              _scope = searchQuery.getScope();
              boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.core.structure.BaseConcept");
              if(!(rightConcept)) {
                ParameterUsages_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
              } else
              {
                boolean isApplicable = _finder.isApplicable(_node);
                if(!(isApplicable)) {
                  ParameterUsages_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
                } else
                {
                  SearchResults results_13 = _finder.find(new SearchQuery(_node, _scope));
                  for(SearchResult result : results_13.getSearchResults()) {
                    parameterUsages.add(result);
                  }
                }
              }
            } catch (Throwable t) {
              ParameterUsages_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder" + "\"  Message:" + t.getMessage());
            }
          }
        }
      } finally {
        _zCursor9.release();
      }
    }
    // null
    {
      ICursor<SearchResult> _zCursor10 = CursorFactory.createCursor(parameterUsages);
      try {
        while(_zCursor10.moveToNext()) {
          SearchResult usage = _zCursor10.getCurrent();
          results.getSearchResults().add(new SearchResult(new SNodePointer(usage.getNode()), "Parameter Usages"));
        }
      } finally {
        _zCursor10.release();
      }
    }
  }

}
