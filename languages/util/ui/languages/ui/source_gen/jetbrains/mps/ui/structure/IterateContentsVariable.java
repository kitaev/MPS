package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IValidIdentifier;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IterateContentsVariable extends BaseConcept implements IValidIdentifier, INamedConcept {
  public static final String concept = "jetbrains.mps.ui.structure.IterateContentsVariable";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public IterateContentsVariable(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(IterateContentsVariable.NAME);
  }

  public void setName(String value) {
    this.setProperty(IterateContentsVariable.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(IterateContentsVariable.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(IterateContentsVariable.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(IterateContentsVariable.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(IterateContentsVariable.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(IterateContentsVariable.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(IterateContentsVariable.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(IterateContentsVariable.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, IterateContentsVariable.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, IterateContentsVariable.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(IterateContentsVariable.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, IterateContentsVariable.SMODEL_ATTRIBUTE, node);
  }

  public static IterateContentsVariable newInstance(SModel sm, boolean init) {
    return (IterateContentsVariable) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.IterateContentsVariable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IterateContentsVariable newInstance(SModel sm) {
    return IterateContentsVariable.newInstance(sm, false);
  }
}
