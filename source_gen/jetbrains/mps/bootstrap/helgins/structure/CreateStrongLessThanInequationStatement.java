package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateStrongLessThanInequationStatement extends AbstractEquationStatement {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.CreateStrongLessThanInequationStatement";

  public  CreateStrongLessThanInequationStatement(SNode node) {
    super(node);
  }

  public static CreateStrongLessThanInequationStatement newInstance(SModel sm, boolean init) {
    return (CreateStrongLessThanInequationStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.CreateStrongLessThanInequationStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateStrongLessThanInequationStatement newInstance(SModel sm) {
    return CreateStrongLessThanInequationStatement.newInstance(sm, false);
  }

}
