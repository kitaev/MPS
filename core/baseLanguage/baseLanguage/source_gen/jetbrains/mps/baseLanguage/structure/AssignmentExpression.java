package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AssignmentExpression extends BaseAssignmentExpression implements TypeDerivable {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AssignmentExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public AssignmentExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AssignmentExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AssignmentExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AssignmentExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AssignmentExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AssignmentExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AssignmentExpression.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(AssignmentExpression.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, AssignmentExpression.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, AssignmentExpression.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(AssignmentExpression.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, AssignmentExpression.SMODEL_ATTRIBUTE, node);
  }

  public static AssignmentExpression newInstance(SModel sm, boolean init) {
    return (AssignmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AssignmentExpression newInstance(SModel sm) {
    return AssignmentExpression.newInstance(sm, false);
  }
}
