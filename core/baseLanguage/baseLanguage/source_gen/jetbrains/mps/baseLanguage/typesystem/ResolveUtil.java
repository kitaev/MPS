package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class ResolveUtil {

  public ResolveUtil() {
  }

  public static List<SNode> parameterTypes(SNode method, SNode instanceType, SNode classifier) {
    List<SNode> result = ListSequence.fromList(new LinkedList<SNode>());
    boolean containsVars = false;
    for(SNode parameter : SLinkOperations.getTargets(method, "parameter", true)) {
      if (ListSequence.fromList(SNodeOperations.getDescendants(parameter, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true)).isNotEmpty()) {
        containsVars = true;
      }
      ListSequence.fromList(result).addElement(SNodeOperations.copyNode(SLinkOperations.getTarget(parameter, "type", true)));
    }
    if (!(containsVars)) {
      return result;
    }
    Set<SNode> frontier = new HashSet<SNode>();
    frontier.add(instanceType);
    SNode concreteMethodClassifierType = ResolveUtil.getConcreteSuperClassifierType(frontier, classifier);
    if (concreteMethodClassifierType == null) {
      return result;
    }
    List<SNode> typeParameters = ListSequence.fromList(SLinkOperations.getTargets(concreteMethodClassifierType, "parameter", true)).toListSequence();
    for(SNode paramType : new ArrayList<SNode>(result)) {
      for(SNode typeVar : SNodeOperations.getDescendants(paramType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true)) {
        SNode replacement = SNodeOperations.copyNode(ListSequence.fromList(typeParameters).getElement(SNodeOperations.getIndexInParent(SLinkOperations.getTarget(typeVar, "typeVariableDeclaration", false))));
        if ((SNodeOperations.getParent(typeVar) == null)) {
          ListSequence.fromList(result).insertElement(result.indexOf(typeVar), replacement);
          ListSequence.fromList(result).removeElement(typeVar);
        } else
        {
          SNodeOperations.replaceWithAnother(typeVar, replacement);
        }
      }
    }
    return result;
  }

  public static SNode getConcreteClassifierType(SNode typeWithVars, SNode classifierSubtype) {
    SNode result = SNodeOperations.copyNode(typeWithVars);
    List<SNode> varRefs = SNodeOperations.getDescendants(result, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false);
    List<SNode> params = ListSequence.fromList(SLinkOperations.getTargets(classifierSubtype, "parameter", true)).toListSequence();
    for(SNode varRef : varRefs) {
      SNodeOperations.replaceWithAnother(varRef, SNodeOperations.copyNode(ListSequence.fromList(params).getElement(SNodeOperations.getIndexInParent(SLinkOperations.getTarget(varRef, "typeVariableDeclaration", false)))));
    }
    return result;
  }

  public static SNode getConcreteSuperClassifierType(Set<SNode> frontier, SNode classifier) {
    SNode concreteMethodClassifierType = null;
    Set<SNode> newFrontier = new HashSet<SNode>();
outer:
    while (!(frontier.isEmpty())) {
      for(SNode currentType : frontier) {
        SNode currentClassifier = SLinkOperations.getTarget(currentType, "classifier", false);
        if (currentClassifier == classifier) {
          concreteMethodClassifierType = currentType;
          break outer;
        }
        if (SNodeOperations.isInstanceOf(currentClassifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
          SNode classConcept = currentClassifier;
          SNode superclass = SLinkOperations.getTarget(classConcept, "superclass", true);
          if ((superclass != null)) {
            newFrontier.add(getConcreteClassifierType(superclass, currentType));
          }
          for(SNode intfc : SLinkOperations.getTargets(classConcept, "implementedInterface", true)) {
            newFrontier.add(getConcreteClassifierType(intfc, currentType));
          }
        }
        if (SNodeOperations.isInstanceOf(currentClassifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
          SNode interfaceConcept = currentClassifier;
          for(SNode intfc : SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true)) {
            newFrontier.add(getConcreteClassifierType(intfc, currentType));
          }
        }
      }
      frontier = newFrontier;
      newFrontier = new HashSet<SNode>();
    }
    return concreteMethodClassifierType;
  }

  public static SNode processMethodToImplement(SNode enclosingClassifier, SNode method) {
    SNode declaringClassifier = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    SNode result = SNodeOperations.copyNode(method);
    Set<SNode> initialClassifierTypes = new HashSet<SNode>();
    if (SNodeOperations.isInstanceOf(enclosingClassifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = enclosingClassifier;
      SNode superclass = SLinkOperations.getTarget(classConcept, "superclass", true);
      if ((superclass != null)) {
        initialClassifierTypes.add(superclass);
      }
      for(SNode intfc : SLinkOperations.getTargets(classConcept, "implementedInterface", true)) {
        initialClassifierTypes.add(intfc);
      }
    }
    if (SNodeOperations.isInstanceOf(enclosingClassifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode interfaceConcept = enclosingClassifier;
      for(SNode intfc : SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true)) {
        initialClassifierTypes.add(intfc);
      }
    }
    SNode concreteSuperClassifierType = getConcreteSuperClassifierType(initialClassifierTypes, declaringClassifier);
    Set<SNode> types = new HashSet<SNode>();
    types.add(SLinkOperations.getTarget(result, "returnType", true));
    for(SNode param : SLinkOperations.getTargets(result, "parameter", true)) {
      types.add(SLinkOperations.getTarget(param, "type", true));
    }
    List<SNode> params = SLinkOperations.getTargets(concreteSuperClassifierType, "parameter", true);
    for(SNode typeToModify : types) {
      for(SNode varRef : SNodeOperations.getDescendants(typeToModify, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true)) {
        SNodeOperations.replaceWithAnother(varRef, SNodeOperations.copyNode(ListSequence.fromList(params).getElement(SNodeOperations.getIndexInParent(SLinkOperations.getTarget(varRef, "typeVariableDeclaration", false)))));
      }
    }
    return result;
  }

}
