package jetbrains.mps.ide.scriptLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class MigrationScript extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.ide.scriptLanguage.structure.MigrationScript";
  public static String TITLE = "title";
  public static String MIGRATION_FROM_BUILD = "migrationFromBuild";
  public static String CATEGORY = "category";
  public static String LONG_CAPTION = "longCaption";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String PART = "part";

  public  MigrationScript(SNode node) {
    super(node);
  }

  public static MigrationScript newInstance(SModel sm, boolean init) {
    return (MigrationScript)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ide.scriptLanguage.structure.MigrationScript", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MigrationScript newInstance(SModel sm) {
    return MigrationScript.newInstance(sm, false);
  }


  public String getTitle() {
    return this.getProperty(MigrationScript.TITLE);
  }

  public void setTitle(String value) {
    this.setProperty(MigrationScript.TITLE, value);
  }

  public String getMigrationFromBuild() {
    return this.getProperty(MigrationScript.MIGRATION_FROM_BUILD);
  }

  public void setMigrationFromBuild(String value) {
    this.setProperty(MigrationScript.MIGRATION_FROM_BUILD, value);
  }

  public String getCategory() {
    return this.getProperty(MigrationScript.CATEGORY);
  }

  public void setCategory(String value) {
    this.setProperty(MigrationScript.CATEGORY, value);
  }

  public String getLongCaption() {
    return this.getProperty(MigrationScript.LONG_CAPTION);
  }

  public void setLongCaption(String value) {
    this.setProperty(MigrationScript.LONG_CAPTION, value);
  }

  public String getName() {
    return this.getProperty(MigrationScript.NAME);
  }

  public void setName(String value) {
    this.setProperty(MigrationScript.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(MigrationScript.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MigrationScript.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MigrationScript.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MigrationScript.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MigrationScript.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MigrationScript.VIRTUAL_PACKAGE, value);
  }

  public int getPartsCount() {
    return this.getChildCount(MigrationScript.PART);
  }

  public Iterator<MigrationScriptPart_Instance> parts() {
    return this.children(MigrationScript.PART);
  }

  public List<MigrationScriptPart_Instance> getParts() {
    return this.getChildren(MigrationScript.PART);
  }

  public void addPart(MigrationScriptPart_Instance node) {
    this.addChild(MigrationScript.PART, node);
  }

  public void insertPart(MigrationScriptPart_Instance prev, MigrationScriptPart_Instance node) {
    this.insertChild(prev, MigrationScript.PART, node);
  }

}
