package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModelAccessor extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.ModelAccessor";
  public static final String GETTER = "getter";
  public static final String SETTER = "setter";
  public static final String VALIDATOR = "validator";

  public ModelAccessor(SNode node) {
    super(node);
  }

  public QueryFunction_ModelAccess_Getter getGetter() {
    return (QueryFunction_ModelAccess_Getter)this.getChild(QueryFunction_ModelAccess_Getter.class, ModelAccessor.GETTER);
  }

  public void setGetter(QueryFunction_ModelAccess_Getter node) {
    super.setChild(ModelAccessor.GETTER, node);
  }

  public QueryFunction_ModelAccess_Setter getSetter() {
    return (QueryFunction_ModelAccess_Setter)this.getChild(QueryFunction_ModelAccess_Setter.class, ModelAccessor.SETTER);
  }

  public void setSetter(QueryFunction_ModelAccess_Setter node) {
    super.setChild(ModelAccessor.SETTER, node);
  }

  public QueryFunction_ModelAccess_Validator getValidator() {
    return (QueryFunction_ModelAccess_Validator)this.getChild(QueryFunction_ModelAccess_Validator.class, ModelAccessor.VALIDATOR);
  }

  public void setValidator(QueryFunction_ModelAccess_Validator node) {
    super.setChild(ModelAccessor.VALIDATOR, node);
  }

  public static ModelAccessor newInstance(SModel sm, boolean init) {
    return (ModelAccessor)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.ModelAccessor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModelAccessor newInstance(SModel sm) {
    return ModelAccessor.newInstance(sm, false);
  }
}
