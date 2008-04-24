package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunction extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ConceptFunction";
  public static String CPR_UsesParameterObject = "usesParameterObject";
  public static String CPR_ConceptFunctionName = "conceptFunctionName";
  public static String CLNK_ConceptFunctionReturnType = "conceptFunctionReturnType";
  public static String CLNK_ConceptFunctionParameter = "conceptFunctionParameter";
  public static String CLNK_ApplicableConceptFunctionParameter = "applicableConceptFunctionParameter";
  public static String BODY = "body";

  public ConceptFunction(SNode node) {
    super(node);
  }

  public static ConceptFunction newInstance(SModel sm, boolean init) {
    return (ConceptFunction)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ConceptFunction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunction newInstance(SModel sm) {
    return ConceptFunction.newInstance(sm, false);
  }


  public StatementList getBody() {
    return (StatementList)this.getChild(ConceptFunction.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(ConceptFunction.BODY, node);
  }

}
