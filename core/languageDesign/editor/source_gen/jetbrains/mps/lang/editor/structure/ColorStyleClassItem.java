package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.StyleClassItem;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.structure._Colors_Enum;
import jetbrains.mps.lang.editor.structure.IQueryFunction_Color;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ColorStyleClassItem extends StyleClassItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.ColorStyleClassItem";
  public static final String COLOR = "color";
  public static final String QUERY = "query";

  public ColorStyleClassItem(SNode node) {
    super(node);
  }

  public _Colors_Enum getColor() {
    String value = super.getProperty(ColorStyleClassItem.COLOR);
    return _Colors_Enum.parseValue(value);
  }

  public void setColor(_Colors_Enum value) {
    super.setProperty(ColorStyleClassItem.COLOR, value.getValueAsString());
  }

  public IQueryFunction_Color getQuery() {
    return (IQueryFunction_Color)this.getChild(IQueryFunction_Color.class, ColorStyleClassItem.QUERY);
  }

  public void setQuery(IQueryFunction_Color node) {
    super.setChild(ColorStyleClassItem.QUERY, node);
  }


  public static ColorStyleClassItem newInstance(SModel sm, boolean init) {
    return (ColorStyleClassItem)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.ColorStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ColorStyleClassItem newInstance(SModel sm) {
    return ColorStyleClassItem.newInstance(sm, false);
  }

}
