package jetbrains.mps.build.dependency.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PathHolder extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.dependency.structure.PathHolder";
  public static final String PATH = "path";
  public static final String MACRO = "macro";

  public PathHolder(SNode node) {
    super(node);
  }

  public String getPath() {
    return this.getProperty(PathHolder.PATH);
  }

  public void setPath(String value) {
    this.setProperty(PathHolder.PATH, value);
  }

  public Macros getMacro() {
    return (Macros) this.getReferent(Macros.class, PathHolder.MACRO);
  }

  public void setMacro(Macros node) {
    super.setReferent(PathHolder.MACRO, node);
  }

  public static PathHolder newInstance(SModel sm, boolean init) {
    return (PathHolder) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.dependency.structure.PathHolder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PathHolder newInstance(SModel sm) {
    return PathHolder.newInstance(sm, false);
  }
}
