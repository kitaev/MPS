package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.plugin.uiActions.StratergyAddMethodDialog;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import jetbrains.mps.lang.behavior.behavior.ConceptBehavior_Behavior;

public class MethodsToOverrideStrategy implements StratergyAddMethodDialog.CollectMethodsStrategy {
  public MethodsToOverrideStrategy() {
  }

  public List<BaseMethodDeclaration> collectImplementableMethods(SNode container) {
    if (SNodeOperations.isInstanceOf(container, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      return BaseAdapter.toAdapters(ClassConcept_Behavior.call_getMethodsToOverride_6603209858471717101(SNodeOperations.cast(container, "jetbrains.mps.baseLanguage.structure.ClassConcept")));
    } else {
      return BaseAdapter.toAdapters(ConceptBehavior_Behavior.call_getMethodsToOverride_6603209858471710849(SNodeOperations.cast(container, "jetbrains.mps.lang.behavior.structure.ConceptBehavior")));
    }
  }
}
