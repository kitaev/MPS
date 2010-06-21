package jetbrains.mps.graphLayout.util;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.graph.Graph;
import java.util.Set;
import java.util.Collection;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;

public class NodeMap<V> implements Map<Node, V> {
  private ArrayList<V> myMap;
  private Graph myGraph;

  public NodeMap(Graph graph) {
    myMap = new ArrayList<V>();
    myGraph = graph;
  }

  public Set<Map.Entry<Node, V>> entrySet() {
    throw new RuntimeException("method is not implemented");
  }

  public Collection<V> values() {
    return myMap;
  }

  public Set<Node> keySet() {
    /*
      Set<Node> res = SetSequence.fromSet(new HashSet<Node>());
      for (int i = 0; i < myMap.size(); i++) {
        res.add(myGraph.getNode(i));
      }
      return res;
    */
    throw new RuntimeException("method is not implemented");
  }

  public void clear() {
    throw new RuntimeException("method is not implemented");
  }

  public void putAll(Map<? extends Node, ? extends V> map) {
    throw new RuntimeException("method is not implemented");
  }

  public V remove(Object object) {
    throw new RuntimeException("method is not implemented");
  }

  public V put(Node node, V value) {
    int index = node.getIndex();
    fillToPosition(index);
    myMap.set(index, value);
    return value;
  }

  public V get(Object object) {
    Node node = ((Node) object);
    int index = node.getIndex();
    fillToPosition(index);
    return myMap.get(index);
  }

  public boolean containsValue(Object object) {
    throw new RuntimeException("method is not implemented");
  }

  public boolean containsKey(Object object) {
    throw new RuntimeException("method is not implemented");
  }

  public boolean isEmpty() {
    throw new RuntimeException("method is not implemented");
  }

  public int size() {
    return myMap.size();
  }

  private void fillToPosition(int position) {
    if (position >= myMap.size()) {
      for (int i = myMap.size(); i <= position; i++) {
        myMap.add(null);
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("node map:\n");
    for (int i = 0; i < myMap.size(); i++) {
      builder.append(i + " -> " + myMap.get(i) + "\n");
    }
    builder.append("end map");
    return builder.toString();
  }
}
