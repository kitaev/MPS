package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

import java.util.List;
import java.util.ArrayList;

import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;

public class DerivedInterfaces_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Derived Interfaces";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  public boolean isApplicable(SNode node) {
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results) {
    List<SNode> derived = new ArrayList<SNode>();
    ListOperations.addElement(derived, node);
    // null
    int passed = 0;
    while (SequenceOperations.getSize(derived) != passed) {
      SNode passingNode = ListOperations.getElement(derived, passed);
      for (SNode nodeUsage : this.executeFinder("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder", passingNode, scope)) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(nodeUsage, null, false, false), "jetbrains.mps.baseLanguage.structure.Interface")) {
          if (SNodeOperations.hasRole(nodeUsage, "jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface")) {
            ListOperations.addElement(derived, SNodeOperations.getParent(nodeUsage, null, false, false));
          }
        }
      }
      if (passingNode != node) {
        ListOperations.addElement(_results, passingNode);
      }
      passed = passed + 1;
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Derived Interfaces";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}
