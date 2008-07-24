package jetbrains.mps.transformation.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextType extends Type {
  public static final String concept = "jetbrains.mps.transformation.generationContext.structure.GenerationContextType";

  public GenerationContextType(SNode node) {
    super(node);
  }

  public static GenerationContextType newInstance(SModel sm, boolean init) {
    return (GenerationContextType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.generationContext.structure.GenerationContextType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextType newInstance(SModel sm) {
    return GenerationContextType.newInstance(sm, false);
  }

}
