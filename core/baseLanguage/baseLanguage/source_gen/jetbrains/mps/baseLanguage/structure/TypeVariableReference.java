package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeVariableReference extends Type {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.TypeVariableReference";
  public static String TYPE_VARIABLE_DECLARATION = "typeVariableDeclaration";

  public TypeVariableReference(SNode node) {
    super(node);
  }

  public static TypeVariableReference newInstance(SModel sm, boolean init) {
    return (TypeVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeVariableReference newInstance(SModel sm) {
    return TypeVariableReference.newInstance(sm, false);
  }


  public TypeVariableDeclaration getTypeVariableDeclaration() {
    return (TypeVariableDeclaration)this.getReferent(TypeVariableReference.TYPE_VARIABLE_DECLARATION);
  }

  public void setTypeVariableDeclaration(TypeVariableDeclaration node) {
    super.setReferent(TypeVariableReference.TYPE_VARIABLE_DECLARATION, node);
  }

}
