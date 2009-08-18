package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseMethodCall extends Expression implements IMethodCall {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BaseMethodCall";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String BASE_METHOD_DECLARATION = "baseMethodDeclaration";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public BaseMethodCall(SNode node) {
    super(node);
  }


  public String getShortDescription() {
    return this.getProperty(BaseMethodCall.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseMethodCall.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseMethodCall.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseMethodCall.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseMethodCall.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseMethodCall.VIRTUAL_PACKAGE, value);
  }

  public BaseMethodDeclaration getBaseMethodDeclaration() {
    return (BaseMethodDeclaration)this.getReferent(BaseMethodDeclaration.class, BaseMethodCall.BASE_METHOD_DECLARATION);
  }

  public void setBaseMethodDeclaration(BaseMethodDeclaration node) {
    super.setReferent(BaseMethodCall.BASE_METHOD_DECLARATION, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(BaseMethodCall.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(Expression.class, BaseMethodCall.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(Expression.class, BaseMethodCall.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(BaseMethodCall.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, BaseMethodCall.ACTUAL_ARGUMENT, node);
  }


  public static BaseMethodCall newInstance(SModel sm, boolean init) {
    return (BaseMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BaseMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseMethodCall newInstance(SModel sm) {
    return BaseMethodCall.newInstance(sm, false);
  }
}
