package jetbrains.mps.lang.plugin.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_PersistentPropertyDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PersistentPropertyDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode persistentPropertyDeclaration, final TypeCheckingContext typeCheckingContext) {
    SNode primitive = SLinkOperations.getTarget(new typeof_PersistentPropertyDeclaration_InferenceRule.QuotationClass_sacma3_a0a0a0a().createNode(typeCheckingContext), "descriptor", false);
    {
      SNode _nodeToCheck_1029348928467 = persistentPropertyDeclaration;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590364(jetbrains.mps.lang.plugin.typesystem)", "5527296032508935722", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) SLinkOperations.getTarget(persistentPropertyDeclaration, "type", true), (SNode) new typeof_PersistentPropertyDeclaration_InferenceRule.QuotationClass_sacma3_a0a1a0().createNode(primitive, typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.plugin.structure.PersistentPropertyDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_sacma3_a0a0a0a {
    public QuotationClass_sacma3_a0a0a0a() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("descriptor", quotedNode1_2, SModelReference.fromString("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), SNodeId.fromString("1196683941620")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("descriptor", quotedNode1_2, SModelReference.fromString("r:00000000-0000-4000-0000-011c895902de(jetbrains.mps.baseLanguage.blTypes.primitiveDescriptors)"), SNodeId.fromString("1196683941620")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_sacma3_a0a1a0 {
    public QuotationClass_sacma3_a0a1a0() {
    }

    public SNode createNode(Object parameter_11, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_2;
          quotedNode1_7.addReference(SReference.create("classifier", quotedNode1_7, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Cloneable")));
          quotedNode_1.addChild("argument", quotedNode1_7);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_3;
          quotedNode1_8.addReference(SReference.create("classifier", quotedNode1_8, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Enum")));
          quotedNode_1.addChild("argument", quotedNode1_8);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_4;
          quotedNode1_9.addReference(SReference.create("classifier", quotedNode1_9, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~String")));
          quotedNode_1.addChild("argument", quotedNode1_9);
        }
        {
          quotedNode_5 = (SNode) parameter_11;
          SNode quotedNode1_10;
          if (_parameterValues_129834374.contains(quotedNode_5)) {
            quotedNode1_10 = CopyUtil.copy(quotedNode_5);
          } else {
            _parameterValues_129834374.add(quotedNode_5);
            quotedNode1_10 = quotedNode_5;
          }
          if (quotedNode1_10 != null) {
            quotedNode_1.addChild("argument", HUtil.copyIfNecessary(quotedNode1_10, typeCheckingContext));
          }
        }
        result = quotedNode1_6;
      }
      return result;
    }

    public SNode createNode(Object parameter_11) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_6 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_2;
          quotedNode1_7.addReference(SReference.create("classifier", quotedNode1_7, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Cloneable")));
          quotedNode_1.addChild("argument", quotedNode1_7);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_3;
          quotedNode1_8.addReference(SReference.create("classifier", quotedNode1_8, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Enum")));
          quotedNode_1.addChild("argument", quotedNode1_8);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_4;
          quotedNode1_9.addReference(SReference.create("classifier", quotedNode1_9, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~String")));
          quotedNode_1.addChild("argument", quotedNode1_9);
        }
        {
          quotedNode_5 = (SNode) parameter_11;
          SNode quotedNode1_10;
          if (_parameterValues_129834374.contains(quotedNode_5)) {
            quotedNode1_10 = CopyUtil.copy(quotedNode_5);
          } else {
            _parameterValues_129834374.add(quotedNode_5);
            quotedNode1_10 = quotedNode_5;
          }
          if (quotedNode1_10 != null) {
            quotedNode_1.addChild("argument", HUtil.copyIfNecessary(quotedNode1_10));
          }
        }
        result = quotedNode1_6;
      }
      return result;
    }
  }
}
