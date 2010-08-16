package jetbrains.mps.graphLayout.planarization;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.Iterator;

public abstract class PQNode {
  public static final int INF = 1000000;

  protected List<PQNode> myChildren;
  private PQNode myParent;
  private PQNode.State myState;
  private int myNumFullLeaves;

  public PQNode() {
    myChildren = ListSequence.fromList(new LinkedList<PQNode>());
    myState = null;
    myParent = null;
  }

  /**
   * A spesial procedure for pertinent root. It merges all full leaves to one p-node and makes new biconnected
   * component created by reduction correct.
   * 
   * @param children new children of ppertinent root generated by reduction step
   */
  public abstract PQNode processAsPertinentRoot(List<PQNode> children, Node nextGraphNode);

  public abstract PQNode makeReduction(boolean isRealPertinentRoot);

  public abstract int getAValue();

  public void computeAValue() {
    for (PQNode child : ListSequence.fromList(getChildren())) {
      child.computeAValue();
    }
  }

  public abstract void makeADeletion();

  public abstract int getHValue();

  public void computeHValue() {
    for (PQNode child : ListSequence.fromList(getChildren())) {
      child.computeHValue();
    }
  }

  public abstract void makeHDeletion();

  public void setState(PQNode.State state) {
    myState = state;
  }

  public PQNode.State getState() {
    return myState;
  }

  public List<PQNode> getChildren() {
    return myChildren;
  }

  public EdgesOrder getEdgesOrder() {
    return null;
  }

  public Node getGraphNode() {
    return null;
  }

  public void addLastChild(PQNode child) {
    ListSequence.fromList(myChildren).addElement(child);
    child.setParent(this);
  }

  public void addFirstChild(PQNode child) {
    ListSequence.fromList(myChildren).insertElement(0, child);
    child.setParent(this);
  }

  public PQNode getParent() {
    return this.myParent;
  }

  public void setParent(PQNode parent) {
    this.myParent = parent;
  }

  public void collectEdgesOrderInSubtree(EdgesOrder order) {
  }

  public String getGraphInfo(String prefix) {
    return prefix;
  }

  public String toString(int offset) {
    StringBuilder builder = new StringBuilder();
    String spaces = "";
    for (int i = 0; i < offset; i++) {
      spaces += " ";
    }
    builder.append(spaces + "node " + getType() + " state = " + getState() + "\n");
    builder.append(getGraphInfo(spaces) + "\n");
    if (ListSequence.fromList(getChildren()).count() > 0) {
      builder.append(spaces + "children: \n");
      for (PQNode child : ListSequence.fromList(getChildren())) {
        builder.append(child.toString(offset + 2));
      }
    }
    return builder.toString();
  }

  public void addGraphNode(Node node) {
  }

  public abstract String getType();

  public int getNumFullLeaves() {
    return this.myNumFullLeaves;
  }

  public void setNumFullLeaves(int numFullLeaves) {
    this.myNumFullLeaves = numFullLeaves;
  }

  public boolean isLeaf() {
    return ListSequence.fromList(getChildren()).count() == 0;
  }

  protected PQNode makeEmpty() {
    if (getState() == PQNode.State.EMPTY) {
      return this;
    }
    if (ListSequence.fromList(getChildren()).count() == 0) {
      if (getState() == PQNode.State.FULL) {
        return null;
      } else {
        return this;
      }
    } else {
      Iterator<PQNode> childItr = ListSequence.fromList(getChildren()).iterator();
      while (childItr.hasNext()) {
        if (childItr.next().makeEmpty() == null) {
          childItr.remove();
        }
      }
      setState(PQNode.State.EMPTY);
      if (ListSequence.fromList(getChildren()).count() == 0) {
        return null;
      } else {
        return this;
      }
    }
  }

  public static   enum State {
    FULL(),
    PARTIAL(),
    EMPTY();

    State() {
    }
  }
}
