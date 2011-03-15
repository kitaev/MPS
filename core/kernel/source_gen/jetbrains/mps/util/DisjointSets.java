package jetbrains.mps.util;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.HashSet;

public class DisjointSets<T> {
  private Map<T, T> myParent = MapSequence.fromMap(new HashMap<T, T>());
  private Map<T, Integer> myRank = MapSequence.fromMap(new HashMap<T, Integer>());

  public DisjointSets(Iterable<T> elements) {
    for (T e : Sequence.fromIterable(elements)) {
      MapSequence.fromMap(myParent).put(e, e);
      MapSequence.fromMap(myRank).put(e, 0);
    }
  }

  private T getRoot(T x) {
    if (MapSequence.fromMap(myParent).get(x) != x) {
      MapSequence.fromMap(myParent).put(x, getRoot(MapSequence.fromMap(myParent).get(x)));
    }
    return MapSequence.fromMap(myParent).get(x);
  }

  public void unite(T a, T b) {
    a = getRoot(a);
    b = getRoot(b);
    if (MapSequence.fromMap(myRank).get(a) < MapSequence.fromMap(myRank).get(b)) {
      MapSequence.fromMap(myParent).put(a, b);
    } else {
      MapSequence.fromMap(myParent).put(b, a);
      if (MapSequence.fromMap(myRank).get(a) == MapSequence.fromMap(myRank).get(b)) {
        MapSequence.fromMap(myRank).put(a, MapSequence.fromMap(myRank).get(a) + 1);
      }
    }
  }

  public Iterable<Set<T>> getSets() {
    final Map<T, Set<T>> rootToSet = MapSequence.fromMap(new HashMap<T, Set<T>>());
    SetSequence.fromSet(MapSequence.fromMap(myParent).keySet()).visitAll(new IVisitor<T>() {
      public void visit(T x) {
        T r = getRoot(x);
        if (MapSequence.fromMap(rootToSet).get(r) == null) {
          MapSequence.fromMap(rootToSet).put(r, SetSequence.fromSet(new HashSet<T>()));
        }
        SetSequence.fromSet(MapSequence.fromMap(rootToSet).get(r)).addElement(x);
      }
    });
    return MapSequence.fromMap(rootToSet).values();
  }
}
