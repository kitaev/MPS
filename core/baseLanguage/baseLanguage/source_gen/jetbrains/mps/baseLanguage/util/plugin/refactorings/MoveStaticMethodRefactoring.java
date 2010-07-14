package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MoveStaticMethodRefactoring extends BasicMoveRefactoring {
  public MoveStaticMethodRefactoring(SNode moving, SNode destination) {
    super(moving, destination);
  }

  private void replaceFields() {
    SNode classNode = SNodeOperations.getAncestor(this.myMoving, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    for (SNode field : ListSequence.fromList(SNodeOperations.getDescendants(this.myMoving, "jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference", false, new String[]{}))) {
      SNodeOperations.replaceWithAnother(field, new MoveStaticMethodRefactoring.QuotationClass_f5lqsg_a0a0a0b0a().createNode(classNode, SLinkOperations.getTarget(field, "variableDeclaration", false)));
    }
  }

  private void replaceMethods() {
    SNode classNode = SNodeOperations.getAncestor(this.myMoving, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    for (SNode call : ListSequence.fromList(SNodeOperations.getDescendants(this.myMoving, "jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall", false, new String[]{}))) {
      if (SLinkOperations.getTarget(call, "baseMethodDeclaration", false) != this.myMoving) {
        SNode newCall = new MoveStaticMethodRefactoring.QuotationClass_f5lqsg_a0a0a0a1a1().createNode(classNode, SLinkOperations.getTarget(call, "baseMethodDeclaration", false));
        ListSequence.fromList(SLinkOperations.getTargets(newCall, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(call, "actualArgument", true)));
        ListSequence.fromList(SLinkOperations.getTargets(newCall, "typeArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(call, "typeArgument", true)));
        SNodeOperations.replaceWithAnother(call, newCall);
      }
    }
  }

  @Override
  protected void correctMoving() {
    this.replaceFields();
    this.replaceMethods();
  }

  @Override
  public void replaceSingleUsage(SNode usage) {
    super.replaceSingleUsage(usage);
    if (SNodeOperations.isInstanceOf(usage, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      SNode newCall;
      if (SNodeOperations.getAncestor(usage, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) == this.myDestination) {
        newCall = new MoveStaticMethodRefactoring.QuotationClass_f5lqsg_a0a0a1a1a3().createNode(this.myReplacing);
      } else {
        newCall = new MoveStaticMethodRefactoring.QuotationClass_f5lqsg_a0a0a0b0b0d().createNode(this.myDestination, this.myReplacing);
      }
      ListSequence.fromList(SLinkOperations.getTargets(newCall, "actualArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(usage, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "actualArgument", true)));
      ListSequence.fromList(SLinkOperations.getTargets(newCall, "typeArgument", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(usage, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "typeArgument", true)));
      SNodeOperations.replaceWithAnother(usage, newCall);
    }
  }

  public static class QuotationClass_f5lqsg_a0a0a0b0a {
    public QuotationClass_f5lqsg_a0a0a0b0a() {
    }

    public SNode createNode(Object parameter_3, Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_4);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_f5lqsg_a0a0a0a1a1 {
    public QuotationClass_f5lqsg_a0a0a0a1a1() {
    }

    public SNode createNode(Object parameter_3, Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("baseMethodDeclaration", (SNode) parameter_4);
        quotedNode1_2.setReferent("classConcept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_f5lqsg_a0a0a1a1a3 {
    public QuotationClass_f5lqsg_a0a0a1a1a3() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("baseMethodDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_f5lqsg_a0a0a0b0b0d {
    public QuotationClass_f5lqsg_a0a0a0b0b0d() {
    }

    public SNode createNode(Object parameter_3, Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("baseMethodDeclaration", (SNode) parameter_4);
        quotedNode1_2.setReferent("classConcept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
