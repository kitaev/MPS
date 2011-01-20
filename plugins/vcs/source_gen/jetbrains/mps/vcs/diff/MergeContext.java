package jetbrains.mps.vcs.diff;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.diff.changes.ChangeSet;
import java.util.Map;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.vcs.diff.changes.ChangeSetBuilder;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.vcs.diff.changes.DeleteRootChange;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vcs.diff.changes.AddRootChange;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.vcs.diff.changes.NodeGroupChange;
import jetbrains.mps.vcs.diff.changes.NodeChange;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.vcs.diff.changes.SetPropertyChange;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.vcs.diff.changes.SetReferenceChange;
import jetbrains.mps.smodel.CopyUtil;
import java.util.ArrayList;

public class MergeContext {
  private SModel myBaseModel;
  private SModel myMyModel;
  private SModel myRepositoryModel;
  private SModel myResultModel;
  private ChangeSet myMineChangeSet;
  private ChangeSet myRepositoryChangeSet;
  private Map<ModelChange, List<ModelChange>> myConflictingChanges = MapSequence.fromMap(new HashMap<ModelChange, List<ModelChange>>());
  private Map<ModelChange, List<ModelChange>> mySymmetricChanges = MapSequence.fromMap(new HashMap<ModelChange, List<ModelChange>>());
  private Set<ModelChange> myAppliedChanges = SetSequence.fromSet(new HashSet<ModelChange>());
  private Set<ModelChange> myExcludedChanges = SetSequence.fromSet(new HashSet<ModelChange>());

