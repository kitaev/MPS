package jetbrains.mps.execution.commands.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandBuilderExpression extends Expression {
  public static final String concept = "jetbrains.mps.execution.commands.structure.CommandBuilderExpression";
  public static final String COMMAND_PART = "commandPart";
  public static final String ARGUMENT = "argument";

  public CommandBuilderExpression(SNode node) {
    super(node);
  }

  public ExecuteCommandPart getCommandPart() {
    return (ExecuteCommandPart) this.getReferent(ExecuteCommandPart.class, CommandBuilderExpression.COMMAND_PART);
  }

  public void setCommandPart(ExecuteCommandPart node) {
    super.setReferent(CommandBuilderExpression.COMMAND_PART, node);
  }

  public int getArgumentsCount() {
    return this.getChildCount(CommandBuilderExpression.ARGUMENT);
  }

  public Iterator<CommandParameterAssignment> arguments() {
    return this.children(CommandParameterAssignment.class, CommandBuilderExpression.ARGUMENT);
  }

  public List<CommandParameterAssignment> getArguments() {
    return this.getChildren(CommandParameterAssignment.class, CommandBuilderExpression.ARGUMENT);
  }

  public void addArgument(CommandParameterAssignment node) {
    this.addChild(CommandBuilderExpression.ARGUMENT, node);
  }

  public void insertArgument(CommandParameterAssignment prev, CommandParameterAssignment node) {
    this.insertChild(prev, CommandBuilderExpression.ARGUMENT, node);
  }

  public static CommandBuilderExpression newInstance(SModel sm, boolean init) {
    return (CommandBuilderExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.CommandBuilderExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommandBuilderExpression newInstance(SModel sm) {
    return CommandBuilderExpression.newInstance(sm, false);
  }
}
