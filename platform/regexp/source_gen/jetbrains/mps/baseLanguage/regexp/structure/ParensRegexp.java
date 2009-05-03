package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParensRegexp extends Regexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp";
  public static final String EXPR = "expr";

  public ParensRegexp(SNode node) {
    super(node);
  }

  public Regexp getExpr() {
    return (Regexp)this.getChild(Regexp.class, ParensRegexp.EXPR);
  }

  public void setExpr(Regexp node) {
    super.setChild(ParensRegexp.EXPR, node);
  }


  public static ParensRegexp newInstance(SModel sm, boolean init) {
    return (ParensRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParensRegexp newInstance(SModel sm) {
    return ParensRegexp.newInstance(sm, false);
  }

}
