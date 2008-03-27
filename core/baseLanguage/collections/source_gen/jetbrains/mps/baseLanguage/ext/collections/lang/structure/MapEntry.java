package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class MapEntry extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapEntry";
  public static String KEY = "key";
  public static String VALUE = "value";

  public  MapEntry(SNode node) {
    super(node);
  }

  public static MapEntry newInstance(SModel sm, boolean init) {
    return (MapEntry)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapEntry", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MapEntry newInstance(SModel sm) {
    return MapEntry.newInstance(sm, false);
  }


  public Expression getKey() {
    return (Expression)this.getChild(MapEntry.KEY);
  }

  public void setKey(Expression node) {
    super.setChild(MapEntry.KEY, node);
  }

  public Expression getValue() {
    return (Expression)this.getChild(MapEntry.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(MapEntry.VALUE, node);
  }

}
