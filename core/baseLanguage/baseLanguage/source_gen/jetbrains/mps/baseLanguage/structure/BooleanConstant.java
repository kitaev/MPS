package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BooleanConstant extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BooleanConstant";
  public static final String VALUE = "value";

  public BooleanConstant(SNode node) {
    super(node);
  }

  public boolean getValue() {
    return this.getBooleanProperty(BooleanConstant.VALUE);
  }

  public void setValue(boolean value) {
    this.setBooleanProperty(BooleanConstant.VALUE, value);
  }

  public static BooleanConstant newInstance(SModel sm, boolean init) {
    return (BooleanConstant) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BooleanConstant newInstance(SModel sm) {
    return BooleanConstant.newInstance(sm, false);
  }
}
