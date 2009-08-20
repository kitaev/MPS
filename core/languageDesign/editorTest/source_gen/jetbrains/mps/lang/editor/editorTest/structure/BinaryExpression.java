package jetbrains.mps.lang.editor.editorTest.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BinaryExpression extends BaseConcept implements IBaseTestBlock {
  public static final String concept = "jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LEFT = "left";
  public static final String RIGHT = "right";

  public BinaryExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BinaryExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BinaryExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BinaryExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BinaryExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BinaryExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BinaryExpression.VIRTUAL_PACKAGE, value);
  }

  public IBaseTestBlock getLeft() {
    return (IBaseTestBlock)this.getChild(IBaseTestBlock.class, BinaryExpression.LEFT);
  }

  public void setLeft(IBaseTestBlock node) {
    super.setChild(BinaryExpression.LEFT, node);
  }

  public IBaseTestBlock getRight() {
    return (IBaseTestBlock)this.getChild(IBaseTestBlock.class, BinaryExpression.RIGHT);
  }

  public void setRight(IBaseTestBlock node) {
    super.setChild(BinaryExpression.RIGHT, node);
  }

  public static BinaryExpression newInstance(SModel sm, boolean init) {
    return (BinaryExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BinaryExpression newInstance(SModel sm) {
    return BinaryExpression.newInstance(sm, false);
  }
}
