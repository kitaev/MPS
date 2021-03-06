package planarizationTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.ClusteredGraph;
import visualization.GraphIO;
import java.util.List;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.EdgesHistoryManager;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarization.ClusteredGraphEmbeddingFinder;
import java.util.Set;
import jetbrains.mps.graphLayout.algorithms.BiconnectAugmentation;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.graphLayout.planarization.ShortestPathEmbeddingFinder;

public class ClusterEmbeddingMakeBiconnected_Test extends TestCase {
  public void test_connectedTriagles() throws Exception {
    String graphString = "6 8  0 1  1 2  0 2  3 4  4 5  5 3  2 4  1 3";
    String treeString = "9 8  0 1  0 2  1 3  1 4  1 5  2 6  2 7  2 8";
    ClusteredGraph graph = GraphIO.scanClusteredGraph(graphString, treeString);
    test(graph);
  }

  public void test_noEdges() throws Exception {
    String graphString = "4 0";
    String treeString = "7 6  0 1  0 2  1 3  1 4  2 5  2 6";
    ClusteredGraph graph = GraphIO.scanClusteredGraph(graphString, treeString);
    test(graph);
  }

  public void test_test1() throws Exception {
    String graphString = "4 1  0 2";
    String treeString = "7 6  0 1  0 2  1 3  1 4  2 5  2 6";
    ClusteredGraph graph = GraphIO.scanClusteredGraph(graphString, treeString);
    test(graph);
  }

  public void test(ClusteredGraph graph) {
    List<Edge> edges = graph.getEdges();
    EdgesHistoryManager manager = new EdgesHistoryManager(graph);
    EmbeddedGraph embeddedGraph = new ClusteredGraphEmbeddingFinder().find(graph);
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph, false);
    CheckEmbeddedGraph.checkFull(embeddedGraph);
    Set<Edge> newEdges = BiconnectAugmentation.smartMakeBiconnected(graph);
    for (Edge edge : SetSequence.fromSet(newEdges)) {
      graph.removeEdge(edge);
    }
    for (Edge edge : SetSequence.fromSet(newEdges)) {
      ShortestPathEmbeddingFinder.restoreEdge(embeddedGraph, edge, false);
    }
    CheckEmbeddedGraph.checkEmbeddedGraph(embeddedGraph, false);
    CheckEmbeddedGraph.checkFull(embeddedGraph);
  }
}
