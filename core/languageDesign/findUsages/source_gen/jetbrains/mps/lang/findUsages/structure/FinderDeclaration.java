package jetbrains.mps.lang.findUsages.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.plugin.structure.ICheckedNamePolicy;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FinderDeclaration extends AbstractFinderDeclaration implements INamedConcept, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.findUsages.structure.FinderDeclaration";
  public static final String DESCRIPTION = "description";
  public static final String LONG_DESCRIPTION = "longDescription";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_VISIBLE_BLOCK = "isVisibleBlock";

  public FinderDeclaration(SNode node) {
    super(node);
  }

  public String getDescription() {
    return this.getProperty(FinderDeclaration.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(FinderDeclaration.DESCRIPTION, value);
  }

  public String getLongDescription() {
    return this.getProperty(FinderDeclaration.LONG_DESCRIPTION);
  }

  public void setLongDescription(String value) {
    this.setProperty(FinderDeclaration.LONG_DESCRIPTION, value);
  }

  public String getName() {
    return this.getProperty(FinderDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(FinderDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(FinderDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FinderDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FinderDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FinderDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FinderDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FinderDeclaration.VIRTUAL_PACKAGE, value);
  }

  public IsVisibleBlock getIsVisibleBlock() {
    return (IsVisibleBlock)this.getChild(IsVisibleBlock.class, FinderDeclaration.IS_VISIBLE_BLOCK);
  }

  public void setIsVisibleBlock(IsVisibleBlock node) {
    super.setChild(FinderDeclaration.IS_VISIBLE_BLOCK, node);
  }


  public static FinderDeclaration newInstance(SModel sm, boolean init) {
    return (FinderDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.findUsages.structure.FinderDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FinderDeclaration newInstance(SModel sm) {
    return FinderDeclaration.newInstance(sm, false);
  }

}
