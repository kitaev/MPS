package jetbrains.mps.lang.structure.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public class LinkInstances_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.lang.structure.findUsages.LinkInstances_Finder");

  public String getDescription() {
    return "Link Instances";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.lang.structure.structure.LinkDeclaration";
  }

  public boolean isApplicable(SNode node) {
    return !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration"));
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    // collect roles
    Set<String> roles = new HashSet<String>();
    SNode curNode = node;
    do {
      roles.add(SPropertyOperations.getString(curNode, "role"));
      curNode = SLinkOperations.getTarget(curNode, "specializedLink", false);
    } while(curNode != null);
    // find concept
    SNode conceptDeclaration = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
    if ((conceptDeclaration == null)) {
      return;
    }
    boolean isChild = SPropertyOperations.hasValue(node, "metaClass", "aggregation", "reference");
    // find instances and link examples
    for(SNode instance : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder", conceptDeclaration, scope, indicator))) {
      for(String role : SetSequence.fromSet(roles)) {
        if (isChild) {
          for(SNode child : ListSequence.fromList(instance.getChildren(role))) {
            ListOperations.addElement(_results, child);
          }
        } else
        {
          SNode referent = instance.getReference(role).getSourceNode();
          if (referent != null) {
            ListOperations.addElement(_results, referent);
          }
        }
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Link Instances";
  }

}
