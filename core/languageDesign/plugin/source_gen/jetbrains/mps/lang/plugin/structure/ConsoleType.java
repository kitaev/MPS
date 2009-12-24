package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConsoleType extends Type {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConsoleType";

  public ConsoleType(SNode node) {
    super(node);
  }

  public static ConsoleType newInstance(SModel sm, boolean init) {
    return (ConsoleType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConsoleType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConsoleType newInstance(SModel sm) {
    return ConsoleType.newInstance(sm, false);
  }
}
