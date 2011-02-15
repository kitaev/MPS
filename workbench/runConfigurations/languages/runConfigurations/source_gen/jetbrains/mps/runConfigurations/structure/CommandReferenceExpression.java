package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandReferenceExpression extends Expression {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.CommandReferenceExpression";
  public static final String COMMAND_DECLARATION = "commandDeclaration";
  public static final String ARGUMENT = "argument";

  public CommandReferenceExpression(SNode node) {
    super(node);
  }

  public CommandDeclaration getCommandDeclaration() {
    return (CommandDeclaration) this.getReferent(CommandDeclaration.class, CommandReferenceExpression.COMMAND_DECLARATION);
  }

  public void setCommandDeclaration(CommandDeclaration node) {
    super.setReferent(CommandReferenceExpression.COMMAND_DECLARATION, node);
  }

  public int getArgumentsCount() {
    return this.getChildCount(CommandReferenceExpression.ARGUMENT);
  }

  public Iterator<Expression> arguments() {
    return this.children(Expression.class, CommandReferenceExpression.ARGUMENT);
  }

  public List<Expression> getArguments() {
    return this.getChildren(Expression.class, CommandReferenceExpression.ARGUMENT);
  }

  public void addArgument(Expression node) {
    this.addChild(CommandReferenceExpression.ARGUMENT, node);
  }

  public void insertArgument(Expression prev, Expression node) {
    this.insertChild(prev, CommandReferenceExpression.ARGUMENT, node);
  }

  public static CommandReferenceExpression newInstance(SModel sm, boolean init) {
    return (CommandReferenceExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.CommandReferenceExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommandReferenceExpression newInstance(SModel sm) {
    return CommandReferenceExpression.newInstance(sm, false);
  }
}
