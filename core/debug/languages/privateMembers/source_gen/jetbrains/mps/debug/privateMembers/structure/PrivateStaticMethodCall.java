package jetbrains.mps.debug.privateMembers.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.StaticMethodCall;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PrivateStaticMethodCall extends StaticMethodCall {
  public static final String concept = "jetbrains.mps.debug.privateMembers.structure.PrivateStaticMethodCall";

  public PrivateStaticMethodCall(SNode node) {
    super(node);
  }

  public static PrivateStaticMethodCall newInstance(SModel sm, boolean init) {
    return (PrivateStaticMethodCall) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.privateMembers.structure.PrivateStaticMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PrivateStaticMethodCall newInstance(SModel sm) {
    return PrivateStaticMethodCall.newInstance(sm, false);
  }
}
