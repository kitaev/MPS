package jetbrains.mps.lang.intentions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class IntentionDeclaration_Behavior {
  private static Class[] PARAMETERS_1240406910049 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_1213877237628(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Intention";
  }

  public static String call_getConceptName_1213877237638(SNode thisNode) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(thisNode, "forConcept", false));
  }

  public static boolean virtual_isParameterized_1240406910049(SNode thisNode) {
    return false;
  }

  public static SNode virtual_getDescendantToCheck_3745452943050928880(SNode thisNode) {
    if (!(ConceptFunction_Behavior.call_isReturnOnly_3745452943050787634(SLinkOperations.getTarget(thisNode, "descriptionFunction", true)))) {
      return null;
    }
    SNode stmt = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "descriptionFunction", true), "body", true), "statement", true)).first();
    if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
      SNode expr = SLinkOperations.getTarget(SNodeOperations.cast(stmt, "jetbrains.mps.baseLanguage.structure.ReturnStatement"), "expression", true);
      if (!(SNodeOperations.isInstanceOf(expr, "jetbrains.mps.baseLanguage.structure.StringLiteral"))) {
        return null;
      }
      return SNodeOperations.cast(expr, "jetbrains.mps.baseLanguage.structure.StringLiteral");
    } else if (SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      SNode expr = SLinkOperations.getTarget(SNodeOperations.cast(stmt, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
      if (!(SNodeOperations.isInstanceOf(expr, "jetbrains.mps.baseLanguage.structure.StringLiteral"))) {
        return null;
      }
      return SNodeOperations.cast(expr, "jetbrains.mps.baseLanguage.structure.StringLiteral");
    } else
    {
      return null;
    }
  }

  public static boolean call_isParameterized_1240406910049(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.intentions.structure.IntentionDeclaration"), "virtual_isParameterized_1240406910049", PARAMETERS_1240406910049);
  }

  public static boolean callSuper_isParameterized_1240406910049(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.intentions.structure.IntentionDeclaration"), callerConceptFqName, "virtual_isParameterized_1240406910049", PARAMETERS_1240406910049);
  }

}
