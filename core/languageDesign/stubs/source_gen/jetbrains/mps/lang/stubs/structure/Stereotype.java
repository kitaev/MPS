package jetbrains.mps.lang.stubs.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Stereotype extends Expression {
  public static final String concept = "jetbrains.mps.lang.stubs.structure.Stereotype";
  public static final String LANG_NAME = "langName";

  public Stereotype(SNode node) {
    super(node);
  }

  public Expression getLangName() {
    return (Expression) this.getChild(Expression.class, Stereotype.LANG_NAME);
  }

  public void setLangName(Expression node) {
    super.setChild(Stereotype.LANG_NAME, node);
  }

  public static Stereotype newInstance(SModel sm, boolean init) {
    return (Stereotype) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.stubs.structure.Stereotype", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Stereotype newInstance(SModel sm) {
    return Stereotype.newInstance(sm, false);
  }
}
