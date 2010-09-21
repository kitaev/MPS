package jetbrains.mps.traceInfo;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import jetbrains.mps.util.Mapper;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.application.ApplicationManager;

public class TraceInfoManager implements ApplicationComponent {
  private static final Logger LOG = Logger.getLogger(TraceInfoManager.class);

  private final Set<String> myTraceableConcepts = new HashSet<String>();
  private final Map<String, Mapper<SNode, List<SNode>>> myScopeConceptsAndGetters = new HashMap<String, Mapper<SNode, List<SNode>>>();
  private final Map<String, Mapper<SNode, String>> myUnitConceptsToUnitNameGetters = new LinkedHashMap<String, Mapper<SNode, String>>();

  public TraceInfoManager() {
  }

  public boolean isTraceableNode(SNode node) {
    for (String concept : myTraceableConcepts) {
      if (SNodeOperations.isInstanceOf(node, concept)) {
        return true;
      }
    }
    return false;
  }

  public boolean isScopeNode(SNode node) {
    for (String concept : myScopeConceptsAndGetters.keySet()) {
      if (SNodeOperations.isInstanceOf(node, concept)) {
        return true;
      }
    }
    return false;
  }

  public boolean isUnitNode(SNode node) {
    for (String concept : myUnitConceptsToUnitNameGetters.keySet()) {
      if (SNodeOperations.isInstanceOf(node, concept)) {
        return true;
      }
    }
    return false;
  }

  public List<SNode> getVarsInScope(SNode scopeNode) {
    for (String concept : myScopeConceptsAndGetters.keySet()) {
      if (SNodeOperations.isInstanceOf(scopeNode, concept)) {
        return myScopeConceptsAndGetters.get(concept).value(scopeNode);
      }
    }
    return new ArrayList<SNode>(0);
  }

  @Nullable
  public String getUnitName(SNode unitNode) {
    for (String concept : myUnitConceptsToUnitNameGetters.keySet()) {
      if (SNodeOperations.isInstanceOf(unitNode, concept)) {
        Mapper<SNode, String> mapper = myUnitConceptsToUnitNameGetters.get(concept);
        if (mapper == null) {
          return null;
        }
        return mapper.value(unitNode);
      }
    }
    return null;
  }

  public void addTraceableConcept(String fqName) {
    myTraceableConcepts.add(fqName);
  }

  public void removeTraceableConcept(String fqName) {
    boolean result = myTraceableConcepts.remove(fqName);
    LOG.assertLog(result, "No traceble concept named " + fqName);
  }

  public void addScopeConcept(String fqName, Mapper<SNode, List<SNode>> varsGetter) {
    myScopeConceptsAndGetters.put(fqName, varsGetter);
  }

  public void removeScopeConcept(String fqName) {
    Mapper<SNode, List<SNode>> result = myScopeConceptsAndGetters.remove(fqName);
    LOG.assertLog(result != null, "No scope concept named " + fqName);
  }

  public void addUnitConcept(String fqName, Mapper<SNode, String> nameGetter) {
    myUnitConceptsToUnitNameGetters.put(fqName, nameGetter);
  }

  public void removeUnitConcept(String fqName) {
    Mapper<SNode, String> result = myUnitConceptsToUnitNameGetters.remove(fqName);
    LOG.assertLog(result != null, "No unit concept named " + fqName);
  }

  @NotNull
  public String getComponentName() {
    return "Trace Info Manager";
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }

  public static TraceInfoManager getInstance() {
    return ApplicationManager.getApplication().getComponent(TraceInfoManager.class);
  }
}
