package jetbrains.mps.nanoj.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1239288077577(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.<INodeSubstituteAction>fromArray();
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.DivExpression");
      Iterable<SNode> concepts = ListSequence.<SNode>fromArray(concept);
      concepts = Sequence.fromIterable(concepts).concat(ListSequence.fromList(SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope())));
      for(final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "leftExpr", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_Expression_1239288077595(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.<INodeSubstituteAction>fromArray();
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.nanoj.structure.DivExpression");
      Iterable<SNode> concepts = ListSequence.<SNode>fromArray(concept);
      concepts = Sequence.fromIterable(concepts).concat(ListSequence.fromList(SConceptOperations.getAllSubConcepts(concept, _context.getModel(), operationContext.getScope())));
      for(final SNode subconcept : concepts) {
        if (!(SNodeOperations.isInstanceOf(subconcept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration"))) {
          continue;
        }
        if (SConceptPropertyOperations.getBoolean(subconcept, "abstract")) {
          continue;
        }
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(subconcept, _context.getSourceNode()) {

          public SNode doSubstitute(String pattern) {
            SNode result = SConceptOperations.createNewNode(NameUtil.nodeFQName(subconcept), null);
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), result);
            SLinkOperations.setTarget(result, "rightExpr", _context.getSourceNode(), true);
            return result;
          }
        });
      }
    }
    return result;
  }

}
