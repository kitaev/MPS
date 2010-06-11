package jetbrains.mps.graphLayout.graph;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Edge {
  private Node mySource;
  private Node myTarget;

  public Edge(Node source, Node target) {
    mySource = source;
    myTarget = target;
  }

  public Node getSource() {
    return this.mySource;
  }

  public Node getTarget() {
    return this.myTarget;
  }

  public void removeFromGraph() {
    ListSequence.fromList(mySource.getOutEdges()).removeElement(this);
  }
}
