package jetbrains.mps.lang.typesystem.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_MethodCall_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_MethodCall_NonTypesystemRule() {
  }

  public void applyRule(final SNode baseMethodCall, final TypeCheckingContext typeCheckingContext) {
    for(SNode annotationInstance : SLinkOperations.getTargets(SLinkOperations.getTarget(baseMethodCall, "baseMethodDeclaration", false), "annotation", true)) {
      if (SLinkOperations.getTarget(annotationInstance, "annotation", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_18().createNode(typeCheckingContext), "classifier", false)) {
        if (!(RulesUtil.withinInferenceItem(baseMethodCall))) {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(baseMethodCall, "inference method should be called only within inference rules", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "1196178341653", intentionProvider, errorTarget);
        }
        return;
      } else if (SLinkOperations.getTarget(annotationInstance, "annotation", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_56().createNode(typeCheckingContext), "classifier", false)) {
        if (!(RulesUtil.withinCheckingItem(baseMethodCall))) {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(baseMethodCall, "checking method should be called only within checking methods and inference rules", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.typesystem)", "5239146621999661342", intentionProvider, errorTarget);
        }
        return;
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodCall";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
