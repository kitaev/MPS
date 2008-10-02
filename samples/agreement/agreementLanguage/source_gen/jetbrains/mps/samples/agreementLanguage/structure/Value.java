package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Value extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.Value";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String TYPE = "type";
  public static String QUANTITY = "quantity";

  public Value(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Value.NAME);
  }

  public void setName(String value) {
    this.setProperty(Value.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Value.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Value.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Value.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Value.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Value.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Value.VIRTUAL_PACKAGE, value);
  }

  public ValueType getType() {
    String value = super.getProperty(Value.TYPE);
    return ValueType.parseValue(value);
  }

  public void setType(ValueType value) {
    super.setProperty(Value.TYPE, value.getValueAsString());
  }

  public int getQuantitiesCount() {
    return this.getChildCount(Value.QUANTITY);
  }

  public Iterator<QuantityTemporalProperty> quantities() {
    return this.children(Value.QUANTITY);
  }

  public List<QuantityTemporalProperty> getQuantities() {
    return this.getChildren(Value.QUANTITY);
  }

  public void addQuantity(QuantityTemporalProperty node) {
    this.addChild(Value.QUANTITY, node);
  }

  public void insertQuantity(QuantityTemporalProperty prev, QuantityTemporalProperty node) {
    this.insertChild(prev, Value.QUANTITY, node);
  }


  public static Value newInstance(SModel sm, boolean init) {
    return (Value)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.Value", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Value newInstance(SModel sm) {
    return Value.newInstance(sm, false);
  }

}
