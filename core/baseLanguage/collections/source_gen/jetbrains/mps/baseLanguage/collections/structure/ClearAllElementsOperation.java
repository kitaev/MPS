package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClearAllElementsOperation extends NoArgumentsSequenceOperation implements IListOperation, IQueueOperation, IStackOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ClearAllElementsOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public ClearAllElementsOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ClearAllElementsOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ClearAllElementsOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ClearAllElementsOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ClearAllElementsOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ClearAllElementsOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ClearAllElementsOperation.VIRTUAL_PACKAGE, value);
  }


  public static ClearAllElementsOperation newInstance(SModel sm, boolean init) {
    return (ClearAllElementsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ClearAllElementsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClearAllElementsOperation newInstance(SModel sm) {
    return ClearAllElementsOperation.newInstance(sm, false);
  }

}
