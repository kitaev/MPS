package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DebugInfoInitializer extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.DebugInfoInitializer";
  public static final String CONCEPTS_TO_DEBUG = "conceptsToDebug";

  public DebugInfoInitializer(SNode node) {
    super(node);
  }

  public int getConceptsToDebugsCount() {
    return this.getChildCount(DebugInfoInitializer.CONCEPTS_TO_DEBUG);
  }

  public Iterator<ConceptReference> conceptsToDebugs() {
    return this.children(ConceptReference.class, DebugInfoInitializer.CONCEPTS_TO_DEBUG);
  }

  public List<ConceptReference> getConceptsToDebugs() {
    return this.getChildren(ConceptReference.class, DebugInfoInitializer.CONCEPTS_TO_DEBUG);
  }

  public void addConceptsToDebug(ConceptReference node) {
    this.addChild(DebugInfoInitializer.CONCEPTS_TO_DEBUG, node);
  }

  public void insertConceptsToDebug(ConceptReference prev, ConceptReference node) {
    this.insertChild(prev, DebugInfoInitializer.CONCEPTS_TO_DEBUG, node);
  }

  public static DebugInfoInitializer newInstance(SModel sm, boolean init) {
    return (DebugInfoInitializer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.DebugInfoInitializer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DebugInfoInitializer newInstance(SModel sm) {
    return DebugInfoInitializer.newInstance(sm, false);
  }
}
