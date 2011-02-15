package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandPart extends BaseConcept {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.CommandPart";
  public static final String EXPRESSION = "expression";

  public CommandPart(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression) this.getChild(Expression.class, CommandPart.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(CommandPart.EXPRESSION, node);
  }

  public static CommandPart newInstance(SModel sm, boolean init) {
    return (CommandPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.CommandPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommandPart newInstance(SModel sm) {
    return CommandPart.newInstance(sm, false);
  }
}
