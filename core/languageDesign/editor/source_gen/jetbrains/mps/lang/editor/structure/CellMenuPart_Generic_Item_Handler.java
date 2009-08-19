package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_Generic_Item_Handler extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Item_Handler";

  public CellMenuPart_Generic_Item_Handler(SNode node) {
    super(node);
  }

  public static CellMenuPart_Generic_Item_Handler newInstance(SModel sm, boolean init) {
    return (CellMenuPart_Generic_Item_Handler)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_Generic_Item_Handler", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_Generic_Item_Handler newInstance(SModel sm) {
    return CellMenuPart_Generic_Item_Handler.newInstance(sm, false);
  }
}
