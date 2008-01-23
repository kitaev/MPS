package jetbrains.accounting.money.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MoneyIsZeroMethodCall extends MoneyMethodCall {
  public static final String concept = "jetbrains.accounting.money.structure.MoneyIsZeroMethodCall";

  public  MoneyIsZeroMethodCall(SNode node) {
    super(node);
  }

  public static MoneyIsZeroMethodCall newInstance(SModel sm, boolean init) {
    return (MoneyIsZeroMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.accounting.money.structure.MoneyIsZeroMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MoneyIsZeroMethodCall newInstance(SModel sm) {
    return MoneyIsZeroMethodCall.newInstance(sm, false);
  }

}
