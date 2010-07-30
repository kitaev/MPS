package jetbrains.mps.baseLanguage.builders.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.builders.behavior.Builder_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNodePointer;

public class SimpleBuilderPropertyBuilder_declaration_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public SimpleBuilderPropertyBuilder_declaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder", "declaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder", "declaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SNode contextBuilder = SNodeOperations.as(Builder_Behavior.getContextBuilder_7057666463730366732(_context.getEnclosingNode()), "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilder");
    for (SNode dcl = SLinkOperations.getTarget(contextBuilder, "declaration", false); (dcl != null); dcl = SLinkOperations.getTarget(dcl, "extends", false)) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getTargets(dcl, "property", true)));
      for (SNode builders : ListSequence.fromList(SModelOperations.getRootsIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilders"))) {
        for (SNode basedecl : ListSequence.fromList(SLinkOperations.getTargets(builders, "builder", true))) {
          SNode extdecl = SNodeOperations.as(basedecl, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderExtensionDeclaration");
          if (dcl == SLinkOperations.getTarget(extdecl, "extended", false)) {
            ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getTargets(extdecl, "property", true)));
          }
        }
      }
    }
    return result;
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:971d5c35-6139-4f76-9019-ac96d9713d41(jetbrains.mps.baseLanguage.builders.constraints)", "5389689214217448672");
  }
}
