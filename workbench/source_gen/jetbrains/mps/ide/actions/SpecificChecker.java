package jetbrains.mps.ide.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public abstract class SpecificChecker {
  public abstract List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressContext progressContext, IOperationContext operationContext);

  protected static void addIssue(List<SearchResult<ModelCheckerIssue>> results, SNode node, String message, String severity, String category, IModelCheckerFix fix) {
    ListSequence.fromList(results).addElement(ModelCheckerIssue.getSearchResult(node, message, severity + SearchResult.SUBCATEGORY_SEPARATOR + category, fix));
  }
}
