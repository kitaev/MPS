package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstanceMethodCallOperation extends BaseConcept implements IOperation, IMethodCall {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String BASE_METHOD_DECLARATION = "baseMethodDeclaration";
  public static final String _$ATTRIBUTE = "_$attribute";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public InstanceMethodCallOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(InstanceMethodCallOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InstanceMethodCallOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InstanceMethodCallOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InstanceMethodCallOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InstanceMethodCallOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InstanceMethodCallOperation.VIRTUAL_PACKAGE, value);
  }

  public BaseMethodDeclaration getBaseMethodDeclaration() {
    return (BaseMethodDeclaration) this.getReferent(BaseMethodDeclaration.class, InstanceMethodCallOperation.BASE_METHOD_DECLARATION);
  }

  public void setBaseMethodDeclaration(BaseMethodDeclaration node) {
    super.setReferent(InstanceMethodCallOperation.BASE_METHOD_DECLARATION, node);
  }

  public InstanceMethodDeclaration getInstanceMethodDeclaration() {
    return this.ensureAdapter(InstanceMethodDeclaration.class, "baseMethodDeclaration", this.getBaseMethodDeclaration());
  }

  public void setInstanceMethodDeclaration(InstanceMethodDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(InstanceMethodCallOperation._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, InstanceMethodCallOperation._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, InstanceMethodCallOperation._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(InstanceMethodCallOperation._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, InstanceMethodCallOperation._$ATTRIBUTE, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(InstanceMethodCallOperation.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(Expression.class, InstanceMethodCallOperation.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(Expression.class, InstanceMethodCallOperation.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(InstanceMethodCallOperation.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, InstanceMethodCallOperation.ACTUAL_ARGUMENT, node);
  }

  public static InstanceMethodCallOperation newInstance(SModel sm, boolean init) {
    return (InstanceMethodCallOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstanceMethodCallOperation newInstance(SModel sm) {
    return InstanceMethodCallOperation.newInstance(sm, false);
  }
}
