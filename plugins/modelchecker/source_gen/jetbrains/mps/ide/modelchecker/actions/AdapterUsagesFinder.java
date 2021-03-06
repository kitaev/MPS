package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class AdapterUsagesFinder extends ModelCheckerIssueFinder {
  public AdapterUsagesFinder() {
  }

  @Override
  protected List<SpecificChecker> getSpecificCheckers() {
    return ListSequence.fromListAndArray(new ArrayList<SpecificChecker>(), new AdapterUsagesFinder.AdapterUsagesChecker());
  }

  public static class AdapterUsagesChecker extends SpecificChecker {
    public AdapterUsagesChecker() {
    }

    public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressContext progressContext, IOperationContext operationContext) {
      List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());

      String title = "Checking " + SModelOperations.getModelName(model) + " for adapter usages...";
      for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
        if (!(progressContext.checkAndUpdateIndicator(title))) {
          break;
        }
        // Check for adapter references 
        for (SReference ref : Sequence.fromIterable(SNodeOperations.getReferences(node))) {
          SModelReference targetSModelReference = ref.getTargetSModelReference();
          if (targetSModelReference != null && targetSModelReference.getStereotype().equals("java_stub")) {
            SNode target = SLinkOperations.getTargetNode(ref);
            if ((target != null) && SNodeOperations.isInstanceOf(target, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
              String qualifiedName = ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(SNodeOperations.cast(target, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "jetbrains.mps.lang.core.structure.INamedConcept"), "virtual_getFqName_1213877404258", new Class[]{SNode.class}));
              if ("jetbrains.mps.smodel.INodeAdapter".equals(qualifiedName) || "jetbrains.mps.smodel.BaseAdapter".equals(qualifiedName)) {
                addIssue(results, node, "Reference to " + qualifiedName + " in role `" + SLinkOperations.getRole(ref) + "'", ModelChecker.SEVERITY_ERROR, "adapter class usage", null);
              }

              if (targetSModelReference.getLongName().endsWith(".structure") && SModelUtil.findConceptDeclaration(qualifiedName, GlobalScope.getInstance()) != null) {
                addIssue(results, node, "Using adapter of " + qualifiedName + " concept in role `" + SLinkOperations.getRole(ref) + "'", ModelChecker.SEVERITY_ERROR, "adapter class usage", null);
              }
            }
          }
        }
      }

      return results;
    }
  }
}
