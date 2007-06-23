package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class subtyping_classifier_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  subtyping_classifier_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type) {
    SNode classifier = SLinkOperations.getTarget(type, "classifier", false);
    SModel runtimeTypesModel = TypeChecker.getInstance().getRuntimeTypesModel();
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> supertypes = new ArrayList<SNode>();
    if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode classConcept = classifier;
      if(!((SLinkOperations.getTarget(classConcept, "superclass", true) == null))) {
        supertypes.add(SLinkOperations.getTarget(classConcept, "superclass", true));
      }
      supertypes.addAll(SLinkOperations.getTargets(classConcept, "implementedInterface", true));
      if(!((SLinkOperations.getTarget(classConcept, "extendedClass", false) == null))) {
        supertypes.add(new QuotationClass_4().createNode(SLinkOperations.getTarget(classConcept, "extendedClass", false)));
      }
    }
    if(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
      SNode interfaceConcept = classifier;
      supertypes.addAll(SLinkOperations.getTargets(interfaceConcept, "extendedInterface", true));
    }
    if(supertypes.isEmpty()) {
      result.add(new QuotationClass_5().createNode());
    }
    for(SNode supertype : supertypes) {
      SNode supertypeCopy = SNodeOperations.copyNode(supertype, runtimeTypesModel);
      for(SNode typeParam : new ArrayList<SNode>(SLinkOperations.getTargets(supertypeCopy, "parameter", true))) {
        if(SNodeOperations.isInstanceOf(typeParam, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
          SNode tvr = typeParam;
          int i = ((List)SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).indexOf(SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false));
          if(i < 0 || i >= SLinkOperations.getCount(type, "parameter")) {
            ((SNode)supertypeCopy).removeChild(typeParam);
            continue;
          }
          SNode newNode = SNodeOperations.copyNode(((SNode)((List)SLinkOperations.getTargets(type, "parameter", true)).get(i)), runtimeTypesModel);
          supertypeCopy.replaceChild(typeParam, newNode);
        }
      }
      result.add(supertypeCopy);
    }
    supertypes.add(type);
    for(SNode supertype : supertypes) {
      SNode erasure = SNodeOperations.copyNode(supertype, runtimeTypesModel);
      if(SLinkOperations.getCount(erasure, "parameter") > 0) {
        for(SNode parameter : SLinkOperations.getTargets(erasure, "parameter", true)) {
          SNodeOperations.deleteNode(parameter);
        }
        result.add(erasure);
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
  public boolean isSupertyping() {
    return false;
  }
  public boolean isWeak() {
    return false;
  }
}
