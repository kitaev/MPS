package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class ElsifTransform_Intention extends BaseIntention implements Intention {
  public ElsifTransform_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Elsif Transform";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SNode ifFalseStatement = SLinkOperations.getTarget(node, "ifFalseStatement", true);
    return (ifFalseStatement != null) && SNodeOperations.isInstanceOf(ifFalseStatement, "jetbrains.mps.baseLanguage.structure.IfStatement");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode ifFalseStatement = SLinkOperations.getTarget(node, "ifFalseStatement", true);
    while (true) {
      SNode ifStatement = SNodeOperations.cast(ifFalseStatement, "jetbrains.mps.baseLanguage.structure.IfStatement");
      SNode elsifClause = SNodeFactoryOperations.addNewChild(node, "elsifClauses", "jetbrains.mps.baseLanguage.structure.ElsifClause");
      SLinkOperations.setTarget(elsifClause, "condition", SLinkOperations.getTarget(ifStatement, "condition", true), true);
      SLinkOperations.setTarget(elsifClause, "statementList", SLinkOperations.getTarget(ifStatement, "ifTrue", true), true);
      ifFalseStatement = SLinkOperations.getTarget(ifStatement, "ifFalseStatement", true);
      if ((ifFalseStatement == null)) {
        break;
      }
      if (!(SNodeOperations.isInstanceOf(ifFalseStatement, "jetbrains.mps.baseLanguage.structure.IfStatement"))) {
        SLinkOperations.setTarget(node, "ifFalseStatement", ifFalseStatement, true);
        break;
      }
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
