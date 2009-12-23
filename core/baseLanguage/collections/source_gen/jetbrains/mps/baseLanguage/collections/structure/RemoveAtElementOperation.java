package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveAtElementOperation extends SequenceOperation implements IListOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.RemoveAtElementOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String INDEX = "index";

  public RemoveAtElementOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(RemoveAtElementOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RemoveAtElementOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RemoveAtElementOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RemoveAtElementOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RemoveAtElementOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RemoveAtElementOperation.VIRTUAL_PACKAGE, value);
  }

  public Expression getIndex() {
    return (Expression) this.getChild(Expression.class, RemoveAtElementOperation.INDEX);
  }

  public void setIndex(Expression node) {
    super.setChild(RemoveAtElementOperation.INDEX, node);
  }

  public static RemoveAtElementOperation newInstance(SModel sm, boolean init) {
    return (RemoveAtElementOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.RemoveAtElementOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveAtElementOperation newInstance(SModel sm) {
    return RemoveAtElementOperation.newInstance(sm, false);
  }
}
