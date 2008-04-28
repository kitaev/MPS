package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StringConceptPropertyDeclaration extends ConceptPropertyDeclaration {
  public static final String concept = "jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptPropertyDeclaration";

  public StringConceptPropertyDeclaration(SNode node) {
    super(node);
  }

  public static StringConceptPropertyDeclaration newInstance(SModel sm, boolean init) {
    return (StringConceptPropertyDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptPropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StringConceptPropertyDeclaration newInstance(SModel sm) {
    return StringConceptPropertyDeclaration.newInstance(sm, false);
  }

}
