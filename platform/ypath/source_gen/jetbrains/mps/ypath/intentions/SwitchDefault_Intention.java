package jetbrains.mps.ypath.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class SwitchDefault_Intention extends BaseIntention {

  public SwitchDefault_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.ypath.structure.TreeNodeKindProperty";
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
    return (SPropertyOperations.getBoolean(node, "default") ?
      "Make Regular" :
      "Make Default"
    );
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    boolean isDefault = SPropertyOperations.getBoolean(node, "default");
    SPropertyOperations.set(node, "default", "" + (!(isDefault)));
  }

  public String getLocationString() {
    return "jetbrains.mps.ypath.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    ListSequence.fromList(list).addElement(this);
    return list;
  }

}
