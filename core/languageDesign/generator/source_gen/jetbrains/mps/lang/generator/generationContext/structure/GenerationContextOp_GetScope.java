package jetbrains.mps.lang.generator.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextOp_GetScope extends GenerationContextOp_Base {
  public static final String concept = "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetScope";

  public GenerationContextOp_GetScope(SNode node) {
    super(node);
  }

  public static GenerationContextOp_GetScope newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_GetScope)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetScope", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_GetScope newInstance(SModel sm) {
    return GenerationContextOp_GetScope.newInstance(sm, false);
  }

}
