package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_EditorCell extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_EditorCell";

  public ConceptFunctionParameter_EditorCell(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_EditorCell newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_EditorCell) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_EditorCell", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_EditorCell newInstance(SModel sm) {
    return ConceptFunctionParameter_EditorCell.newInstance(sm, false);
  }
}
