package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EventVariable extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.samples.agreementLanguage.structure.EventVariable";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String TYPE = "type";

  public EventVariable(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(EventVariable.NAME);
  }

  public void setName(String value) {
    this.setProperty(EventVariable.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EventVariable.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EventVariable.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EventVariable.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EventVariable.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EventVariable.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EventVariable.VIRTUAL_PACKAGE, value);
  }

  public ValueType getType() {
    String value = super.getProperty(EventVariable.TYPE);
    return ValueType.parseValue(value);
  }

  public void setType(ValueType value) {
    super.setProperty(EventVariable.TYPE, value.getValueAsString());
  }


  public static EventVariable newInstance(SModel sm, boolean init) {
    return (EventVariable)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.agreementLanguage.structure.EventVariable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventVariable newInstance(SModel sm) {
    return EventVariable.newInstance(sm, false);
  }

}
