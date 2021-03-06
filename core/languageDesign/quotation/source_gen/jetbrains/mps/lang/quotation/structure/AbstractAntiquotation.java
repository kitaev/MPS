package jetbrains.mps.lang.quotation.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.IMetaLevelChanger;
import jetbrains.mps.baseLanguage.structure.Expression;

public interface AbstractAntiquotation extends IMetaLevelChanger {
  public static final String concept = "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation";
  public static final String LABEL = "label";
  public static final String EXPRESSION = "expression";

  public String getLabel();
  public void setLabel(String value);
  public Expression getExpression();
  public void setExpression(Expression node);
}
