package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OrAssignmentExpression extends BaseAssignmentExpression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.OrAssignmentExpression";

  public OrAssignmentExpression(SNode node) {
    super(node);
  }

  public static OrAssignmentExpression newInstance(SModel sm, boolean init) {
    return (OrAssignmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.OrAssignmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OrAssignmentExpression newInstance(SModel sm) {
    return OrAssignmentExpression.newInstance(sm, false);
  }
}
