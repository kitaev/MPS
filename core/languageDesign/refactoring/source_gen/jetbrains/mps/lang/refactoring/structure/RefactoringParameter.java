package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RefactoringParameter extends BaseConcept implements INamedConcept, RefactoringArgument {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.RefactoringParameter";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CHOOSER = "chooser";

  public RefactoringParameter(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(RefactoringParameter.NAME);
  }

  public void setName(String value) {
    this.setProperty(RefactoringParameter.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(RefactoringParameter.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RefactoringParameter.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RefactoringParameter.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RefactoringParameter.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RefactoringParameter.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RefactoringParameter.VIRTUAL_PACKAGE, value);
  }

  public RefactoringParameterChooser getChooser() {
    return (RefactoringParameterChooser) this.getChild(RefactoringParameterChooser.class, RefactoringParameter.CHOOSER);
  }

  public void setChooser(RefactoringParameterChooser node) {
    super.setChild(RefactoringParameter.CHOOSER, node);
  }

  public static RefactoringParameter newInstance(SModel sm, boolean init) {
    return (RefactoringParameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.RefactoringParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RefactoringParameter newInstance(SModel sm) {
    return RefactoringParameter.newInstance(sm, false);
  }
}
