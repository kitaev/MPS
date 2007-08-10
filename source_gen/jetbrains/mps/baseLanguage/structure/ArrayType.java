package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArrayType extends Type {
  public static String COMPONENT_TYPE = "componentType";

  public  ArrayType(SNode node) {
    super(node);
  }

  public static ArrayType newInstance(SModel sm, boolean init) {
    return (ArrayType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArrayType newInstance(SModel sm) {
    return ArrayType.newInstance(sm, false);
  }


  public Type getComponentType() {
    return (Type)this.getChild(ArrayType.COMPONENT_TYPE);
  }

  public void setComponentType(Type node) {
    super.setChild(ArrayType.COMPONENT_TYPE, node);
  }

}
