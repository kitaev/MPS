package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.structure.ClassifierType;

public class InternalPartialFieldReference extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalPartialFieldReference";
  public static String FIELD_TYPE = "fieldType";
  public static String INSTANCE_TYPE = "instanceType";
  public static String INSTANCE = "instance";
  public static String FIELD_NAME = "fieldName";

  public  InternalPartialFieldReference(SNode node) {
    super(node);
  }

  public static InternalPartialFieldReference newInstance(SModel sm, boolean init) {
    return (InternalPartialFieldReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalPartialFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalPartialFieldReference newInstance(SModel sm) {
    return InternalPartialFieldReference.newInstance(sm, false);
  }


  public Type getFieldType() {
    return (Type)this.getChild(InternalPartialFieldReference.FIELD_TYPE);
  }

  public void setFieldType(Type node) {
    super.setChild(InternalPartialFieldReference.FIELD_TYPE, node);
  }

  public ClassifierType getInstanceType() {
    return (ClassifierType)this.getChild(InternalPartialFieldReference.INSTANCE_TYPE);
  }

  public void setInstanceType(ClassifierType node) {
    super.setChild(InternalPartialFieldReference.INSTANCE_TYPE, node);
  }

  public Expression getInstance() {
    return (Expression)this.getChild(InternalPartialFieldReference.INSTANCE);
  }

  public void setInstance(Expression node) {
    super.setChild(InternalPartialFieldReference.INSTANCE, node);
  }

  public String getFieldName() {
    return this.getProperty(InternalPartialFieldReference.FIELD_NAME);
  }

  public void setFieldName(String value) {
    this.setProperty(InternalPartialFieldReference.FIELD_NAME, value);
  }

}
