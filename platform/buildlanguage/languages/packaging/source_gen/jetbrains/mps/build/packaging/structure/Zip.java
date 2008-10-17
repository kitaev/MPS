package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Zip extends Jar {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Zip";

  public Zip(SNode node) {
    super(node);
  }

  public static Zip newInstance(SModel sm, boolean init) {
    return (Zip)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Zip", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Zip newInstance(SModel sm) {
    return Zip.newInstance(sm, false);
  }

}
