package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_ScopeNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_ScopeNode";

  public ConceptFunctionParameter_ScopeNode(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_ScopeNode newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_ScopeNode) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_ScopeNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_ScopeNode newInstance(SModel sm) {
    return ConceptFunctionParameter_ScopeNode.newInstance(sm, false);
  }
}
