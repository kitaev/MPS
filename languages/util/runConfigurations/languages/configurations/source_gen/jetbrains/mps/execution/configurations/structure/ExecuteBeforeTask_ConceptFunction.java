package jetbrains.mps.execution.configurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExecuteBeforeTask_ConceptFunction extends ConceptFunction {
  public static final String concept = "jetbrains.mps.execution.configurations.structure.ExecuteBeforeTask_ConceptFunction";

  public ExecuteBeforeTask_ConceptFunction(SNode node) {
    super(node);
  }

  public static ExecuteBeforeTask_ConceptFunction newInstance(SModel sm, boolean init) {
    return (ExecuteBeforeTask_ConceptFunction) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.configurations.structure.ExecuteBeforeTask_ConceptFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExecuteBeforeTask_ConceptFunction newInstance(SModel sm) {
    return ExecuteBeforeTask_ConceptFunction.newInstance(sm, false);
  }
}
