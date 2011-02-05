package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CheckCallOperation extends BaseConcept implements IMemberOperation {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.CheckCallOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MEMBER = "member";

  public CheckCallOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CheckCallOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CheckCallOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CheckCallOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CheckCallOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CheckCallOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CheckCallOperation.VIRTUAL_PACKAGE, value);
  }

  public IMember getMember() {
    return (IMember) this.getReferent(IMember.class, CheckCallOperation.MEMBER);
  }

  public void setMember(IMember node) {
    super.setReferent(CheckCallOperation.MEMBER, node);
  }

  public CheckProperties_Function getCheckProperties() {
    return this.ensureAdapter(CheckProperties_Function.class, "member", this.getMember());
  }

  public void setCheckProperties(CheckProperties_Function node) {
    this.setMember(node);
  }

  public static CheckCallOperation newInstance(SModel sm, boolean init) {
    return (CheckCallOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.CheckCallOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CheckCallOperation newInstance(SModel sm) {
    return CheckCallOperation.newInstance(sm, false);
  }
}
