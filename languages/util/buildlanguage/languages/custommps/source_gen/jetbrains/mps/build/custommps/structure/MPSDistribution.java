package jetbrains.mps.build.custommps.structure;

/*Generated by MPS */

import jetbrains.mps.build.packaging.structure.AbstractProjectComponent;
import jetbrains.mps.build.packaging.structure.ICompositeComponent;
import jetbrains.mps.build.packaging.structure.INotBuildableComponent;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.structure.Path;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MPSDistribution extends AbstractProjectComponent implements ICompositeComponent, INotBuildableComponent {
  public static final String concept = "jetbrains.mps.build.custommps.structure.MPSDistribution";
  public static final String EXCLUDES = "excludes";
  public static final String INCLUDES = "includes";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PATH_TO_BUILD_TOOLS_ZIP = "pathToBuildToolsZip";
  public static final String LICENCE_PATH = "licencePath";
  public static final String ENTRY = "entry";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public MPSDistribution(SNode node) {
    super(node);
  }

  public String getExcludes() {
    return this.getProperty(MPSDistribution.EXCLUDES);
  }

  public void setExcludes(String value) {
    this.setProperty(MPSDistribution.EXCLUDES, value);
  }

  public String getIncludes() {
    return this.getProperty(MPSDistribution.INCLUDES);
  }

  public void setIncludes(String value) {
    this.setProperty(MPSDistribution.INCLUDES, value);
  }

  public String getName() {
    return this.getProperty(MPSDistribution.NAME);
  }

  public void setName(String value) {
    this.setProperty(MPSDistribution.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(MPSDistribution.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MPSDistribution.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MPSDistribution.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MPSDistribution.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MPSDistribution.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MPSDistribution.VIRTUAL_PACKAGE, value);
  }

  public Path getPathToBuildToolsZip() {
    return (Path) this.getChild(Path.class, MPSDistribution.PATH_TO_BUILD_TOOLS_ZIP);
  }

  public void setPathToBuildToolsZip(Path node) {
    super.setChild(MPSDistribution.PATH_TO_BUILD_TOOLS_ZIP, node);
  }

  public Path getLicencePath() {
    return (Path) this.getChild(Path.class, MPSDistribution.LICENCE_PATH);
  }

  public void setLicencePath(Path node) {
    super.setChild(MPSDistribution.LICENCE_PATH, node);
  }

  public int getEntriesCount() {
    return this.getChildCount(MPSDistribution.ENTRY);
  }

  public Iterator<AbstractProjectComponent> entries() {
    return this.children(AbstractProjectComponent.class, MPSDistribution.ENTRY);
  }

  public List<AbstractProjectComponent> getEntries() {
    return this.getChildren(AbstractProjectComponent.class, MPSDistribution.ENTRY);
  }

  public void addEntry(AbstractProjectComponent node) {
    this.addChild(MPSDistribution.ENTRY, node);
  }

  public void insertEntry(AbstractProjectComponent prev, AbstractProjectComponent node) {
    this.insertChild(prev, MPSDistribution.ENTRY, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(MPSDistribution.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, MPSDistribution.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, MPSDistribution.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(MPSDistribution.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, MPSDistribution.SMODEL_ATTRIBUTE, node);
  }

  public static MPSDistribution newInstance(SModel sm, boolean init) {
    return (MPSDistribution) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.custommps.structure.MPSDistribution", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MPSDistribution newInstance(SModel sm) {
    return MPSDistribution.newInstance(sm, false);
  }
}
