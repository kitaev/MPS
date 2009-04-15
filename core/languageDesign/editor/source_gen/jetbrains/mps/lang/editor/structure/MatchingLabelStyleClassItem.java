package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.StyleClassItem;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.structure.QueryFunction_String;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchingLabelStyleClassItem extends StyleClassItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem";
  public static final String LABEL_NAME = "labelName";
  public static final String QUERY = "query";

  public MatchingLabelStyleClassItem(SNode node) {
    super(node);
  }

  public String getLabelName() {
    return this.getProperty(MatchingLabelStyleClassItem.LABEL_NAME);
  }

  public void setLabelName(String value) {
    this.setProperty(MatchingLabelStyleClassItem.LABEL_NAME, value);
  }

  public QueryFunction_String getQuery() {
    return (QueryFunction_String)this.getChild(QueryFunction_String.class, MatchingLabelStyleClassItem.QUERY);
  }

  public void setQuery(QueryFunction_String node) {
    super.setChild(MatchingLabelStyleClassItem.QUERY, node);
  }


  public static MatchingLabelStyleClassItem newInstance(SModel sm, boolean init) {
    return (MatchingLabelStyleClassItem)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatchingLabelStyleClassItem newInstance(SModel sm) {
    return MatchingLabelStyleClassItem.newInstance(sm, false);
  }

}
