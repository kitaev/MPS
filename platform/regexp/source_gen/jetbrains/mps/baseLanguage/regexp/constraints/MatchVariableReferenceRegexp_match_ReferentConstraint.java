package jetbrains.mps.baseLanguage.regexp.constraints;

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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MatchVariableReferenceRegexp_match_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public MatchVariableReferenceRegexp_match_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp", "match", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp", "match");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> matches = new ArrayList<SNode>();
    SNode top = _context.getEnclosingNode();
    while (SNodeOperations.getParent(top) != null && SNodeOperations.isInstanceOf(SNodeOperations.getParent(top), "jetbrains.mps.baseLanguage.regexp.structure.Regexp")) {
      top = SNodeOperations.getParent(top);
    }
    ListSequence.fromList(matches).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(top, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp", true, new String[]{})));
    if (SNodeOperations.isInstanceOf(top, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp")) {
      ListSequence.fromList(matches).addElement(SNodeOperations.cast(top, "jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp"));
    }
    return matches;
  }

  public boolean hasPresentation() {
    return true;
  }

  public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
    return (_context.getSmartReference() ?
      "\\" + SPropertyOperations.getString(_context.getParameterNode(), "name") :
      SPropertyOperations.getString(_context.getParameterNode(), "name")
    );
  }
}
