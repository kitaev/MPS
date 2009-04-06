package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MapType extends Type {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.MapType";
  public static final String KEY_TYPE = "keyType";
  public static final String VALUE_TYPE = "valueType";

  public MapType(SNode node) {
    super(node);
  }

  public Type getKeyType() {
    return (Type)this.getChild(Type.class, MapType.KEY_TYPE);
  }

  public void setKeyType(Type node) {
    super.setChild(MapType.KEY_TYPE, node);
  }

  public Type getValueType() {
    return (Type)this.getChild(Type.class, MapType.VALUE_TYPE);
  }

  public void setValueType(Type node) {
    super.setChild(MapType.VALUE_TYPE, node);
  }


  public static MapType newInstance(SModel sm, boolean init) {
    return (MapType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MapType newInstance(SModel sm) {
    return MapType.newInstance(sm, false);
  }

}
