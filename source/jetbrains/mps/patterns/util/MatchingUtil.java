package jetbrains.mps.patterns.util;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.patterns.*;
import jetbrains.mps.annotations.*;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.typesLanguage.evaluator.NodeWrapper;
import jetbrains.mps.typesLanguage.equation.IType;
import jetbrains.mps.typesLanguage.equation.NodeWrapperType;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 08.01.2006
 * Time: 16:46:12
 * To change this template use File | Settings | File Templates.
 */
public class MatchingUtil {

  private static Logger LOG = Logger.getLogger(MatchingUtil.class);

  private static Stack<ListPattern> ourCurrentListPatterns = new Stack<ListPattern>();

  private static ListPattern getCurrentListPattern() {
    return ourCurrentListPatterns.empty() ? null : ourCurrentListPatterns.peek();
  }

  public static Substitution matchNodeWithPattern(SNode node, PatternExpression patternExpression) {
    SNode patternNode = patternExpression.getPatternNode();
    Substitution currentSubstitution = new Substitution();
    if (matchNodes(node, patternNode, currentSubstitution)) {
      return currentSubstitution;
    } else {
      return null;
    }
  }


  public static Substitution matchNodeWithPattern(IType type, PatternExpression patternExpression) {
    SNode patternNode = patternExpression.getPatternNode();
    Substitution currentSubstitution = new Substitution();

    if (type instanceof NodeWrapperType) {
      NodeWrapperType nodeWrapperType = (NodeWrapperType) type;
        if (matchNodes(nodeWrapperType.getNodeWrapper(), patternNode, currentSubstitution)) {
      return currentSubstitution;
    } else {
      return null;
    }
    }

    return null;
  }


  private static boolean matchNodes(SNode node, SNode patternNode, Substitution substitution) {
    //todo do smth with Type Vars  

    //-- whole node bindings
    AttributeConcept patternAttribute = patternNode.getAttribute();
    if (patternAttribute instanceof WildcardPattern) {
      return true;
    }
    if (patternAttribute instanceof ListPattern) {
      //simply go on
    } else if (patternAttribute instanceof AsPattern) {
      bindNodeWithVar(substitution, (PatternVariableDeclaration) patternAttribute, node);
    } else if (patternAttribute instanceof PatternVariableDeclaration) {
      bindNodeWithVar(substitution, (PatternVariableDeclaration) patternAttribute, node);
      return true;
    }

    //-- matching class
    if (node.getClass() != patternNode.getClass()) return false;

    //-- matching properties
    Set<String> propertyNames = node.getPropertyNames();
    for (String propertyName : patternNode.getPropertyNames()) {
      //if property pattern var
      PropertyAttributeConcept propertyAttribute = patternNode.getPropertyAttribute(propertyName);
      if (propertyAttribute instanceof PropertyPatternVariableDeclaration) {
        LazyPropertyValue propertyValue = new LazyPropertyValue(node, propertyName);
        bindPropertyWithVar(substitution, (PropertyPatternVariableDeclaration) propertyAttribute, propertyValue);
      } else {//else match values
        if (!EqualUtil.equals(patternNode.getProperty(propertyName), node.getProperty(propertyName))) return false;
      }
    }

    //-- matching children
    Set<String> childRoles = patternNode.getChildRoles();
    for (String role : childRoles) {
      List<SNode> children = node.getChildren(role);
      List<SNode> patternChildren = patternNode.getChildren(role);

      //if list pattern
      SNode listPatternChild = null;
      for (SNode patternChild : patternChildren) {
        if (patternChild.getAttribute() instanceof ListPattern) {
          listPatternChild = patternChild;
          break;
        }
      }
      if (listPatternChild != null) {
        if (!matchListOfNodes(children, listPatternChild, substitution)) return false;
      } else {

        //else just match children
        Iterator<SNode> childrenIterator = children.iterator();
        for (SNode patternChild : patternChildren) {
          SNode child = childrenIterator.hasNext() ? childrenIterator.next() : null;
          if (!matchNodes(child, patternChild, substitution)) return false;
        }
      }
    }

    //-- matching references
    Set<String> referenceRoles = patternNode.getReferenceRoles();
    for (String role : referenceRoles) {
      SNode target = node.getReferent(role);

      //if this role has a link pattern var
      LinkAttributeConcept linkAttribute = patternNode.getLinkAttribute(role);
      if (linkAttribute instanceof LinkPatternVariableDeclaration) {
        bindReferenceTargetWithVar(substitution, (LinkPatternVariableDeclaration) linkAttribute, target);
      } else {//if role has just a link
        SNode patternTarget = patternNode.getReferent(role);
        if (patternTarget != target) return false;
      }
    }

    return true;
  }


