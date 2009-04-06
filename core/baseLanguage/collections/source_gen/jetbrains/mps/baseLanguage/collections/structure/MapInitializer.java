package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.collections.structure.MapEntry;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MapInitializer extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.MapInitializer";
  public static final String ENTRIES = "entries";

  public MapInitializer(SNode node) {
    super(node);
  }

  public int getEntriesesCount() {
    return this.getChildCount(MapInitializer.ENTRIES);
  }

  public Iterator<MapEntry> entrieses() {
    return this.children(MapEntry.class, MapInitializer.ENTRIES);
  }

  public List<MapEntry> getEntrieses() {
    return this.getChildren(MapEntry.class, MapInitializer.ENTRIES);
  }

  public void addEntries(MapEntry node) {
    this.addChild(MapInitializer.ENTRIES, node);
  }

  public void insertEntries(MapEntry prev, MapEntry node) {
    this.insertChild(prev, MapInitializer.ENTRIES, node);
  }


  public static MapInitializer newInstance(SModel sm, boolean init) {
    return (MapInitializer)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.MapInitializer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MapInitializer newInstance(SModel sm) {
    return MapInitializer.newInstance(sm, false);
  }

}
