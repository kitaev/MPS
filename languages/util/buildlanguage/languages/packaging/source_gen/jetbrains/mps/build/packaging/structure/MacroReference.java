package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MacroReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.MacroReference";
  public static final String NAME = "name";
  public static final String PATH = "path";

  public MacroReference(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(MacroReference.NAME);
  }

  public void setName(String value) {
    this.setProperty(MacroReference.NAME, value);
  }

  public String getPath() {
    return this.getProperty(MacroReference.PATH);
  }

  public void setPath(String value) {
    this.setProperty(MacroReference.PATH, value);
  }

  public static MacroReference newInstance(SModel sm, boolean init) {
    return (MacroReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.MacroReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MacroReference newInstance(SModel sm) {
    return MacroReference.newInstance(sm, false);
  }
}
