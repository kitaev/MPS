package smodelLanguage.samples;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class NodeRef {

  public void node_ref_1() {
    List<SNode> members = SLinkOperations.getTargets(SNodeOperations.getNode("jetbrains.mps.bootstrap.editorLanguage.structure", "1139535328871"), "member", true);
    String presentation = SPropertyOperations.getString(ListSequence.fromList(members).first(), "externalValue");
    String internalValue = SPropertyOperations.getString(ListSequence.fromList(members).first(), "internalValue");
    String javaIdentifier = SPropertyOperations.getString(ListSequence.fromList(members).first(), "javaIdentifier");
  }

}
