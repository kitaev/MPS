package sampleGraphs;

/*Generated by MPS */

import java.util.Random;
import jetbrains.mps.graphLayout.graph.Graph;
import java.util.List;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.SortedSetSequence;
import java.util.TreeSet;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.graphLayout.algorithms.ConnectivityComponents;

public class RandomGraphGenerator {
  private static Random rand = new Random();

  public static Graph generateNoLoops(int numNodes, int numEdges) {
    // Generate random directed graph with fixed number of nodes and edges. Multiedges are allowed. 
    Graph g = new Graph();
    for (int i = 0; i < numNodes; i++) {
      g.addNode();
    }
    for (int i = 0; i < numEdges; i++) {
      int s = 0;
      int t = 0;
      while (s == t) {
        s = RandomGraphGenerator.rand.nextInt(numNodes);
        t = RandomGraphGenerator.rand.nextInt(numNodes);
      }
      g.getNode(s).addEdgeTo(g.getNode(t));
    }
    return g;
  }

  public static Graph generateSimple(int numNodes, int numEdges) throws IllegalArgumentException {
    // Generate random simple directed graph with fixed number of nodes and edges. 
    Graph g = new Graph();
    for (int i = 0; i < numNodes; i++) {
      g.addNode();
    }
    List<Set<Integer>> connected = ListSequence.fromList(new ArrayList<Set<Integer>>());
    for (int i = 0; i < numNodes; i++) {
      ListSequence.fromList(connected).addElement(SortedSetSequence.fromSet(new TreeSet<Integer>()));
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(i)).addElement(i);
    }
    int maxIter = 1000;
    int countBad = 0;
    for (int i = 0; i < numEdges; i++) {
      int s = 0;
      int t = 0;
      int iter = 0;
      for (; iter < maxIter; iter++) {
        s = RandomGraphGenerator.rand.nextInt(numNodes);
        t = RandomGraphGenerator.rand.nextInt(numNodes);
        if (!(SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).contains(t))) {
          break;
        }
      }
      if (iter == maxIter) {
        countBad++;
        s = 0;
        while (s < numNodes && SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).count() == numNodes) {
          s++;
        }
        if (s == numNodes) {
          throw new IllegalArgumentException("too much edges!");
        }
        t = 0;
        while (SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).contains(t)) {
          t++;
        }
      }
      g.getNode(s).addEdgeTo(g.getNode(t));
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).addElement(t);
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(t)).addElement(s);
    }
    System.out.println("random failed " + countBad + " times!");
    return g;
  }

  public static Graph generateFixedNumLayers(int[] numInLayer, int numEdges) throws IllegalArgumentException {
    // generate simple layered graph with fixed number of vertices in each layer and fixed number of edges. 
    int n = 0;
    int[] firstVertice = new int[numInLayer.length + 1];
    for (int i = 0; i < numInLayer.length; i++) {
      firstVertice[i] = n;
      n += numInLayer[i];
    }
    firstVertice[numInLayer.length] = n;
    int[] layers = new int[n];
    for (int i = 0; i < numInLayer.length; i++) {
      for (int j = firstVertice[i]; j < firstVertice[i + 1]; j++) {
        layers[j] = i;
      }
    }
    Graph g = SimpleDirectedGraphs.emptyGraph(n);
    List<Set<Integer>> connected = ListSequence.fromList(new ArrayList<Set<Integer>>());
    for (int i = 0; i < n; i++) {
      ListSequence.fromList(connected).addElement(SortedSetSequence.fromSet(new TreeSet<Integer>()));
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(i)).addElement(i);
    }
    if (numInLayer.length == 1) {
      return g;
    }
    int numAddedEdges = 0;
    for (int i = firstVertice[1]; i < n; i++) {
      int source = firstVertice[layers[i] - 1] + RandomGraphGenerator.rand.nextInt(numInLayer[layers[i] - 1]);
      g.addEdgeByIndex(source, i);
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(source)).addElement(i);
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(i)).addElement(source);
      numAddedEdges++;
    }
    if (numAddedEdges > numEdges) {
      throw new IllegalArgumentException("not enought edges!");
    }
    int maxIter = 1000;
    int countBad = 0;
    for (int i = numAddedEdges; i < numEdges; i++) {
      int s = 0;
      int t = 0;
      int iter = 0;
      for (; iter < maxIter; iter++) {
        int a = RandomGraphGenerator.rand.nextInt(n);
        int b = RandomGraphGenerator.rand.nextInt(n);
        s = Math.min(a, b);
        t = Math.max(a, b);
        if (layers[s] != layers[t] && !(SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).contains(t))) {
          break;
        }
      }
      if (iter == maxIter) {
        countBad++;
        s = 0;
        while (s < n && SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).count() == n) {
          s++;
        }
        if (s == n) {
          throw new IllegalArgumentException("too much edges!");
        }
        t = s;
        while (t < n && (layers[t] == layers[s] || SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).contains(t))) {
          t++;
        }
        if (t == n) {
          throw new IllegalArgumentException("too much edges!");
        }
      }
      g.addEdgeByIndex(s, t);
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(s)).addElement(t);
      SetSequence.fromSet(ListSequence.fromList(connected).getElement(t)).addElement(s);
    }
    System.out.println("random failed " + countBad + " times!");
    return g;
  }

  public static Graph generateLayeredGraph(int numNodes, int numEdges) throws IllegalArgumentException {
    // generate simple layered graph with fixed number of vertices, random distribution of layers and fixed number of edges. 
    int numLayers = RandomGraphGenerator.rand.nextInt(numNodes) + 1;
    int[] numInLayer = new int[numLayers];
    int sum = 0;
    for (int i = 0; i < numLayers; i++) {
      numInLayer[i] = RandomGraphGenerator.rand.nextInt(numNodes) + 1;
      sum += numInLayer[i];
    }
    int rest = numNodes - numLayers;
    int cur = numNodes;
    for (int i = 0; i < numLayers; i++) {
      numInLayer[i] = 1 + (numInLayer[i] * rest) / sum;
      cur -= numInLayer[i];
    }
    // due to integer division there may be unassigned nodes 
    for (int i = 0; i < cur; i++) {
      numInLayer[i]++;
    }
    return generateFixedNumLayers(numInLayer, numEdges);
  }

  public static Graph generateSimpleConnectedGraph(int numNodes, int numEdges) {
    Graph graph = null;
    while (graph == null) {
      graph = generateSimple(numNodes, numEdges);
      if (!(ConnectivityComponents.isConnected(graph))) {
        graph = null;
      }
    }
    return graph;
  }
}
