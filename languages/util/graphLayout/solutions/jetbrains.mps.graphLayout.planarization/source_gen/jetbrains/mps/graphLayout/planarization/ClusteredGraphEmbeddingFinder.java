package jetbrains.mps.graphLayout.planarization;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.List;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.graphLayout.graph.ClusteredGraph;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.graphLayout.algorithms.ConnectivityComponents;
import jetbrains.mps.graphLayout.algorithms.BiconnectAugmentation;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.graphLayout.planarGraph.CheckEmbeddedGraph;

public class ClusteredGraphEmbeddingFinder implements IEmbeddingFinder {
  private Map<Node, List<Edge>> myClusterBorderMap;

  public ClusteredGraphEmbeddingFinder() {
  }

  public EmbeddedGraph find(Graph graph) {
    if (graph instanceof ClusteredGraph) {
      ClusteredGraph clusteredGraph = ((ClusteredGraph) graph);
      Node root = clusteredGraph.getRoot();
      myClusterBorderMap = MapSequence.fromMap(new HashMap<Node, List<Edge>>());
      ConnectivityComponents.makeConnected(graph);
      BiconnectAugmentation.smartMakeBiconnected(graph);
      ClusterEmbeddingConstructor constructor = new ClusterEmbeddingConstructor(clusteredGraph, root, null);
      constructor.setClusterBorderMap(myClusterBorderMap);
      EmbeddedGraph embeddedGraph = constructor.constructEmbedding();
      for (Node cluster : SetSequence.fromSet(MapSequence.fromMap(myClusterBorderMap).keySet())) {
        List<Edge> newBorder = ListSequence.fromList(new LinkedList<Edge>());
        for (Edge edge : ListSequence.fromList(MapSequence.fromMap(myClusterBorderMap).get(cluster))) {
          if (edge.getSource() == edge.getTarget()) {
            List<Edge> newEdges = ListSequence.fromList(new LinkedList<Edge>());
            embeddedGraph.splitEdge(edge, newEdges);
            ListSequence.fromList(newBorder).addSequence(ListSequence.fromList(newEdges));
          } else {
            ListSequence.fromList(newBorder).addElement(edge);
          }
        }
        MapSequence.fromMap(myClusterBorderMap).put(cluster, newBorder);
      }
      CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph, false);
      return embeddedGraph;
    } else {
      throw new RuntimeException("can find embedding of clustered graphs only");
    }
  }

  public Map<Node, List<Edge>> getClusterBorderMap() {
    return myClusterBorderMap;
  }
}
