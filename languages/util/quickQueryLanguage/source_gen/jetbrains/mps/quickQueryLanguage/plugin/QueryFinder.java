package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.findusages.view.FindUtils;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class QueryFinder implements IFinder {
  private Query myQuery;

  public QueryFinder(Query query) {
    this.myQuery = query;
  }

  public SearchResults find(SearchQuery searchQuery, ProgressIndicator indicator) {
    Object queryObject = searchQuery.getObjectHolder().getObject();
    assert queryObject instanceof SNode;
    SearchResults instances = FindUtils.getSearchResults(indicator, ((SNode) queryObject), searchQuery.getScope(), "jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder");
    List<SearchResult<SNode>> instancesList = instances.getSearchResults();
    Iterator<SearchResult<SNode>> it = ListSequence.fromList(instancesList).iterator();
    while (it.hasNext()) {
      SearchResult<SNode> current = it.next();
      try {
        if (!(this.myQuery.isSatisfies(current.getObject()))) {
          it.remove();
        }
      } catch (Throwable t) {
      }
    }
    return new SearchResults(instances.getSearchedNodes(), instancesList);
  }
}
