package jetbrains.mps.project.structure.model;

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

import java.util.List;

public class ModelProperties {
  private String myLongName;
  private String myStereotype;
  private boolean myUsesLog;
  private int myVersion;

  private RootReference myRoot;

  private List<ModuleReference> myImportedLanguages;
  private List<SModelReference> myImportedModels;
  private List<ModuleReference> myImportedDevkits;
  private List <ModuleReference> myLanguagesInGeneration;

  public String getLongName() {
    return myLongName;
  }

  public void setLongName(String longName) {
    myLongName = longName;
  }

  public String getStereotype() {
    return myStereotype;
  }

  public void setStereotype(String stereotype) {
    myStereotype = stereotype;
  }

  public boolean isUsesLog() {
    return myUsesLog;
  }

  public void setUsesLog(boolean usesLog) {
    myUsesLog = usesLog;
  }

  public int getVersion() {
    return myVersion;
  }

  public void setVersion(int version) {
    myVersion = version;
  }

  public RootReference getRoot() {
    return myRoot;
  }

  public void setRoot(RootReference root) {
    myRoot = root;
  }

  public List<ModuleReference> getImportedLanguages() {
    return myImportedLanguages;
  }

  public List<SModelReference> getImportedModels() {
    return myImportedModels;
  }

  public List<ModuleReference> getImportedDevkits() {
    return myImportedDevkits;
  }

  public List<ModuleReference> getLanguagesInGeneration() {
    return myLanguagesInGeneration;
  }
}
