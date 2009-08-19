package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DeprecatedNodeAnnotation extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation";
  public static final String BUILD = "build";
  public static final String COMMENT = "comment";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public DeprecatedNodeAnnotation(SNode node) {
    super(node);
  }

  public String getBuild() {
    return this.getProperty(DeprecatedNodeAnnotation.BUILD);
  }

  public void setBuild(String value) {
    this.setProperty(DeprecatedNodeAnnotation.BUILD, value);
  }

  public String getComment() {
    return this.getProperty(DeprecatedNodeAnnotation.COMMENT);
  }

  public void setComment(String value) {
    this.setProperty(DeprecatedNodeAnnotation.COMMENT, value);
  }

  public String getName() {
    return this.getProperty(DeprecatedNodeAnnotation.NAME);
  }

  public void setName(String value) {
    this.setProperty(DeprecatedNodeAnnotation.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DeprecatedNodeAnnotation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DeprecatedNodeAnnotation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DeprecatedNodeAnnotation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DeprecatedNodeAnnotation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DeprecatedNodeAnnotation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DeprecatedNodeAnnotation.VIRTUAL_PACKAGE, value);
  }

  public static DeprecatedNodeAnnotation newInstance(SModel sm, boolean init) {
    return (DeprecatedNodeAnnotation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DeprecatedNodeAnnotation newInstance(SModel sm) {
    return DeprecatedNodeAnnotation.newInstance(sm, false);
  }
}
