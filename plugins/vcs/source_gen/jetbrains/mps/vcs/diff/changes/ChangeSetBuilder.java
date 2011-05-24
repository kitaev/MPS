package jetbrains.mps.vcs.diff.changes;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.PropertySupport;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.smodel.SReference;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.List;
import jetbrains.mps.util.LongestCommonSubsequenceFinder;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ISetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class ChangeSetBuilder {
  private SModel myOldModel;
  private SModel myNewModel;
  private ChangeSet myChangeSet;

  private ChangeSetBuilder(SModel oldModel, SModel newModel) {
    this(new ChangeSet(oldModel, newModel));
  }

  private ChangeSetBuilder(ChangeSet changeSet) {
    myOldModel = changeSet.getOldModel();
    myNewModel = changeSet.getNewModel();
    myChangeSet = changeSet;
  }

  private void buildPropertyChanges(SNode oldNode, SNode newNode) {
    Map<String, String> oldProperties = (Map<String, String>) oldNode.getProperties();
    Map<String, String> newProperties = (Map<String, String>) newNode.getProperties();
    for (String name : SetSequence.fromSet(MapSequence.fromMap(oldProperties).keySet()).union(SetSequence.fromSet(MapSequence.fromMap(newProperties).keySet()))) {
      PropertySupport propertySupport = new ChangeSetBuilder.DefaultPropertySupport();
      SNode propertyDeclaration = oldNode.getPropertyDeclaration(name);
      if (propertyDeclaration != null) {
        propertySupport = PropertySupport.getPropertySupport(propertyDeclaration);
      }

      String oldInternalValue = propertySupport.toInternalValue(MapSequence.fromMap(oldProperties).get(name));
      String newInternalValue = propertySupport.toInternalValue(MapSequence.fromMap(newProperties).get(name));
      if (!(ObjectUtils.equals(oldInternalValue, newInternalValue))) {
        myChangeSet.add(new SetPropertyChange(myChangeSet, oldNode.getSNodeId(), name, MapSequence.fromMap(newProperties).get(name)));
      }
    }
  }

  private void buildReferenceChanges(SNode oldNode, SNode newNode) {
    final Map<String, SReference> oldReferences = MapSequence.fromMap(new HashMap<String, SReference>());
    final Map<String, SReference> newReferences = MapSequence.fromMap(new HashMap<String, SReference>());
    Sequence.fromIterable(SNodeOperations.getReferences(oldNode)).visitAll(new IVisitor<SReference>() {
      public void visit(SReference ref) {
        MapSequence.fromMap(oldReferences).put(SLinkOperations.getRole(ref), ref);
      }
    });
    Sequence.fromIterable(SNodeOperations.getReferences(newNode)).visitAll(new IVisitor<SReference>() {
      public void visit(SReference ref) {
        MapSequence.fromMap(newReferences).put(SLinkOperations.getRole(ref), ref);
      }
    });
    for (String role : SetSequence.fromSet(MapSequence.fromMap(oldReferences).keySet()).union(SetSequence.fromSet(MapSequence.fromMap(newReferences).keySet()))) {
      SReference oldReference = MapSequence.fromMap(oldReferences).get(role);
      SReference newReference = MapSequence.fromMap(newReferences).get(role);
      if (eq_nbyrtw_a0a0c0e0b(check_nbyrtw_a0a0c0e0b(oldReference), check_nbyrtw_a0a0c0e0b_0(newReference)) && eq_nbyrtw_a0a0c0e0b_0(check_nbyrtw_a0a0c0e0b_1(oldReference), check_nbyrtw_a0a0c0e0b_2(newReference)) && eq_nbyrtw_a0a2a4a1(check_nbyrtw_a0a2a4a1(oldReference), check_nbyrtw_a0a2a4a1_0(newReference))) {
        // same references 
      } else {
        SModelReference targetModel = check_nbyrtw_a0a0a2a4a1(newReference);
        if (eq_nbyrtw_a0b0a2a4a1(SNodeOperations.getModel(newNode).getSModelReference(), targetModel)) {
          // This is internal reference 
          targetModel = null;
        }
        myChangeSet.add(new SetReferenceChange(myChangeSet, oldNode.getSNodeId(), role, targetModel, check_nbyrtw_e0a0a2a0c0e0b(newReference), check_nbyrtw_f0a0a2a0c0e0b(newReference)));
      }
    }
  }

  private void buildNodeChanges(SNode oldNode) {
    SNodeId nodeId = oldNode.getSNodeId();
    SNode newNode = myNewModel.getNodeById(nodeId);

    buildPropertyChanges(oldNode, newNode);
    buildReferenceChanges(oldNode, newNode);

    Set<String> roles = SetSequence.fromSetWithValues(new HashSet<String>(), ListSequence.fromList(SNodeOperations.getChildren(oldNode)).concat(ListSequence.fromList(SNodeOperations.getChildren(newNode))).<String>select(new ISelector<SNode, String>() {
      public String select(SNode ch) {
        return SNodeOperations.getContainingLinkRole(ch);
      }
    }));
    for (String role : SetSequence.fromSet(roles)) {
      final List<SNode> oldChildren = oldNode.getChildren(role);
      List<SNode> newChildren = newNode.getChildren(role);
      List<SNodeId> oldIds = ListSequence.fromList(oldChildren).<SNodeId>select(new ISelector<SNode, SNodeId>() {
        public SNodeId select(SNode n) {
          return n.getSNodeId();
        }
      }).toListSequence();
      List<SNodeId> newIds = ListSequence.fromList(newChildren).<SNodeId>select(new ISelector<SNode, SNodeId>() {
        public SNodeId select(SNode n) {
          return n.getSNodeId();
        }
      }).toListSequence();
      LongestCommonSubsequenceFinder<SNodeId> finder = new LongestCommonSubsequenceFinder<SNodeId>(oldIds, newIds);

      // Finding insertings, deletings and replacings 
      List<Tuples._2<Tuples._2<Integer, Integer>, Tuples._2<Integer, Integer>>> differentIndices = finder.getDifferentIndices();
      for (Tuples._2<Tuples._2<Integer, Integer>, Tuples._2<Integer, Integer>> indices : ListSequence.fromList(differentIndices)) {
        Tuples._2<Integer, Integer> oldIndices = indices._0();
        Tuples._2<Integer, Integer> newIndices = indices._1();
        myChangeSet.add(new NodeGroupChange(myChangeSet, nodeId, role, (int) oldIndices._0(), (int) oldIndices._1(), (int) newIndices._0(), (int) newIndices._1()));
      }

      // Finding changes for children 
      List<Tuples._2<Integer, Integer>> commonIndices = finder.getCommonIndices();
      ListSequence.fromList(commonIndices).<SNode>select(new ISelector<Tuples._2<Integer, Integer>, SNode>() {
        public SNode select(Tuples._2<Integer, Integer> in) {
          return ListSequence.fromList(oldChildren).getElement((int) in._0());
        }
      }).visitAll(new IVisitor<SNode>() {
        public void visit(SNode child) {
          buildNodeChanges(child);
        }
      });
    }
  }

  private void buildChanges(boolean withOpposite) {
    _FunctionTypes._return_P1_E0<? extends Set<SNodeId>, ? super SModel> rootIds = new _FunctionTypes._return_P1_E0<ISetSequence<SNodeId>, SModel>() {
      public ISetSequence<SNodeId> invoke(SModel m) {
        return SetSequence.fromSetWithValues(new HashSet<SNodeId>(), ListSequence.fromList(SModelOperations.getRoots(m, null)).<SNodeId>select(new ISelector<SNode, SNodeId>() {
          public SNodeId select(SNode node) {
            return node.getSNodeId();
          }
        }));
      }
    };
    Set<SNodeId> oldRootIds = rootIds.invoke(myOldModel);
    Set<SNodeId> newRootIds = rootIds.invoke(myNewModel);

    myChangeSet.addAll(SetSequence.fromSet(newRootIds).subtract(SetSequence.fromSet(oldRootIds)).<AddRootChange>select(new ISelector<SNodeId, AddRootChange>() {
      public AddRootChange select(SNodeId r) {
        return new AddRootChange(myChangeSet, r);
      }
    }));
    myChangeSet.addAll(SetSequence.fromSet(oldRootIds).subtract(SetSequence.fromSet(newRootIds)).<DeleteRootChange>select(new ISelector<SNodeId, DeleteRootChange>() {
      public DeleteRootChange select(SNodeId r) {
        return new DeleteRootChange(myChangeSet, r);
      }
    }));

    for (SNodeId rootId : SetSequence.fromSet(oldRootIds).intersect(SetSequence.fromSet(newRootIds))) {
      buildNodeChanges(myOldModel.getNodeById(rootId));
    }

    if (withOpposite) {
      myChangeSet.buildOppositeChangeSet();
    }
  }

  public static ChangeSet buildChangeSet(SModel oldModel, SModel newModel) {
    return buildChangeSet(oldModel, newModel, false);
  }

  public static ChangeSet buildChangeSet(SModel oldModel, SModel newModel, boolean withOpposite) {
    ChangeSetBuilder builder = new ChangeSetBuilder(oldModel, newModel);
    builder.buildChanges(withOpposite);
    return builder.myChangeSet;
  }

  public static void rebuildChangeSet(ChangeSet changeSet) {
    ListSequence.fromList(changeSet.getModelChanges()).clear();
    changeSet.clearOppositeChangeSet();
    new ChangeSetBuilder(changeSet).buildChanges(true);
  }

  private static SNodeId check_nbyrtw_a0a0c0e0b(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTargetNodeId();
    }
    return null;
  }

  private static SNodeId check_nbyrtw_a0a0c0e0b_0(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTargetNodeId();
    }
    return null;
  }

  private static SModelReference check_nbyrtw_a0a0c0e0b_1(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTargetSModelReference();
    }
    return null;
  }

  private static SModelReference check_nbyrtw_a0a0c0e0b_2(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTargetSModelReference();
    }
    return null;
  }

  private static String check_nbyrtw_a0a2a4a1(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getResolveInfo();
    }
    return null;
  }

  private static String check_nbyrtw_a0a2a4a1_0(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getResolveInfo();
    }
    return null;
  }

  private static SModelReference check_nbyrtw_a0a0a2a4a1(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTargetSModelReference();
    }
    return null;
  }

  private static SNodeId check_nbyrtw_e0a0a2a0c0e0b(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getTargetNodeId();
    }
    return null;
  }

  private static String check_nbyrtw_f0a0a2a0c0e0b(SReference checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getResolveInfo();
    }
    return null;
  }

  private static boolean eq_nbyrtw_a0a0c0e0b(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_nbyrtw_a0a0c0e0b_0(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_nbyrtw_a0a2a4a1(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_nbyrtw_a0b0a2a4a1(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static class DefaultPropertySupport extends PropertySupport {
    private DefaultPropertySupport() {
    }

    protected boolean canSetValue(String string) {
      return true;
    }
  }
}