  public MergeContext(final SModel base, final SModel mine, final SModel repository) {
    myBaseModel = base;
    myMyModel = mine;
    myRepositoryModel = repository;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myMineChangeSet = ChangeSetBuilder.buildChangeSet(base, mine);
        myRepositoryChangeSet = ChangeSetBuilder.buildChangeSet(base, repository);
      }
    });
  }

  private void addConflict(ModelChange a, ModelChange b) {
    addChangeLink(myConflictingChanges, a, b);
  }

  private void addSymmetric(ModelChange a, ModelChange b) {
    addChangeLink(mySymmetricChanges, a, b);
  }

  private Map<SNodeId, DeleteRootChange> arrangeDeleteRootChanges(ChangeSet changeSet) {
    final Map<SNodeId, DeleteRootChange> deleteRootChanges = MapSequence.fromMap(new HashMap<SNodeId, DeleteRootChange>());
    Sequence.fromIterable(changeSet.getModelChanges(DeleteRootChange.class)).visitAll(new IVisitor<DeleteRootChange>() {
      public void visit(DeleteRootChange d) {
        MapSequence.fromMap(deleteRootChanges).put(d.getNodeId(), d);
      }
    });
    return deleteRootChanges;
  }

  private Map<SNodeId, AddRootChange> arrangeAddRootChanges(ChangeSet changeSet) {
    final Map<SNodeId, AddRootChange> addRootChanges = MapSequence.fromMap(new HashMap<SNodeId, AddRootChange>());
    Sequence.fromIterable(changeSet.getModelChanges(AddRootChange.class)).visitAll(new IVisitor<AddRootChange>() {
      public void visit(AddRootChange a) {
        MapSequence.fromMap(addRootChanges).put(a.getNodeId(), a);
      }
    });
    return addRootChanges;
  }

  private void collectGroupChangesWithOthersConflicts(Map<Tuples._2<SNodeId, String>, List<NodeGroupChange>> arrangedChanges, ChangeSet thisChangeSet, ChangeSet otherChangeSet) {
    Map<SNodeId, DeleteRootChange> deleteRootChanges = arrangeDeleteRootChanges(thisChangeSet);
    for (NodeChange change : Sequence.fromIterable(otherChangeSet.getModelChanges(NodeChange.class))) {
      if (!(MapSequence.fromMap(myConflictingChanges).containsKey(change))) {
        SNode node = myBaseModel.getNodeById(change.getAffectedNodeId());
        while (node != null) {
          SNodeId nodeId = node.getSNodeId();
          if (SNodeOperations.getParent(node) == null) {
            DeleteRootChange conflicting = MapSequence.fromMap(deleteRootChanges).get(nodeId);
            if (conflicting != null) {
              addConflict(change, conflicting);
            }
          } else {
            Tuples._2<SNodeId, String> nodeRole = MultiTuple.<SNodeId,String>from(SNodeOperations.getParent(node).getSNodeId(), SNodeOperations.getContainingLinkRole(node));
            final int index = SNodeOperations.getIndexInParent(node);
            NodeGroupChange conflicting = ListSequence.fromList(MapSequence.fromMap(arrangedChanges).get(nodeRole)).findFirst(new IWhereFilter<NodeGroupChange>() {
              public boolean accept(NodeGroupChange ch) {
                return ch.getBegin() <= index && index < ch.getEnd();
              }
            });
            if (conflicting != null) {
              addConflict(change, conflicting);
              break;
            }
          }
          node = SNodeOperations.getParent(node);
        }
      }
    }
  }

  private Map<Tuples._2<SNodeId, String>, SetPropertyChange> arrangePropertyChanges(ChangeSet changeSet) {
    Map<Tuples._2<SNodeId, String>, SetPropertyChange> propertyChangesMap = MapSequence.fromMap(new HashMap<Tuples._2<SNodeId, String>, SetPropertyChange>());
    for (SetPropertyChange spc : Sequence.fromIterable(changeSet.getModelChanges(SetPropertyChange.class))) {
      MapSequence.fromMap(propertyChangesMap).put(MultiTuple.<SNodeId,String>from(spc.getAffectedNodeId(), spc.getPropertyName()), spc);
    }
    return propertyChangesMap;
  }

  private void collectPropertyConflicts() {
    Map<Tuples._2<SNodeId, String>, SetPropertyChange> minePropertyChanges = arrangePropertyChanges(myMineChangeSet);
    Map<Tuples._2<SNodeId, String>, SetPropertyChange> repositoryPropertyChanges = arrangePropertyChanges(myRepositoryChangeSet);
    for (Tuples._2<SNodeId, String> nodeName : SetSequence.fromSet(MapSequence.fromMap(minePropertyChanges).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(repositoryPropertyChanges).keySet()))) {
      SetPropertyChange mineChange = MapSequence.fromMap(minePropertyChanges).get(nodeName);
      SetPropertyChange repositoryChange = MapSequence.fromMap(repositoryPropertyChanges).get(nodeName);
      if (ObjectUtils.equals(mineChange.getNewValue(), repositoryChange.getNewValue())) {
        addSymmetric(mineChange, repositoryChange);
      } else {
        addConflict(mineChange, repositoryChange);
      }
    }
  }

  private Map<Tuples._2<SNodeId, String>, SetReferenceChange> arrangeReferenceChanges(ChangeSet changeSet) {
    Map<Tuples._2<SNodeId, String>, SetReferenceChange> referenceChangesMap = MapSequence.fromMap(new HashMap<Tuples._2<SNodeId, String>, SetReferenceChange>());
    for (SetReferenceChange spc : Sequence.fromIterable(changeSet.getModelChanges(SetReferenceChange.class))) {
      MapSequence.fromMap(referenceChangesMap).put(MultiTuple.<SNodeId,String>from(spc.getAffectedNodeId(), spc.getRole()), spc);
    }
    return referenceChangesMap;
  }

  private void collectReferenceConflicts() {
    Map<Tuples._2<SNodeId, String>, SetReferenceChange> mineReferenceChanges = arrangeReferenceChanges(myMineChangeSet);
    Map<Tuples._2<SNodeId, String>, SetReferenceChange> repositoryReferenceChanges = arrangeReferenceChanges(myRepositoryChangeSet);
    for (Tuples._2<SNodeId, String> nodeName : SetSequence.fromSet(MapSequence.fromMap(mineReferenceChanges).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(repositoryReferenceChanges).keySet()))) {
      SetReferenceChange mineChange = MapSequence.fromMap(mineReferenceChanges).get(nodeName);
      SetReferenceChange repositoryChange = MapSequence.fromMap(repositoryReferenceChanges).get(nodeName);
      if (ObjectUtils.equals(mineChange.getTargetNodeId(), repositoryChange.getTargetNodeId()) && ObjectUtils.equals(mineChange.getTargetModelReference(), repositoryChange.getTargetModelReference()) && ObjectUtils.equals(mineChange.getResolveInfo(), repositoryChange.getResolveInfo())) {
        addSymmetric(mineChange, repositoryChange);
      } else {
        addConflict(mineChange, repositoryChange);
      }
    }
  }

  private void collectSymmetricRootDeletes() {
    Map<SNodeId, DeleteRootChange> mineDeleteRootChanges = arrangeDeleteRootChanges(myMineChangeSet);
    Map<SNodeId, DeleteRootChange> repositoryDeleteRootChanges = arrangeDeleteRootChanges(myRepositoryChangeSet);
    for (SNodeId deletedRoot : SetSequence.fromSet(MapSequence.fromMap(mineDeleteRootChanges).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(repositoryDeleteRootChanges).keySet()))) {
      addSymmetric(MapSequence.fromMap(mineDeleteRootChanges).get(deletedRoot), MapSequence.fromMap(repositoryDeleteRootChanges).get(deletedRoot));
    }
  }

  private void collectConflictingRootAdds() {
    Map<SNodeId, AddRootChange> mineAddRootChanges = arrangeAddRootChanges(myMineChangeSet);
    Map<SNodeId, AddRootChange> repositoryAddRootChanges = arrangeAddRootChanges(myRepositoryChangeSet);
    for (SNodeId addedRoot : SetSequence.fromSet(MapSequence.fromMap(mineAddRootChanges).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(repositoryAddRootChanges).keySet()))) {
      addConflict(MapSequence.fromMap(mineAddRootChanges).get(addedRoot), MapSequence.fromMap(repositoryAddRootChanges).get(addedRoot));
    }
  }

  private void collectConflicts() {
    Map<Tuples._2<SNodeId, String>, List<NodeGroupChange>> mineGroupChanges = arrangeNodeGroupChanges(myMineChangeSet);
    Map<Tuples._2<SNodeId, String>, List<NodeGroupChange>> repositoryGroupChanges = arrangeNodeGroupChanges(myRepositoryChangeSet);
    for (Tuples._2<SNodeId, String> nodeRole : SetSequence.fromSet(MapSequence.fromMap(mineGroupChanges).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(repositoryGroupChanges).keySet()))) {
      List<NodeGroupChange> mine = MapSequence.fromMap(mineGroupChanges).get(nodeRole);
      List<NodeGroupChange> repository = MapSequence.fromMap(repositoryGroupChanges).get(nodeRole);
      // This is a quadratic algorithm, it can be optimized to linear, 
      // but it is left for simplicity 
      for (NodeGroupChange m : ListSequence.fromList(mine)) {
        for (NodeGroupChange r : ListSequence.fromList(repository)) {
          if (!(m.getEnd() < r.getBegin() || m.getBegin() > r.getEnd())) {
            addConflict(m, r);
            // TODO check for symmetry 
          }
        }
      }
    }

    collectGroupChangesWithOthersConflicts(mineGroupChanges, myMineChangeSet, myRepositoryChangeSet);
    collectGroupChangesWithOthersConflicts(repositoryGroupChanges, myRepositoryChangeSet, myMineChangeSet);

    collectPropertyConflicts();
    collectReferenceConflicts();

    collectSymmetricRootDeletes();
    collectConflictingRootAdds();
  }

  public void applyAllNonConflictingChanges() {
    for (ModelChange change : ListSequence.fromList(myMineChangeSet.getModelChanges()).concat(ListSequence.fromList(myRepositoryChangeSet.getModelChanges()))) {
      if (!(isChangeResolved(change)) && Sequence.fromIterable(getConflictedWith(change)).isEmpty()) {
        applyChange(change);
      }
    }
  }

  private Iterable<ModelChange> getConflictedWith(ModelChange change) {
    return ListSequence.fromList(MapSequence.fromMap(myConflictingChanges).get(change)).where(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange other) {
        return !(SetSequence.fromSet(myExcludedChanges).contains(other));
      }
    });
  }

  private boolean isChangeResolved(ModelChange change) {
    return SetSequence.fromSet(myExcludedChanges).contains(change) || SetSequence.fromSet(myAppliedChanges).contains(change);
  }

  public void applyChange(ModelChange change) {
    assert !(isChangeResolved(change));
    change.apply(myResultModel);
    SetSequence.fromSet(myAppliedChanges).addElement(change);
    for (ModelChange conflicted : Sequence.fromIterable(getConflictedWith(change))) {
      assert !(SetSequence.fromSet(myAppliedChanges).contains(conflicted));
      excludeChange(conflicted);
    }
  }

  public void excludeChange(ModelChange change) {
    assert !(isChangeResolved(change));
    SetSequence.fromSet(myExcludedChanges).addElement(change);
    for (ModelChange conflicted : Sequence.fromIterable(getConflictedWith(change))) {
      if (!(isChangeResolved(conflicted)) && Sequence.fromIterable(getConflictedWith(conflicted)).isEmpty()) {
        applyChange(conflicted);
      }
    }
  }

  public void rebuildAll() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        collectConflicts();
        myResultModel = CopyUtil.copyModel(myBaseModel);
        myResultModel.setLoading(true);
        applyAllNonConflictingChanges();
        myResultModel.setLoading(false);
      }
    });
  }

  private static Map<Tuples._2<SNodeId, String>, List<NodeGroupChange>> arrangeNodeGroupChanges(ChangeSet changeSet) {
    Map<Tuples._2<SNodeId, String>, List<NodeGroupChange>> nodeRoleToGroupChanges = MapSequence.fromMap(new HashMap<Tuples._2<SNodeId, String>, List<NodeGroupChange>>());
    for (NodeGroupChange change : Sequence.fromIterable(changeSet.getModelChanges(NodeGroupChange.class))) {
      Tuples._2<SNodeId, String> nodeRole = MultiTuple.<SNodeId,String>from(change.getParentNodeId(), change.getRole());
      if (!(MapSequence.fromMap(nodeRoleToGroupChanges).containsKey(nodeRole))) {
        MapSequence.fromMap(nodeRoleToGroupChanges).put(nodeRole, ListSequence.fromList(new ArrayList<NodeGroupChange>()));
      }
      ListSequence.fromList(MapSequence.fromMap(nodeRoleToGroupChanges).get(nodeRole)).addElement(change);
    }
    return nodeRoleToGroupChanges;
  }

  private static void addOneWayChangeLink(Map<ModelChange, List<ModelChange>> map, ModelChange a, ModelChange b) {
    if (MapSequence.fromMap(map).get(a) == null) {
      MapSequence.fromMap(map).put(a, ListSequence.fromList(new ArrayList<ModelChange>()));
    }
    ListSequence.fromList(MapSequence.fromMap(map).get(a)).addElement(b);
  }

  private static void addChangeLink(Map<ModelChange, List<ModelChange>> map, ModelChange a, ModelChange b) {
    assert a.getChangeSet() != b.getChangeSet();
    addOneWayChangeLink(map, a, b);
    addOneWayChangeLink(map, b, a);
  }
}
