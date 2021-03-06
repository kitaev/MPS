package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class XMLSAXBreakStatement extends Statement {
  public static final String concept = "jetbrains.mps.xmlQuery.structure.XMLSAXBreakStatement";
  public static final String RESULT = "result";

  public XMLSAXBreakStatement(SNode node) {
    super(node);
  }

  public Expression getResult() {
    return (Expression) this.getChild(Expression.class, XMLSAXBreakStatement.RESULT);
  }

  public void setResult(Expression node) {
    super.setChild(XMLSAXBreakStatement.RESULT, node);
  }

  public static XMLSAXBreakStatement newInstance(SModel sm, boolean init) {
    return (XMLSAXBreakStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlQuery.structure.XMLSAXBreakStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static XMLSAXBreakStatement newInstance(SModel sm) {
    return XMLSAXBreakStatement.newInstance(sm, false);
  }
}
