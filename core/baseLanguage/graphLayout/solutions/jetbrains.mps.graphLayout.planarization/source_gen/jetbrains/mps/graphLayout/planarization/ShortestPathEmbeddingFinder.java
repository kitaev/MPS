package jetbrains.mps.graphLayout.planarization;

/*Generated by MPS */

import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.graph.Graph;
import java.util.List;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.graphLayout.planarGraph.DualGraph;
import java.util.Map;
import jetbrains.mps.graphLayout.planarGraph.Face;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.algorithms.ShortestPath;

public class ShortestPathEmbeddingFinder implements IEmbeddingFinder {
  private static int SHOW_LOG = 1;

  private IEmbeddingFinder myInitialFinder;

  public ShortestPathEmbeddingFinder(IEmbeddingFinder initialFinder) {
    myInitialFinder = initialFinder;
  }

  public EmbeddedGraph find(Graph graph) {
    final EmbeddedGraph embeddedGraph = myInitialFinder.find(graph);
    if (SHOW_LOG > 0) {
      System.out.println("initial embedding: ");
      System.out.println(embeddedGraph);
    }
    List<Edge> toAdd = ListSequence.fromList(graph.getEdges()).where(new IWhereFilter<Edge>() {
      public boolean accept(Edge it) {
        return !(MapSequence.fromMap(embeddedGraph.getAdjacentFacesMap()).containsKey(it));
      }
    }).toListSequence();
    if (SHOW_LOG > 0) {
      System.out.println("edges to add: ");
      System.out.println(toAdd);
    }
    for (Edge edge : ListSequence.fromList(toAdd)) {
      edge.removeFromGraph();
    }
    for (Edge edge : ListSequence.fromList(toAdd)) {
      restoreEdge(embeddedGraph, edge);
    }
    return embeddedGraph;
  }

  private void restoreEdge(EmbeddedGraph embeddedGraph, Edge removedEdge) {
    DualGraph dualGraph = new DualGraph(embeddedGraph);
    Map<Edge, List<Face>> adjacentFacesMap = embeddedGraph.getAdjacentFacesMap();
    List<Node> newNodes = ListSequence.fromList(new ArrayList<Node>());
    for (Node node : ListSequence.fromList(removedEdge.getAdjacentNodes())) {
      Node newNode = dualGraph.addDummyNode();
      for (Edge nodeEdge : ListSequence.fromList(node.getEdges(Edge.Direction.BOTH))) {
        for (Face face : ListSequence.fromList(MapSequence.fromMap(adjacentFacesMap).get(nodeEdge))) {
          newNode.addEdgeTo(MapSequence.fromMap(dualGraph.getNodesMap()).get(face));
        }
      }
      ListSequence.fromList(newNodes).addElement(newNode);
    }
    /*
      System.out.println("before: " + embeddedGraph);
      System.out.println(dualGraph);
      System.out.println("adding " + removedEdge);
    */
    List<Edge> path = ShortestPath.getPath(dualGraph, ListSequence.fromList(newNodes).getElement(0), ListSequence.fromList(newNodes).getElement(1), Edge.Direction.BOTH);
    List<Node> nodePath = ListSequence.fromList(new ArrayList<Node>());
    List<Face> facePath = ListSequence.fromList(new ArrayList<Face>());
    ListSequence.fromList(nodePath).addElement(ListSequence.fromList(removedEdge.getAdjacentNodes()).getElement(0));
    Node cur = ListSequence.fromList(newNodes).getElement(0);
    for (Edge edge : ListSequence.fromList(path)) {
      Edge realEdge = MapSequence.fromMap(dualGraph.getEdgesMap()).get(edge);
      if (MapSequence.fromMap(adjacentFacesMap).get(realEdge) != null) {
        ListSequence.fromList(nodePath).addElement(embeddedGraph.splitEdge(MapSequence.fromMap(dualGraph.getEdgesMap()).get(edge)));
      }
      cur = edge.getOpposite(cur);
      Face curFace = MapSequence.fromMap(dualGraph.getFacesMap()).get(cur);
      if (curFace != null) {
        ListSequence.fromList(facePath).addElement(curFace);
      }
    }
    List<Edge> newEdges = ListSequence.fromList(new ArrayList<Edge>());
    ListSequence.fromList(nodePath).addElement(ListSequence.fromList(removedEdge.getAdjacentNodes()).getElement(1));
    for (int i = 0; i < ListSequence.fromList(nodePath).count() - 1; i++) {
      Node start = ListSequence.fromList(nodePath).getElement(i);
      Node end = ListSequence.fromList(nodePath).getElement(i + 1);
      Edge newEdge = start.addEdgeTo(end);
      ListSequence.fromList(newEdges).addElement(newEdge);
      List<Edge> tempPath = ListSequence.fromListAndArray(new ArrayList<Edge>(), newEdge);
      embeddedGraph.splitFace(ListSequence.fromList(facePath).getElement(i), tempPath, start, end);
    }
    embeddedGraph.setEdgesHistory(removedEdge, newEdges);
  }
}
