package jetbrains.mps.debug;

/*Generated by MPS */

import org.jdom.Element;

public class VarInfo {
  private static String VAR_NAME = "varName";
  private static String NODE_ID = "nodeId";

  private String myVarName;
  private String myNodeId;

  public VarInfo() {
  }

  public VarInfo(Element element) {
    this.myNodeId = element.getAttribute(NODE_ID).getValue();
    this.myVarName = element.getAttribute(VAR_NAME).getValue();
  }

  public String getNodeId() {
    return this.myNodeId;
  }

  public String getVarName() {
    return this.myVarName;
  }

  public void setVarName(String varName) {
    this.myVarName = varName;
  }

  public void setNodeId(String nodeId) {
    this.myNodeId = nodeId;
  }

  public void saveTo(Element element) {
    element.setAttribute(NODE_ID, this.myNodeId);
    element.setAttribute(VAR_NAME, this.myVarName);
  }
}
