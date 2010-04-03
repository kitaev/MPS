package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class anonymousClassExtendsItsClassifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public anonymousClassExtendsItsClassifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode classifierType, TypeCheckingContext typeCheckingContext) {
    List<SNode> result = new ArrayList<SNode>();
    do {
      SNode matchedNode_q6q799_b0 = SLinkOperations.getTarget(classifierType, "classifier", false);
      {
        boolean matches_q6q799_a1a = false;
        {
          SNode matchingNode_q6q799_a1a = SLinkOperations.getTarget(classifierType, "classifier", false);
          if (matchingNode_q6q799_a1a != null) {
            matches_q6q799_a1a = SModelUtil_new.isAssignableConcept(matchingNode_q6q799_a1a.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.AnonymousClass");
          }
        }
        if (matches_q6q799_a1a) {
          ListSequence.fromList(result).addElement(new anonymousClassExtendsItsClassifier_SubtypingRule.QuotationClass_r0kks7_a0a0a0a0c0b0b0a().createNode(SLinkOperations.getTargets(matchedNode_q6q799_b0, "typeParameter", true), SLinkOperations.getTarget(matchedNode_q6q799_b0, "classifier", false), typeCheckingContext));
          break;
        }
      }
    } while (false);
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_r0kks7_a0a0a0a0c0b0b0a {
    public QuotationClass_r0kks7_a0a0a0a0c0b0b0a() {
    }

    public SNode createNode(Object parameter_4, Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_4, Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_5);
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
