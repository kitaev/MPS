package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.baseLanguage.structure.Closureoid;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WhenConcreteStatement extends Statement implements Closureoid {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.WhenConcreteStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_SHALLOW = "isShallow";
  public static final String SKIPS_ERROR = "skipsError";
  public static final String BODY = "body";
  public static final String ARGUMENT = "argument";
  public static final String ARGUMENT_REPRESENTATOR = "argumentRepresentator";
  public static final String _$ATTRIBUTE = "_$attribute";

  public WhenConcreteStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(WhenConcreteStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(WhenConcreteStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(WhenConcreteStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(WhenConcreteStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(WhenConcreteStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(WhenConcreteStatement.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsShallow() {
    return this.getBooleanProperty(WhenConcreteStatement.IS_SHALLOW);
  }

  public void setIsShallow(boolean value) {
    this.setBooleanProperty(WhenConcreteStatement.IS_SHALLOW, value);
  }

  public boolean getSkipsError() {
    return this.getBooleanProperty(WhenConcreteStatement.SKIPS_ERROR);
  }

  public void setSkipsError(boolean value) {
    this.setBooleanProperty(WhenConcreteStatement.SKIPS_ERROR, value);
  }

  public StatementList getBody() {
    return (StatementList) this.getChild(StatementList.class, WhenConcreteStatement.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(WhenConcreteStatement.BODY, node);
  }

  public Expression getArgument() {
    return (Expression) this.getChild(Expression.class, WhenConcreteStatement.ARGUMENT);
  }

  public void setArgument(Expression node) {
    super.setChild(WhenConcreteStatement.ARGUMENT, node);
  }

  public WhenConcreteVariableDeclaration getArgumentRepresentator() {
    return (WhenConcreteVariableDeclaration) this.getChild(WhenConcreteVariableDeclaration.class, WhenConcreteStatement.ARGUMENT_REPRESENTATOR);
  }

  public void setArgumentRepresentator(WhenConcreteVariableDeclaration node) {
    super.setChild(WhenConcreteStatement.ARGUMENT_REPRESENTATOR, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(WhenConcreteStatement._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, WhenConcreteStatement._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, WhenConcreteStatement._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(WhenConcreteStatement._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, WhenConcreteStatement._$ATTRIBUTE, node);
  }

  public static WhenConcreteStatement newInstance(SModel sm, boolean init) {
    return (WhenConcreteStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.WhenConcreteStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WhenConcreteStatement newInstance(SModel sm) {
    return WhenConcreteStatement.newInstance(sm, false);
  }
}
