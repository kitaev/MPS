package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IValidIdentifier_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class StyleSheetClass_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, IValidIdentifier_BehaviorDescriptor, IStyleContainer_BehaviorDescriptor {
  public StyleSheetClass_BehaviorDescriptor() {
  }

  public SNode virtual_getParent_1219419981626(SNode thisNode) {
    return StyleSheetClass_Behavior.virtual_getParent_1219419981626(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.StyleSheetClass";
  }
}
