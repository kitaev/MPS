package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkList_RemoveAllChildrenOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LinkList_RemoveAllChildrenOperation";

  public LinkList_RemoveAllChildrenOperation(SNode node) {
    super(node);
  }

  public static LinkList_RemoveAllChildrenOperation newInstance(SModel sm, boolean init) {
    return (LinkList_RemoveAllChildrenOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LinkList_RemoveAllChildrenOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkList_RemoveAllChildrenOperation newInstance(SModel sm) {
    return LinkList_RemoveAllChildrenOperation.newInstance(sm, false);
  }

}
