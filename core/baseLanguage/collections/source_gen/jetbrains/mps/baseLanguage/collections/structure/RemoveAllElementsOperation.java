package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveAllElementsOperation extends SingleArgumentSequenceOperation implements IListOperation, IQueueOperation, IStackOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public RemoveAllElementsOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(RemoveAllElementsOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RemoveAllElementsOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RemoveAllElementsOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RemoveAllElementsOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RemoveAllElementsOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RemoveAllElementsOperation.VIRTUAL_PACKAGE, value);
  }

  public static RemoveAllElementsOperation newInstance(SModel sm, boolean init) {
    return (RemoveAllElementsOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveAllElementsOperation newInstance(SModel sm) {
    return RemoveAllElementsOperation.newInstance(sm, false);
  }
}
