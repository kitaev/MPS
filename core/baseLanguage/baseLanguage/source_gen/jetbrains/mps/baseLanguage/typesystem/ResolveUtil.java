package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Iterator;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ResolveUtil {
  public ResolveUtil() {
  }

  public static List<SNode> parameterTypes(SNode method, SNode instanceType, SNode classifier) {
    List<SNode> result = ListSequence.fromList(new LinkedList<SNode>());
    boolean containsVars = false;
    for (SNode parameter : SLinkOperations.getTargets(method, "parameter", true)) {
      if (ListSequence.fromList(SNodeOperations.getDescendants(parameter, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true, new String[]{})).isNotEmpty()) {
        containsVars = true;
      }
      ListSequence.fromList(result).addElement(SNodeOperations.copyNode(SLinkOperations.getTarget(parameter, "type", true)));
    }
    if (!(containsVars)) {
      return result;
    }
    Set<SNode> frontier = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(frontier).addElement(instanceType);
    SNode concreteMethodClassifierType = ResolveUtil.getConcreteSuperClassifierType(frontier, classifier);
    if (concreteMethodClassifierType == null) {
      return result;
    }
    List<SNode> typeParameters = ListSequence.fromList(SLinkOperations.getTargets(concreteMethodClassifierType, "parameter", true)).toListSequence();
    for (SNode paramType : ListSequence.fromListWithValues(new ArrayList<SNode>(), result)) {
      for (SNode typeVar : SNodeOperations.getDescendants(paramType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true, new String[]{})) {
        SNode variableDeclaration = SLinkOperations.getTarget(typeVar, "typeVariableDeclaration", false);
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(variableDeclaration), "jetbrains.mps.baseLanguage.structure.Classifier")) {
          SNode replacement = SNodeOperations.copyNode(ListSequence.fromList(typeParameters).getElement(SNodeOperations.getIndexInParent(variableDeclaration)));
          if ((SNodeOperations.getParent(typeVar) == null)) {
            ListSequence.fromList(result).insertElement(ListSequence.fromList(result).indexOf(typeVar), replacement);
            ListSequence.fromList(result).removeElement(typeVar);
          } else {
            SNodeOperations.replaceWithAnother(typeVar, replacement);
          }
        }
      }
    }
    return result;
  }

  public static SNode getConcreteClassifierType(SNode typeWithVars, SNode classifierSubtype) {
    SNode result = SNodeOperations.copyNode(typeWithVars);
    List<SNode> varRefs = SNodeOperations.getDescendants(result, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{});
    List<SNode> params = ListSequence.fromList(SLinkOperations.getTargets(classifierSubtype, "parameter", true)).toListSequence();
    for (SNode varRef : varRefs) {
      SNodeOperations.replaceWithAnother(varRef, SNodeOperations.copyNode(ListSequence.fromList(params).getElement(SNodeOperations.getIndexInParent(SLinkOperations.getTarget(varRef, "typeVariableDeclaration", false)))));
    }
    return result;
  }

  public static SNode getConcreteSuperClassifierType(Set<SNode> frontier, SNode classifier) {
    SNode concreteMethodClassifierType = null;
    Set<SNode> newFrontier = SetSequence.fromSet(new HashSet<SNode>());
outer:
    while (!(SetSequence.fromSet(frontier).isEmpty())) {
      for (SNode currentType : frontier) {
        SNode currentClassifier = SLinkOperations.getTarget(currentType, "classifier", false);
        if (currentClassifier == classifier) {
          concreteMethodClassifierType = currentType;
          break outer;
        }
        if (SNodeOperations.isInstanceOf(currentClassifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
          SNode classConcept = SNodeOperations.cast(currentClassifier, "jetbrains.mps.baseLanguage.structure.ClassConcept");
          SNode superclass = SLinkOperations.getTarget(classConcept, "superclass", true);
          if ((superclass != null)) {
            SetSequence.fromSet(newFrontier).addElement(getConcreteClassifierType(superclass, currentType));
          }
          for (SNode intfc : SLinkOperations.getTargets(classConcept, "implementedInterface", true)) {
            SetSequence.fromSet(newFrontier).addElement(getConcreteClassifierType(intfc, currentType));
          }
        }
        if (SNodeOperations.isInstanceOf(currentClassifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
          SNode interfaceConcept = SNodeOperations.cast(currentClassifier, "jetbrains.mps.baseLanguage.structure.Interface");
          for (SNode intfc : SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true)) {
            SetSequence.fromSet(newFrontier).addElement(getConcreteClassifierType(intfc, currentType));
          }
        }
      }
      frontier = newFrontier;
      newFrontier = SetSequence.fromSet(new HashSet<SNode>());
    }
    return concreteMethodClassifierType;
  }

  public static SNode processMethodToImplement(SNode enclosingClassifier, SNode method) {
    SNode declaringClassifier = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    SNode result = SNodeOperations.copyNode(method);
    Set<SNode> initialClassifierTypes = SetSequence.fromSet(new HashSet<SNode>());
    if (SNodeOperations.isInstanceOf(enclosingClassifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = SNodeOperations.cast(enclosingClassifier, "jetbrains.mps.baseLanguage.structure.ClassConcept");
      SNode superclass = SLinkOperations.getTarget(classConcept, "superclass", true);
      if ((superclass != null)) {
        SetSequence.fromSet(initialClassifierTypes).addElement(superclass);
      }
      for (SNode intfc : SLinkOperations.getTargets(classConcept, "implementedInterface", true)) {
        SetSequence.fromSet(initialClassifierTypes).addElement(intfc);
      }
    }
    if (SNodeOperations.isInstanceOf(enclosingClassifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode interfaceConcept = SNodeOperations.cast(enclosingClassifier, "jetbrains.mps.baseLanguage.structure.Interface");
      for (SNode intfc : SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true)) {
        SetSequence.fromSet(initialClassifierTypes).addElement(intfc);
      }
    }
    SNode concreteSuperClassifierType = getConcreteSuperClassifierType(initialClassifierTypes, declaringClassifier);
    Set<SNode> types = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(types).addElement(SLinkOperations.getTarget(result, "returnType", true));
    for (SNode param : SLinkOperations.getTargets(result, "parameter", true)) {
      SetSequence.fromSet(types).addElement(SLinkOperations.getTarget(param, "type", true));
    }
    List<SNode> params = SLinkOperations.getTargets(concreteSuperClassifierType, "parameter", true);
    for (SNode typeToModify : types) {
      for (SNode varRef : SNodeOperations.getDescendants(typeToModify, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true, new String[]{})) {
        // maybe a var from method 
        SNode typeVariableDeclaration = SLinkOperations.getTarget(varRef, "typeVariableDeclaration", false);
        if (SNodeOperations.getParent(typeVariableDeclaration) != result) {
          int index = SNodeOperations.getIndexInParent(typeVariableDeclaration);
          if (ListSequence.fromList(params).count() > index) {
            SNodeOperations.replaceWithAnother(varRef, SNodeOperations.copyNode(ListSequence.fromList(params).getElement(index)));
          } else {
            SNodeOperations.replaceWithAnother(varRef, new ResolveUtil.QuotationClass_2818_0().createNode());
          }
        }
      }
    }
    return result;
  }

  public static boolean goodArguments(Iterable<SNode> parameterTypes, List<SNode> arguments) {
    if (SNodeOperations.isInstanceOf(Sequence.fromIterable(parameterTypes).last(), "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
      if (Sequence.fromIterable(parameterTypes).count() - 1 > ListSequence.fromList(arguments).count()) {
        return false;
      }

      SNode lastArgument = ListSequence.fromList(arguments).last();
      SNode varArgType = SNodeOperations.cast(Sequence.fromIterable(parameterTypes).last(), "jetbrains.mps.baseLanguage.structure.VariableArityType");
      Iterator<SNode> pTypesItr = Sequence.fromIterable(parameterTypes).iterator();
      Iterator<SNode> argumentsItr = ListSequence.fromList(arguments).iterator();

      while (pTypesItr.hasNext()) {
        SNode parameterType = pTypesItr.next();
        SNode argument = (argumentsItr.hasNext() ?
          argumentsItr.next() :
          null
        );

        if (parameterType == varArgType) {
          // vararg reached 
          if (argument == null) {
            // zero varargs 
            return true;
          }
          SNode mayBeLastArgumentType = TypeChecker.getInstance().getTypeOf(argument);
          SNode varArgComponentType = SLinkOperations.getTarget(varArgType, "componentType", true);
          if ((lastArgument == argument) && SNodeOperations.isInstanceOf(mayBeLastArgumentType, "jetbrains.mps.baseLanguage.structure.ArrayType") && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(SNodeOperations.cast(mayBeLastArgumentType, "jetbrains.mps.baseLanguage.structure.ArrayType"), "componentType", true), varArgComponentType)) {
            // array type as vararg 
            return true;
          } else {
            while (argument != null) {
              if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(argument), varArgComponentType))) {
                return false;
              }
              argument = (argumentsItr.hasNext() ?
                argumentsItr.next() :
                null
              );
            }
            return true;
          }
        } else if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(argument), parameterType))) {
          return false;
        }
      }
      return true;
    } else if (Sequence.fromIterable(parameterTypes).count() == ListSequence.fromList(arguments).count()) {
      {
        SNode parameterType;
        SNode argument;
        Iterator<SNode> parameterType_iterator = Sequence.fromIterable(parameterTypes).iterator();
        Iterator<SNode> argument_iterator = ListSequence.fromList(arguments).iterator();
        while (true) {
          if (!(parameterType_iterator.hasNext())) {
            break;
          }
          if (!(argument_iterator.hasNext())) {
            break;
          }
          parameterType = parameterType_iterator.next();
          argument = argument_iterator.next();
          if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(argument), parameterType))) {
            return false;
          }
        }
      }
      return true;
    } else {
      return false;
    }
  }

  public static class QuotationClass_2818_0 {
    public QuotationClass_2818_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_2818_0 = null;
      {
        quotedNode_2818_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2818_0 = quotedNode_2818_0;
        quotedNode1_2818_0.addReference(SReference.create("classifier", quotedNode1_2818_0, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2818_0;
      }
      return result;
    }
  }
}
