package jetbrains.mps.baseLanguage.tuples.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class indexedTupleType_supertypeOf_namedTupleType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public indexedTupleType_supertypeOf_namedTupleType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode ntt, TypeCheckingContext typeCheckingContext) {
    final List<SNode> queue = ListSequence.fromList(new LinkedList<SNode>());
    final List<SNode> pts = SLinkOperations.getTargets(ntt, "parameter", true);
    return new _Quotations.QuotationClass_2().createNode(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(ntt, "classifier", false), "component", true)).select(new ISelector <SNode, SNode>() {

      public SNode select(SNode cmp) {
        SNode tmp = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ArrayType", null);
        SLinkOperations.setTarget(tmp, "componentType", SNodeOperations.copyNode(SLinkOperations.getTarget(cmp, "type", true)), true);
        ListSequence.fromList(queue).clear();
        ListSequence.fromList(queue).addElement(SLinkOperations.getTarget(tmp, "componentType", true));
        while (ListSequence.fromList(queue).isNotEmpty()) {
          SNode t = ListSequence.fromList(queue).removeElementAt(0);
          if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
            int idx = SNodeOperations.getIndexInParent(SLinkOperations.getTarget(SNodeOperations.cast(t, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false));
            if (idx < ListSequence.fromList(pts).count()) {
              SNodeOperations.replaceWithAnother(t, SNodeOperations.copyNode(ListSequence.fromList(pts).getElement(idx)));
            }
          } else
          {
            for(SNode c : ListSequence.fromList(SNodeOperations.getChildren(t))) {
              ListSequence.fromList(queue).addElement(c);
            }
          }
        }
        return SLinkOperations.getTarget(tmp, "componentType", true);
      }
    }).toListSequence(), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

}
