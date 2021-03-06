package jetbrains.mps.baseLanguage.tuples.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NamedTupleType extends ClassifierType {
  public static final String concept = "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType";
  public static final String CPR_LeftBracket = "leftBracket";
  public static final String CPR_RightBracket = "rightBracket";

  public NamedTupleType(SNode node) {
    super(node);
  }

  public NamedTupleDeclaration getTupleDeclaration() {
    return this.ensureAdapter(NamedTupleDeclaration.class, "classifier", this.getClassifier());
  }

  public void setTupleDeclaration(NamedTupleDeclaration node) {
    this.setClassifier(node);
  }

  public static NamedTupleType newInstance(SModel sm, boolean init) {
    return (NamedTupleType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NamedTupleType newInstance(SModel sm) {
    return NamedTupleType.newInstance(sm, false);
  }
}
