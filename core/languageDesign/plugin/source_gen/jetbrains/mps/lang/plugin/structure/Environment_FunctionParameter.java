package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Environment_FunctionParameter extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.Environment_FunctionParameter";

  public Environment_FunctionParameter(SNode node) {
    super(node);
  }

  public static Environment_FunctionParameter newInstance(SModel sm, boolean init) {
    return (Environment_FunctionParameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.Environment_FunctionParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Environment_FunctionParameter newInstance(SModel sm) {
    return Environment_FunctionParameter.newInstance(sm, false);
  }
}
