package jetbrains.mps.lang.plugin.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class Rename_S_ActionParameters_MigrationScript extends BaseMigrationScript {
  public Rename_S_ActionParameters_MigrationScript(IOperationContext operationContext) {
    super("rename \"S...\" action parameters");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "rename \"SNODE\" action parameters";
      }

      public String getAdditionalInfo() {
        return "rename \"SNODE\" action parameters";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SLinkOperations.getTarget(node, "key", false) == SLinkOperations.getTarget(new Rename_S_ActionParameters_MigrationScript.QuotationClass_obtej7_a0a0a0d0a0a0b0a().createNode(), "variableDeclaration", false);
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setTarget(node, "key", SLinkOperations.getTarget(new Rename_S_ActionParameters_MigrationScript.QuotationClass_obtej7_a0a0a0a4a0a0a1a0().createNode(), "variableDeclaration", false), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "rename \"SNODES\" action parameters";
      }

      public String getAdditionalInfo() {
        return "rename \"SNODES\" action parameters";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SLinkOperations.getTarget(node, "key", false) == SLinkOperations.getTarget(new Rename_S_ActionParameters_MigrationScript.QuotationClass_obtej7_a0a0a0d0a0a0c0a().createNode(), "variableDeclaration", false);
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setTarget(node, "key", SLinkOperations.getTarget(new Rename_S_ActionParameters_MigrationScript.QuotationClass_obtej7_a0a0a0a4a0a0a2a0().createNode(), "variableDeclaration", false), false);
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  public static class QuotationClass_obtej7_a0a0a0d0a0a0b0a {
    public QuotationClass_obtej7_a0a0a0d0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.SNODE")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_obtej7_a0a0a0a4a0a0a1a0 {
    public QuotationClass_obtej7_a0a0a0a4a0a0a1a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.NODE")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_obtej7_a0a0a0d0a0a0c0a {
    public QuotationClass_obtej7_a0a0a0d0a0a0c0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.SNODES")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_obtej7_a0a0a0a4a0a0a2a0 {
    public QuotationClass_obtej7_a0a0a0a4a0a0a2a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.NODES")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
