package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class AddOnNewLine_Intention extends BaseIntention {

  public AddOnNewLine_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.EditorCellModel";
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
    return "Add On New Line";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (SNodeOperations.getParent(node) != null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.CellModel_Collection"), "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Indent") && !(EditorCellModel_Behavior.call_isNewLine_1237383076236(node));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode newLine = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem", null);
    SPropertyOperations.set(newLine, "flag", "" + (true));
    SLinkOperations.addChild(node, "styleItem", newLine);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    ListSequence.fromList(list).addElement(this);
    return list;
  }

}
