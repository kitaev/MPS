package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetPreferencesComponentOperation extends ProjectOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.GetPreferencesComponentOperation";
  public static final String COMPONENT_DECLARATION = "componentDeclaration";

  public GetPreferencesComponentOperation(SNode node) {
    super(node);
  }

  public PreferencesComponentDeclaration getComponentDeclaration() {
    return (PreferencesComponentDeclaration) this.getReferent(PreferencesComponentDeclaration.class, GetPreferencesComponentOperation.COMPONENT_DECLARATION);
  }

  public void setComponentDeclaration(PreferencesComponentDeclaration node) {
    super.setReferent(GetPreferencesComponentOperation.COMPONENT_DECLARATION, node);
  }

  public static GetPreferencesComponentOperation newInstance(SModel sm, boolean init) {
    return (GetPreferencesComponentOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GetPreferencesComponentOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetPreferencesComponentOperation newInstance(SModel sm) {
    return GetPreferencesComponentOperation.newInstance(sm, false);
  }
}
