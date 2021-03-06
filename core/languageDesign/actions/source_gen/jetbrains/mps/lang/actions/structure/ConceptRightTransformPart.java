package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptRightTransformPart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.lang.actions.structure.ConceptRightTransformPart";
  public static final String CONCEPT = "concept";
  public static final String HANDLER = "handler";

  public ConceptRightTransformPart(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration) this.getReferent(ConceptDeclaration.class, ConceptRightTransformPart.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(ConceptRightTransformPart.CONCEPT, node);
  }

  public QueryFunction_SideTransform_ConceptHandler getHandler() {
    return (QueryFunction_SideTransform_ConceptHandler) this.getChild(QueryFunction_SideTransform_ConceptHandler.class, ConceptRightTransformPart.HANDLER);
  }

  public void setHandler(QueryFunction_SideTransform_ConceptHandler node) {
    super.setChild(ConceptRightTransformPart.HANDLER, node);
  }

  public static ConceptRightTransformPart newInstance(SModel sm, boolean init) {
    return (ConceptRightTransformPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptRightTransformPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptRightTransformPart newInstance(SModel sm) {
    return ConceptRightTransformPart.newInstance(sm, false);
  }
}
