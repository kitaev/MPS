package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandClosureLiteral extends ClosureLiteral {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.CommandClosureLiteral";

  public CommandClosureLiteral(SNode node) {
    super(node);
  }

  public static CommandClosureLiteral newInstance(SModel sm, boolean init) {
    return (CommandClosureLiteral) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.CommandClosureLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommandClosureLiteral newInstance(SModel sm) {
    return CommandClosureLiteral.newInstance(sm, false);
  }
}
