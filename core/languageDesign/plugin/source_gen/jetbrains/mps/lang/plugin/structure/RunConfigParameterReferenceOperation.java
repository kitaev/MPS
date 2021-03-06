package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RunConfigParameterReferenceOperation extends BaseConcept implements IMemberOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.RunConfigParameterReferenceOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MEMBER = "member";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public RunConfigParameterReferenceOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(RunConfigParameterReferenceOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RunConfigParameterReferenceOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RunConfigParameterReferenceOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RunConfigParameterReferenceOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RunConfigParameterReferenceOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RunConfigParameterReferenceOperation.VIRTUAL_PACKAGE, value);
  }

  public IMember getMember() {
    return (IMember) this.getReferent(IMember.class, RunConfigParameterReferenceOperation.MEMBER);
  }

  public void setMember(IMember node) {
    super.setReferent(RunConfigParameterReferenceOperation.MEMBER, node);
  }

  public RunConfigExecutionParameterDeclaration getRunConfigParameter() {
    return this.ensureAdapter(RunConfigExecutionParameterDeclaration.class, "member", this.getMember());
  }

  public void setRunConfigParameter(RunConfigExecutionParameterDeclaration node) {
    this.setMember(node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(RunConfigParameterReferenceOperation.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, RunConfigParameterReferenceOperation.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, RunConfigParameterReferenceOperation.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(RunConfigParameterReferenceOperation.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, RunConfigParameterReferenceOperation.SMODEL_ATTRIBUTE, node);
  }

  public static RunConfigParameterReferenceOperation newInstance(SModel sm, boolean init) {
    return (RunConfigParameterReferenceOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.RunConfigParameterReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RunConfigParameterReferenceOperation newInstance(SModel sm) {
    return RunConfigParameterReferenceOperation.newInstance(sm, false);
  }
}
