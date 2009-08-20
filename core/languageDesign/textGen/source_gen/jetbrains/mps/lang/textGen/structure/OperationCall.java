package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OperationCall extends AbstractAppendPart {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.OperationCall";
  public static final String FUNCTION = "function";
  public static final String PARAMETER = "parameter";

  public OperationCall(SNode node) {
    super(node);
  }

  public OperationDeclaration getFunction() {
    return (OperationDeclaration)this.getReferent(OperationDeclaration.class, OperationCall.FUNCTION);
  }

  public void setFunction(OperationDeclaration node) {
    super.setReferent(OperationCall.FUNCTION, node);
  }

  public int getParametersCount() {
    return this.getChildCount(OperationCall.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(Expression.class, OperationCall.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(Expression.class, OperationCall.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(OperationCall.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, OperationCall.PARAMETER, node);
  }

  public static OperationCall newInstance(SModel sm, boolean init) {
    return (OperationCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.OperationCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OperationCall newInstance(SModel sm) {
    return OperationCall.newInstance(sm, false);
  }
}
