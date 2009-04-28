package jetbrains.mps.lang.structure.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public class ExactConceptInstances_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.lang.structure.findUsages.ExactConceptInstances_Finder");

  public String getDescription() {
    return "Exact Concept Instances";
  }

  public String getLongDescription() {
    return "only instances of the specified concept, not including instances of it's subconcepts";
  }

  public String getConcept() {
    return "jetbrains.mps.lang.structure.structure.ConceptDeclaration";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> resNodes = ListSequence.fromListWithValues(new ArrayList<SNode>(), FindUsagesManager.getInstance().findExactInstances(((ConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))), scope, new FindUsagesManager.ProgressAdapter(indicator), false));
    for(SNode resNode : resNodes) {
      ListOperations.addElement(_results, resNode);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Concept Instances";
  }

}
