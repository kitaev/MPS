package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NewCreateBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.NewCreateBlock";

  public NewCreateBlock(SNode node) {
    super(node);
  }

  public static NewCreateBlock newInstance(SModel sm, boolean init) {
    return (NewCreateBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.NewCreateBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NewCreateBlock newInstance(SModel sm) {
    return NewCreateBlock.newInstance(sm, false);
  }
}
