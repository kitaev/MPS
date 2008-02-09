package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomPropertyImplementation extends PropertyImplementation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation";
  public static String PROPERTY_GETTER = "propertyGetter";
  public static String PROPERTY_SETTER = "propertySetter";

  public  CustomPropertyImplementation(SNode node) {
    super(node);
  }

  public static CustomPropertyImplementation newInstance(SModel sm, boolean init) {
    return (CustomPropertyImplementation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomPropertyImplementation newInstance(SModel sm) {
    return CustomPropertyImplementation.newInstance(sm, false);
  }


  public PropertyGetter getPropertyGetter() {
    return (PropertyGetter)this.getChild(CustomPropertyImplementation.PROPERTY_GETTER);
  }

  public void setPropertyGetter(PropertyGetter node) {
    super.setChild(CustomPropertyImplementation.PROPERTY_GETTER, node);
  }

  public SetAccessor getPropertySetter() {
    return (SetAccessor)this.getChild(CustomPropertyImplementation.PROPERTY_SETTER);
  }

  public void setPropertySetter(SetAccessor node) {
    super.setChild(CustomPropertyImplementation.PROPERTY_SETTER, node);
  }

}
