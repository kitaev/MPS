package jetbrains.mps.lang.editor.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class IndentLayoutShouldntBeUsedWithBraces_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public IndentLayoutShouldntBeUsedWithBraces_NonTypesystemRule() {
  }

  public void applyRule(final SNode editorCellModel, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(editorCellModel, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
      SNode collection = SNodeOperations.cast(editorCellModel, "jetbrains.mps.lang.editor.structure.CellModel_Collection");
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(collection, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent") && SPropertyOperations.getBoolean(collection, "usesBraces")) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(editorCellModel, "Braces shouldn't be used with indent layout.", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "4575971948964608918", intentionProvider, errorTarget);
        }
      }
    }
    if (SNodeOperations.isInstanceOf(editorCellModel, "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole")) {
      SNode collection = SNodeOperations.cast(editorCellModel, "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole");
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(collection, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent") && SPropertyOperations.getBoolean(collection, "usesBraces")) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(editorCellModel, "Braces shouldn't be used with indent layout.", "r:00000000-0000-4000-0000-011c8959029a(jetbrains.mps.lang.editor.typesystem)", "4575971948964608943", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.editor.structure.EditorCellModel";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
