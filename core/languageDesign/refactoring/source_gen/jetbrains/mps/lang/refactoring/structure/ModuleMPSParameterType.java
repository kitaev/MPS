package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleMPSParameterType extends MPSParameterType {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ModuleMPSParameterType";

  public ModuleMPSParameterType(SNode node) {
    super(node);
  }

  public static ModuleMPSParameterType newInstance(SModel sm, boolean init) {
    return (ModuleMPSParameterType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ModuleMPSParameterType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleMPSParameterType newInstance(SModel sm) {
    return ModuleMPSParameterType.newInstance(sm, false);
  }
}
