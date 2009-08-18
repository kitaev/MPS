package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.IType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Type extends BaseConcept implements IType {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.Type";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public Type(SNode node) {
    super(node);
  }


  public String getShortDescription() {
    return this.getProperty(Type.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Type.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Type.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Type.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Type.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Type.VIRTUAL_PACKAGE, value);
  }


  public static Type newInstance(SModel sm, boolean init) {
    return (Type)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Type", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Type newInstance(SModel sm) {
    return Type.newInstance(sm, false);
  }
}
