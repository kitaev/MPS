package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import java.util.List;
import java.util.ArrayList;

public class subtypesOfClassifierTypeWWildcards_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public subtypesOfClassifierTypeWWildcards_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status, final boolean inequalityIsWeak, final boolean inequalityIsLessThan) {
    {
      final SNode t = subtype;
      typeCheckingContext.whenConcrete(t, new Runnable() {
        public void run() {
          {
            GeneratedMatchingPattern pattern_n8ubly_a0a0 = new subtypesOfClassifierTypeWWildcards_InequationReplacementRule.Pattern_1s2zdh_a0a0a0a0a0(SLinkOperations.getTarget(supertype, "classifier", false));
            SNode coercedNode_n8ubly_a0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getRepresentative(t), pattern_n8ubly_a0a0, inequalityIsWeak);
            if (coercedNode_n8ubly_a0a0 != null) {
              {
                SNode typeParam;
                SNode myParam;
                Iterator<SNode> typeParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(coercedNode_n8ubly_a0a0, "parameter", true)).iterator();
                Iterator<SNode> myParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
                while (true) {
                  if (!(typeParam_iterator.hasNext())) {
                    break;
                  }
                  if (!(myParam_iterator.hasNext())) {
                    break;
                  }
                  typeParam = typeParam_iterator.next();
                  myParam = myParam_iterator.next();
                  {
                    final SNode finalTypeParam = typeParam;
                    {
                      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "6281385834685063550", 0, null);
                      _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
                      typeCheckingContext.createGreaterThanInequality((SNode) myParam, (SNode) finalTypeParam, false, true, _info_12389875345);
                    }
                    {
                      final SNode concreteParam = myParam;
                      typeCheckingContext.whenConcrete(concreteParam, new Runnable() {
                        public void run() {
                          if (!(SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(concreteParam), "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(concreteParam), "jetbrains.mps.baseLanguage.structure.UpperBoundType") || SNodeOperations.isInstanceOf(typeCheckingContext.getRepresentative(concreteParam), "jetbrains.mps.baseLanguage.structure.LowerBoundType"))) {
                            {
                              SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                              EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357903", 0, null);
                              _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
                              typeCheckingContext.createEquation((SNode) finalTypeParam, (SNode) typeCheckingContext.getRepresentative(concreteParam), _info_12389875345);
                            }
                          }
                        }
                      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357880", false, false);
                    }
                  }
                }
              }
            } else {
              SNode nodeWithError = equationInfo.getNodeWithError();
              {
                MessageTarget errorTarget = new NodeMessageTarget();
                IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeWithError, BaseConcept_Behavior.call_getDetailedPresentation_2354269628709769373(subtype) + " is not a subtype of " + BaseConcept_Behavior.call_getDetailedPresentation_2354269628709769373(supertype), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1227259028675", null, errorTarget);
                HUtil.addAdditionalRuleIdsFromInfo(_reporter_2309309498, equationInfo);
              }
            }
          }
        }
      }, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1220523357849", false, true);
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status, final boolean inequalityIsWeak, final boolean inequalityIsLessThan) {
    boolean result_14532009 = true;
    {
      final SNode t = subtype;
      {
        GeneratedMatchingPattern pattern_a0a0 = new subtypesOfClassifierTypeWWildcards_InequationReplacementRule.Pattern_1s2zdh_a0a0a0a0a1a1(SLinkOperations.getTarget(supertype, "classifier", false));
        SNode coercedNode_a0a0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(t, pattern_a0a0, inequalityIsWeak);
        if (coercedNode_a0a0 != null) {
          {
            SNode typeParam;
            SNode myParam;
            Iterator<SNode> typeParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(coercedNode_a0a0, "parameter", true)).iterator();
            Iterator<SNode> myParam_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
            while (true) {
              if (!(typeParam_iterator.hasNext())) {
                break;
              }
              if (!(myParam_iterator.hasNext())) {
                break;
              }
              typeParam = typeParam_iterator.next();
              myParam = myParam_iterator.next();
              {
                final SNode finalTypeParam = typeParam;
                result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) finalTypeParam, (SNode) myParam, true);
                {
                  final SNode concreteParam = myParam;
                  if (!(SNodeOperations.isInstanceOf(concreteParam, "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(concreteParam, "jetbrains.mps.baseLanguage.structure.UpperBoundType") || SNodeOperations.isInstanceOf(concreteParam, "jetbrains.mps.baseLanguage.structure.LowerBoundType"))) {
                    result_14532009 = result_14532009 && MatchingUtil.matchNodes((SNode) finalTypeParam, (SNode) concreteParam);
                  }
                }
              }
            }
          }
        } else {
          SNode nodeWithError = equationInfo.getNodeWithError();
          result_14532009 = false;
        }
      }
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public IsApplicableStatus isApplicableSubtypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public IsApplicableStatus isApplicableSupertypeAndPattern(SNode node) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.Type";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public static class Pattern_1s2zdh_a0a0a0a0a0 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> patternVar_l;
    /*package*/ SNode patternVar_ignored;
    /*package*/ Object AntiquotationField_n8ubly_a0a0a0a0a;

    public Pattern_1s2zdh_a0a0a0a0a0(Object parameter_n8ubly_a0a0a0a0a) {
      this.AntiquotationField_n8ubly_a0a0a0a0a = parameter_n8ubly_a0a0a0a0a;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_1220523357854;
        nodeToMatch_1220523357854 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_1220523357854.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField_n8ubly_a0a0a0a0a;
          if (nodeToMatch_1220523357854.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_1220523357854 = "parameter";
          this.patternVar_l = ListSequence.fromList(new ArrayList<SNode>());
          patternVar_ignored = null;
          for (SNode childVar : nodeToMatch_1220523357854.getChildren(childRole_1220523357854)) {
            patternVar_ignored = childVar;
            ListSequence.fromList(this.patternVar_l).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_l = (List<SNode>) pattern.getFieldValue("patternVar_l");
        patternVar_ignored = (SNode) pattern.getFieldValue("patternVar_ignored");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_l".equals(fieldName)) {
        return patternVar_l;
      }
      if ("patternVar_ignored".equals(fieldName)) {
        return patternVar_ignored;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }

  public static class Pattern_1s2zdh_a0a0a0a0a1a1 extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ List<SNode> patternVar_l;
    /*package*/ SNode patternVar_ignored;
    /*package*/ Object AntiquotationField_n8ubly_a0a0a0a0a_0;

    public Pattern_1s2zdh_a0a0a0a0a1a1(Object parameter_n8ubly_a0a0a0a0a_0) {
      this.AntiquotationField_n8ubly_a0a0a0a0a_0 = parameter_n8ubly_a0a0a0a0a_0;
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_7731054303349223391;
        nodeToMatch_7731054303349223391 = nodeToMatch;
        if (!("jetbrains.mps.baseLanguage.structure.ClassifierType".equals(nodeToMatch_7731054303349223391.getConceptFqName()))) {
          return false;
        }
        {
          SNode referent;
          referent = (SNode) this.AntiquotationField_n8ubly_a0a0a0a0a_0;
          if (nodeToMatch_7731054303349223391.getReferent("classifier") != referent) {
            return false;
          }
        }
        {
          String childRole_7731054303349223391 = "parameter";
          this.patternVar_l = ListSequence.fromList(new ArrayList<SNode>());
          patternVar_ignored = null;
          for (SNode childVar : nodeToMatch_7731054303349223391.getChildren(childRole_7731054303349223391)) {
            patternVar_ignored = childVar;
            ListSequence.fromList(this.patternVar_l).addElement(childVar);
          }
        }
      }
      return true;
    }

    public boolean hasAntiquotations() {
      return true;
    }

    public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
      if (pattern != null && pattern.getClass() == this.getClass()) {
        patternVar_l = (List<SNode>) pattern.getFieldValue("patternVar_l");
        patternVar_ignored = (SNode) pattern.getFieldValue("patternVar_ignored");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("patternVar_l".equals(fieldName)) {
        return patternVar_l;
      }
      if ("patternVar_ignored".equals(fieldName)) {
        return patternVar_ignored;
      }
      return null;
    }

    public void performActions(Object o) {
    }
  }
}
