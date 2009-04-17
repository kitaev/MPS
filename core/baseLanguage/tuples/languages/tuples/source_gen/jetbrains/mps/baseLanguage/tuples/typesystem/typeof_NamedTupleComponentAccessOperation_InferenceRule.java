package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.baseLanguage.tuples.typesystem._Quotations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.LinkedList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NamedTupleComponentAccessOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_NamedTupleComponentAccessOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    List<SNode> PTYPES = ListOperations.<SNode>createList();
    SNode tupleDecl = SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(operation, "component", false)), "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
    for(SNode tvr : ListSequence.fromList(SLinkOperations.getTargets(tupleDecl, "typeVariableDeclaration", true))) {
      final SNode PTYPE_typevar_1239974367138 = typeCheckingContext.createNewRuntimeTypesVariable();
      ListSequence.fromList(PTYPES).addElement(typeCheckingContext.getEquationManager().getRepresentator(PTYPE_typevar_1239974367138));
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(IOperation_Behavior.call_getOperand_1213877410070(operation), "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239642894205", true), new _Quotations.QuotationClass_3().createNode(tupleDecl, PTYPES, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239642907285", false, 0, intentionProvider);
    }
    SNode tmp = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ArrayType", null);
    SLinkOperations.setTarget(tmp, "componentType", SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(operation, "component", false), "type", true)), true);
    List<SNode> queue = ListSequence.fromList(new LinkedList<SNode>()).addSequence(Sequence.fromArray(SLinkOperations.getTarget(tmp, "componentType", true)));
    while (ListSequence.fromList(queue).isNotEmpty()) {
      SNode t = ListSequence.fromList(queue).removeElementAt(0);
      if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
        int idx = SNodeOperations.getIndexInParent(SLinkOperations.getTarget(SNodeOperations.cast(t, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false));
        if (idx < ListSequence.fromList(PTYPES).count()) {
          SNodeOperations.replaceWithAnother(t, ListSequence.fromList(PTYPES).getElement(idx));
        }
      } else
      {
        for(SNode c : ListSequence.fromList(SNodeOperations.getChildren(t))) {
          ListSequence.fromList(queue).addElement(c);
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(operation, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579816726", true), SLinkOperations.getTarget(tmp, "componentType", true), _nodeToCheck_1029348928467, null, "r:e119dbbd-3529-4067-8bad-6b9edd79d0b6(jetbrains.mps.baseLanguage.tuples.typesystem)", "1239579829277", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
