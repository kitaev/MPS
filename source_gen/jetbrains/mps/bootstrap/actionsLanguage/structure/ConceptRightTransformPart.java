package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class ConceptRightTransformPart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart";
  public static String HANDLER = "handler";
  public static String CONCEPT = "concept";

  public  ConceptRightTransformPart(SNode node) {
    super(node);
  }

  public static ConceptRightTransformPart newInstance(SModel sm, boolean init) {
    return (ConceptRightTransformPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptRightTransformPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptRightTransformPart newInstance(SModel sm) {
    return ConceptRightTransformPart.newInstance(sm, false);
  }


  public QueryFunction_RightTransform_ConceptHandler getHandler() {
    return (QueryFunction_RightTransform_ConceptHandler)this.getChild(ConceptRightTransformPart.HANDLER);
  }

  public void setHandler(QueryFunction_RightTransform_ConceptHandler node) {
    super.setChild(ConceptRightTransformPart.HANDLER, node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptRightTransformPart.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(ConceptRightTransformPart.CONCEPT, node);
  }

}
