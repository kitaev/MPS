package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FieldDeclaration extends VariableDeclaration implements ClassifierMember, IResolveInfo {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String RESOLVE_INFO = "resolveInfo";
  public static String VISIBILITY = "visibility";

  public FieldDeclaration(SNode node) {
    super(node);
  }

  public static FieldDeclaration newInstance(SModel sm, boolean init) {
    return (FieldDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FieldDeclaration newInstance(SModel sm) {
    return FieldDeclaration.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(FieldDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FieldDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FieldDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FieldDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FieldDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FieldDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(FieldDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(FieldDeclaration.RESOLVE_INFO, value);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(FieldDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(FieldDeclaration.VISIBILITY, node);
  }

}
