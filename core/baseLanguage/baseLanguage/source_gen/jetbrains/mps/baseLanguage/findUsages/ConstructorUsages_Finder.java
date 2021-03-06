package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.typesystem.inference.TypeChecker;

public class ConstructorUsages_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ConstructorUsages_Finder");

  public ConstructorUsages_Finder() {
  }

  public String getDescription() {
    return "Constructor Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration";
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    // search for straight usages & search for SUPER calls 
    // BUG IN BASE LANGUAGE -- AT THE TIME THIS THING DOES NOT FIND SUPER() CALLS 
    for (SNode nodeUsage : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", node, scope, indicator))) {
      ListSequence.fromList(_results).addElement(nodeUsage);
    }
    // WORKAROUND - FIND SUPER() CALLS 
    for (SNode subclassResult : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.StraightDerivedClasses_Finder", SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), scope, indicator))) {
      for (SNode constructorNode : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(subclassResult, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "constructor", true))) {
        for (SNode invocation : ListSequence.fromList(SNodeOperations.getDescendants(constructorNode, null, false, new String[]{})).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation");
          }
        })) {
          boolean thisConstructor = true;
          SNode invocationNode = SNodeOperations.cast(invocation, "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation");
          if (ListSequence.fromList(SLinkOperations.getTargets(invocationNode, "actualArgument", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).count()) {
            for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(invocationNode, "actualArgument", true)).count(); i++) {
              SNode actualArgument = ListSequence.fromList(SLinkOperations.getTargets(invocationNode, "actualArgument", true)).getElement(i);
              SNode formalArgument = ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).getElement(i);
              if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(actualArgument), SLinkOperations.getTarget(formalArgument, "type", true)))) {
                thisConstructor = false;
              }
            }
            if (thisConstructor) {
              ListSequence.fromList(_results).addElement(invocationNode);
            }
          }
        }
      }
    }
    // search for enum constants creation 
    SNode enumNode = SNodeOperations.cast(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.EnumClass", false, false), "jetbrains.mps.baseLanguage.structure.EnumClass");
    if (enumNode != null) {
      for (SNode enumConstant : ListSequence.fromList(SLinkOperations.getTargets(enumNode, "enumConstant", true))) {
        boolean thisConstructor = true;
        if (ListSequence.fromList(SLinkOperations.getTargets(enumConstant, "actualArgument", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).count()) {
          for (int i = 0; i < ListSequence.fromList(SLinkOperations.getTargets(enumConstant, "actualArgument", true)).count(); i++) {
            SNode actualArgument = ListSequence.fromList(SLinkOperations.getTargets(enumConstant, "actualArgument", true)).getElement(i);
            SNode formalArgument = ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).getElement(i);
            if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(actualArgument), SLinkOperations.getTarget(formalArgument, "type", true)))) {
              thisConstructor = false;
            }
          }
          if (thisConstructor) {
            ListSequence.fromList(_results).addElement(enumConstant);
          }
        }
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Constructor Usages";
  }
}
