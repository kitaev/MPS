package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_UserArgument extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ConceptFunctionParameter_UserArgument";

  public ConceptFunctionParameter_UserArgument(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_UserArgument newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_UserArgument) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ConceptFunctionParameter_UserArgument", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_UserArgument newInstance(SModel sm) {
    return ConceptFunctionParameter_UserArgument.newInstance(sm, false);
  }
}
