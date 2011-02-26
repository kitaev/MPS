package jetbrains.mps.lang.smodel.scripts;

/*Generated by MPS */

import jetbrains.mps.lang.script.runtime.BaseMigrationScript;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class SModelLanguageMigration_MigrationScript extends BaseMigrationScript {
  public SModelLanguageMigration_MigrationScript(IOperationContext operationContext) {
    super("SModel language migration");
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Java-style typecasts for nodes";
      }

      public String getAdditionalInfo() {
        return "Java-style typecasts for nodes";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.CastExpression";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.lang.smodel.structure.SNodeType"))) {
          return false;
        }
        if (ListSequence.fromList(AttributeOperations.getAttributeList(SLinkOperations.getTarget(node, "type", true), new IAttributeDescriptor.AllAttributes())).isNotEmpty()) {
          return false;
        }
        SNode nodeConcept = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false);
        if (nodeConcept == null) {
          return false;
        }
        if (ListSequence.fromList(AttributeOperations.getAttributeList(nodeConcept, new IAttributeDescriptor.AllAttributes())).isNotEmpty()) {
          return false;
        }
        SNode realType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "expression", true));
        if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
          return true;
        }
        if ((SNodeOperations.isInstanceOf(realType, "jetbrains.mps.baseLanguage.structure.ClassifierType") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(realType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept") && Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(realType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new SModelLanguageMigration_MigrationScript.QuotationClass_r3f4il_a0a0a0a0h0d0a0a0b0a().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept")))) {
          return true;
        }
        return false;
      }

      public void doUpdateInstanceNode(SNode node) {
        SNode newExpr = SModelOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression", null);
        SLinkOperations.setTarget(newExpr, "leftExpression", SLinkOperations.getTarget(node, "expression", true), true);
        SLinkOperations.setTarget(newExpr, "concept", SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false), false);
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
          SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), newExpr);
        } else {
          SNodeOperations.replaceWithAnother(node, newExpr);
        }
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "eliminate list<node<>> and some<node<>>";
      }

      public String getAdditionalInfo() {
        return "eliminate list<node<>> and some<node<>>";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.lang.smodel.structure.SNodeType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.collections.structure.ListType") || SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.GenericDeclaration");
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Eliminate SNode type";
      }

      public String getAdditionalInfo() {
        return "Eliminate SNode type";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
          return false;
        }
        if (ListSequence.fromList(AttributeOperations.getAttributeList(SLinkOperations.getTarget(node, "type", true), new IAttributeDescriptor.AllAttributes())).isNotEmpty()) {
          return false;
        }
        SNode classifier = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false);
        if (!(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        if (!(Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new SModelLanguageMigration_MigrationScript.QuotationClass_r3f4il_a0a0a0a4a3a0a0a3a0().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept")))) {
          return false;
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setNewChild(node, "type", "jetbrains.mps.lang.smodel.structure.SNodeType");
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Eliminate SModel type";
      }

      public String getAdditionalInfo() {
        return "Eliminate SModel type";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
          return false;
        }
        if (ListSequence.fromList(AttributeOperations.getAttributeList(SLinkOperations.getTarget(node, "type", true), new IAttributeDescriptor.AllAttributes())).isNotEmpty()) {
          return false;
        }
        SNode classifier = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(node, "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false);
        if (!(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        if (!(Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new SModelLanguageMigration_MigrationScript.QuotationClass_r3f4il_a0a0a0a4a3a0a0a4a0().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept")))) {
          return false;
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
        SLinkOperations.setNewChild(node, "type", "jetbrains.mps.lang.smodel.structure.SModelType");
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Search for SNode type";
      }

      public String getAdditionalInfo() {
        return "Search for SNode type";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        if (!(Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new SModelLanguageMigration_MigrationScript.QuotationClass_r3f4il_a0a0a0a1a3a0a0a5a0().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept")))) {
          return false;
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
    this.addRefactoring(new AbstractMigrationRefactoring(operationContext) {
      public String getName() {
        return "Search for SModel type";
      }

      public String getAdditionalInfo() {
        return "Search for SModel type";
      }

      public String getFqNameOfConceptToSearchInstances() {
        return "jetbrains.mps.baseLanguage.structure.ClassifierType";
      }

      public boolean isApplicableInstanceNode(SNode node) {
        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
          return false;
        }
        if (!(Classifier_Behavior.call_isDescendant_7165541881557222913(SNodeOperations.cast(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), SNodeOperations.cast(SLinkOperations.getTarget(new SModelLanguageMigration_MigrationScript.QuotationClass_r3f4il_a0a0a0a1a3a0a0a6a0().createNode(), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept")))) {
          return false;
        }
        return true;
      }

      public void doUpdateInstanceNode(SNode node) {
      }

      public boolean isShowAsIntention() {
        return false;
      }
    });
  }

  public static class QuotationClass_r3f4il_a0a0a0a0h0d0a0a0b0a {
    public QuotationClass_r3f4il_a0a0a0a0h0d0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SNode")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r3f4il_a0a0a0a4a3a0a0a3a0 {
    public QuotationClass_r3f4il_a0a0a0a4a3a0a0a3a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SNode")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r3f4il_a0a0a0a4a3a0a0a4a0 {
    public QuotationClass_r3f4il_a0a0a0a4a3a0a0a4a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SModel")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r3f4il_a0a0a0a1a3a0a0a5a0 {
    public QuotationClass_r3f4il_a0a0a0a1a3a0a0a5a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SNode")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_r3f4il_a0a0a0a1a3a0a0a6a0 {
    public QuotationClass_r3f4il_a0a0a0a1a3a0a0a6a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SModel")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
