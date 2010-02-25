package jetbrains.mps.baseLanguage.dates.typesystem;

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
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_UnaryDateTimeOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_UnaryDateTimeOperation_InferenceRule() {
  }

  public void applyRule(final SNode unaryDateTimeOperation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(unaryDateTimeOperation, "datetime", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, "datetime was expected", "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "1186142458707", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.typesystem)", "1186142450296", true), (SNode) new typeof_UnaryDateTimeOperation_InferenceRule.QuotationClass_0641_l523emneeweh().createNode(typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.dates.structure.UnaryDateTimeOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_0641_l523emneeweh {
    public QuotationClass_0641_l523emneeweh() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0641_l523emneerwi = null;
      SNode quotedNode_0641_l523emneerwj = null;
      SNode quotedNode_0641_l523emneerwk = null;
      SNode quotedNode_0641_l523emneerwl = null;
      SNode quotedNode_0641_l523emneerwm = null;
      {
        quotedNode_0641_l523emneerwi = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0641_l523emneerwi = quotedNode_0641_l523emneerwi;
        {
          quotedNode_0641_l523emneerwj = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwj = quotedNode_0641_l523emneerwj;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwj);
        }
        {
          quotedNode_0641_l523emneerwk = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwk = quotedNode_0641_l523emneerwk;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwk);
        }
        {
          quotedNode_0641_l523emneerwl = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwl = quotedNode_0641_l523emneerwl;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwl);
        }
        {
          quotedNode_0641_l523emneerwm = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DurationType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwm = quotedNode_0641_l523emneerwm;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwm);
        }
        result = quotedNode1_0641_l523emneerwi;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0641_l523emneerwi = null;
      SNode quotedNode_0641_l523emneerwj = null;
      SNode quotedNode_0641_l523emneerwk = null;
      SNode quotedNode_0641_l523emneerwl = null;
      SNode quotedNode_0641_l523emneerwm = null;
      {
        quotedNode_0641_l523emneerwi = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0641_l523emneerwi = quotedNode_0641_l523emneerwi;
        {
          quotedNode_0641_l523emneerwj = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwj = quotedNode_0641_l523emneerwj;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwj);
        }
        {
          quotedNode_0641_l523emneerwk = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwk = quotedNode_0641_l523emneerwk;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwk);
        }
        {
          quotedNode_0641_l523emneerwl = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwl = quotedNode_0641_l523emneerwl;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwl);
        }
        {
          quotedNode_0641_l523emneerwm = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DurationType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_0641_l523emneerwm = quotedNode_0641_l523emneerwm;
          quotedNode_0641_l523emneerwi.addChild("argument", quotedNode1_0641_l523emneerwm);
        }
        result = quotedNode1_0641_l523emneerwi;
      }
      return result;
    }
  }
}
