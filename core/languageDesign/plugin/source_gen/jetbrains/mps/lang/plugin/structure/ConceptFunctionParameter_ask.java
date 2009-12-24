package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_ask extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_ask";

  public ConceptFunctionParameter_ask(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_ask newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_ask) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_ask", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_ask newInstance(SModel sm) {
    return ConceptFunctionParameter_ask.newInstance(sm, false);
  }
}
