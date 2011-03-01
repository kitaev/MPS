package jetbrains.mps.baseLanguage.constructors.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_CustomConstructorUsage_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_CustomConstructorUsage_InferenceRule() {
  }

  public void applyRule(final SNode customConstructorUsage, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = customConstructorUsage;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:c19fbfce-5c58-4528-8b93-60edfa062cac(jetbrains.mps.baseLanguage.constructors.typesystem)", "3041831561922455922", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:c19fbfce-5c58-4528-8b93-60edfa062cac(jetbrains.mps.baseLanguage.constructors.typesystem)", "3041831561922455932", true), (SNode) SLinkOperations.getTarget(SLinkOperations.getTarget(customConstructorUsage, "customConstructor", false), "returnType", true), _info_12389875345);
    }
    SNode args = SLinkOperations.getTarget(SLinkOperations.getTarget(customConstructorUsage, "customConstructor", false), "arguments", true);
    if (SNodeOperations.isInstanceOf(args, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause")) {
      int min = Math.min(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(args, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause"), "parameter", true)).count(), ListSequence.fromList(SLinkOperations.getTargets(customConstructorUsage, "element", true)).count());
      for (int i = 0; i < min; i++) {
        SNode actualParam = ListSequence.fromList(SLinkOperations.getTargets(customConstructorUsage, "element", true)).getElement(i);
        {
          SNode _nodeToCheck_1029348928467 = actualParam;
          BaseQuickFixProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:c19fbfce-5c58-4528-8b93-60edfa062cac(jetbrains.mps.baseLanguage.constructors.typesystem)", "2299894485109903431", 0, intentionProvider);
          _info_12389875345.setInequationGroup("");
          typeCheckingContext.createGreaterThanInequation((SNode) typeCheckingContext.typeOf(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(args, "jetbrains.mps.baseLanguage.constructors.structure.CustomArgumentClause"), "parameter", true)).getElement(i), "r:c19fbfce-5c58-4528-8b93-60edfa062cac(jetbrains.mps.baseLanguage.constructors.typesystem)", "2299894485109903433", true), (SNode) typeCheckingContext.typeOf(actualParam, "r:c19fbfce-5c58-4528-8b93-60edfa062cac(jetbrains.mps.baseLanguage.constructors.typesystem)", "2299894485109903442", true), false, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.constructors.structure.CustomConstructorUsage";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }
}
