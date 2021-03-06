package jetbrains.mps.vcs.diff.oldchanges;

/*Generated by MPS */

import jetbrains.mps.smodel.SNodeId;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.DeletedNodeMessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;

@Deprecated
public class DeleteNodeChange extends OldChange {
  private SNodeId myNodeId;
  private List<SNodeId> myChildren;
  private SNodeId myParentId = null;
  private String myRole = null;
  private int myNextChildIndex = -1;

  @Deprecated
  public DeleteNodeChange(SNodeId nodeId, List<SNodeId> childrenIds) {
    myNodeId = nodeId;
    myChildren = childrenIds;
  }

  @Deprecated
  public DeleteNodeChange(SNodeId nodeId, List<SNodeId> children, SNodeId parentId, String role, int nextChildIndex) {
    myNodeId = nodeId;
    myChildren = children;
    myParentId = parentId;
    myRole = role;
    myNextChildIndex = nextChildIndex;
  }

  @Override
  public boolean isSameChange(OldChange c) {
    if (this == c) {
      return true;
    }
    if (c == null || getClass() != c.getClass()) {
      return false;
    }
    DeleteNodeChange that = (DeleteNodeChange) c;
    if ((myChildren != null ?
      !(myChildren.equals(that.myChildren)) :
      that.myChildren != null
    )) {
      return false;
    }
    if ((myNodeId != null ?
      !(myNodeId.equals(that.myNodeId)) :
      that.myNodeId != null
    )) {
      return false;
    }
    return true;
  }

  public String toString() {
    if (myRole == null) {
      return "delete " + myNodeId;
    } else {
      return "delete " + myNodeId + " in role " + myRole + " (next child index is " + myNextChildIndex + ")";
    }
  }

  public SNodeId getAffectedNodeId() {
    return myNodeId;
  }

  public boolean apply(SModel m) {
    SNode node = m.getNodeById(getAffectedNodeId());
    if (node != null) {
      node.delete();
    }
    return true;
  }

  @Override
  public OldChangeType getChangeType() {
    return OldChangeType.DELETE;
  }

  @Override
  public List<SNodeId> getDependencies() {
    return myChildren;
  }

  public List<SNodeId> getChildren() {
    return myChildren;
  }

  public SNodeId getParentId() {
    return myParentId;
  }

  public String getRole() {
    return myRole;
  }

  public int getNextChildIndex() {
    return myNextChildIndex;
  }

  @Override
  public MessageTarget getMessageTarget() {
    if (myRole != null) {
      return new DeletedNodeMessageTarget(myRole, myNextChildIndex);
    } else {
      return new NodeMessageTarget();
    }
  }

  @Override
  public Object getChangeKey() {
    return myNodeId;
  }
}
