package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import jetbrains.mps.typesystem.inference.ITypeContextOwner;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeContextManager;
import java.util.Set;
import jetbrains.mps.util.Pair;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.errors.QuickFixProvider;

public class TypesystemChecker extends SpecificChecker implements ITypeContextOwner {
  public TypesystemChecker() {
  }

  public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressContext progressContext, IOperationContext operationContext) {
    List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());

    for (SNode rootNode : ListSequence.fromList(SModelOperations.getRoots(model, null))) {
      if (!(progressContext.checkAndUpdateIndicator("Checking " + SModelOperations.getModelName(model) + " for typesystem rules..."))) {
        break;
      }
      TypeCheckingContext typeCheckingContext = TypeContextManager.getInstance().getOrCreateContext(rootNode, this, true);
      typeCheckingContext.setOperationContext(operationContext);
      Set<Pair<SNode, List<IErrorReporter>>> nodeWithErrors = typeCheckingContext.checkRootAndGetErrors(true);
      for (Pair<SNode, List<IErrorReporter>> nodeErrorReporters : SetSequence.fromSet(nodeWithErrors)) {
        final SNode node = nodeErrorReporters.o1;
        for (IErrorReporter errorReporter : ListSequence.fromList(nodeErrorReporters.o2)) {
          final IErrorReporter reporter = errorReporter;
          final QuickFix_Runtime quickFix = check_5gkhbq_a0b0b0e0c0a(check_5gkhbq_a0a1a1a4a2a0(reporter));
          IModelCheckerFix fix = null;
          if (quickFix != null) {
            fix = new IModelCheckerFix() {
              public boolean doFix() {
                quickFix.execute(node);
                return true;
              }
            };
          }
          addIssue(results, node, errorReporter.reportError(), SpecificChecker.getResultCategory(errorReporter.getMessageStatus()), "type system", fix);
        }
      }
      TypeContextManager.getInstance().removeContextForNode(rootNode);
      typeCheckingContext.dispose();
    }
    return results;
  }

  private static QuickFix_Runtime check_5gkhbq_a0b0b0e0c0a(QuickFixProvider checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getQuickFix();
    }
    return null;
  }

  private static QuickFixProvider check_5gkhbq_a0a1a1a4a2a0(IErrorReporter checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getIntentionProvider();
    }
    return null;
  }
}
