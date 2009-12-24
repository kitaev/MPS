package jetbrains.mps.lang.sharedConcepts.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_editorContext extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext";

  public ConceptFunctionParameter_editorContext(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_editorContext newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_editorContext) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_editorContext", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_editorContext newInstance(SModel sm) {
    return ConceptFunctionParameter_editorContext.newInstance(sm, false);
  }
}
