package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IndentLayoutOnNewLineStyleClassItem extends BooleanStyleSheetItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem";

  public IndentLayoutOnNewLineStyleClassItem(SNode node) {
    super(node);
  }

  public static IndentLayoutOnNewLineStyleClassItem newInstance(SModel sm, boolean init) {
    return (IndentLayoutOnNewLineStyleClassItem)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IndentLayoutOnNewLineStyleClassItem newInstance(SModel sm) {
    return IndentLayoutOnNewLineStyleClassItem.newInstance(sm, false);
  }

}
