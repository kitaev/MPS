package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CharacterSymbolClassPart_Behavior {
  private static Class[] PARAMETERS_8173814113624650574 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getRepresentation_8173814113624650482(SNode thisNode) {
    return SymbolClassPart_Behavior.call_escapeChar_8173814113624637238(thisNode, SPropertyOperations.getString(thisNode, "character"));
  }

  public static String call_getRepresentation_8173814113624650574(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart"), "virtual_getRepresentation_8173814113624650482", PARAMETERS_8173814113624650574);
  }

  public static String callSuper_getRepresentation_8173814113624650574(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart"), callerConceptFqName, "virtual_getRepresentation_8173814113624650482", PARAMETERS_8173814113624650574);
  }
}
