package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SideTransformVariableReference extends VariableReference {
  public static final String concept = "jetbrains.mps.lang.actions.structure.SideTransformVariableReference";

  public SideTransformVariableReference(SNode node) {
    super(node);
  }

  public SideTransformVariableDeclaration getRightTransformVariableDeclaration() {
    return this.ensureAdapter(SideTransformVariableDeclaration.class, "variableDeclaration", this.getVariableDeclaration());
  }

  public void setRightTransformVariableDeclaration(SideTransformVariableDeclaration node) {
    this.setVariableDeclaration(node);
  }

  public static SideTransformVariableReference newInstance(SModel sm, boolean init) {
    return (SideTransformVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.SideTransformVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SideTransformVariableReference newInstance(SModel sm) {
    return SideTransformVariableReference.newInstance(sm, false);
  }
}
