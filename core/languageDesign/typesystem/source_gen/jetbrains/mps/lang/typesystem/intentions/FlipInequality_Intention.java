package jetbrains.mps.lang.typesystem.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class FlipInequality_Intention extends BaseIntention implements Intention {
  public FlipInequality_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.typesystem.structure.AbstractInequationStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Flip Inequality";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode newNode;
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.typesystem.structure.CreateGreaterThanInequationStatement")) {
      newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement", null);
    } else if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement")) {
      newNode = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.CreateGreaterThanInequationStatement", null);
    } else {
      return;
    }
    SLinkOperations.setTarget(newNode, "rightExpression", SLinkOperations.getTarget(node, "leftExpression", true), true);
    SLinkOperations.setTarget(newNode, "leftExpression", SLinkOperations.getTarget(node, "rightExpression", true), true);
    ListSequence.fromList(SLinkOperations.getTargets(newNode, "afterEquations", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "afterEquations", true)));
    ListSequence.fromList(SLinkOperations.getTargets(newNode, "afterGroups", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "afterGroups", true)));
    ListSequence.fromList(SLinkOperations.getTargets(newNode, "beforeEquations", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "beforeEquations", true)));
    ListSequence.fromList(SLinkOperations.getTargets(newNode, "beforeGroups", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "beforeGroups", true)));
    SPropertyOperations.set(newNode, "checkOnly", "" + SPropertyOperations.getBoolean(node, "checkOnly"));
    SLinkOperations.setTarget(newNode, "errorString", SLinkOperations.getTarget(node, "errorString", true), true);
    SLinkOperations.setTarget(newNode, "helginsIntention", SLinkOperations.getTarget(node, "helginsIntention", true), true);
    SLinkOperations.setTarget(newNode, "inequationGroup", SLinkOperations.getTarget(node, "inequationGroup", true), true);
    SPropertyOperations.set(newNode, "inequationPriority", "" + SPropertyOperations.getInteger_def(node, "inequationPriority", "0"));
    SPropertyOperations.set(newNode, "label", SPropertyOperations.getString(node, "label"));
    SLinkOperations.setTarget(newNode, "nodeToCheck", SLinkOperations.getTarget(node, "nodeToCheck", true), true);
    ListSequence.fromList(SLinkOperations.getTargets(newNode, "rulesToSkip", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(node, "rulesToSkip", true)));
    SNodeOperations.replaceWithAnother(node, newNode);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.typesystem.intentions";
  }
}
