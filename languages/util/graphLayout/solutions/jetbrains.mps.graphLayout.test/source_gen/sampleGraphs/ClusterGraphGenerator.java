package sampleGraphs;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graph.ClusteredGraph;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.Iterator;

public class ClusterGraphGenerator extends AbstractGraphGenerator {
  private AbstractGraphGenerator myGraphGenerator;
  private int myNumClusters;

  public ClusterGraphGenerator(AbstractGraphGenerator graphGenerator) {
    super(0, 0, 0);
    myNumClusters = 3;
    myGraphGenerator = graphGenerator;
  }

  public void setNumClusters(int numClusters) {
    myNumClusters = numClusters;
  }

  protected ClusteredGraph generateGraph() {
    Graph graph = myGraphGenerator.generate();
    ClusteredGraph clusteredGraph = new ClusteredGraph();
    for (int i = 0; i < graph.getNumNodes(); i++) {
      clusteredGraph.createNode();
    }
    for (Edge edge : ListSequence.fromList(graph.getEdges())) {
      clusteredGraph.addEdgeByIndex(edge.getSource().getIndex(), edge.getTarget().getIndex());
    }
    Graph tree = clusteredGraph.getInclusionTree();
    Node root = tree.createNode();
    clusteredGraph.setRoot(root);
    int numClusters = myNumClusters;
    int numNodesInCluster = clusteredGraph.getNumNodes() / numClusters;
    Iterator<Node> nodeItr = ListSequence.fromList(clusteredGraph.getNodes()).iterator();
    for (int i = 0; i < numClusters; i++) {
      Node cluster = tree.createNode();
      tree.connect(root, cluster);
      for (int j = 0; j < numNodesInCluster; j++) {
        this.addLeafCluster(cluster, nodeItr, clusteredGraph);
      }
      if (i == numClusters - 1) {
        while (nodeItr.hasNext()) {
          this.addLeafCluster(cluster, nodeItr, clusteredGraph);
        }
      }
    }
    return clusteredGraph;
  }

  private void addLeafCluster(Node cluster, Iterator<Node> nodeItr, ClusteredGraph clusteredGraph) {
    Graph tree = clusteredGraph.getInclusionTree();
    Node leafCluster = tree.createNode();
    tree.connect(cluster, leafCluster);
    Node node = nodeItr.next();
    clusteredGraph.setNodeInCluster(leafCluster, node);
  }

  @Override
  public ClusteredGraph generate() throws IllegalArgumentException {
    return ((ClusteredGraph) super.generate());
  }

  @Override
  public int getNumNodes() {
    return myGraphGenerator.getNumNodes();
  }

  @Override
  public int getNumEdges() {
    return myGraphGenerator.getNumEdges();
  }
}
