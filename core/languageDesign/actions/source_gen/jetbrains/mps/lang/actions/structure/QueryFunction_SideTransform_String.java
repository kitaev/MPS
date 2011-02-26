package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_SideTransform_String extends ConceptFunction implements ISideTransform_String {
  public static final String concept = "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_String";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public QueryFunction_SideTransform_String(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(QueryFunction_SideTransform_String.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(QueryFunction_SideTransform_String.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(QueryFunction_SideTransform_String.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(QueryFunction_SideTransform_String.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(QueryFunction_SideTransform_String.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(QueryFunction_SideTransform_String.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(QueryFunction_SideTransform_String._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, QueryFunction_SideTransform_String._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, QueryFunction_SideTransform_String._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(QueryFunction_SideTransform_String._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, QueryFunction_SideTransform_String._$ATTRIBUTE, node);
  }

  public static QueryFunction_SideTransform_String newInstance(SModel sm, boolean init) {
    return (QueryFunction_SideTransform_String) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_String", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_SideTransform_String newInstance(SModel sm) {
    return QueryFunction_SideTransform_String.newInstance(sm, false);
  }
}
