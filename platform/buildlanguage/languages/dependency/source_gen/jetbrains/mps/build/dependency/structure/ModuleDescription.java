package jetbrains.mps.build.dependency.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleDescription extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.dependency.structure.ModuleDescription";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String CLASSES = "classes";
  public static String SOURCES = "sources";
  public static String CLASSPATH = "classpath";

  public ModuleDescription(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ModuleDescription.NAME);
  }

  public void setName(String value) {
    this.setProperty(ModuleDescription.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ModuleDescription.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ModuleDescription.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ModuleDescription.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ModuleDescription.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ModuleDescription.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ModuleDescription.VIRTUAL_PACKAGE, value);
  }

  public PathHolder getClasses() {
    return (PathHolder)this.getChild(ModuleDescription.CLASSES);
  }

  public void setClasses(PathHolder node) {
    super.setChild(ModuleDescription.CLASSES, node);
  }

  public int getSourcesesCount() {
    return this.getChildCount(ModuleDescription.SOURCES);
  }

  public Iterator<PathHolder> sourceses() {
    return this.children(ModuleDescription.SOURCES);
  }

  public List<PathHolder> getSourceses() {
    return this.getChildren(ModuleDescription.SOURCES);
  }

  public void addSources(PathHolder node) {
    this.addChild(ModuleDescription.SOURCES, node);
  }

  public void insertSources(PathHolder prev, PathHolder node) {
    this.insertChild(prev, ModuleDescription.SOURCES, node);
  }

  public int getClasspathsCount() {
    return this.getChildCount(ModuleDescription.CLASSPATH);
  }

  public Iterator<PathHolder> classpaths() {
    return this.children(ModuleDescription.CLASSPATH);
  }

  public List<PathHolder> getClasspaths() {
    return this.getChildren(ModuleDescription.CLASSPATH);
  }

  public void addClasspath(PathHolder node) {
    this.addChild(ModuleDescription.CLASSPATH, node);
  }

  public void insertClasspath(PathHolder prev, PathHolder node) {
    this.insertChild(prev, ModuleDescription.CLASSPATH, node);
  }


  public static ModuleDescription newInstance(SModel sm, boolean init) {
    return (ModuleDescription)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.dependency.structure.ModuleDescription", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleDescription newInstance(SModel sm) {
    return ModuleDescription.newInstance(sm, false);
  }

}
