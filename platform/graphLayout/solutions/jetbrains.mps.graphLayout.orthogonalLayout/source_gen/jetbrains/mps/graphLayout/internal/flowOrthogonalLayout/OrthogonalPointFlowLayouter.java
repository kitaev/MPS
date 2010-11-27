package jetbrains.mps.graphLayout.internal.flowOrthogonalLayout;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graphLayout.IPointLayouter;
import jetbrains.mps.graphLayout.graphLayout.GraphPointLayout;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.EdgesHistoryManager;
import jetbrains.mps.graphLayout.algorithms.BiconnectAugmentation;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarization.ShortestPathEmbeddingFinder;
import jetbrains.mps.graphLayout.planarization.PQPlanarizationFinder;
import java.util.List;
import jetbrains.mps.graphLayout.intGeom2D.Point;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.planarGraph.Dart;
import jetbrains.mps.graphLayout.flowOrthogonalLayout.QuasiOrthogonalRepresentation;
import jetbrains.mps.graphLayout.flowOrthogonalLayout.QuasiRepresentationModifier;
import jetbrains.mps.graphLayout.flowOrthogonalLayout.OrthogonalRepresentation;
import jetbrains.mps.graphLayout.util.Direction2D;
import jetbrains.mps.graphLayout.flowOrthogonalLayout.EmbeddedGraphModifier;
import jetbrains.mps.graphLayout.planarGraph.Face;

public class OrthogonalPointFlowLayouter implements IPointLayouter {
  private static int UNIT_LENGHT = 1;
  private static int SHOW_lOG = 0;
  private static int SHOW_TIME = 0;
  private static int MILLIS = 1000;

  private double curTime;

  public OrthogonalPointFlowLayouter() {
  }

