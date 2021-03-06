package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_AnActionEvent extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_AnActionEvent";

  public ConceptFunctionParameter_AnActionEvent(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_AnActionEvent newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_AnActionEvent) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_AnActionEvent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_AnActionEvent newInstance(SModel sm) {
    return ConceptFunctionParameter_AnActionEvent.newInstance(sm, false);
  }
}
