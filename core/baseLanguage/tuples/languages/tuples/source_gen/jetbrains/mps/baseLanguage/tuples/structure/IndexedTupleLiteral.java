package jetbrains.mps.baseLanguage.tuples.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IndexedTupleLiteral extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleLiteral";
  public static final String CPR_LeftBracket = "leftBracket";
  public static final String CPR_RightBracket = "rightBracket";
  public static final String COMPONENT = "component";

  public IndexedTupleLiteral(SNode node) {
    super(node);
  }

  public int getComponentsCount() {
    return this.getChildCount(IndexedTupleLiteral.COMPONENT);
  }

  public Iterator<Expression> components() {
    return this.children(Expression.class, IndexedTupleLiteral.COMPONENT);
  }

  public List<Expression> getComponents() {
    return this.getChildren(Expression.class, IndexedTupleLiteral.COMPONENT);
  }

  public void addComponent(Expression node) {
    this.addChild(IndexedTupleLiteral.COMPONENT, node);
  }

  public void insertComponent(Expression prev, Expression node) {
    this.insertChild(prev, IndexedTupleLiteral.COMPONENT, node);
  }


  public static IndexedTupleLiteral newInstance(SModel sm, boolean init) {
    return (IndexedTupleLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.IndexedTupleLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IndexedTupleLiteral newInstance(SModel sm) {
    return IndexedTupleLiteral.newInstance(sm, false);
  }

}
