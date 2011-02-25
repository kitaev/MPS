package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class RuleFieldReference extends DataFlowConstructor {
  public RuleFieldReference() {
  }

  public boolean isApplicable(SNode node) {
    return SModelUtil_new.isAssignableConcept(INamedConcept_Behavior.call_getFqName_1213877404258(SNodeOperations.getConceptDeclaration(node)), getApplicableConceptFqName());
  }

  public String getApplicableConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference";
  }

  public void performActions(Program o, SNode node) {
    if (SLinkOperations.getTargets(SLinkOperations.getTarget(node, "variableDeclaration", false), "annotation", true) != null) {
      for (SNode annotation : SLinkOperations.getTargets(SLinkOperations.getTarget(node, "variableDeclaration", false), "annotation", true)) {
        String name = SPropertyOperations.getString(SLinkOperations.getTarget(annotation, "annotation", false), "name");
        if (SLinkOperations.getTarget(annotation, "annotation", false) == SNodeOperations.getNode("f:java_stub#2af156ab-65c1-4a62-bd0d-ea734f71eab6#org.jetbrains.annotations(jetbrains.mps.dataFlow.runtime/org.jetbrains.annotations@java_stub)", "~NotNull")) {
          {
            Object object = node;
            if (((Program) o).contains(object)) {
              boolean before = false;
              int position = ((Program) (o)).getEnd(object);
              Instruction instruction = new notNullInstruction(SLinkOperations.getTarget(node, "variableDeclaration", false));
              instruction.setSource(node);
              ((Program) (o)).insert(instruction, position, true, before);
            }
          }
        }
      }
    }
  }
}
