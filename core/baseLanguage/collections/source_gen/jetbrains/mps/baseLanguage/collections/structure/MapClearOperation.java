package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MapClearOperation extends MapOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.MapClearOperation";

  public MapClearOperation(SNode node) {
    super(node);
  }

  public static MapClearOperation newInstance(SModel sm, boolean init) {
    return (MapClearOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapClearOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MapClearOperation newInstance(SModel sm) {
    return MapClearOperation.newInstance(sm, false);
  }
}
