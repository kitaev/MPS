package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EventHandlerParam extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.EventHandlerParam";

  public EventHandlerParam(SNode node) {
    super(node);
  }

  public static EventHandlerParam newInstance(SModel sm, boolean init) {
    return (EventHandlerParam) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.EventHandlerParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventHandlerParam newInstance(SModel sm) {
    return EventHandlerParam.newInstance(sm, false);
  }
}
