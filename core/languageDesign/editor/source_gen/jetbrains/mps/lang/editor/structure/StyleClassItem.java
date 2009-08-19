package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StyleClassItem extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.StyleClassItem";
  public static final String CLNK_AttributeConstant = "attributeConstant";

  public StyleClassItem(SNode node) {
    super(node);
  }

  public static StyleClassItem newInstance(SModel sm, boolean init) {
    return (StyleClassItem)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.StyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StyleClassItem newInstance(SModel sm) {
    return StyleClassItem.newInstance(sm, false);
  }
}
