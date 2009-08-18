package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArrayCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ArrayCreator";
  public static final String COMPONENT_TYPE = "componentType";
  public static final String DIMENSION_EXPRESSION = "dimensionExpression";

  public ArrayCreator(SNode node) {
    super(node);
  }


  public Type getComponentType() {
    return (Type)this.getChild(Type.class, ArrayCreator.COMPONENT_TYPE);
  }

  public void setComponentType(Type node) {
    super.setChild(ArrayCreator.COMPONENT_TYPE, node);
  }

  public int getDimensionExpressionsCount() {
    return this.getChildCount(ArrayCreator.DIMENSION_EXPRESSION);
  }

  public Iterator<DimensionExpression> dimensionExpressions() {
    return this.children(DimensionExpression.class, ArrayCreator.DIMENSION_EXPRESSION);
  }

  public List<DimensionExpression> getDimensionExpressions() {
    return this.getChildren(DimensionExpression.class, ArrayCreator.DIMENSION_EXPRESSION);
  }

  public void addDimensionExpression(DimensionExpression node) {
    this.addChild(ArrayCreator.DIMENSION_EXPRESSION, node);
  }

  public void insertDimensionExpression(DimensionExpression prev, DimensionExpression node) {
    this.insertChild(prev, ArrayCreator.DIMENSION_EXPRESSION, node);
  }


  public static ArrayCreator newInstance(SModel sm, boolean init) {
    return (ArrayCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArrayCreator newInstance(SModel sm) {
    return ArrayCreator.newInstance(sm, false);
  }
}
