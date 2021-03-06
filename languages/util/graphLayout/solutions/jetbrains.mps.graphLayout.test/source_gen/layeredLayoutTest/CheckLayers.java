package layeredLayoutTest;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graph.Graph;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.graph.Edge;

public class CheckLayers {
  public static boolean hasBadEdges(Graph graph, Map<Node, Integer> layers) {
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      for (Edge edge : ListSequence.fromList(node.getOutEdges())) {
        if (layers.get(edge.getSource()) > layers.get(edge.getTarget())) {
          return true;
        }
      }
      for (Edge edge : ListSequence.fromList(node.getInEdges())) {
        if (layers.get(edge.getSource()) > layers.get(edge.getTarget())) {
          return true;
        }
      }
    }
    return false;
  }
}
