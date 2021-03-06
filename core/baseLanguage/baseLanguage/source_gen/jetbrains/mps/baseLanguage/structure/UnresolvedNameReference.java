package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UnresolvedNameReference extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.UnresolvedNameReference";
  public static final String RESOLVE_NAME = "resolveName";

  public UnresolvedNameReference(SNode node) {
    super(node);
  }

  public String getResolveName() {
    return this.getProperty(UnresolvedNameReference.RESOLVE_NAME);
  }

  public void setResolveName(String value) {
    this.setProperty(UnresolvedNameReference.RESOLVE_NAME, value);
  }

  public static UnresolvedNameReference newInstance(SModel sm, boolean init) {
    return (UnresolvedNameReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.UnresolvedNameReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UnresolvedNameReference newInstance(SModel sm) {
    return UnresolvedNameReference.newInstance(sm, false);
  }
}
