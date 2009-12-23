package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseVariableDeclaration extends BaseConcept implements IValidIdentifier {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TYPE = "type";

  public BaseVariableDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(BaseVariableDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(BaseVariableDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BaseVariableDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseVariableDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseVariableDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseVariableDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseVariableDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseVariableDeclaration.VIRTUAL_PACKAGE, value);
  }

  public Type getType() {
    return (Type) this.getChild(Type.class, BaseVariableDeclaration.TYPE);
  }

  public void setType(Type node) {
    super.setChild(BaseVariableDeclaration.TYPE, node);
  }

  public static BaseVariableDeclaration newInstance(SModel sm, boolean init) {
    return (BaseVariableDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseVariableDeclaration newInstance(SModel sm) {
    return BaseVariableDeclaration.newInstance(sm, false);
  }
}
