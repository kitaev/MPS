package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateDeclarationReference extends RuleConsequence implements ITemplateCall {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateDeclarationReference";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TEMPLATE = "template";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public TemplateDeclarationReference(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(TemplateDeclarationReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TemplateDeclarationReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TemplateDeclarationReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TemplateDeclarationReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TemplateDeclarationReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TemplateDeclarationReference.VIRTUAL_PACKAGE, value);
  }

  public TemplateDeclaration getTemplate() {
    return (TemplateDeclaration) this.getReferent(TemplateDeclaration.class, TemplateDeclarationReference.TEMPLATE);
  }

  public void setTemplate(TemplateDeclaration node) {
    super.setReferent(TemplateDeclarationReference.TEMPLATE, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(TemplateDeclarationReference.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(Expression.class, TemplateDeclarationReference.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(Expression.class, TemplateDeclarationReference.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(TemplateDeclarationReference.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, TemplateDeclarationReference.ACTUAL_ARGUMENT, node);
  }

  public static TemplateDeclarationReference newInstance(SModel sm, boolean init) {
    return (TemplateDeclarationReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateDeclarationReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateDeclarationReference newInstance(SModel sm) {
    return TemplateDeclarationReference.newInstance(sm, false);
  }
}
