package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CopyPreProcessor extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.actions.structure.CopyPreProcessor";
  public static final String CONCEPT = "concept";
  public static final String PRE_PROCESS_FUNCTION = "preProcessFunction";

  public CopyPreProcessor(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, CopyPreProcessor.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(CopyPreProcessor.CONCEPT, node);
  }

  public CopyPreProcessFunction getPreProcessFunction() {
    return (CopyPreProcessFunction) this.getChild(CopyPreProcessFunction.class, CopyPreProcessor.PRE_PROCESS_FUNCTION);
  }

  public void setPreProcessFunction(CopyPreProcessFunction node) {
    super.setChild(CopyPreProcessor.PRE_PROCESS_FUNCTION, node);
  }

  public static CopyPreProcessor newInstance(SModel sm, boolean init) {
    return (CopyPreProcessor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.CopyPreProcessor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CopyPreProcessor newInstance(SModel sm) {
    return CopyPreProcessor.newInstance(sm, false);
  }
}
