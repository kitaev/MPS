package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;

public class StatementList_Behavior {
  public static void init(SNode thisNode) {
  }

  public static Set<SNode> call_getExternalVariablesDeclarations_1214501165480(SNode thisNode) {
    Set<SNode> declarations = SetSequence.fromSet(new HashSet<SNode>());
    Set<SNode> reference = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(reference).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(thisNode, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false, new String[]{})));
    SetSequence.fromSet(reference).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(thisNode, "jetbrains.mps.baseLanguage.structure.ParameterReference", false, new String[]{})));
    for (SNode ref : reference) {
      boolean statementsContainsVar = false;
      for (SNode parent : SNodeOperations.getAncestors(SLinkOperations.getTarget(ref, "variableDeclaration", false), null, false)) {
        if (parent == SNodeOperations.getParent(thisNode)) {
          statementsContainsVar = true;
        }
      }
      if (!(statementsContainsVar)) {
        SetSequence.fromSet(declarations).addElement(SLinkOperations.getTarget(ref, "variableDeclaration", false));
      }
    }
    return declarations;
  }

  public static boolean call_isCompact_1237546596168(SNode thisNode) {
    if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.IContainsStatementList"))) {
      return false;
    }
    SNode parent = SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.IContainsStatementList");
    if (!(IContainsStatementList_Behavior.call_isStatementListCompactable_1237546012856(parent))) {
      return false;
    }
    return IContainsStatementList_Behavior.call_isStatementListCompact_1237546693016(parent);
  }

  public static boolean call_isOneLiner_1237538811451(SNode thisNode) {
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).count() > 1) {
      return false;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).count() == 1 && SNodeOperations.isInstanceOf(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.IContainsStatementList")) {
      return false;
    }
    return true;
  }

  public static List<SNode> virtual_getLocalVariableElements_1238805763253(SNode thisNode) {
    return SLinkOperations.getTargets(thisNode, "statement", true);
  }
}