  private static boolean matchNodes(NodeWrapper node, SNode patternNode, Substitution substitution) {

      //-- whole node bindings
      AttributeConcept patternAttribute = patternNode.getAttribute();
      if (patternAttribute instanceof WildcardPattern) {
        return true;
      }
      if (patternAttribute instanceof ListPattern) {
        //simply go on
      } else if (patternAttribute instanceof AsPattern) {
        bindNodeWithVar(substitution, (PatternVariableDeclaration) patternAttribute, node.getNode());
      } else if (patternAttribute instanceof PatternVariableDeclaration) {
        bindNodeWithVar(substitution, (PatternVariableDeclaration) patternAttribute, node.getNode());
        return true;
      }

      //-- matching class
      if (node.getNodeClass() != patternNode.getClass()) return false;

      //-- matching properties
      Set<String> propertyNames = node.getPropertyNames();
      for (String propertyName : patternNode.getPropertyNames()) {
        //if property pattern var
        PropertyAttributeConcept propertyAttribute = patternNode.getPropertyAttribute(propertyName);
        if (propertyAttribute instanceof PropertyPatternVariableDeclaration) {
          LazyPropertyValue propertyValue = new LazyPropertyValue(node.getNode(), propertyName);
          bindPropertyWithVar(substitution, (PropertyPatternVariableDeclaration) propertyAttribute, propertyValue);
        } else {//else match values
          if (!EqualUtil.equals(patternNode.getProperty(propertyName), node.getProperty(propertyName))) return false;
        }
      }

      //-- matching children
      Set<String> childRoles = patternNode.getChildRoles();
      for (String role : childRoles) {
        List<NodeWrapper> children = node.getChildren(role);
        List<SNode> patternChildren = patternNode.getChildren(role);

        //if list pattern
        SNode listPatternChild = null;
        for (SNode patternChild : patternChildren) {
          if (patternChild.getAttribute() instanceof ListPattern) {
            listPatternChild = patternChild;
            break;
          }
        }
        if (listPatternChild != null) {
          if (!matchListOfNodeWrappers(children, listPatternChild, substitution)) return false;
        } else {

          //else just match children
          Iterator<NodeWrapper> childrenIterator = children.iterator();
          for (SNode patternChild : patternChildren) {
            NodeWrapper child = childrenIterator.hasNext() ? childrenIterator.next() : null;
            if (!matchNodes(child, patternChild, substitution)) return false;
          }
        }
      }

      //-- matching references
      Set<String> referenceRoles = patternNode.getReferenceRoles();
      for (String role : referenceRoles) {
        SNode target = node.getReferent(role);

        //if this role has a link pattern var
        LinkAttributeConcept linkAttribute = patternNode.getLinkAttribute(role);
        if (linkAttribute instanceof LinkPatternVariableDeclaration) {
          bindReferenceTargetWithVar(substitution, (LinkPatternVariableDeclaration) linkAttribute, target);
        } else {//if role has just a link
          SNode patternTarget = patternNode.getReferent(role);
          if (patternTarget != target) return false;
        }
      }

      return true;
    }


  private static boolean matchListOfNodeWrappers(List<NodeWrapper> nodes, SNode patternNode, Substitution substitution) {
    ListPattern currentListPattern = (ListPattern) patternNode.getAttribute();
    ourCurrentListPatterns.push(currentListPattern);
    boolean stillMatches = true;
    for (NodeWrapper nodeWrapper : nodes) {
      boolean matchesNow = matchNodes(nodeWrapper, patternNode, substitution);
      stillMatches = stillMatches && matchesNow;
      if (!stillMatches) break;
      substitution.addNodeToListBindedWithVar(currentListPattern, nodeWrapper.getNode());
    }
    ListPattern poppedListPattern = ourCurrentListPatterns.pop();
    LOG.assertLog(poppedListPattern == currentListPattern);
    return stillMatches;
  }



  private static boolean matchListOfNodes(List<SNode> nodes, SNode patternNode, Substitution substitution) {
    ListPattern currentListPattern = (ListPattern) patternNode.getAttribute();
    ourCurrentListPatterns.push(currentListPattern);
    boolean stillMatches = true;
    for (SNode node : nodes) {
      boolean matchesNow = matchNodes(node, patternNode, substitution);
      stillMatches = stillMatches && matchesNow;
      if (!stillMatches) break;
      substitution.addNodeToListBindedWithVar(currentListPattern, node);
    }
    ListPattern poppedListPattern = ourCurrentListPatterns.pop();
    LOG.assertLog(poppedListPattern == currentListPattern);
    return stillMatches;
  }

  private static void bindNodeWithVar(Substitution substitution, PatternVariableDeclaration patternVar, SNode node) {
    if (getCurrentListPattern() == null) {
      substitution.bindNodeWithVar(patternVar, node);
    } else {
      substitution.addNodeToListBindedWithVar(patternVar, node);
    }
  }

  private static void bindPropertyWithVar(Substitution substitution, PropertyPatternVariableDeclaration propertyPatternVar, LazyPropertyValue propertyValue) {
    if (getCurrentListPattern() == null) {
      substitution.bindPropertyWithVar(propertyPatternVar, propertyValue);
    } else {
      substitution.addPropertyToListBindedWithVar(propertyPatternVar, propertyValue);
    }
  }

  private static void bindReferenceTargetWithVar(Substitution substitution, LinkPatternVariableDeclaration linkPatternVariableDeclaration, SNode target) {
    if (getCurrentListPattern() == null) {
      substitution.bindLinkTargetWithVar(linkPatternVariableDeclaration, target);
    } else {
      substitution.addLinkTargetToListBindedWithVar(linkPatternVariableDeclaration, target);
    }
  }
}
