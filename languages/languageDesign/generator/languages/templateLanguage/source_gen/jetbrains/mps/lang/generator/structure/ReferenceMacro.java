package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.LinkAttribute;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReferenceMacro extends LinkAttribute implements AbstractMacro {
  public static final String concept = "jetbrains.mps.lang.generator.structure.ReferenceMacro";
  public static final String COMMENT = "comment";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String REFERENT_FUNCTION = "referentFunction";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ReferenceMacro(SNode node) {
    super(node);
  }

  public String getComment() {
    return this.getProperty(ReferenceMacro.COMMENT);
  }

  public void setComment(String value) {
    this.setProperty(ReferenceMacro.COMMENT, value);
  }

  public String getShortDescription() {
    return this.getProperty(ReferenceMacro.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ReferenceMacro.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ReferenceMacro.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ReferenceMacro.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ReferenceMacro.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ReferenceMacro.VIRTUAL_PACKAGE, value);
  }

  public ReferenceMacro_GetReferent getReferentFunction() {
    return (ReferenceMacro_GetReferent) this.getChild(ReferenceMacro_GetReferent.class, ReferenceMacro.REFERENT_FUNCTION);
  }

  public void setReferentFunction(ReferenceMacro_GetReferent node) {
    super.setChild(ReferenceMacro.REFERENT_FUNCTION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ReferenceMacro.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ReferenceMacro.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ReferenceMacro.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ReferenceMacro.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ReferenceMacro.SMODEL_ATTRIBUTE, node);
  }

  public static ReferenceMacro newInstance(SModel sm, boolean init) {
    return (ReferenceMacro) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.ReferenceMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReferenceMacro newInstance(SModel sm) {
    return ReferenceMacro.newInstance(sm, false);
  }
}
