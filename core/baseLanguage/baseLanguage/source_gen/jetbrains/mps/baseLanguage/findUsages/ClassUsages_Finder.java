package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ClassUsages_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ClassUsages_Finder");

  public ClassUsages_Finder() {
  }

  public String getDescription() {
    return "Class Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    for (SNode result : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", node, scope, indicator))) {
      ListSequence.fromList(_results).addElement(result);
    }
    for (SNode constructor : ListSequence.fromList(SLinkOperations.getTargets(node, "constructor", true))) {
      for (SNode result : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.ConstructorUsages_Finder", constructor, scope, indicator))) {
        ListSequence.fromList(_results).addElement(result);
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListSequence.fromList(_results).addElement(node);
    for (SNode constructor : ListSequence.fromList(SLinkOperations.getTargets(node, "constructor", true))) {
      ListSequence.fromList(_results).addElement(constructor);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Class Usages";
  }
}
