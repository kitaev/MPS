package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MPSParameterChooser extends RefactoringParameterChooser {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.MPSParameterChooser";
  public static final String TITLE = "title";
  public static final String TYPE = "type";
  public static final String FILTER_BLOCK = "filterBlock";
  public static final String INITIAL_VALUE_BLOCK = "initialValueBlock";

  public MPSParameterChooser(SNode node) {
    super(node);
  }

  public String getTitle() {
    return this.getProperty(MPSParameterChooser.TITLE);
  }

  public void setTitle(String value) {
    this.setProperty(MPSParameterChooser.TITLE, value);
  }

  public MPSParameterType getType() {
    String value = super.getProperty(MPSParameterChooser.TYPE);
    return MPSParameterType.parseValue(value);
  }

  public void setType(MPSParameterType value) {
    super.setProperty(MPSParameterChooser.TYPE, value.getValueAsString());
  }

  public FilterParameterClause getFilterBlock() {
    return (FilterParameterClause)this.getChild(FilterParameterClause.class, MPSParameterChooser.FILTER_BLOCK);
  }

  public void setFilterBlock(FilterParameterClause node) {
    super.setChild(MPSParameterChooser.FILTER_BLOCK, node);
  }

  public InitialPropertyValueClause getInitialValueBlock() {
    return (InitialPropertyValueClause)this.getChild(InitialPropertyValueClause.class, MPSParameterChooser.INITIAL_VALUE_BLOCK);
  }

  public void setInitialValueBlock(InitialPropertyValueClause node) {
    super.setChild(MPSParameterChooser.INITIAL_VALUE_BLOCK, node);
  }

  public static MPSParameterChooser newInstance(SModel sm, boolean init) {
    return (MPSParameterChooser)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.MPSParameterChooser", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MPSParameterChooser newInstance(SModel sm) {
    return MPSParameterChooser.newInstance(sm, false);
  }
}
