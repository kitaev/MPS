package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_SelectOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_SelectOperation_InferenceRule() {
  }

  public void applyRule(final SNode so, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode sequenceParamType_typevar_1225884177658 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(so);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1611944601324093272", 0, null);
      typeCheckingContext.createGreaterThanInequality((SNode) new typeof_SelectOperation_InferenceRule.QuotationClass_jxb36x_a0a1a0().createNode(typeCheckingContext.getRepresentative(sequenceParamType_typevar_1225884177658), typeCheckingContext), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1225885277159", true), false, true, _info_12389875345);
    }
    final SNode resType_typevar_1203177754378 = typeCheckingContext.createNewRuntimeTypesVariable();
    final SNode selectorParamType_typevar_1240677567421 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(so, "closure", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240677325769", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1240677325771", true), (SNode) new typeof_SelectOperation_InferenceRule.QuotationClass_jxb36x_a0a4a0().createNode(typeCheckingContext.getRepresentative(selectorParamType_typevar_1240677567421), typeCheckingContext.getRepresentative(resType_typevar_1203177754378), typeCheckingContext), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = so;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "6523931710140214764", 0, null);
      typeCheckingContext.createGreaterThanInequality((SNode) typeCheckingContext.getRepresentative(selectorParamType_typevar_1240677567421), (SNode) typeCheckingContext.getRepresentative(sequenceParamType_typevar_1225884177658), false, true, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = so;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1203177774935", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1203177771381", true), (SNode) new typeof_SelectOperation_InferenceRule.QuotationClass_jxb36x_a0a6a0().createNode(typeCheckingContext.getRepresentative(resType_typevar_1203177754378), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SelectOperation";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_jxb36x_a0a1a0 {
    public QuotationClass_jxb36x_a0a1a0() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_jxb36x_a0a4a0 {
    public QuotationClass_jxb36x_a0a4a0() {
    }

    public SNode createNode(Object parameter_7, Object parameter_8, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_2, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_5, typeCheckingContext));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = HUtil.copyIfNecessary(quotedNode_3, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_6, typeCheckingContext));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }

    public SNode createNode(Object parameter_7, Object parameter_8) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.FunctionType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_7;
          SNode quotedNode1_5;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_5 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_5 = quotedNode_2;
          }
          if (quotedNode1_5 != null) {
            quotedNode_1.addChild("parameterType", HUtil.copyIfNecessary(quotedNode1_5));
          }
        }
        {
          quotedNode_3 = (SNode) parameter_8;
          SNode quotedNode1_6;
          if (_parameterValues_129834374.contains(quotedNode_3)) {
            quotedNode1_6 = HUtil.copyIfNecessary(quotedNode_3);
          } else {
            _parameterValues_129834374.add(quotedNode_3);
            quotedNode1_6 = quotedNode_3;
          }
          if (quotedNode1_6 != null) {
            quotedNode_1.addChild("resultType", HUtil.copyIfNecessary(quotedNode1_6));
          }
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_jxb36x_a0a6a0 {
    public QuotationClass_jxb36x_a0a6a0() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2, typeCheckingContext);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
