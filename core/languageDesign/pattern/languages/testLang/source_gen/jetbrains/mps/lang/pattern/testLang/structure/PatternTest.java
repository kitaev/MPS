package jetbrains.mps.lang.pattern.testLang.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.unitTest.structure.ITestCase;
import jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.PatternExpression;
import jetbrains.mps.baseLanguage.structure.BooleanConstant;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PatternTest extends BaseConcept implements INamedConcept, ITestCase, ITestMethod {
  public static final String concept = "jetbrains.mps.lang.pattern.testLang.structure.PatternTest";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NODE_TO_MATCH = "nodeToMatch";
  public static final String PATTERN = "pattern";
  public static final String MATCHES = "matches";
  public static final String VARIABLE = "variable";
  public static final String PROPERTY = "property";
  public static final String LIST = "list";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PatternTest(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PatternTest.NAME);
  }

  public void setName(String value) {
    this.setProperty(PatternTest.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PatternTest.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PatternTest.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PatternTest.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PatternTest.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PatternTest.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PatternTest.VIRTUAL_PACKAGE, value);
  }

  public BaseConcept getNodeToMatch() {
    return (BaseConcept) this.getChild(BaseConcept.class, PatternTest.NODE_TO_MATCH);
  }

  public void setNodeToMatch(BaseConcept node) {
    super.setChild(PatternTest.NODE_TO_MATCH, node);
  }

  public PatternExpression getPattern() {
    return (PatternExpression) this.getChild(PatternExpression.class, PatternTest.PATTERN);
  }

  public void setPattern(PatternExpression node) {
    super.setChild(PatternTest.PATTERN, node);
  }

  public BooleanConstant getMatches() {
    return (BooleanConstant) this.getChild(BooleanConstant.class, PatternTest.MATCHES);
  }

  public void setMatches(BooleanConstant node) {
    super.setChild(PatternTest.MATCHES, node);
  }

  public int getVariablesCount() {
    return this.getChildCount(PatternTest.VARIABLE);
  }

  public Iterator<VariableValue> variables() {
    return this.children(VariableValue.class, PatternTest.VARIABLE);
  }

  public List<VariableValue> getVariables() {
    return this.getChildren(VariableValue.class, PatternTest.VARIABLE);
  }

  public void addVariable(VariableValue node) {
    this.addChild(PatternTest.VARIABLE, node);
  }

  public void insertVariable(VariableValue prev, VariableValue node) {
    this.insertChild(prev, PatternTest.VARIABLE, node);
  }

  public int getPropertiesCount() {
    return this.getChildCount(PatternTest.PROPERTY);
  }

  public Iterator<PropertyValue> properties() {
    return this.children(PropertyValue.class, PatternTest.PROPERTY);
  }

  public List<PropertyValue> getProperties() {
    return this.getChildren(PropertyValue.class, PatternTest.PROPERTY);
  }

  public void addProperty(PropertyValue node) {
    this.addChild(PatternTest.PROPERTY, node);
  }

  public void insertProperty(PropertyValue prev, PropertyValue node) {
    this.insertChild(prev, PatternTest.PROPERTY, node);
  }

  public int getListsCount() {
    return this.getChildCount(PatternTest.LIST);
  }

  public Iterator<ListValue> lists() {
    return this.children(ListValue.class, PatternTest.LIST);
  }

  public List<ListValue> getLists() {
    return this.getChildren(ListValue.class, PatternTest.LIST);
  }

  public void addList(ListValue node) {
    this.addChild(PatternTest.LIST, node);
  }

  public void insertList(ListValue prev, ListValue node) {
    this.insertChild(prev, PatternTest.LIST, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PatternTest.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PatternTest.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PatternTest.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PatternTest.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PatternTest.SMODEL_ATTRIBUTE, node);
  }

  public static PatternTest newInstance(SModel sm, boolean init) {
    return (PatternTest) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.pattern.testLang.structure.PatternTest", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PatternTest newInstance(SModel sm) {
    return PatternTest.newInstance(sm, false);
  }
}
