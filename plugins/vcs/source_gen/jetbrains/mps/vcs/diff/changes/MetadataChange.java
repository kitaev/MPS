package jetbrains.mps.vcs.diff.changes;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNodeId;

public abstract class MetadataChange extends ModelChange {
  protected MetadataChange(@NotNull ChangeSet changeSet) {
    super(changeSet);
  }

  @Nullable
  @Override
  public final SNodeId getRootId() {
    return null;
  }
}
