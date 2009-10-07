package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_Model extends ConceptFunctionParameter_CreatorType {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_Model";

  public ConceptFunctionParameter_Model(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_Model newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_Model)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_Model", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_Model newInstance(SModel sm) {
    return ConceptFunctionParameter_Model.newInstance(sm, false);
  }
}
