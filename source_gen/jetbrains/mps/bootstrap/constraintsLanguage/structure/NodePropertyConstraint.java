package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration;

public class NodePropertyConstraint extends BaseConcept {
  public static String APPLICABLE_CONCEPT = "applicableConcept";
  public static String APPLICABLE_PROPERTY = "applicableProperty";
  public static String PROPERTY_GETTER = "propertyGetter";
  public static String PROPERTY_SETTER = "propertySetter";

  public  NodePropertyConstraint(SNode node) {
    super(node);
  }

  public static NodePropertyConstraint newInstance(SModel sm, boolean init) {
    return (NodePropertyConstraint)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static NodePropertyConstraint newInstance(SModel sm) {
    return NodePropertyConstraint.newInstance(sm, false);
  }

  public ConceptDeclaration getApplicableConcept() {
    return (ConceptDeclaration)this.getReferent(NodePropertyConstraint.APPLICABLE_CONCEPT);
  }
  public void setApplicableConcept(ConceptDeclaration node) {
    super.setReferent(NodePropertyConstraint.APPLICABLE_CONCEPT, node);
  }
  public PropertyDeclaration getApplicableProperty() {
    return (PropertyDeclaration)this.getReferent(NodePropertyConstraint.APPLICABLE_PROPERTY);
  }
  public void setApplicableProperty(PropertyDeclaration node) {
    super.setReferent(NodePropertyConstraint.APPLICABLE_PROPERTY, node);
  }
  public ConstraintFunction_PropertyGetter getPropertyGetter() {
    return (ConstraintFunction_PropertyGetter)this.getChild(NodePropertyConstraint.PROPERTY_GETTER);
  }
  public void setPropertyGetter(ConstraintFunction_PropertyGetter node) {
    super.setChild(NodePropertyConstraint.PROPERTY_GETTER, node);
  }
  public ConstraintFunction_PropertySetter getPropertySetter() {
    return (ConstraintFunction_PropertySetter)this.getChild(NodePropertyConstraint.PROPERTY_SETTER);
  }
  public void setPropertySetter(ConstraintFunction_PropertySetter node) {
    super.setChild(NodePropertyConstraint.PROPERTY_SETTER, node);
  }
}
