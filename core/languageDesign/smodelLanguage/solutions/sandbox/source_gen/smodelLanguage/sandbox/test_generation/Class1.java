package smodelLanguage.sandbox.test_generation;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class Class1 {

  public void method1(SNode node) {
    List<SNode> nodes = SNodeOperations.getAllAttributes(node);
    SNode firstNode = SequenceOperations.getFirst(SNodeOperations.getAllAttributes(node));
  }

  public void method2(SNode node) {
    List<SNode> macros = SLinkOperations.getTargets(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true);
    SNode firstMacro = SequenceOperations.getFirst(SLinkOperations.getTargets(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true));
    SNode propertyMacro = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), true);
    SNode concept = SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "name"), true));
  }

  public void method3(SNode node) {
    SNode macro = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), true);
    SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "xoxoxoxo"), true);
  }

  public void method4(SNode node) {
    SNode conceptDeclaration = SLinkOperations.getTarget(node, "conceptDeclaration", false);
    SLinkOperations.setTarget(node, "conceptDeclaration", null, false);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), null, false);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceMacro", "conceptDeclaration"), SConceptOperations.createNewNode("jetbrains.mps.transformation.TLBase.structure.ReferenceMacro", null), false);
  }

  public void method5(SNode node) {
    SNode expression = SLinkOperations.getTarget(node, "expression", true);
    SLinkOperations.setNewChild(node, "expression", "jetbrains.mps.baseLanguage.structure.BinaryOperation");
    SLinkOperations.setNewChild(node, "", "jetbrains.mps.baseLanguage.structure.BinaryOperation");
    SLinkOperations.setNewChild(node, "", "null");
  }

}
