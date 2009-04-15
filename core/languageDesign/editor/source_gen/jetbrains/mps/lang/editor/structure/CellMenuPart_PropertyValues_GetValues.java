package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_PropertyValues_GetValues extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyValues_GetValues";

  public CellMenuPart_PropertyValues_GetValues(SNode node) {
    super(node);
  }

  public static CellMenuPart_PropertyValues_GetValues newInstance(SModel sm, boolean init) {
    return (CellMenuPart_PropertyValues_GetValues)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyValues_GetValues", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_PropertyValues_GetValues newInstance(SModel sm) {
    return CellMenuPart_PropertyValues_GetValues.newInstance(sm, false);
  }

}
