package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractPropertyDeclaration extends BaseConcept implements IProjectComponent, ICommented {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.AbstractPropertyDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TYPE = "type";

  public AbstractPropertyDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(AbstractPropertyDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(AbstractPropertyDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AbstractPropertyDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AbstractPropertyDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AbstractPropertyDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AbstractPropertyDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AbstractPropertyDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AbstractPropertyDeclaration.VIRTUAL_PACKAGE, value);
  }

  public PropertyType getType() {
    return (PropertyType) this.getChild(PropertyType.class, AbstractPropertyDeclaration.TYPE);
  }

  public void setType(PropertyType node) {
    super.setChild(AbstractPropertyDeclaration.TYPE, node);
  }

  public static AbstractPropertyDeclaration newInstance(SModel sm, boolean init) {
    return (AbstractPropertyDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.AbstractPropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractPropertyDeclaration newInstance(SModel sm) {
    return AbstractPropertyDeclaration.newInstance(sm, false);
  }
}
