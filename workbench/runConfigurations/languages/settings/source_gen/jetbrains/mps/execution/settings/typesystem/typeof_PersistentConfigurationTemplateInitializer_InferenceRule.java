package jetbrains.mps.execution.settings.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_PersistentConfigurationTemplateInitializer_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_PersistentConfigurationTemplateInitializer_InferenceRule() {
  }

  public void applyRule(final SNode configurationTemplateInitializer, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = configurationTemplateInitializer;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477809", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477818", true), (SNode) new typeof_PersistentConfigurationTemplateInitializer_InferenceRule.QuotationClass_xmb8fa_a0a0a0().createNode(SLinkOperations.getTarget(configurationTemplateInitializer, "template", false), typeCheckingContext), _info_12389875345);
    }
    List<SNode> parameters = SLinkOperations.getTargets(SLinkOperations.getTarget(configurationTemplateInitializer, "template", false), "templateParameter", true);
    for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(configurationTemplateInitializer, "parameter", true)).count(); i++) {
      if (i >= ListSequence.fromList(parameters).count()) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(configurationTemplateInitializer, "Incompatible number of parameters", "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477834", intentionProvider, errorTarget);
        }
        return;
      }
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTargets(configurationTemplateInitializer, "parameter", true).get(i);
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477843", 0, intentionProvider);
        typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477852", true), (SNode) typeCheckingContext.typeOf(ListSequence.fromList(parameters).getElement(i), "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "6981317760235477846", true), false, _info_12389875345);
      }
    }

  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.execution.settings.structure.PersistentConfigurationTemplateInitializer";
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

  public static class QuotationClass_xmb8fa_a0a0a0 {
    public QuotationClass_xmb8fa_a0a0a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("persistentConfiguration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.TemplatePersistentConfigurationType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("persistentConfiguration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
