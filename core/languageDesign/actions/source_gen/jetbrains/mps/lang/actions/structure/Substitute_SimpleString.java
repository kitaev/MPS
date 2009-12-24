package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Substitute_SimpleString extends BaseConcept implements ISubstitute_String {
  public static final String concept = "jetbrains.mps.lang.actions.structure.Substitute_SimpleString";
  public static final String TEXT = "text";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public Substitute_SimpleString(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(Substitute_SimpleString.TEXT);
  }

  public void setText(String value) {
    this.setProperty(Substitute_SimpleString.TEXT, value);
  }

  public String getShortDescription() {
    return this.getProperty(Substitute_SimpleString.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Substitute_SimpleString.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Substitute_SimpleString.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Substitute_SimpleString.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Substitute_SimpleString.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Substitute_SimpleString.VIRTUAL_PACKAGE, value);
  }

  public static Substitute_SimpleString newInstance(SModel sm, boolean init) {
    return (Substitute_SimpleString) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.Substitute_SimpleString", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Substitute_SimpleString newInstance(SModel sm) {
    return Substitute_SimpleString.newInstance(sm, false);
  }
}
