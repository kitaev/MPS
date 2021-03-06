package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ProjectPluginDeclaration extends BaseConcept implements IClassifier {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ProjectPluginDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String INIT_BLOCK = "initBlock";
  public static final String DISPOSE_BLOCK = "disposeBlock";
  public static final String FIELD_DECLARATION = "fieldDeclaration";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ProjectPluginDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ProjectPluginDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ProjectPluginDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ProjectPluginDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ProjectPluginDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ProjectPluginDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ProjectPluginDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ProjectPluginDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ProjectPluginDeclaration.VIRTUAL_PACKAGE, value);
  }

  public ProjectPluginInitBlock getInitBlock() {
    return (ProjectPluginInitBlock) this.getChild(ProjectPluginInitBlock.class, ProjectPluginDeclaration.INIT_BLOCK);
  }

  public void setInitBlock(ProjectPluginInitBlock node) {
    super.setChild(ProjectPluginDeclaration.INIT_BLOCK, node);
  }

  public ProjectPluginDisposeBlock getDisposeBlock() {
    return (ProjectPluginDisposeBlock) this.getChild(ProjectPluginDisposeBlock.class, ProjectPluginDeclaration.DISPOSE_BLOCK);
  }

  public void setDisposeBlock(ProjectPluginDisposeBlock node) {
    super.setChild(ProjectPluginDeclaration.DISPOSE_BLOCK, node);
  }

  public int getFieldDeclarationsCount() {
    return this.getChildCount(ProjectPluginDeclaration.FIELD_DECLARATION);
  }

  public Iterator<DefaultClassifierFieldDeclaration> fieldDeclarations() {
    return this.children(DefaultClassifierFieldDeclaration.class, ProjectPluginDeclaration.FIELD_DECLARATION);
  }

  public List<DefaultClassifierFieldDeclaration> getFieldDeclarations() {
    return this.getChildren(DefaultClassifierFieldDeclaration.class, ProjectPluginDeclaration.FIELD_DECLARATION);
  }

  public void addFieldDeclaration(DefaultClassifierFieldDeclaration node) {
    this.addChild(ProjectPluginDeclaration.FIELD_DECLARATION, node);
  }

  public void insertFieldDeclaration(DefaultClassifierFieldDeclaration prev, DefaultClassifierFieldDeclaration node) {
    this.insertChild(prev, ProjectPluginDeclaration.FIELD_DECLARATION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ProjectPluginDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ProjectPluginDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ProjectPluginDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ProjectPluginDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ProjectPluginDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static ProjectPluginDeclaration newInstance(SModel sm, boolean init) {
    return (ProjectPluginDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ProjectPluginDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ProjectPluginDeclaration newInstance(SModel sm) {
    return ProjectPluginDeclaration.newInstance(sm, false);
  }
}
