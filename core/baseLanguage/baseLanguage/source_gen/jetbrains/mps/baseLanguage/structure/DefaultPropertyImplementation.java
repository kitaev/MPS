package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DefaultPropertyImplementation extends PropertyImplementation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation";
  public static String DEFAULT_GET_ACCESSOR = "defaultGetAccessor";
  public static String DEFAULT_SET_ACCESSOR = "defaultSetAccessor";

  public DefaultPropertyImplementation(SNode node) {
    super(node);
  }

  public static DefaultPropertyImplementation newInstance(SModel sm, boolean init) {
    return (DefaultPropertyImplementation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DefaultPropertyImplementation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DefaultPropertyImplementation newInstance(SModel sm) {
    return DefaultPropertyImplementation.newInstance(sm, false);
  }


  public DefaultGetAccessor getDefaultGetAccessor() {
    return (DefaultGetAccessor)this.getChild(DefaultPropertyImplementation.DEFAULT_GET_ACCESSOR);
  }

  public void setDefaultGetAccessor(DefaultGetAccessor node) {
    super.setChild(DefaultPropertyImplementation.DEFAULT_GET_ACCESSOR, node);
  }

  public DefaultSetAccessor getDefaultSetAccessor() {
    return (DefaultSetAccessor)this.getChild(DefaultPropertyImplementation.DEFAULT_SET_ACCESSOR);
  }

  public void setDefaultSetAccessor(DefaultSetAccessor node) {
    super.setChild(DefaultPropertyImplementation.DEFAULT_SET_ACCESSOR, node);
  }

}
