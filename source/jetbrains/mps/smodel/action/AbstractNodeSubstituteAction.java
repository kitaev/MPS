package jetbrains.mps.smodel.action;

import jetbrains.mps.nodeEditor.AbstractNodeSubstituteItem;
import jetbrains.mps.smodel.SNode;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: May 5, 2006
 * Time: 7:41:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractNodeSubstituteAction extends AbstractNodeSubstituteItem implements INodeSubstituteAction {
  private SNode mySourceNode;
  private SNode myParameterNode;

  protected AbstractNodeSubstituteAction(SNode parameterNode, SNode sourceNode) {
    mySourceNode = sourceNode;
    myParameterNode = parameterNode;
  }

  public SNode getSourceNode() {
    return mySourceNode;
  }

  public SNode getParameterNode() {
    return myParameterNode;
  }
}
