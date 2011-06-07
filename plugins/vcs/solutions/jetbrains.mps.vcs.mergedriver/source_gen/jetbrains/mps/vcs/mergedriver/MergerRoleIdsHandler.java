package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import jetbrains.mps.smodel.persistence.RoleIdsComponent;
import java.util.Map;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

/*package*/ class MergerRoleIdsHandler implements RoleIdsComponent.RoleIdsHandler {
  private boolean myConsistent = true;
  private Map<String, SNodeId> myConceptsToIds = MapSequence.fromMap(new HashMap<String, SNodeId>());
  private Map<Tuples._2<String, String>, SNodeId> myNodeRolesToIds = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, SNodeId>());
  private Map<Tuples._2<String, String>, SNodeId> myReferenceRolesToIds = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, SNodeId>());
  private Map<Tuples._2<String, String>, SNodeId> myPropertyNamesToIds = MapSequence.fromMap(new HashMap<Tuples._2<String, String>, SNodeId>());

  /*package*/ MergerRoleIdsHandler() {
  }

  private <K> void storeAndCheckConsistency(Map<K, SNodeId> somethingToIds, K key, SNodeId value) {
    if (MapSequence.fromMap(somethingToIds).containsKey(key)) {
      myConsistent = myConsistent && eq_clnjnl_a0a0a0a0a(MapSequence.fromMap(somethingToIds).get(key), value);
    } else {
      MapSequence.fromMap(somethingToIds).put(key, value);
    }
  }

  public void conceptRead(String conceptFqName, SNodeId conceptId) {
    storeAndCheckConsistency(myConceptsToIds, conceptFqName, conceptId);
  }

  public void nodeRoleRead(String conceptFqName, String linkRole, SNodeId linkId) {
    storeAndCheckConsistency(myNodeRolesToIds, MultiTuple.<String,String>from(conceptFqName, linkRole), linkId);
  }

  public void referenceRoleRead(String conceptFqName, String referenceLinkRole, SNodeId linkId) {
    storeAndCheckConsistency(myReferenceRolesToIds, MultiTuple.<String,String>from(conceptFqName, referenceLinkRole), linkId);
  }

  public void propertyNameRead(String conceptFqName, String propertyName, SNodeId nameId) {
    storeAndCheckConsistency(myPropertyNamesToIds, MultiTuple.<String,String>from(conceptFqName, propertyName), nameId);
  }

  public SNodeId getConceptId(String conceptFqName) {
    return MapSequence.fromMap(myConceptsToIds).get(conceptFqName);
  }

  public SNodeId getNodeRoleId(String conceptFqName, String linkRole) {
    return MapSequence.fromMap(myNodeRolesToIds).get(MultiTuple.<String,String>from(conceptFqName, linkRole));
  }

  public SNodeId getReferenceRoleId(String conceptFqName, String referenceLinkRole) {
    return MapSequence.fromMap(myReferenceRolesToIds).get(MultiTuple.<String,String>from(conceptFqName, referenceLinkRole));
  }

  public SNodeId getPropertyNameId(String conceptFqName, String propertyName) {
    return MapSequence.fromMap(myPropertyNamesToIds).get(MultiTuple.<String,String>from(conceptFqName, propertyName));
  }

  public boolean isConsistent() {
    return myConsistent;
  }

  private static boolean eq_clnjnl_a0a0a0a0a(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
