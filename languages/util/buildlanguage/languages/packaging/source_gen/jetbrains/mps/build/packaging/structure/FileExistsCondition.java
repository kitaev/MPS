package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FileExistsCondition extends BaseConcept implements ICondition {
  public static final String concept = "jetbrains.mps.build.packaging.structure.FileExistsCondition";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PATH_TO_CHECK = "pathToCheck";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public FileExistsCondition(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(FileExistsCondition.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FileExistsCondition.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FileExistsCondition.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FileExistsCondition.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FileExistsCondition.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FileExistsCondition.VIRTUAL_PACKAGE, value);
  }

  public NonExistingPath getPathToCheck() {
    return (NonExistingPath) this.getChild(NonExistingPath.class, FileExistsCondition.PATH_TO_CHECK);
  }

  public void setPathToCheck(NonExistingPath node) {
    super.setChild(FileExistsCondition.PATH_TO_CHECK, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(FileExistsCondition.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, FileExistsCondition.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, FileExistsCondition.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(FileExistsCondition.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, FileExistsCondition.SMODEL_ATTRIBUTE, node);
  }

  public static FileExistsCondition newInstance(SModel sm, boolean init) {
    return (FileExistsCondition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.FileExistsCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FileExistsCondition newInstance(SModel sm) {
    return FileExistsCondition.newInstance(sm, false);
  }
}
