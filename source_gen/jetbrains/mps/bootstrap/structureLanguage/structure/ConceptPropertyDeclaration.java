package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ConceptPropertyDeclaration extends BaseConcept implements INamedConcept {
  public static String NAME = "name";

  public  ConceptPropertyDeclaration(SNode node) {
    super(node);
  }

  public static ConceptPropertyDeclaration newInstance(SModel sm) {
    return (ConceptPropertyDeclaration)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.ConceptPropertyDeclaration", sm, GlobalScope.getInstance()).getAdaptor();
  }

  public String getName() {
    return this.getProperty(ConceptPropertyDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(ConceptPropertyDeclaration.NAME, value);
  }
}
