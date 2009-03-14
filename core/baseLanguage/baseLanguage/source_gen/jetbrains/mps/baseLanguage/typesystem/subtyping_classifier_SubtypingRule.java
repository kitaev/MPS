package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtyping_classifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public subtyping_classifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode clt) {
    SNode classifier = SLinkOperations.getTarget(clt, "classifier", false);
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> supertypes = new ArrayList<SNode>();
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = classifier;
      if (!((SLinkOperations.getTarget(classConcept, "superclass", true) == null))) {
        ListSequence.fromList(supertypes).addElement(SLinkOperations.getTarget(classConcept, "superclass", true));
      }
      ListSequence.fromList(supertypes).addSequence(ListSequence.fromList(SLinkOperations.getTargets(classConcept, "implementedInterface", true)));
    }
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode interfaceConcept = classifier;
      supertypes.addAll(SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true));
    }
    if (ListSequence.fromList(supertypes).isEmpty()) {
      ListSequence.fromList(result).addElement(new _Quotations.QuotationClass_4().createNode());
    }
    for(SNode supertype : supertypes) {
      SNode supertypeCopy = SNodeOperations.copyNode(supertype);
      for(SNode typeParam : new ArrayList<SNode>(SLinkOperations.getTargets(supertypeCopy, "parameter", true))) {
        if (SNodeOperations.isInstanceOf(typeParam, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
          SNode tvr = typeParam;
          int i = ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).indexOf(SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false));
          if (i < 0 || i >= SLinkOperations.getCount(clt, "parameter")) {
            ((SNode)supertypeCopy).removeChild(typeParam);
            continue;
          }
          SNode newNode = SNodeOperations.copyNode(ListSequence.fromList(((List<SNode>)SLinkOperations.getTargets(clt, "parameter", true))).getElement(i));
          supertypeCopy.replaceChild(typeParam, newNode);
        }
      }
      ListSequence.fromList(result).addElement(supertypeCopy);
    }
    ListSequence.fromList(supertypes).addElement(clt);
    for(SNode supertype : supertypes) {
      SNode erasure = SNodeOperations.copyNode(supertype);
      if (SLinkOperations.getCount(erasure, "parameter") > 0) {
        for(SNode parameter : SLinkOperations.getTargets(erasure, "parameter", true)) {
          SNodeOperations.deleteNode(parameter);
        }
        ListSequence.fromList(result).addElement(erasure);
      }
    }
    return result;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
