package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TryCatchStatement_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void virtual_collectUncaughtMethodThrowables_5412515780383134223(SNode thisNode, Set<SNode> throwables, boolean ignoreMayBeThrowables) {
    TryCatchStatement_Behavior.collectUncatchedThrowables_4313092516462065508(throwables, SLinkOperations.getTarget(thisNode, "body", true), SLinkOperations.getTargets(thisNode, "catchClause", true), ignoreMayBeThrowables);
  }

  public static List<SNode> virtual_getCatchClauses_3718132079121388582(SNode thisNode) {
    return SLinkOperations.getTargets(thisNode, "catchClause", true);
  }

  public static void collectUncatchedThrowables_4313092516462065508(Set<SNode> throwables, SNode body, List<SNode> catchClause, boolean ignoreMayBeThrowables) {
    Set<SNode> thrownsFromBody = SetSequence.fromSet(new HashSet());
    StatementList_Behavior.call_collectUncaughtThrowables_5412515780383134474(body, thrownsFromBody, ignoreMayBeThrowables);

    // remove what we have catched 
    for (SNode caatch : ListSequence.fromList(catchClause)) {
      SLinkOperations.getTarget(caatch, "throwable", true);
      Set<SNode> toRemove = SetSequence.fromSet(new HashSet());
      for (SNode thrownFromBody : SetSequence.fromSet(thrownsFromBody)) {
        SNode catchedType = SLinkOperations.getTarget(SLinkOperations.getTarget(caatch, "throwable", true), "type", true);
        if (TypeChecker.getInstance().getSubtypingManager().isSubtype(new TryCatchStatement_Behavior.QuotationClass_1bi1ep_a0a0b0c0e0d().createNode(thrownFromBody), catchedType)) {
          SetSequence.fromSet(toRemove).addElement(thrownFromBody);
        }
      }
      SetSequence.fromSet(thrownsFromBody).removeSequence(SetSequence.fromSet(toRemove));
    }
    SetSequence.fromSet(throwables).addSequence(SetSequence.fromSet(thrownsFromBody));

    // now collect what was thrown in catch blocks 
    for (SNode caatch : ListSequence.fromList(catchClause)) {
      StatementList_Behavior.call_collectUncaughtThrowables_5412515780383134474(SLinkOperations.getTarget(caatch, "catchBody", true), throwables, ignoreMayBeThrowables);
    }
  }

  public static class QuotationClass_1bi1ep_a0a0b0c0e0d {
    public QuotationClass_1bi1ep_a0a0b0c0e0d() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
