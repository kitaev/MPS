package jetbrains.mps.baseLanguage.extensionMethods.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.search.VisibilityUtil;

public class ExtensionMethodCall_extension_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ExtensionMethodCall_extension_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.extensionMethods.structure.ExtensionMethodCall", "baseMethodDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.extensionMethods.structure.ExtensionMethodCall", "baseMethodDeclaration");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SNode operandType = SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
    for (SNode extension : ListSequence.fromList(SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.baseLanguage.extensionMethods.structure.TypeExtension"))) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(operandType), SLinkOperations.getTarget(extension, "type", true))) {
        for (SNode method : ListSequence.fromList(SLinkOperations.getTargets(extension, "methods", true))) {
          if (VisibilityUtil.isVisible(_context.getEnclosingNode(), method)) {
            ListSequence.fromList(result).addElement(method);
          }
        }
      }
    }
    for (SNode container : ListSequence.fromList(SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.baseLanguage.extensionMethods.structure.SimpleExtensionMethodsContainer"))) {
      for (SNode method : ListSequence.fromList(SLinkOperations.getTargets(container, "methods", true))) {
        if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(operandType), SLinkOperations.getTarget(method, "extendedType", true))) {
          if (VisibilityUtil.isVisible(_context.getEnclosingNode(), method)) {
            ListSequence.fromList(result).addElement(method);
          }
        }
      }
    }
    return result;
  }
}
