package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.AbstractListOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddAllElementsOperation extends AbstractListOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation";
  public static final String ARGUMENT = "argument";

  public AddAllElementsOperation(SNode node) {
    super(node);
  }

  public Expression getArgument() {
    return (Expression)this.getChild(Expression.class, AddAllElementsOperation.ARGUMENT);
  }

  public void setArgument(Expression node) {
    super.setChild(AddAllElementsOperation.ARGUMENT, node);
  }


  public static AddAllElementsOperation newInstance(SModel sm, boolean init) {
    return (AddAllElementsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AddAllElementsOperation newInstance(SModel sm) {
    return AddAllElementsOperation.newInstance(sm, false);
  }

}
