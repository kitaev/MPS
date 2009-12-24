package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveSTByConditionPart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.lang.actions.structure.RemoveSTByConditionPart";
  public static final String CONDITION = "condition";

  public RemoveSTByConditionPart(SNode node) {
    super(node);
  }

  public QueryFunction_ST_RemoveBy_Condition getCondition() {
    return (QueryFunction_ST_RemoveBy_Condition) this.getChild(QueryFunction_ST_RemoveBy_Condition.class, RemoveSTByConditionPart.CONDITION);
  }

  public void setCondition(QueryFunction_ST_RemoveBy_Condition node) {
    super.setChild(RemoveSTByConditionPart.CONDITION, node);
  }

  public static RemoveSTByConditionPart newInstance(SModel sm, boolean init) {
    return (RemoveSTByConditionPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.RemoveSTByConditionPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveSTByConditionPart newInstance(SModel sm) {
    return RemoveSTByConditionPart.newInstance(sm, false);
  }
}
