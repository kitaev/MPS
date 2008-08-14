package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InternalClassifierType extends ClassifierType {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalClassifierType";
  public static String FQ_CLASS_NAME = "fqClassName";

  public InternalClassifierType(SNode node) {
    super(node);
  }

  public String getFqClassName() {
    return this.getProperty(InternalClassifierType.FQ_CLASS_NAME);
  }

  public void setFqClassName(String value) {
    this.setProperty(InternalClassifierType.FQ_CLASS_NAME, value);
  }


  public static InternalClassifierType newInstance(SModel sm, boolean init) {
    return (InternalClassifierType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalClassifierType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalClassifierType newInstance(SModel sm) {
    return InternalClassifierType.newInstance(sm, false);
  }

}
