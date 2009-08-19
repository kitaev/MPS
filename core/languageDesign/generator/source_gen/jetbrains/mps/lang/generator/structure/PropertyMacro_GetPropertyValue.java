package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyMacro_GetPropertyValue extends TemplateQueryBase {
  public static final String concept = "jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue";

  public PropertyMacro_GetPropertyValue(SNode node) {
    super(node);
  }

  public static PropertyMacro_GetPropertyValue newInstance(SModel sm, boolean init) {
    return (PropertyMacro_GetPropertyValue)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyMacro_GetPropertyValue newInstance(SModel sm) {
    return PropertyMacro_GetPropertyValue.newInstance(sm, false);
  }
}
