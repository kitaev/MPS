package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InternalPartialFieldReference extends Expression implements IOperation {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalPartialFieldReference";
  public static final String FIELD_NAME = "fieldName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FIELD_TYPE = "fieldType";
  public static final String INSTANCE_TYPE = "instanceType";
  public static final String INSTANCE = "instance";

  public InternalPartialFieldReference(SNode node) {
    super(node);
  }

  public String getFieldName() {
    return this.getProperty(InternalPartialFieldReference.FIELD_NAME);
  }

  public void setFieldName(String value) {
    this.setProperty(InternalPartialFieldReference.FIELD_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InternalPartialFieldReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InternalPartialFieldReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InternalPartialFieldReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InternalPartialFieldReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InternalPartialFieldReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InternalPartialFieldReference.VIRTUAL_PACKAGE, value);
  }

  public Type getFieldType() {
    return (Type) this.getChild(Type.class, InternalPartialFieldReference.FIELD_TYPE);
  }

  public void setFieldType(Type node) {
    super.setChild(InternalPartialFieldReference.FIELD_TYPE, node);
  }

  public ClassifierType getInstanceType() {
    return (ClassifierType) this.getChild(ClassifierType.class, InternalPartialFieldReference.INSTANCE_TYPE);
  }

  public void setInstanceType(ClassifierType node) {
    super.setChild(InternalPartialFieldReference.INSTANCE_TYPE, node);
  }

  public Expression getInstance() {
    return (Expression) this.getChild(Expression.class, InternalPartialFieldReference.INSTANCE);
  }

  public void setInstance(Expression node) {
    super.setChild(InternalPartialFieldReference.INSTANCE, node);
  }

  public static InternalPartialFieldReference newInstance(SModel sm, boolean init) {
    return (InternalPartialFieldReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalPartialFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalPartialFieldReference newInstance(SModel sm) {
    return InternalPartialFieldReference.newInstance(sm, false);
  }
}
