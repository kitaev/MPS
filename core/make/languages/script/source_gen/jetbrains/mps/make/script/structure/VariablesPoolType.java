package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariablesPoolType extends Type {
  public static final String concept = "jetbrains.mps.make.script.structure.VariablesPoolType";

  public VariablesPoolType(SNode node) {
    super(node);
  }

  public static VariablesPoolType newInstance(SModel sm, boolean init) {
    return (VariablesPoolType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.script.structure.VariablesPoolType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VariablesPoolType newInstance(SModel sm) {
    return VariablesPoolType.newInstance(sm, false);
  }
}
