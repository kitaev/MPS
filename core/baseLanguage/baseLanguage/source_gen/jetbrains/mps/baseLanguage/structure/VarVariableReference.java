package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VarVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.VarVariableReference";
  public static final String DECLARATION = "declaration";

  public VarVariableReference(SNode node) {
    super(node);
  }

  public VarVariableDeclaration getDeclaration() {
    return (VarVariableDeclaration) this.getReferent(VarVariableDeclaration.class, VarVariableReference.DECLARATION);
  }

  public void setDeclaration(VarVariableDeclaration node) {
    super.setReferent(VarVariableReference.DECLARATION, node);
  }

  public static VarVariableReference newInstance(SModel sm, boolean init) {
    return (VarVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VarVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VarVariableReference newInstance(SModel sm) {
    return VarVariableReference.newInstance(sm, false);
  }
}
