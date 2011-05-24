package jetbrains.mps.vcs.diff.merge;

/*Generated by MPS */

import jetbrains.mps.vcs.diff.changes.ChangeSet;
import java.util.Map;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.SModel;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.vcs.diff.changes.NodeCopier;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class MergeContext {
  private ChangeSet myMineChangeSet;
  private ChangeSet myRepositoryChangeSet;
  private Map<ModelChange, List<ModelChange>> myConflictingChanges = MapSequence.fromMap(new HashMap<ModelChange, List<ModelChange>>());
  private Map<ModelChange, List<ModelChange>> mySymmetricChanges = MapSequence.fromMap(new HashMap<ModelChange, List<ModelChange>>());
  private Map<SNodeId, List<ModelChange>> myRootToChanges = MapSequence.fromMap(new HashMap<SNodeId, List<ModelChange>>());
  private SModel myResultModel;
  private Set<ModelChange> myAppliedChanges = SetSequence.fromSet(new HashSet<ModelChange>());
  private Set<ModelChange> myExcludedChanges = SetSequence.fromSet(new HashSet<ModelChange>());
  private NodeCopier myNodeCopier;

  public MergeContext(final SModel base, final SModel mine, final SModel repository) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        MergeConflictsBuilder conflictsBuilder = new MergeConflictsBuilder(base, mine, repository);
        myMineChangeSet = conflictsBuilder.myMineChangeSet;
        myRepositoryChangeSet = conflictsBuilder.myRepositoryChangeSet;
        myConflictingChanges = conflictsBuilder.myConflictingChanges;
        mySymmetricChanges = conflictsBuilder.mySymmetricChanges;
        fillRootToChangesMap();

        myResultModel = CopyUtil.copyModel(base);
        myNodeCopier = new NodeCopier(myResultModel);
      }
    });
  }

  private void fillRootToChangesMap() {
    for (ModelChange change : Sequence.fromIterable(getAllChanges())) {
      SNodeId rootId = change.getRootId();
      if (MapSequence.fromMap(myRootToChanges).get(rootId) == null) {
        MapSequence.fromMap(myRootToChanges).put(rootId, ListSequence.fromList(new ArrayList<ModelChange>()));
      }
      ListSequence.fromList(MapSequence.fromMap(myRootToChanges).get(rootId)).addElement(change);
    }
  }

  public void applyAllNonConflictingChanges(@Nullable final SNodeId rootId) {
    applyChanges(Sequence.fromIterable(getAllChanges()).where(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange c) {
        return eq_358wfv_a0a0a0a0a0a0a0b(c.getRootId(), rootId) && Sequence.fromIterable(getConflictedWith(c)).isEmpty();
      }
    }));
  }

  public void applyAllChangesForNonConflictingRoots() {
    for (SNodeId root : SetSequence.fromSet(MapSequence.fromMap(myRootToChanges).keySet())) {
      if (!(ListSequence.fromList(MapSequence.fromMap(myRootToChanges).get(root)).any(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange ch) {
          return !(isChangeResolved(ch)) && Sequence.fromIterable(getConflictedWith(ch)).isNotEmpty();
        }
      }))) {
        applyAllNonConflictingChanges(root);
      }
    }
  }

  public Iterable<ModelChange> getAllChanges() {
    return ListSequence.fromList(myMineChangeSet.getModelChanges()).concat(ListSequence.fromList(myRepositoryChangeSet.getModelChanges()));
  }

  public Set<SNodeId> getAffectedRoots() {
    return MapSequence.fromMap(myRootToChanges).keySet();
  }

  public List<ModelChange> getChangesForRoot(SNodeId rootId) {
    return MapSequence.fromMap(myRootToChanges).get(rootId);
  }

  public Iterable<ModelChange> getConflictedWith(ModelChange change) {
    return ListSequence.fromList(MapSequence.fromMap(myConflictingChanges).get(change)).where(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange other) {
        return !(SetSequence.fromSet(myExcludedChanges).contains(other));
      }
    });
  }

  public boolean isChangeResolved(ModelChange change) {
    return SetSequence.fromSet(myExcludedChanges).contains(change) || SetSequence.fromSet(myAppliedChanges).contains(change);
  }

  public void applyChanges(Iterable<ModelChange> changes) {
    applyChangesNoRestoreIds(changes);
    myNodeCopier.restoreIds(false);
  }

  public void excludeChanges(Iterable<ModelChange> changes) {
    excludeChangesNoRestoreIds(changes);
    myNodeCopier.restoreIds(false);
  }

  private void applyChangesNoRestoreIds(Iterable<ModelChange> changes) {
    for (ModelChange c : Sequence.fromIterable(changes)) {
      applyChange(c);
    }
  }

  private void excludeChangesNoRestoreIds(Iterable<ModelChange> changes) {
    for (ModelChange c : Sequence.fromIterable(changes)) {
      excludeChange(c);
    }
  }

  private void applyChange(ModelChange change) {
    if (isChangeResolved(change)) {
    } else {
      change.apply(myResultModel, myNodeCopier);
      SetSequence.fromSet(myAppliedChanges).addElement(change);
      for (ModelChange symmetric : ListSequence.fromList(MapSequence.fromMap(mySymmetricChanges).get(change))) {
        assert !(SetSequence.fromSet(myAppliedChanges).contains(symmetric));
        SetSequence.fromSet(myExcludedChanges).addElement(symmetric);
      }
      excludeChangesNoRestoreIds(getConflictedWith(change));
    }
  }

  private void excludeChange(ModelChange change) {
    if (isChangeResolved(change)) {
    } else {
      SetSequence.fromSet(myExcludedChanges).addElement(change);
      for (ModelChange symmetric : ListSequence.fromList(MapSequence.fromMap(mySymmetricChanges).get(change))) {
        assert !(SetSequence.fromSet(myAppliedChanges).contains(symmetric));
        SetSequence.fromSet(myExcludedChanges).addElement(symmetric);
      }
      applyChangesNoRestoreIds(Sequence.fromIterable(getConflictedWith(change)).where(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange c) {
          return Sequence.fromIterable(getConflictedWith(c)).isEmpty();
        }
      }));
    }
  }

  public boolean hasIdsToRestore() {
    return myNodeCopier.hasIdsToRestore();
  }

  public SModel getResultModel() {
    return myResultModel;
  }

  public SModel getBaseModel() {
    return myMineChangeSet.getOldModel();
  }

  public SModel getMyModel() {
    return myMineChangeSet.getNewModel();
  }

  public SModel getRepositoryModel() {
    return myRepositoryChangeSet.getNewModel();
  }

  public ChangeSet getMyChangeSet() {
    return myMineChangeSet;
  }

  public ChangeSet getRepositoryChangeSet() {
    return myRepositoryChangeSet;
  }

  public boolean isMyChange(ModelChange change) {
    return change.getChangeSet() == myMineChangeSet;
  }

  public MergeContextState getCurrentState() {
    return new MergeContextState(myResultModel, myAppliedChanges, myExcludedChanges, myNodeCopier.getState());
  }

  public void restoreState(MergeContextState state) {
    MergeContextState stateCopy = new MergeContextState(state);
    myResultModel = stateCopy.myResultModel;
    myAppliedChanges = stateCopy.myAppliedChanges;
    myExcludedChanges = stateCopy.myExcludedChanges;
    myNodeCopier.setState(stateCopy.myIdReplacementCache, myResultModel);
  }

  private static boolean eq_358wfv_a0a0a0a0a0a0a0b(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
