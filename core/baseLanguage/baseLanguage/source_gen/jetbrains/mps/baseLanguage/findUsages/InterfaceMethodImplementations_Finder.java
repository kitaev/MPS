package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;

public class InterfaceMethodImplementations_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder");

  public InterfaceMethodImplementations_Finder() {
  }

  public String getDescription() {
    return "Interface Method Implementations";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration";
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.Interface") && SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.Interface", "method");
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> implementorsAndAncestorsList = new ArrayList<SNode>();
    for (SNode implementor : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder", SNodeOperations.getParent(node), scope, indicator))) {
      ListSequence.fromList(implementorsAndAncestorsList).addElement(implementor);
    }
    for (SNode classNode : ListSequence.fromList(implementorsAndAncestorsList).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.ClassConcept");
      }
    })) {
      for (SNode sMethod : ListSequence.fromList(SLinkOperations.getTargets(classNode, "method", true))) {
        if (BaseMethodDeclaration_Behavior.call_hasSameSignature_1213877350435(sMethod, node)) {
          ListSequence.fromList(_results).addElement(sMethod);
        }
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Method Implementation";
  }
}
