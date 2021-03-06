package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.progress.EmptyProgressIndicator;

public class BaseMethodUsages_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.BaseMethodUsages_Finder");

  public BaseMethodUsages_Finder() {
  }

  public String getDescription() {
    return "Base Method Usages";
  }

  public String getLongDescription() {
    return "Usages of all base methods";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null && SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Interface", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> baseMethods = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.BaseMethod_Finder", node, GlobalScope.getInstance(), indicator);
    for (SNode method : ListSequence.fromList(baseMethods)) {
      for (SNode usage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.AllMethodUsages_Finder", method, scope, indicator))) {
        ListSequence.fromList(_results).addElement(usage);
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    List<SNode> baseMethods = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.BaseMethod_Finder", node, GlobalScope.getInstance(), new EmptyProgressIndicator());
    ListSequence.fromList(baseMethods).addElement(node);
    for (SNode method : ListSequence.fromList(baseMethods)) {
      ListSequence.fromList(_results).addElement(method);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Base method usages";
  }
}
