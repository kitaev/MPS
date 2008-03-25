package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;

public class NewNode {

  public void newNode1(SModel model) {
    SNode newClass = SModelOperations.createNewRootNode(model, "jetbrains.mps.baseLanguage.structure.ClassConcept", null);
    SLinkOperations.addNewChild(newClass, "constructor", "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration");
    SLinkOperations.addNewChild(SLinkOperations.addNewChild(newClass, "constructor", "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"), "parameter", "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
  }

  public void newNode2(SNode node) {
    SNode newIfStatement = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.baseLanguage.structure.IfStatement", null);
    SNode newCondition = SLinkOperations.setNewChild(newIfStatement, "condition", "jetbrains.mps.baseLanguage.structure.Expression");
    SNode newCondition2 = SNodeOperations.replaceWithNewChild(newCondition, "jetbrains.mps.baseLanguage.structure.AndExpression");
    SNode newStatement = SLinkOperations.addNewChild(SLinkOperations.getTarget(newIfStatement, "ifTrue", true), "statement", "jetbrains.mps.baseLanguage.structure.ReturnStatement");
  }

  public void newNode3(SNode sample) {
    SNode ifStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
    SNode ifStatement1 = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", sample);
    SNode ifStatement2 = SConceptOperations.createNewNode(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IfStatement")), null);
    SNode ifStatement3 = SConceptOperations.createNewNode(NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IfStatement")), sample);
  }

}
