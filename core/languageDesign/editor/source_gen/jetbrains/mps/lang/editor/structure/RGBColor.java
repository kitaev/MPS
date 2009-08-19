package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RGBColor extends BaseConcept implements IQueryFunction_Color {
  public static final String concept = "jetbrains.mps.lang.editor.structure.RGBColor";
  public static final String VALUE = "value";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public RGBColor(SNode node) {
    super(node);
  }

  public String getValue() {
    return this.getProperty(RGBColor.VALUE);
  }

  public void setValue(String value) {
    this.setProperty(RGBColor.VALUE, value);
  }

  public String getShortDescription() {
    return this.getProperty(RGBColor.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RGBColor.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RGBColor.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RGBColor.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RGBColor.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RGBColor.VIRTUAL_PACKAGE, value);
  }

  public static RGBColor newInstance(SModel sm, boolean init) {
    return (RGBColor)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.RGBColor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RGBColor newInstance(SModel sm) {
    return RGBColor.newInstance(sm, false);
  }
}
