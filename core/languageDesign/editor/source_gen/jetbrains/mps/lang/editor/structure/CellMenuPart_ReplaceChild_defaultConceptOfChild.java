package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_ReplaceChild_defaultConceptOfChild extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_defaultConceptOfChild";

  public CellMenuPart_ReplaceChild_defaultConceptOfChild(SNode node) {
    super(node);
  }

  public static CellMenuPart_ReplaceChild_defaultConceptOfChild newInstance(SModel sm, boolean init) {
    return (CellMenuPart_ReplaceChild_defaultConceptOfChild)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_defaultConceptOfChild", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_ReplaceChild_defaultConceptOfChild newInstance(SModel sm) {
    return CellMenuPart_ReplaceChild_defaultConceptOfChild.newInstance(sm, false);
  }

}
