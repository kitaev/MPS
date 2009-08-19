package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_SideTransform_Icon extends ConceptFunction implements ISideTransform_String {
  public static final String concept = "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Icon";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public QueryFunction_SideTransform_Icon(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(QueryFunction_SideTransform_Icon.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(QueryFunction_SideTransform_Icon.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(QueryFunction_SideTransform_Icon.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(QueryFunction_SideTransform_Icon.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(QueryFunction_SideTransform_Icon.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(QueryFunction_SideTransform_Icon.VIRTUAL_PACKAGE, value);
  }

  public static QueryFunction_SideTransform_Icon newInstance(SModel sm, boolean init) {
    return (QueryFunction_SideTransform_Icon)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Icon", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_SideTransform_Icon newInstance(SModel sm) {
    return QueryFunction_SideTransform_Icon.newInstance(sm, false);
  }
}
