package smodelLanguage.sandbox.test_generation;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;

public class Class1 {

  public void method1(SNode node) {
    SNodeOperations.isAttribute(node);
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
    // single attribute access
    SNode expression = SLinkOperations.getTarget(node, "expression", true);
    SLinkOperations.setNewChild(node, "expression", "jetbrains.mps.baseLanguage.structure.BinaryOperation");
    SLinkOperations.setNewChild(node, "expression", "jetbrains.mps.baseLanguage.structure.Expression");
    SNode ex = SLinkOperations.deleteChild(node, "expression");
    SLinkOperations.setNewChild(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "alias"), "jetbrains.mps.transformation.TLBase.structure.PropertyMacro");
    SLinkOperations.setNewChild(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "alias"), "jetbrains.mps.transformation.TLBase.structure.PropertyMacro");
    SNode macro = SLinkOperations.deleteChild(node, AttributesRolesUtil.childRoleFromPropertyAttributeRole("propertyMacro", "alias"));
  }

  public void method6(SNode node) {
    // attribute list access
    List<SNode> nodes = SLinkOperations.getTargets(node, "statement", true);
    SLinkOperations.addNewChild(node, "statement", "jetbrains.mps.baseLanguage.structure.Statement");
    SLinkOperations.addNewChild(node, "statement", "jetbrains.mps.baseLanguage.structure.Statement");
    SLinkOperations.addChild(node, "statement", null);
    SLinkOperations.addAll(node, "statement", null);
    SLinkOperations.insertChildFirst(node, "statement", null);
    int c1 = SLinkOperations.getCount(node, "statement");
    List<SNode> macros = SLinkOperations.getTargets(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true);
    SLinkOperations.addNewChild(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), "jetbrains.mps.transformation.TLBase.structure.NodeMacro");
    SLinkOperations.addNewChild(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), "jetbrains.mps.transformation.TLBase.structure.NodeMacro");
    SLinkOperations.addChild(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), null);
    SLinkOperations.addAll(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), null);
    SLinkOperations.insertChildFirst(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), null);
    int c2 = SLinkOperations.getCount(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"));
    int c3 = SequenceOperations.count(SLinkOperations.getTargets(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true));
    // not a link
    int all = SequenceOperations.count(SNodeOperations.getAllAttributes(node));
  }

}
