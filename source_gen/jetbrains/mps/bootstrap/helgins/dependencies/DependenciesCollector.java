package jetbrains.mps.bootstrap.helgins.dependencies;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.util.Pair;
import jetbrains.mps.helgins.inference.util.INodeGetter;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class DependenciesCollector {

  public void collectDependencies(SNode inferenceRule, Map<SNode, Pair<SNode, INodeGetter>> dependencies, Set<SNode> leafs) {
    Set<SNode> roots = new HashSet<SNode>();
    for(SNode applicableNodeReference : SNodeOperations.getDescendants(inferenceRule, "jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeReference", false)) {
      if(SLinkOperations.getTarget(applicableNodeReference, "applicableNode", false) == SLinkOperations.getTarget(inferenceRule, "applicableNode", true)) {
        roots.add(applicableNodeReference);
      }
    }
    int prevSize = 0;
    for(SNode root : roots) {
      dependencies.put(root, null);
    }
    while(dependencies.size() > prevSize) {
      prevSize = dependencies.size();
      for(SNode node : dependencies.keySet()) {
        SNode parent = SNodeOperations.getParent(node, null, false, false);
        do {
          SNode matchedNode_1194538774943 = parent;
          {
            boolean matches_1194538774945 = false;
            matches_1194538774945 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression");
            if(matches_1194538774945) {
              leafs.add(matchedNode_1194538774943);
              break;
            }
          }
          {
            boolean matches_1194538897614 = false;
            matches_1194538897614 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
            if(matches_1194538897614) {
              if(SLinkOperations.getTarget(matchedNode_1194538774943, "rValue", true) == node) {
                dependencies.put(SLinkOperations.getTarget(matchedNode_1194538774943, "lValue", true), new Pair<SNode, INodeGetter>(node, new INodeGetter() {

                  public SNode getNode(SNode p0) {
                    SNode assignmentExpression;
                    SNode n;
                    n = p0.getParent();
                    assignmentExpression = n;
                    return SLinkOperations.getTarget(assignmentExpression, "rValue", true);
                  }

                }));
              }
              break;
            }
          }
          {
            boolean matches_1194539042393 = false;
            matches_1194539042393 = SModelUtil_new.isAssignableConcept(parent.getConceptFqName(), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess");
            if(matches_1194539042393) {
              {
                SNode operationExpression = SNodeOperations.getParent(matchedNode_1194538774943, null, false, false);
                if(SLinkOperations.getTarget(operationExpression, "leftExpression", true) == node && SPropertyOperations.hasValue(SLinkOperations.getTarget(matchedNode_1194538774943, "link", false), "metaClass", "aggregation", null)) {
                  dependencies.put(operationExpression, new Pair<SNode, INodeGetter>(node, new INodeGetter() {

                    public SNode getNode(SNode p0) {
                      return p0.getParent();
                    }

                  }));
                }
              }
              break;
            }
          }
          if(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
            dependencies.put(SLinkOperations.getTarget(node, "variableDeclaration", false), new Pair<SNode, INodeGetter>(node, new INodeGetter() {

              public SNode getNode(SNode p0) {
                SNode n = p0;
                SNode variableReference = n;
                return SLinkOperations.getTarget(variableReference, "variableDeclaration", false);
              }

            }));
          }
        } while(false);
      }
    }
  }

}
