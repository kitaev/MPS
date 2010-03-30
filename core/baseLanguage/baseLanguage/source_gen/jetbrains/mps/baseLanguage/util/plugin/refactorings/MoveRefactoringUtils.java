package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModel;

public class MoveRefactoringUtils {
  public static void addNodeAtLink(SNode container, SNode node) {
    SNode concept = SNodeOperations.getConceptDeclaration(node);
    for (SNode link : ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(SNodeOperations.getConceptDeclaration(container)))) {
      if (SLinkOperations.getTarget(link, "target", false) == concept) {
        container.addChild(SPropertyOperations.getString(link, "role"), node);
      }
    }
  }

  public static void addImportIfNeed(SModel model, SModel toImport) {
    if (model == toImport || model.getImportedModelUIDs().contains(toImport.getSModelReference())) {
      return;
    }
    model.addImportedModel(toImport.getSModelReference());
  }
}
