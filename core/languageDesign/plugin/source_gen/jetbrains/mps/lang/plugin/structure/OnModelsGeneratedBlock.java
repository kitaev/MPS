package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OnModelsGeneratedBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.OnModelsGeneratedBlock";

  public OnModelsGeneratedBlock(SNode node) {
    super(node);
  }

  public static OnModelsGeneratedBlock newInstance(SModel sm, boolean init) {
    return (OnModelsGeneratedBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.OnModelsGeneratedBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OnModelsGeneratedBlock newInstance(SModel sm) {
    return OnModelsGeneratedBlock.newInstance(sm, false);
  }
}
