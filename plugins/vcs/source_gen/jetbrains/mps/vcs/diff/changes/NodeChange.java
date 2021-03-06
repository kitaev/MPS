package jetbrains.mps.vcs.diff.changes;

/*Generated by MPS */

import jetbrains.mps.smodel.SNodeId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class NodeChange extends ModelChange {
  private SNodeId myAffectedNodeId;

  public NodeChange(@NotNull ChangeSet changeSet, @NotNull SNodeId affectedNodeId) {
    super(changeSet);
    myAffectedNodeId = affectedNodeId;
  }

  @NotNull
  public SNodeId getAffectedNodeId() {
    return myAffectedNodeId;
  }

  @Nullable
  @Override
  public SNodeId getRootId() {
    return getChangeSet().getOldModel().getNodeById(getAffectedNodeId()).getContainingRoot().getSNodeId();
  }

  @NotNull
  public ChangeType getType() {
    return ChangeType.CHANGE;
  }
}
