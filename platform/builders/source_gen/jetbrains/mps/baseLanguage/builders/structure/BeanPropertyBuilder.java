package jetbrains.mps.baseLanguage.builders.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BeanPropertyBuilder extends Builder {
  public static final String concept = "jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder";
  public static final String SETTER = "setter";
  public static final String VALUE = "value";

  public BeanPropertyBuilder(SNode node) {
    super(node);
  }

  public InstanceMethodDeclaration getSetter() {
    return (InstanceMethodDeclaration)this.getReferent(InstanceMethodDeclaration.class, BeanPropertyBuilder.SETTER);
  }

  public void setSetter(InstanceMethodDeclaration node) {
    super.setReferent(BeanPropertyBuilder.SETTER, node);
  }

  public Expression getValue() {
    return (Expression)this.getChild(Expression.class, BeanPropertyBuilder.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(BeanPropertyBuilder.VALUE, node);
  }

  public static BeanPropertyBuilder newInstance(SModel sm, boolean init) {
    return (BeanPropertyBuilder)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BeanPropertyBuilder newInstance(SModel sm) {
    return BeanPropertyBuilder.newInstance(sm, false);
  }
}
