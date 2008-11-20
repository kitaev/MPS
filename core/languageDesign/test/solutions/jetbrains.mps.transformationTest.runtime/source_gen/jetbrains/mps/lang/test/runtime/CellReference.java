package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public class CellReference {

  private SNode myNode;
  private String myId;

  public CellReference(SNode node, String id) {
    this.myNode = node;
    this.myId = id;
  }

  public SNode getNode() {
    return this.myNode;
  }

  public String getID() {
    return this.myId;
  }

}
