package jetbrains.mps.samples.xmlLiterals.structure;

/*Generated by MPS */

import jetbrains.mps.xml.structure.Content;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ElementMacro extends Content {
  public static final String concept = "jetbrains.mps.samples.xmlLiterals.structure.ElementMacro";
  public static final String EXPRESSION = "expression";

  public ElementMacro(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression) this.getChild(Expression.class, ElementMacro.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(ElementMacro.EXPRESSION, node);
  }

  public static ElementMacro newInstance(SModel sm, boolean init) {
    return (ElementMacro) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.xmlLiterals.structure.ElementMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ElementMacro newInstance(SModel sm) {
    return ElementMacro.newInstance(sm, false);
  }
}
