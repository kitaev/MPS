package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod;
import jetbrains.mps.baseLanguage.unitTest.structure.ITestCase;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EditorTestCase extends BaseConcept implements INamedConcept, ITestMethod, ITestCase {
  public static final String concept = "jetbrains.mps.lang.test.structure.EditorTestCase";
  public static final String DESCRIPTION = "description";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NODE_TO_EDIT = "nodeToEdit";
  public static final String RESULT = "result";
  public static final String CODE = "code";
  public static final String _$ATTRIBUTE = "_$attribute";

  public EditorTestCase(SNode node) {
    super(node);
  }

  public String getDescription() {
    return this.getProperty(EditorTestCase.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(EditorTestCase.DESCRIPTION, value);
  }

  public String getName() {
    return this.getProperty(EditorTestCase.NAME);
  }

  public void setName(String value) {
    this.setProperty(EditorTestCase.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EditorTestCase.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EditorTestCase.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EditorTestCase.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EditorTestCase.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EditorTestCase.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EditorTestCase.VIRTUAL_PACKAGE, value);
  }

  public BaseConcept getNodeToEdit() {
    return (BaseConcept) this.getChild(BaseConcept.class, EditorTestCase.NODE_TO_EDIT);
  }

  public void setNodeToEdit(BaseConcept node) {
    super.setChild(EditorTestCase.NODE_TO_EDIT, node);
  }

  public BaseConcept getResult() {
    return (BaseConcept) this.getChild(BaseConcept.class, EditorTestCase.RESULT);
  }

  public void setResult(BaseConcept node) {
    super.setChild(EditorTestCase.RESULT, node);
  }

  public StatementList getCode() {
    return (StatementList) this.getChild(StatementList.class, EditorTestCase.CODE);
  }

  public void setCode(StatementList node) {
    super.setChild(EditorTestCase.CODE, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(EditorTestCase._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, EditorTestCase._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, EditorTestCase._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(EditorTestCase._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, EditorTestCase._$ATTRIBUTE, node);
  }

  public static EditorTestCase newInstance(SModel sm, boolean init) {
    return (EditorTestCase) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.EditorTestCase", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EditorTestCase newInstance(SModel sm) {
    return EditorTestCase.newInstance(sm, false);
  }
}
