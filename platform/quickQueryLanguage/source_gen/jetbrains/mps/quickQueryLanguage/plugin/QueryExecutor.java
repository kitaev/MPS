package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.embeddableEditor.GenerateResult;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.holders.NodeHolder;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.bootstrap.structureLanguage.findUsages.ConceptInstances_Finder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import java.util.Iterator;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class QueryExecutor {

  private final String myClassType = ".Query";
  private String myClassName;
  private ClassLoader myLoader;
  private SNode myModelQuery;
  private IOperationContext myContext;
  private Query myQuery;
  private List<SearchResult<SNode>> myResult;

  public QueryExecutor(final GenerateResult generateResult) {
    this.setFields(generateResult);
    if (generateResult.getModelDescriptor() != null) {
      this.myClassName = generateResult.getModelDescriptor().getLongName() + this.myClassType;
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          QueryExecutor.this.myLoader = generateResult.getLoader(QueryExecutor.this);
        }

      });
    }
  }

  private void setFields(GenerateResult result) {
    this.myModelQuery = result.getSNode();
    this.myContext = result.getOperationContext();
  }

  public List<SNode> getSearchResult() {
    List<SNode> results = new ArrayList<SNode>();
    for(SearchResult<SNode> nodeResult : this.myResult) {
      results.add(nodeResult.getObject());
    }
    return results;
  }

  public Query getQuery() {
    return this.myQuery;
  }

  public void run(@NotNull() final ProgressIndicator indicator, final IScope scope) {
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        try {
          List<SearchResult<SNode>> instancesList;
          QueryExecutor.this.myQuery = (Query)Class.forName(QueryExecutor.this.myClassName, true, QueryExecutor.this.myLoader).newInstance();
          /*
            String conceptFqName = QueryExecutor.this.myQuery.getConcept();
            SNode c = SModelUtil_new.findConceptDeclaration(conceptFqName, GlobalScope.getInstance());
          */
          SearchQuery searchQuery = new SearchQuery(new NodeHolder(SLinkOperations.getTarget(QueryExecutor.this.myModelQuery, "conceptDeclaration", false)), scope);
          BaseFinder[] finders = new BaseFinder[1];
          finders[0] = new ConceptInstances_Finder();
          SearchResults instances = FindUtils.getSearchResults(indicator, searchQuery, finders);
          instancesList = instances.getSearchResults();
          Iterator<SearchResult<SNode>> it = instancesList.iterator();
          while (it.hasNext()) {
            SearchResult<SNode> current = it.next();
            if (!(QueryExecutor.this.myQuery.isSatisfies(current.getObject()))) {
              it.remove();
            }
          }
          QueryExecutor.this.myContext.getProject().getComponent(UsagesViewTool.class).showResults(searchQuery, new SearchResults(instances.getSearchedNodes(), instancesList));
          QueryExecutor.this.myResult = instancesList;
        } catch (Throwable t) {
          t.printStackTrace();
        }
      }

    });
  }

}
