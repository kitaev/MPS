package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class Property_HasValue_Simple extends SNodeOperation {
  public static String VALUE = "value";

  public  Property_HasValue_Simple(SNode node) {
    super(node);
  }

  public static Property_HasValue_Simple newInstance(SModel sm, boolean init) {
    return (Property_HasValue_Simple)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Property_HasValue_Simple", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Property_HasValue_Simple newInstance(SModel sm) {
    return Property_HasValue_Simple.newInstance(sm, false);
  }

  public Expression getValue() {
    return (Expression)this.getChild(Property_HasValue_Simple.VALUE);
  }
  public void setValue(Expression node) {
    super.setChild(Property_HasValue_Simple.VALUE, node);
  }
}
