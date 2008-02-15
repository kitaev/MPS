package jetbrains.mps.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class InvokeExpression extends Expression implements IInvokeExpression {
  public static final String concept = "jetbrains.mps.closures.structure.InvokeExpression";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String PARAMETER = "parameter";

  public  InvokeExpression(SNode node) {
    super(node);
  }

  public static InvokeExpression newInstance(SModel sm, boolean init) {
    return (InvokeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.closures.structure.InvokeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InvokeExpression newInstance(SModel sm) {
    return InvokeExpression.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(InvokeExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InvokeExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InvokeExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InvokeExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InvokeExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InvokeExpression.VIRTUAL_PACKAGE, value);
  }

  public int getParametersCount() {
    return this.getChildCount(InvokeExpression.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(InvokeExpression.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(InvokeExpression.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(InvokeExpression.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, InvokeExpression.PARAMETER, node);
  }

}
