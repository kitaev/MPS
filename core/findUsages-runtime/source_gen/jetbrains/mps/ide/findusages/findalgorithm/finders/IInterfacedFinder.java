package jetbrains.mps.ide.findusages.findalgorithm.finders;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressIndicator;

public interface IInterfacedFinder extends IFinder {
  public String getConcept();
  public boolean isApplicable(SNode node);
  public boolean isVisible(SNode node);
  public String getDescription();
  public String getLongDescription();
  public boolean canNavigate();
  public SNode getNodeToNavigate();
  public SearchResults<SNode> find(SearchQuery query, ProgressIndicator indicator);
}
