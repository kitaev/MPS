package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PastePostProcessor extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.actions.structure.PastePostProcessor";
  public static final String CONCEPT = "concept";
  public static final String POST_PROCESS_FUNCTION = "postProcessFunction";

  public PastePostProcessor(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, PastePostProcessor.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(PastePostProcessor.CONCEPT, node);
  }

  public PastePostProcessFunction getPostProcessFunction() {
    return (PastePostProcessFunction) this.getChild(PastePostProcessFunction.class, PastePostProcessor.POST_PROCESS_FUNCTION);
  }

  public void setPostProcessFunction(PastePostProcessFunction node) {
    super.setChild(PastePostProcessor.POST_PROCESS_FUNCTION, node);
  }

  public static PastePostProcessor newInstance(SModel sm, boolean init) {
    return (PastePostProcessor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.PastePostProcessor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PastePostProcessor newInstance(SModel sm) {
    return PastePostProcessor.newInstance(sm, false);
  }
}
