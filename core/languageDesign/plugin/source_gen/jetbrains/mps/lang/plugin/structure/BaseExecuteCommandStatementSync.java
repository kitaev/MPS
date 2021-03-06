package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseExecuteCommandStatementSync extends BaseExecuteCommandStatement {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.BaseExecuteCommandStatementSync";

  public BaseExecuteCommandStatementSync(SNode node) {
    super(node);
  }

  public static BaseExecuteCommandStatementSync newInstance(SModel sm, boolean init) {
    return (BaseExecuteCommandStatementSync) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.BaseExecuteCommandStatementSync", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseExecuteCommandStatementSync newInstance(SModel sm) {
    return BaseExecuteCommandStatementSync.newInstance(sm, false);
  }
}
