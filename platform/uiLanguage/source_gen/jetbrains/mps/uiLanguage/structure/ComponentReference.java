package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComponentReference extends Expression {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ComponentReference";
  public static final String COMPONENT = "component";

  public ComponentReference(SNode node) {
    super(node);
  }

  public ComponentInstance getComponent() {
    return (ComponentInstance)this.getReferent(ComponentInstance.class, ComponentReference.COMPONENT);
  }

  public void setComponent(ComponentInstance node) {
    super.setReferent(ComponentReference.COMPONENT, node);
  }

  public static ComponentReference newInstance(SModel sm, boolean init) {
    return (ComponentReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ComponentReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComponentReference newInstance(SModel sm) {
    return ComponentReference.newInstance(sm, false);
  }
}
