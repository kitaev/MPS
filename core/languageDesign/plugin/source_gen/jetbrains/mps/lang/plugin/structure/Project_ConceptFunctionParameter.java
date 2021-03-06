package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Project_ConceptFunctionParameter extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.Project_ConceptFunctionParameter";

  public Project_ConceptFunctionParameter(SNode node) {
    super(node);
  }

  public static Project_ConceptFunctionParameter newInstance(SModel sm, boolean init) {
    return (Project_ConceptFunctionParameter) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.Project_ConceptFunctionParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Project_ConceptFunctionParameter newInstance(SModel sm) {
    return Project_ConceptFunctionParameter.newInstance(sm, false);
  }
}
