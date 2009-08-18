package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter extends Expression implements IParameter {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter";
  public static final String CPR_DontUseParameterObject = "dontUseParameterObject";
  public static final String CLNK_ConceptFunctionParameterType = "conceptFunctionParameterType";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public ConceptFunctionParameter(SNode node) {
    super(node);
  }


  public String getShortDescription() {
    return this.getProperty(ConceptFunctionParameter.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptFunctionParameter.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptFunctionParameter.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptFunctionParameter.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptFunctionParameter.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptFunctionParameter.VIRTUAL_PACKAGE, value);
  }


  public static ConceptFunctionParameter newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter newInstance(SModel sm) {
    return ConceptFunctionParameter.newInstance(sm, false);
  }
}
