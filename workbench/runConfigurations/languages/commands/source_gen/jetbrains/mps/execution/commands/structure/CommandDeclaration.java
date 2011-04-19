package jetbrains.mps.execution.commands.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.baseLanguage.structure.IMethodLike;
import jetbrains.mps.execution.common.structure.IGeneratedToClass;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.BlockStatement;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandDeclaration extends BaseConcept implements INamedConcept, IClassifier, IMethodLike, IGeneratedToClass {
  public static final String concept = "jetbrains.mps.execution.commands.structure.CommandDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String DEBUGGER = "debugger";
  public static final String EXECUTE = "execute";
  public static final String METHOD = "method";
  public static final String PARAMETER_DECLARATION = "parameterDeclaration";
  public static final String _$ATTRIBUTE = "_$attribute";

  public CommandDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(CommandDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(CommandDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(CommandDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CommandDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CommandDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CommandDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CommandDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CommandDeclaration.VIRTUAL_PACKAGE, value);
  }

  public Expression getDebugger() {
    return (Expression) this.getChild(Expression.class, CommandDeclaration.DEBUGGER);
  }

  public void setDebugger(Expression node) {
    super.setChild(CommandDeclaration.DEBUGGER, node);
  }

  public BlockStatement getExecute() {
    return (BlockStatement) this.getChild(BlockStatement.class, CommandDeclaration.EXECUTE);
  }

  public void setExecute(BlockStatement node) {
    super.setChild(CommandDeclaration.EXECUTE, node);
  }

  public int getMethodsCount() {
    return this.getChildCount(CommandDeclaration.METHOD);
  }

  public Iterator<CommandMethod> methods() {
    return this.children(CommandMethod.class, CommandDeclaration.METHOD);
  }

  public List<CommandMethod> getMethods() {
    return this.getChildren(CommandMethod.class, CommandDeclaration.METHOD);
  }

  public void addMethod(CommandMethod node) {
    this.addChild(CommandDeclaration.METHOD, node);
  }

  public void insertMethod(CommandMethod prev, CommandMethod node) {
    this.insertChild(prev, CommandDeclaration.METHOD, node);
  }

  public int getParameterDeclarationsCount() {
    return this.getChildCount(CommandDeclaration.PARAMETER_DECLARATION);
  }

  public Iterator<CommandParameterDeclaration> parameterDeclarations() {
    return this.children(CommandParameterDeclaration.class, CommandDeclaration.PARAMETER_DECLARATION);
  }

  public List<CommandParameterDeclaration> getParameterDeclarations() {
    return this.getChildren(CommandParameterDeclaration.class, CommandDeclaration.PARAMETER_DECLARATION);
  }

  public void addParameterDeclaration(CommandParameterDeclaration node) {
    this.addChild(CommandDeclaration.PARAMETER_DECLARATION, node);
  }

  public void insertParameterDeclaration(CommandParameterDeclaration prev, CommandParameterDeclaration node) {
    this.insertChild(prev, CommandDeclaration.PARAMETER_DECLARATION, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(CommandDeclaration._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, CommandDeclaration._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, CommandDeclaration._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(CommandDeclaration._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, CommandDeclaration._$ATTRIBUTE, node);
  }

  public static CommandDeclaration newInstance(SModel sm, boolean init) {
    return (CommandDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.CommandDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommandDeclaration newInstance(SModel sm) {
    return CommandDeclaration.newInstance(sm, false);
  }
}
