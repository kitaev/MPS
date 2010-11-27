package jetbrains.mps.graphLayout.graph;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public class Node implements INode {
  private List<Edge> myOutEdges;
  private List<Edge> myInEdges;
  private boolean myIsDummy;
  private int myIndex;
  private Graph myGraph;

  /*package*/ Node(Graph graph, int index, boolean isDummy) {
    myGraph = graph;
    myOutEdges = ListSequence.fromList(new LinkedList<Edge>());
    myInEdges = ListSequence.fromList(new LinkedList<Edge>());
    myIndex = index;
    myIsDummy = isDummy;
  }

  /*package*/ Edge addEdgeTo(Node target) {
    Edge edge = new Edge(this, target);
    this.addOutEdge(edge);
    if (target != this) {
      target.addInEdge(edge);
    }
    return edge;
  }

  public List<Edge> getOutEdges() {
    return myOutEdges;
  }

  public List<Edge> getInEdges() {
    return myInEdges;
  }

  public List<Edge> getEdges() {
    return getEdges(Edge.Direction.BOTH);
  }

  public List<Edge> getEdges(Edge.Direction dir) {
    if (dir == Edge.Direction.FRONT) {
      return getOutEdges();
    } else if (dir == Edge.Direction.BOTH) {
      return ListSequence.fromList(getOutEdges()).concat(ListSequence.fromList(getInEdges())).toListSequence();
    } else {
      return getInEdges();
    }
  }

  /*package*/ void addOutEdge(Edge edge) {
    ListSequence.fromList(myOutEdges).addElement(edge);
  }

  /*package*/ void addInEdge(Edge edge) {
    ListSequence.fromList(myInEdges).addElement(edge);
  }

  public int getIndex() {
    return this.myIndex;
  }

  public boolean isDummy() {
    return myIsDummy;
  }

  public Graph getGraph() {
    return myGraph;
  }

  @Override
  public String toString() {
    return Integer.toString(myIndex);
  }
}
