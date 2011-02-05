package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstructorParameter extends VariableDeclaration {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.ConstructorParameter";

  public ConstructorParameter(SNode node) {
    super(node);
  }

  public static ConstructorParameter newInstance(SModel sm, boolean init) {
    return (ConstructorParameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.ConstructorParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstructorParameter newInstance(SModel sm) {
    return ConstructorParameter.newInstance(sm, false);
  }
}
