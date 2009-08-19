package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SEnum_MemberForNameOperation extends BaseConcept implements SEnumOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.SEnum_MemberForNameOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME_EXPRESSION = "nameExpression";

  public SEnum_MemberForNameOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SEnum_MemberForNameOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SEnum_MemberForNameOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SEnum_MemberForNameOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SEnum_MemberForNameOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SEnum_MemberForNameOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SEnum_MemberForNameOperation.VIRTUAL_PACKAGE, value);
  }

  public Expression getNameExpression() {
    return (Expression)this.getChild(Expression.class, SEnum_MemberForNameOperation.NAME_EXPRESSION);
  }

  public void setNameExpression(Expression node) {
    super.setChild(SEnum_MemberForNameOperation.NAME_EXPRESSION, node);
  }

  public static SEnum_MemberForNameOperation newInstance(SModel sm, boolean init) {
    return (SEnum_MemberForNameOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SEnum_MemberForNameOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SEnum_MemberForNameOperation newInstance(SModel sm) {
    return SEnum_MemberForNameOperation.newInstance(sm, false);
  }
}
