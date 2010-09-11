package jetbrains.mps.graphLayout.algorithms;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class MinCostCirculation {
  private static int TEST_MODE = 1;

  public static Map<Edge, Integer> getCirculation(Graph graph, Map<Edge, Integer> low, Map<Edge, Integer> initialCapacity, Map<Edge, Integer> cost) {
    Map<Edge, Integer> capacity = MapSequence.fromMap(new HashMap<Edge, Integer>());
    Node source = graph.addDummyNode();
    Node target = graph.addDummyNode();
    for (Edge edge : ListSequence.fromList(graph.getEdges())) {
      MapSequence.fromMap(capacity).put(edge, MapSequence.fromMap(initialCapacity).get(edge) - MapSequence.fromMap(low).get(edge));
    }
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      if (node.isDummy()) {
        continue;
      }
      int diff = 0;
      for (Edge edge : ListSequence.fromList(node.getInEdges())) {
        diff += MapSequence.fromMap(low).get(edge);
      }
      for (Edge edge : ListSequence.fromList(node.getOutEdges())) {
        diff -= MapSequence.fromMap(low).get(edge);
      }
      Edge newEdge = null;
      if (diff > 0) {
        newEdge = source.addEdgeTo(node);
      }
      if (diff < 0) {
        newEdge = node.addEdgeTo(target);
      }
      if (newEdge != null) {
        MapSequence.fromMap(capacity).put(newEdge, Math.abs(diff));
        MapSequence.fromMap(cost).put(newEdge, 0);
      }
    }
    Map<Edge, Integer> flow;
    if (TEST_MODE > 0) {
      flow = MinCostMaxFlowWithPotentials.getFlow(graph, source, target, capacity, cost);
      /*
        Map<Edge, Integer> anotherFlow = MinCostMaxFlow.getFlow(graph, source, target, capacity, cost);
        int flowCost = 0;
        int anotherFlowCost = 0;
        for (Edge edge : ListSequence.fromList(graph.getEdges())) {
          flowCost += MapSequence.fromMap(flow).get(edge) * MapSequence.fromMap(cost).get(edge);
          anotherFlowCost += MapSequence.fromMap(anotherFlow).get(edge) * MapSequence.fromMap(cost).get(edge);
        }
        if (anotherFlowCost != flowCost) {
          throw new RuntimeException("dijkstra result is different than ford-bellman");
        }
      */
    } else {
      flow = MinCostMaxFlow.getFlow(graph, source, target, capacity, cost);
    }
    for (Edge edge : ListSequence.fromList(source.getOutEdges())) {
      if (MapSequence.fromMap(flow).get(edge) != MapSequence.fromMap(capacity).get(edge)) {
        throw new RuntimeException("failed to find circulation");
      }
    }
    for (Edge edge : ListSequence.fromList(source.getEdges()).concat(ListSequence.fromList(target.getEdges()))) {
      MapSequence.fromMap(flow).removeKey(edge);
    }
    graph.remove(source);
    graph.remove(target);
    for (Edge edge : ListSequence.fromList(graph.getEdges())) {
      MapSequence.fromMap(flow).put(edge, MapSequence.fromMap(flow).get(edge) + MapSequence.fromMap(low).get(edge));
    }
    return flow;
  }
}
