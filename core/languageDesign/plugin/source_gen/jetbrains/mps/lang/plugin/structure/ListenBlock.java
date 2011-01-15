package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListenBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ListenBlock";

  public ListenBlock(SNode node) {
    super(node);
  }

  public static ListenBlock newInstance(SModel sm, boolean init) {
    return (ListenBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ListenBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListenBlock newInstance(SModel sm) {
    return ListenBlock.newInstance(sm, false);
  }
}
