package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomParameterChooser extends RefactoringParameterChooser {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.CustomParameterChooser";
  public static final String ENTITY_TYPE = "entityType";
  public static final String COMPONENT_BLOCK = "componentBlock";

  public CustomParameterChooser(SNode node) {
    super(node);
  }

  public Type getEntityType() {
    return (Type)this.getChild(Type.class, CustomParameterChooser.ENTITY_TYPE);
  }

  public void setEntityType(Type node) {
    super.setChild(CustomParameterChooser.ENTITY_TYPE, node);
  }

  public ParameterChooserComponentClause getComponentBlock() {
    return (ParameterChooserComponentClause)this.getChild(ParameterChooserComponentClause.class, CustomParameterChooser.COMPONENT_BLOCK);
  }

  public void setComponentBlock(ParameterChooserComponentClause node) {
    super.setChild(CustomParameterChooser.COMPONENT_BLOCK, node);
  }

  public static CustomParameterChooser newInstance(SModel sm, boolean init) {
    return (CustomParameterChooser)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.CustomParameterChooser", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomParameterChooser newInstance(SModel sm) {
    return CustomParameterChooser.newInstance(sm, false);
  }
}
