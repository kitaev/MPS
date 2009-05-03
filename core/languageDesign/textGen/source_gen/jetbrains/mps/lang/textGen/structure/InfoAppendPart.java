package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InfoAppendPart extends AbstractAppendPart {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.InfoAppendPart";
  public static final String VALUE = "value";

  public InfoAppendPart(SNode node) {
    super(node);
  }

  public Expression getValue() {
    return (Expression)this.getChild(Expression.class, InfoAppendPart.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(InfoAppendPart.VALUE, node);
  }


  public static InfoAppendPart newInstance(SModel sm, boolean init) {
    return (InfoAppendPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.InfoAppendPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InfoAppendPart newInstance(SModel sm) {
    return InfoAppendPart.newInstance(sm, false);
  }

}
