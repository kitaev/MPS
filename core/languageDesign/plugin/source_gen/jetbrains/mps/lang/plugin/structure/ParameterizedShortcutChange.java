package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParameterizedShortcutChange extends ShortcutChange {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ParameterizedShortcutChange";

  public ParameterizedShortcutChange(SNode node) {
    super(node);
  }

  public static ParameterizedShortcutChange newInstance(SModel sm, boolean init) {
    return (ParameterizedShortcutChange) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ParameterizedShortcutChange", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParameterizedShortcutChange newInstance(SModel sm) {
    return ParameterizedShortcutChange.newInstance(sm, false);
  }
}
