package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.AbstractListOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SetElementOperation extends AbstractListOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SetElementOperation";
  public static final String INDEX = "index";
  public static final String ELEMENT = "element";

  public SetElementOperation(SNode node) {
    super(node);
  }

  public Expression getIndex() {
    return (Expression)this.getChild(Expression.class, SetElementOperation.INDEX);
  }

  public void setIndex(Expression node) {
    super.setChild(SetElementOperation.INDEX, node);
  }

  public Expression getElement() {
    return (Expression)this.getChild(Expression.class, SetElementOperation.ELEMENT);
  }

  public void setElement(Expression node) {
    super.setChild(SetElementOperation.ELEMENT, node);
  }


  public static SetElementOperation newInstance(SModel sm, boolean init) {
    return (SetElementOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SetElementOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SetElementOperation newInstance(SModel sm) {
    return SetElementOperation.newInstance(sm, false);
  }

}
