package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Jar extends AbstractProjectComponent implements ICompositeComponent {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Jar";
  public static String FILEMODE = "filemode";
  public static String DIRMODE = "dirmode";
  public static String EXCLUDES = "excludes";
  public static String INCLUDES = "includes";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String DELETE = "delete";
  public static String ENTRY = "entry";

  public Jar(SNode node) {
    super(node);
  }

  public String getFilemode() {
    return this.getProperty(Jar.FILEMODE);
  }

  public void setFilemode(String value) {
    this.setProperty(Jar.FILEMODE, value);
  }

  public String getDirmode() {
    return this.getProperty(Jar.DIRMODE);
  }

  public void setDirmode(String value) {
    this.setProperty(Jar.DIRMODE, value);
  }

  public String getExcludes() {
    return this.getProperty(Jar.EXCLUDES);
  }

  public void setExcludes(String value) {
    this.setProperty(Jar.EXCLUDES, value);
  }

  public String getIncludes() {
    return this.getProperty(Jar.INCLUDES);
  }

  public void setIncludes(String value) {
    this.setProperty(Jar.INCLUDES, value);
  }

  public String getName() {
    return this.getProperty(Jar.NAME);
  }

  public void setName(String value) {
    this.setProperty(Jar.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Jar.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Jar.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Jar.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Jar.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Jar.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Jar.VIRTUAL_PACKAGE, value);
  }

  public Delete getDelete() {
    return (Delete)this.getChild(Jar.DELETE);
  }

  public void setDelete(Delete node) {
    super.setChild(Jar.DELETE, node);
  }

  public int getEntriesCount() {
    return this.getChildCount(Jar.ENTRY);
  }

  public Iterator<AbstractProjectComponent> entries() {
    return this.children(Jar.ENTRY);
  }

  public List<AbstractProjectComponent> getEntries() {
    return this.getChildren(Jar.ENTRY);
  }

  public void addEntry(AbstractProjectComponent node) {
    this.addChild(Jar.ENTRY, node);
  }

  public void insertEntry(AbstractProjectComponent prev, AbstractProjectComponent node) {
    this.insertChild(prev, Jar.ENTRY, node);
  }


  public static Jar newInstance(SModel sm, boolean init) {
    return (Jar)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Jar", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Jar newInstance(SModel sm) {
    return Jar.newInstance(sm, false);
  }

}
