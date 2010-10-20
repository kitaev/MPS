package jetbrains.mps.lang.editor.table.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StateReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.table.structure.StateReference";
  public static final String STATE = "state";

  public StateReference(SNode node) {
    super(node);
  }

  public State getState() {
    return (State) this.getReferent(State.class, StateReference.STATE);
  }

  public void setState(State node) {
    super.setReferent(StateReference.STATE, node);
  }

  public static StateReference newInstance(SModel sm, boolean init) {
    return (StateReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.table.structure.StateReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StateReference newInstance(SModel sm) {
    return StateReference.newInstance(sm, false);
  }
}
