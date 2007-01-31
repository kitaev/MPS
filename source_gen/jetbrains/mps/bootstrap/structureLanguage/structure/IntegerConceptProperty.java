package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class IntegerConceptProperty extends ConceptProperty {
  public static String VALUE = "value";

  public  IntegerConceptProperty(SNode node) {
    super(node);
  }

  public static IntegerConceptProperty newInstance(SModel sm) {
    return (IntegerConceptProperty)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.IntegerConceptProperty", sm, GlobalScope.getInstance()).getAdaptor();
  }

  public int getValue() {
    return this.getIntegerProperty(IntegerConceptProperty.VALUE);
  }
  public void setValue(int value) {
    this.setIntegerProperty(IntegerConceptProperty.VALUE, value);
  }
  public IntegerConceptPropertyDeclaration getIntegerConceptPropertyDeclaration() {
    return (IntegerConceptPropertyDeclaration)this.getConceptPropertyDeclaration();
  }
  public void setIntegerConceptPropertyDeclaration(IntegerConceptPropertyDeclaration node) {
    this.setConceptPropertyDeclaration(node);
  }
}
