package jetbrains.mps.baseLanguage.builders.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleBuilderPropertyBuilder extends Builder {
  public static final String concept = "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder";
  public static final String DECLARATION = "declaration";
  public static final String VALUE = "value";

  public SimpleBuilderPropertyBuilder(SNode node) {
    super(node);
  }

  public SimpleBuilderProperty getDeclaration() {
    return (SimpleBuilderProperty) this.getReferent(SimpleBuilderProperty.class, SimpleBuilderPropertyBuilder.DECLARATION);
  }

  public void setDeclaration(SimpleBuilderProperty node) {
    super.setReferent(SimpleBuilderPropertyBuilder.DECLARATION, node);
  }

  public Expression getValue() {
    return (Expression) this.getChild(Expression.class, SimpleBuilderPropertyBuilder.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(SimpleBuilderPropertyBuilder.VALUE, node);
  }

  public static SimpleBuilderPropertyBuilder newInstance(SModel sm, boolean init) {
    return (SimpleBuilderPropertyBuilder) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleBuilderPropertyBuilder newInstance(SModel sm) {
    return SimpleBuilderPropertyBuilder.newInstance(sm, false);
  }
}
