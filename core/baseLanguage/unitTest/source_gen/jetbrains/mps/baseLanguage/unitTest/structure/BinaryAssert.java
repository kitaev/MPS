package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BinaryAssert extends Statement implements MessageHolder {
  public static final String concept = "jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPECTED = "expected";
  public static final String ACTUAL = "actual";
  public static final String MESSAGE = "message";

  public BinaryAssert(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BinaryAssert.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BinaryAssert.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BinaryAssert.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BinaryAssert.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BinaryAssert.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BinaryAssert.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpected() {
    return (Expression)this.getChild(Expression.class, BinaryAssert.EXPECTED);
  }

  public void setExpected(Expression node) {
    super.setChild(BinaryAssert.EXPECTED, node);
  }

  public Expression getActual() {
    return (Expression)this.getChild(Expression.class, BinaryAssert.ACTUAL);
  }

  public void setActual(Expression node) {
    super.setChild(BinaryAssert.ACTUAL, node);
  }

  public Message getMessage() {
    return (Message)this.getChild(Message.class, BinaryAssert.MESSAGE);
  }

  public void setMessage(Message node) {
    super.setChild(BinaryAssert.MESSAGE, node);
  }

  public static BinaryAssert newInstance(SModel sm, boolean init) {
    return (BinaryAssert)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BinaryAssert newInstance(SModel sm) {
    return BinaryAssert.newInstance(sm, false);
  }
}
