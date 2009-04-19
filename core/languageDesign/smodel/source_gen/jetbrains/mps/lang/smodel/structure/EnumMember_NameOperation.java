package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EnumMember_NameOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.EnumMember_NameOperation";

  public EnumMember_NameOperation(SNode node) {
    super(node);
  }

  public static EnumMember_NameOperation newInstance(SModel sm, boolean init) {
    return (EnumMember_NameOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.EnumMember_NameOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EnumMember_NameOperation newInstance(SModel sm) {
    return EnumMember_NameOperation.newInstance(sm, false);
  }

}
