package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArrayLiteral extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ArrayLiteral";
  public static final String ITEM = "item";

  public ArrayLiteral(SNode node) {
    super(node);
  }


  public int getItemsCount() {
    return this.getChildCount(ArrayLiteral.ITEM);
  }

  public Iterator<Expression> items() {
    return this.children(Expression.class, ArrayLiteral.ITEM);
  }

  public List<Expression> getItems() {
    return this.getChildren(Expression.class, ArrayLiteral.ITEM);
  }

  public void addItem(Expression node) {
    this.addChild(ArrayLiteral.ITEM, node);
  }

  public void insertItem(Expression prev, Expression node) {
    this.insertChild(prev, ArrayLiteral.ITEM, node);
  }


  public static ArrayLiteral newInstance(SModel sm, boolean init) {
    return (ArrayLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArrayLiteral newInstance(SModel sm) {
    return ArrayLiteral.newInstance(sm, false);
  }
}
