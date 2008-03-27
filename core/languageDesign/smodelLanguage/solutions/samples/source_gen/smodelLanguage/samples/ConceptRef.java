package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.IScope;

public class ConceptRef {

  public void concept_ref_1(SNode node) {
    SNode concept1 = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IfStatement");
    SNode concept2 = SNodeOperations.getConceptDeclaration(node);
    if (SConceptOperations.isSuperConceptOf(concept1, NameUtil.nodeFQName(concept2))) {
    }
    INodeAdapter adapter = ((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept1));
  }

  public void instanceOf_1(SNode node, SNode concept1, SNode concept2) {
    SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.IfStatement");
    SNodeOperations.isInstanceOf(node, NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IfStatement")));
    SNodeOperations.isInstanceOf(node, NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(node)));
    SNodeOperations.isInstanceOf(node, NameUtil.nodeFQName(concept1));
    SNodeOperations.isInstanceOf(node, NameUtil.nodeFQName(concept2));
    SNodeOperations.isInstanceOf(node, NameUtil.nodeFQName(concept2));
  }

  public void concept_conceptProperties(SNode exprConcept) {
    boolean b = SConceptPropertyOperations.getBoolean(exprConcept, "lvalue");
  }

  public void concept_conceptLinkTargets(SNode conceptFunctionConcept) {
    List<SNode> applicableParams = SLinkOperations.getConceptLinkTargets(conceptFunctionConcept, "applicableConceptFunctionParameter");
  }

  public void concept_types() {
    SNode exprConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression");
    SNode c1 = exprConcept;
    SNode c2 = (SNode)c1;
    // ====== to node
    // - ok -
    SNode n1 = exprConcept;
    SNode n2 = exprConcept;
    // -- not ok --
    SNode n3 = exprConcept;
    exprConcept = n1;
    exprConcept = n2;
    // ====== to concept
    // - ok -
    SNode exprConc = c1;
    SNode bExprConc = exprConcept;
    exprConc = bExprConc;
    // -- not ok --
    bExprConc = exprConc;
  }

  public void concept_hierarchy1(SNode concept) {
    // concept and all its supers
    List<SNode> hierarchy = SConceptOperations.getConceptHierarchy(concept);
    // supers
    List<SNode> supers_all = SConceptOperations.getAllSuperConcepts(concept);
    // direct supers
    List<SNode> supers_direct = SConceptOperations.getDirectSuperConcepts(concept);
    // ======
    boolean yes1 = SConceptOperations.isSuperConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression"), "jetbrains.mps.baseLanguage.structure.BinaryOperation");
    boolean yes2 = SConceptOperations.isSuperConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression"), NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BinaryOperation")));
    boolean yes3 = SConceptOperations.isSubConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BinaryOperation"), "jetbrains.mps.baseLanguage.structure.Expression");
    boolean yes4 = SConceptOperations.isSubConceptOf(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BinaryOperation"), NameUtil.nodeFQName(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Expression")));
  }

  public void concept_hierarchy2() {
    List<SNode> subConcepts = SConceptOperations.getAllSubConcepts(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BinaryOperation"));
    SNode n;
    List<SNode> subConcepts1 = SConceptOperations.getAllSubConcepts(SNodeOperations.getConceptDeclaration(n));
  }

  public void concept_instances(IScope scope) {
    List<SNode> instances = SConceptOperations.findConceptInstances(SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BinaryOperation"), null);
    SNode aConcept;
    List<SNode> instances2 = SConceptOperations.findConceptInstances(aConcept, scope);
  }

}
