package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleActionPlace extends BaseConcept implements ActionPlaceSpecification {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.SimpleActionPlace";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public SimpleActionPlace(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SimpleActionPlace.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SimpleActionPlace.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SimpleActionPlace.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SimpleActionPlace.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SimpleActionPlace.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SimpleActionPlace.VIRTUAL_PACKAGE, value);
  }


  public static SimpleActionPlace newInstance(SModel sm, boolean init) {
    return (SimpleActionPlace)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.SimpleActionPlace", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleActionPlace newInstance(SModel sm) {
    return SimpleActionPlace.newInstance(sm, false);
  }

}
