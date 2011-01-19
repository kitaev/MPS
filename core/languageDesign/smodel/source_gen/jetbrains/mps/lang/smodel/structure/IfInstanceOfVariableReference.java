package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseVariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IfInstanceOfVariableReference extends BaseVariableReference {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.IfInstanceOfVariableReference";

  public IfInstanceOfVariableReference(SNode node) {
    super(node);
  }

  public IfInstanceOfVariable getInstanceOfVariable() {
    return this.ensureAdapter(IfInstanceOfVariable.class, "baseVariableDeclaration", this.getBaseVariableDeclaration());
  }

  public void setInstanceOfVariable(IfInstanceOfVariable node) {
    this.setBaseVariableDeclaration(node);
  }

  public static IfInstanceOfVariableReference newInstance(SModel sm, boolean init) {
    return (IfInstanceOfVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.IfInstanceOfVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IfInstanceOfVariableReference newInstance(SModel sm) {
    return IfInstanceOfVariableReference.newInstance(sm, false);
  }
}
