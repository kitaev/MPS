package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;

public class ConceptPropertyDeclaration extends BaseConcept implements INamedConcept {
  public static String NAME = "name";

  public  ConceptPropertyDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ConceptPropertyDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(ConceptPropertyDeclaration.NAME, value);
  }
}
