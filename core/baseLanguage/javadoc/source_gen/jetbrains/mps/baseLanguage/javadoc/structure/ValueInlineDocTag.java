package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ValueInlineDocTag extends BaseInlineDocTag {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.ValueInlineDocTag";
  public static final String TEXT = "text";

  public ValueInlineDocTag(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(ValueInlineDocTag.TEXT);
  }

  public void setText(String value) {
    this.setProperty(ValueInlineDocTag.TEXT, value);
  }

  public static ValueInlineDocTag newInstance(SModel sm, boolean init) {
    return (ValueInlineDocTag)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.ValueInlineDocTag", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ValueInlineDocTag newInstance(SModel sm) {
    return ValueInlineDocTag.newInstance(sm, false);
  }
}
