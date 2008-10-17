package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.collections.constraints.SmartClosureParameterTypeUtil;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.typesystem.RulesFunctions_BaseLanguage;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SmartClosureParameterDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SmartClosureParameterDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode scpd, final TypeCheckingContext typeCheckingContext) {
    final SNode sampleTypeVar_typevar_1204072172194 = typeCheckingContext.createNewRuntimeTypesVariable();
    SmartClosureParameterTypeUtil.equateInputType(typeCheckingContext, scpd, typeCheckingContext.getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194));
    {
      final SNode foo = typeCheckingContext.getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194);
      typeCheckingContext.whenConcrete(foo, new Runnable() {

        public void run() {
          if (SmartClosureParameterTypeUtil.hasResolveType(scpd)) {
            final SNode resolveTypeVar_typevar_1204072273983 = typeCheckingContext.createNewRuntimeTypesVariable();
            SmartClosureParameterTypeUtil.equateResolveType(typeCheckingContext, scpd, typeCheckingContext.getEquationManager().getRepresentator(resolveTypeVar_typevar_1204072273983));
            {
              final SNode bar = typeCheckingContext.getEquationManager().getRepresentator(resolveTypeVar_typevar_1204072273983);
              typeCheckingContext.whenConcrete(bar, new Runnable() {

                public void run() {
                  SNode resType = ClassifierTypeUtil.resolveTypeUsingSupertypes(typeCheckingContext.getEquationManager().getRepresentator(foo), typeCheckingContext.getEquationManager().getRepresentator(bar));
                  {
                    IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
                    SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(resType, pattern_0, typeCheckingContext);
                    if (coercedNode_0 != null) {
                      List<SNode> params = SLinkOperations.getTargets(coercedNode_0, "parameter", true);
                      if (params.size() > 0) {
                        {
                          SNode _nodeToCheck_1029348928467 = scpd;
                          BaseIntentionProvider intentionProvider = null;
                          typeCheckingContext.createEquation(typeCheckingContext.typeOf(scpd, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072627891", true), params.get(0), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072627885", intentionProvider);
                        }
                      }
                      return;
                    }
                  }
                }

              }, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072289638");
            }
          } else if ((SNodeOperations.getAncestorWhereConceptInList(scpd, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, false, false) != null)) {
            SNode bmc = SNodeOperations.getAncestorWhereConceptInList(scpd, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, false, false);
            // attempt to resolve type using static method call with type parameters
            // code copied from typeOf_BaseMethodCall
            Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
            RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, bmc, SLinkOperations.getTarget(SLinkOperations.getTarget(bmc, "baseMethodDeclaration", false), "returnType", true), mmap);
            RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
            List<SNode> vars = new ArrayList<SNode>();
            vars.addAll(mmap.keySet());
            List<SNode> actualTypes = new ArrayList<SNode>();
            for(List<SNode> atypes : mmap.values()) {
              actualTypes.add(SNodeOperations.copyNode(atypes.get(0)));
            }
            SNode resType = ClassifierTypeUtil.resolveType(SNodeOperations.copyNode(typeCheckingContext.getEquationManager().getRepresentator(foo)), actualTypes, vars);
            {
              IMatchingPattern pattern_3 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
              SNode coercedNode_3 = TypeChecker.getInstance().getRuntimeSupport().coerce_(resType, pattern_3, typeCheckingContext);
              if (coercedNode_3 != null) {
                List<SNode> params = SLinkOperations.getTargets(coercedNode_3, "parameter", true);
                if (params.size() > 0) {
                  {
                    SNode _nodeToCheck_1029348928467 = scpd;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(typeCheckingContext.typeOf(scpd, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1210677438644", true), params.get(0), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1210677438638", intentionProvider);
                  }
                }
                return;
              }
            }
          } else
          {
            {
              IMatchingPattern pattern_1 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
              SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194), pattern_1, typeCheckingContext);
              if (coercedNode_1 != null) {
                List<SNode> params = SLinkOperations.getTargets(coercedNode_1, "parameter", true);
                if (params.size() > 0) {
                  {
                    SNode _nodeToCheck_1029348928467 = scpd;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(typeCheckingContext.typeOf(scpd, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072411309", true), params.get(0), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072415594", intentionProvider);
                  }
                }
                return;
              }
            }
            {
              IMatchingPattern pattern_2 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType");
              SNode coercedNode_2 = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194), pattern_2, typeCheckingContext);
              if (coercedNode_2 != null) {
                {
                  SNode _nodeToCheck_1029348928467 = scpd;
                  BaseIntentionProvider intentionProvider = null;
                  typeCheckingContext.createEquation(typeCheckingContext.typeOf(scpd, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072500672", true), SLinkOperations.getTarget(coercedNode_2, "elementType", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072507050", intentionProvider);
                }
                return;
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1204072188615");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
