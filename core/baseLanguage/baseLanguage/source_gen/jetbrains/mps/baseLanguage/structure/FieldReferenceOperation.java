package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FieldReferenceOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String FIELD_DECLARATION = "fieldDeclaration";

  public FieldReferenceOperation(SNode node) {
    super(node);
  }

  public static FieldReferenceOperation newInstance(SModel sm, boolean init) {
    return (FieldReferenceOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FieldReferenceOperation newInstance(SModel sm) {
    return FieldReferenceOperation.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(FieldReferenceOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FieldReferenceOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FieldReferenceOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FieldReferenceOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FieldReferenceOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FieldReferenceOperation.VIRTUAL_PACKAGE, value);
  }

  public FieldDeclaration getFieldDeclaration() {
    return (FieldDeclaration)this.getReferent(FieldReferenceOperation.FIELD_DECLARATION);
  }

  public void setFieldDeclaration(FieldDeclaration node) {
    super.setReferent(FieldReferenceOperation.FIELD_DECLARATION, node);
  }

}
