package jetbrains.mps.vcs.diff.merge;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.diff.changes.*;

import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;

import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.vcs.diff.changes.ModuleDependencyChange.DependencyType;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.util.SNodeCompare;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class MergeConflictsBuilder {
  private SModel myBaseModel;
  private SModel myMyModel;
  private SModel myRepositoryModel;
  /*package*/ ChangeSet myMineChangeSet;
  /*package*/ ChangeSet myRepositoryChangeSet;
  /*package*/ Map<ModelChange, List<ModelChange>> myConflictingChanges = MapSequence.fromMap(new HashMap<ModelChange, List<ModelChange>>());
  /*package*/ Map<ModelChange, List<ModelChange>> mySymmetricChanges = MapSequence.fromMap(new HashMap<ModelChange, List<ModelChange>>());

  public MergeConflictsBuilder(SModel base, SModel mine, SModel repository) {
    // should be invoked from read action 
    myBaseModel = base;
    myMyModel = mine;

    myRepositoryModel = repository;
    myMineChangeSet = ChangeSetBuilder.buildChangeSet(base, mine);
    myRepositoryChangeSet = ChangeSetBuilder.buildChangeSet(base, repository);

    collectConflicts();
  }

  private void addConflict(ModelChange a, ModelChange b) {
    addChangeLink(myConflictingChanges, a, b);
  }

  private void addSymmetric(ModelChange a, ModelChange b) {
    addChangeLink(mySymmetricChanges, a, b);
  }

  private <K, C extends ModelChange> Tuples._2<Map<K, C>, Map<K, C>> arrangeChanges(_FunctionTypes._return_P1_E0<? extends K, ? super C> changeToKey, Class<C> changeClass) {
    return MultiTuple.<Map<K, C>,Map<K, C>>from(MergeConflictsBuilder.<K,C>arrangeChanges(myMineChangeSet, changeToKey, changeClass), MergeConflictsBuilder.<K,C>arrangeChanges(myRepositoryChangeSet, changeToKey, changeClass));
  }

  private <K, C extends ModelChange> void collectSymmetricChanges(Map<K, C> mine, Map<K, C> repo) {
    for (K key : SetSequence.fromSet(MapSequence.fromMap(mine).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(repo).keySet()))) {
      addSymmetric(MapSequence.fromMap(mine).get(key), MapSequence.fromMap(repo).get(key));
    }
  }

  private <K, C extends ModelChange> void collectSymmetricChanges(Tuples._2<Map<K, C>, Map<K, C>> mineAndRepo) {
    collectSymmetricChanges(mineAndRepo._0(), mineAndRepo._1());
  }

  private <K, C extends ModelChange> void collectSymmetricChanges(_FunctionTypes._return_P1_E0<? extends K, ? super C> changeToKey, Class<C> changeClass) {
    collectSymmetricChanges(arrangeChanges(changeToKey, changeClass));
  }

  private void collectGroupChangesWithOthersConflicts(Map<Tuples._2<SNodeId, String>, List<NodeGroupChange>> arrangedChanges, ChangeSet thisChangeSet, ChangeSet otherChangeSet) {
    Map<SNodeId, DeleteRootChange> deleteRootChanges = MergeConflictsBuilder.<SNodeId,DeleteRootChange>arrangeChanges(thisChangeSet, new _FunctionTypes._return_P1_E0<SNodeId, DeleteRootChange>() {
        public SNodeId invoke(DeleteRootChange drc) {
          return drc.getRootId();
        }
      }, DeleteRootChange.class);
    for (ModelChange change : ListSequence.fromList(otherChangeSet.getModelChanges())) {
      if (MapSequence.fromMap(myConflictingChanges).containsKey(change)) {
        continue;
      }

      SNodeId nodeId = null;
      if (change instanceof NodeChange) {
        nodeId = ((NodeChange) change).getAffectedNodeId();
      } else if (change instanceof NodeGroupChange) {
        nodeId = ((NodeGroupChange) change).getParentNodeId();
      }
      if (nodeId == null) {
        continue;
      }
      SNode node = myBaseModel.getNodeById(nodeId);
      while (node != null) {
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

  private void collectPropertyConflicts() {
    Tuples._2<Map<Tuples._2<SNodeId, String>, SetPropertyChange>, Map<Tuples._2<SNodeId, String>, SetPropertyChange>> arranged;
    arranged = this.<Tuples._2<SNodeId, String>,SetPropertyChange>arrangeChanges(new _FunctionTypes._return_P1_E0<Tuples._2<SNodeId, String>, SetPropertyChange>() {
      public Tuples._2<SNodeId, String> invoke(SetPropertyChange spc) {
        return MultiTuple.<SNodeId,String>from(spc.getAffectedNodeId(), spc.getPropertyName());
      }
    }, SetPropertyChange.class);
    for (Tuples._2<SNodeId, String> nodeName : SetSequence.fromSet(MapSequence.fromMap(arranged._0()).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(arranged._1()).keySet()))) {
      SetPropertyChange mineChange = MapSequence.fromMap(arranged._0()).get(nodeName);
      SetPropertyChange repositoryChange = MapSequence.fromMap(arranged._1()).get(nodeName);
      if (ObjectUtils.equals(mineChange.getNewValue(), repositoryChange.getNewValue())) {
        addSymmetric(mineChange, repositoryChange);
      } else {
        addConflict(mineChange, repositoryChange);
      }
    }
  }

  private void collectReferenceConflicts() {
    Tuples._2<Map<Tuples._2<SNodeId, String>, SetReferenceChange>, Map<Tuples._2<SNodeId, String>, SetReferenceChange>> arranged;
    arranged = this.<Tuples._2<SNodeId, String>,SetReferenceChange>arrangeChanges(new _FunctionTypes._return_P1_E0<Tuples._2<SNodeId, String>, SetReferenceChange>() {
      public Tuples._2<SNodeId, String> invoke(SetReferenceChange src) {
        return MultiTuple.<SNodeId,String>from(src.getAffectedNodeId(), src.getRole());
      }
    }, SetReferenceChange.class);
    for (Tuples._2<SNodeId, String> nodeName : SetSequence.fromSet(MapSequence.fromMap(arranged._0()).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(arranged._1()).keySet()))) {
      SetReferenceChange mineChange = MapSequence.fromMap(arranged._0()).get(nodeName);
      SetReferenceChange repositoryChange = MapSequence.fromMap(arranged._1()).get(nodeName);
      if (ObjectUtils.equals(mineChange.getTargetNodeId(), repositoryChange.getTargetNodeId()) && ObjectUtils.equals(mineChange.getTargetModelReference(), repositoryChange.getTargetModelReference()) && ObjectUtils.equals(mineChange.getResolveInfo(), repositoryChange.getResolveInfo())) {
        addSymmetric(mineChange, repositoryChange);
      } else {
        addConflict(mineChange, repositoryChange);
      }
    }
  }

  private void collectSymmetricRootDeletes() {
    collectSymmetricChanges(new _FunctionTypes._return_P1_E0<SNodeId, DeleteRootChange>() {
      public SNodeId invoke(DeleteRootChange drc) {
        return drc.getRootId();
      }
    }, DeleteRootChange.class);
  }

  private void collectConflictingRootAdds() {
    Tuples._2<Map<SNodeId, AddRootChange>, Map<SNodeId, AddRootChange>> arranged;
    arranged = this.<SNodeId,AddRootChange>arrangeChanges(new _FunctionTypes._return_P1_E0<SNodeId, AddRootChange>() {
      public SNodeId invoke(AddRootChange drc) {
        return drc.getRootId();
      }
    }, AddRootChange.class);
    for (SNodeId addedRoot : SetSequence.fromSet(MapSequence.fromMap(arranged._0()).keySet()).intersect(SetSequence.fromSet(MapSequence.fromMap(arranged._1()).keySet()))) {
      AddRootChange mine = MapSequence.fromMap(arranged._0()).get(addedRoot);
      AddRootChange repository = MapSequence.fromMap(arranged._1()).get(addedRoot);
      if (SNodeCompare.nodeEquals(myMyModel.getNodeById(mine.getRootId()), myRepositoryModel.getNodeById(repository.getRootId()))) {
        addSymmetric(mine, repository);
      } else {
        addConflict(mine, repository);
      }
    }
  }

  private boolean nodeGroupChangesSymmetric(NodeGroupChange mine, NodeGroupChange repository) {
    if (mine.getBegin() == repository.getBegin() && mine.getEnd() == repository.getEnd()) {
      if (mine.getResultEnd() - mine.getResultBegin() == repository.getResultEnd() - repository.getResultBegin()) {
        List<SNode> myChildren = myMyModel.getNodeById(mine.getParentNodeId()).getChildren(mine.getRole());
        List<SNode> repositoryChildren = myRepositoryModel.getNodeById(repository.getParentNodeId()).getChildren(repository.getRole());
        for (int o = 0; o < mine.getResultEnd() - mine.getResultBegin(); o++) {
          if (!(SNodeCompare.nodeEquals(myChildren.get(mine.getResultBegin() + o), repositoryChildren.get(repository.getResultBegin() + o)))) {
            return false;
          }
        }
        return true;
      }
    }
    return false;
  }

  private void collectSymmetricImportedModelChanges() {
    collectSymmetricChanges(new _FunctionTypes._return_P1_E0<SModelReference, ImportedModelChange>() {
      public SModelReference invoke(ImportedModelChange imc) {
        return imc.getModelReference();
      }
    }, ImportedModelChange.class);
  }

  public void collectSymmetricModuleDependencyChanges() {
    collectSymmetricChanges(new _FunctionTypes._return_P1_E0<Tuples._2<ModuleReference, ModuleDependencyChange.DependencyType>, ModuleDependencyChange>() {
      public Tuples._2<ModuleReference, ModuleDependencyChange.DependencyType> invoke(ModuleDependencyChange mdc) {
        return MultiTuple.<ModuleReference,ModuleDependencyChange.DependencyType>from(mdc.getModuleReference(), mdc.getDependencyType());
      }
    }, ModuleDependencyChange.class);
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
          if (m.getEnd() < r.getBegin() || m.getBegin() > r.getEnd()) {
            // ok 
          } else {
            if (nodeGroupChangesSymmetric(m, r)) {
              addSymmetric(m, r);
            } else {
              addConflict(m, r);
            }
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

    collectSymmetricImportedModelChanges();
    collectSymmetricModuleDependencyChanges();
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

  private static <K, C extends ModelChange> Map<K, C> arrangeChanges(ChangeSet changeSet, final _FunctionTypes._return_P1_E0<? extends K, ? super C> changeToKey, Class<C> changeClass) {
    final Map<K, C> map = MapSequence.fromMap(new HashMap<K, C>());
    Sequence.fromIterable(changeSet.getModelChanges(changeClass)).visitAll(new IVisitor<C>() {
      public void visit(C ch) {
        MapSequence.fromMap(map).put(changeToKey.invoke(ch), ch);
      }
    });
    return map;
  }
}
