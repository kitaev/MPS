package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RaiseOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.RaiseOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ARGUMENT = "argument";

  public RaiseOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(RaiseOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RaiseOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RaiseOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RaiseOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RaiseOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RaiseOperation.VIRTUAL_PACKAGE, value);
  }

  public Expression getArgument() {
    return (Expression)this.getChild(Expression.class, RaiseOperation.ARGUMENT);
  }

  public void setArgument(Expression node) {
    super.setChild(RaiseOperation.ARGUMENT, node);
  }

  public static RaiseOperation newInstance(SModel sm, boolean init) {
    return (RaiseOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.RaiseOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RaiseOperation newInstance(SModel sm) {
    return RaiseOperation.newInstance(sm, false);
  }
}
