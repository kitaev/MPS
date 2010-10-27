package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicable2Status;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.smodel.SModelUtil_new;

public class namedTuple_assignableTo_namedTuple_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public namedTuple_assignableTo_namedTuple_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext, IsApplicable2Status status) {
    if (!(SLinkOperations.getTarget(subtype, "classifier", false) == SLinkOperations.getTarget(supertype, "classifier", false))) {
      BaseQuickFixProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "Different named tuples", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579585554", intentionProvider, errorTarget);
      _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
    }
    if (!(ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameter", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).count())) {
      BaseQuickFixProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "Parameter types counts don't match", "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239968591797", intentionProvider, errorTarget);
      _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
    }
    {
      SNode lp;
      SNode rp;
      Iterator<SNode> lp_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameter", true)).iterator();
      Iterator<SNode> rp_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
      while (true) {
        if (!(lp_iterator.hasNext())) {
          break;
        }
        if (!(rp_iterator.hasNext())) {
          break;
        }
        lp = lp_iterator.next();
        rp = rp_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
          BaseQuickFixProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239968769054", 0, intentionProvider);
          _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) lp, (SNode) rp, false, _info_12389875345);
        }
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, IsApplicable2Status status) {
    boolean result_14532009 = true;
    if (!(SLinkOperations.getTarget(subtype, "classifier", false) == SLinkOperations.getTarget(supertype, "classifier", false))) {
      result_14532009 = false;
    }
    if (!(ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameter", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).count())) {
      result_14532009 = false;
    }
    {
      SNode lp;
      SNode rp;
      Iterator<SNode> lp_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameter", true)).iterator();
      Iterator<SNode> rp_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameter", true)).iterator();
      while (true) {
        if (!(lp_iterator.hasNext())) {
          break;
        }
        if (!(rp_iterator.hasNext())) {
          break;
        }
        lp = lp_iterator.next();
        rp = rp_iterator.next();
        result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) lp, (SNode) rp, true);
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
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }
}