  public GraphPointLayout doLayout(Graph graph) {
    double time = System.currentTimeMillis();
    curTime = time;
    if (OrthogonalPointFlowLayouter.SHOW_TIME > 0) {
      System.out.println("creating layout for graph with " + ListSequence.fromList(graph.getNodes()).count() + " nodes and " + ListSequence.fromList(graph.getEdges()).count() + " edges...");
    }
    Graph copy = new Graph();
    Map<Node, Node> nodeMap = MapSequence.fromMap(new HashMap<Node, Node>());
    Map<Edge, Edge> edgeMap = MapSequence.fromMap(new HashMap<Edge, Edge>());
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      MapSequence.fromMap(nodeMap).put(node, copy.createNode());
    }
    for (Edge edge : ListSequence.fromList(graph.getEdges())) {
      MapSequence.fromMap(edgeMap).put(edge, copy.connect(MapSequence.fromMap(nodeMap).get(edge.getSource()), MapSequence.fromMap(nodeMap).get(edge.getTarget())));
    }
    EdgesHistoryManager historyManager = new EdgesHistoryManager(copy);
    BiconnectAugmentation.smartMakeBiconnected(copy);
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new PQPlanarizationFinder()).find(copy);
    Map<Edge, List<Edge>> history = MapSequence.fromMap(new HashMap<Edge, List<Edge>>());
    for (Edge edge : ListSequence.fromList(graph.getEdges())) {
      Edge copyEdge = MapSequence.fromMap(edgeMap).get(edge);
      MapSequence.fromMap(history).put(edge, historyManager.getHistory(copyEdge));
      // if copyEdge has been reverted during st-numbering in planarization step 
      if (copyEdge.getSource() != MapSequence.fromMap(nodeMap).get(edge.getSource())) {
        MapSequence.fromMap(history).put(edge, ListSequence.fromList(MapSequence.fromMap(history).get(edge)).reversedList());
      }
    }
    if (OrthogonalPointFlowLayouter.SHOW_TIME > 0) {
      long newTime = System.currentTimeMillis();
      System.out.println("finding the embedding: " + ((newTime - curTime) / OrthogonalPointFlowLayouter.MILLIS));
      System.out.println("graph now has " + ListSequence.fromList(copy.getNodes()).count() + " nodes and " + ListSequence.fromList(copy.getEdges()).count() + " edges");
      curTime = newTime;
    }
    GraphPointLayout copyLayout = getFlowLayout(embeddedGraph, historyManager);
    GraphPointLayout graphLayout = new GraphPointLayout(graph);
    for (Node node : ListSequence.fromList(graph.getNodes())) {
      graphLayout.setLayoutFor(node, copyLayout.getLayoutFor(MapSequence.fromMap(nodeMap).get(node)));
    }
    for (Edge graphEdge : ListSequence.fromList(graph.getEdges())) {
      List<Point> edgeLayout = ListSequence.fromList(new ArrayList<Point>());
      List<Edge> edgeHistory = MapSequence.fromMap(history).get(graphEdge);
      Node cur = MapSequence.fromMap(nodeMap).get(graphEdge.getSource());
      for (Edge edge : ListSequence.fromList(edgeHistory)) {
        if (cur == edge.getSource()) {
          ListSequence.fromList(edgeLayout).addSequence(ListSequence.fromList(copyLayout.getLayoutFor(edge)));
        } else {
          ListSequence.fromList(edgeLayout).addSequence(ListSequence.fromList(copyLayout.getLayoutFor(edge)).reversedList());
        }
        cur = edge.getOpposite(cur);
      }
      graphLayout.setLayoutFor(graphEdge, edgeLayout);
    }
    if (OrthogonalPointFlowLayouter.SHOW_TIME > 0) {
      long newTime = System.currentTimeMillis();
      System.out.println("all: " + ((newTime - time) / OrthogonalPointFlowLayouter.MILLIS));
    }
    return graphLayout;
  }

  public GraphPointLayout getFlowLayout(EmbeddedGraph embeddedGraph, EdgesHistoryManager historyManager) {
    Graph graph = embeddedGraph.getGraph();
    List<Edge> oldEdges = ListSequence.fromList(new ArrayList<Edge>());
    ListSequence.fromList(oldEdges).addSequence(ListSequence.fromList(graph.getEdges()));
    List<Node> oldNodes = ListSequence.fromList(new ArrayList<Node>());
    ListSequence.fromList(oldNodes).addSequence(ListSequence.fromList(graph.getNodes()));
    Map<Dart, Integer> bends = MapSequence.fromMap(new HashMap<Dart, Integer>());
    Map<Dart, Integer> angles = MapSequence.fromMap(new HashMap<Dart, Integer>());
    QuasiOrthogonalRepresentation.getRepresentation(embeddedGraph, bends, angles);
    if (OrthogonalPointFlowLayouter.SHOW_lOG > 0) {
      System.out.println("bends:");
      System.out.println(bends);
    }
    if (OrthogonalPointFlowLayouter.SHOW_TIME > 0) {
      long newTime = System.currentTimeMillis();
      System.out.println("finding the representation: " + ((newTime - curTime) / OrthogonalPointFlowLayouter.MILLIS));
      curTime = newTime;
    }
    new QuasiRepresentationModifier(embeddedGraph, bends, angles).reduceToOrthogonalRepresentation();
    OrthogonalRepresentation.replaceBendsByNodes(embeddedGraph, bends, angles);
    Map<Dart, Direction2D> directions = OrthogonalRepresentation.getDirections(embeddedGraph, angles);
    EmbeddedGraphModifier modifier = new EmbeddedGraphModifier(embeddedGraph);
    modifier.setDartDirections(directions);
    modifier.makeRectangularFaces();
    if (OrthogonalPointFlowLayouter.SHOW_lOG > 0) {
      System.out.println("after making faces rectangular: ");
      printEmbeddedGraphWithDirections(embeddedGraph, directions);
    }
    if (OrthogonalPointFlowLayouter.SHOW_TIME > 0) {
      long newTime = System.currentTimeMillis();
      System.out.println("making faces rectangular: " + ((newTime - curTime) / OrthogonalPointFlowLayouter.MILLIS));
      System.out.println("graph now has " + ListSequence.fromList(graph.getNodes()).count() + " nodes and " + ListSequence.fromList(graph.getEdges()).count() + " edges");
      curTime = newTime;
    }
    Map<Edge, Integer> lengths = new EdgeLengthComputer().compute(embeddedGraph, directions);
    Map<Node, Point> coordinates;
    /*
      CoordinatePlacer placer = new CoordinatePlacer(embeddedGraph, lengths, directions);
      coordinates = placer.getCoordinates();
    */
    ConstraintsGraphProcessor processor = new ConstraintsGraphProcessor(embeddedGraph, directions);
    processor.constructGraph();
    coordinates = processor.getCoordinates();
    GraphPointLayout graphLayout = new GraphPointLayout(graph);
    for (Node node : ListSequence.fromList(oldNodes)) {
      graphLayout.setLayoutFor(node, MapSequence.fromMap(coordinates).get(node));
    }
    for (Edge edge : ListSequence.fromList(oldEdges)) {
      List<Edge> history = historyManager.getHistory(edge);
      List<Point> edgeLayout = ListSequence.fromList(new ArrayList<Point>());
      Node cur = edge.getSource();
      ListSequence.fromList(edgeLayout).addElement(MapSequence.fromMap(coordinates).get(cur));
      for (Edge historyEdge : ListSequence.fromList(history)) {
        Node next = historyEdge.getOpposite(cur);
        ListSequence.fromList(edgeLayout).addElement(MapSequence.fromMap(coordinates).get(next));
        cur = next;
      }
      graphLayout.setLayoutFor(edge, edgeLayout);
    }
    if (OrthogonalPointFlowLayouter.SHOW_TIME > 0) {
      long newTime = System.currentTimeMillis();
      System.out.println("finding layout: " + ((newTime - curTime) / OrthogonalPointFlowLayouter.MILLIS));
      curTime = newTime;
    }
    return graphLayout;
  }

  private void printEmbeddedGraphWithDirections(EmbeddedGraph embeddedGraph, Map<Dart, Direction2D> directions) {
    for (Face face : ListSequence.fromList(embeddedGraph.getFaces())) {
      System.out.println("face: ");
      if (embeddedGraph.isOuterFace(face)) {
        System.out.println("outer!");
      }
      for (Dart dart : ListSequence.fromList(face.getDarts())) {
        System.out.print(dart + " dir = " + MapSequence.fromMap(directions).get(dart) + "; ");
      }
      System.out.println();
    }
  }
}
