package jetbrains.mps.lang.core.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.project.structure.modules.ModuleReference;

public class AddMissingLanguageImport_Intention extends BaseIntention implements Intention {
  public AddMissingLanguageImport_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return true;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Language " + node.getLanguageNamespace() + " to Current Module";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return node.getLanguage() == null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    ModuleReference moduleRef = node.getLanguage().getModuleReference();
    if (moduleRef == null) {
      return;
    }
    editorContext.getOperationContext().getModule().addUsedLanguage(moduleRef);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.core.intentions";
  }
}
