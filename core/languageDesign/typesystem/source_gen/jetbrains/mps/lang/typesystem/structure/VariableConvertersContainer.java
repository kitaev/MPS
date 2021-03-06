package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariableConvertersContainer extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.VariableConvertersContainer";
  public static final String CONVERTER_ITEM = "converterItem";

  public VariableConvertersContainer(SNode node) {
    super(node);
  }

  public int getConverterItemsCount() {
    return this.getChildCount(VariableConvertersContainer.CONVERTER_ITEM);
  }

  public Iterator<VariableConverterItem> converterItems() {
    return this.children(VariableConverterItem.class, VariableConvertersContainer.CONVERTER_ITEM);
  }

  public List<VariableConverterItem> getConverterItems() {
    return this.getChildren(VariableConverterItem.class, VariableConvertersContainer.CONVERTER_ITEM);
  }

  public void addConverterItem(VariableConverterItem node) {
    this.addChild(VariableConvertersContainer.CONVERTER_ITEM, node);
  }

  public void insertConverterItem(VariableConverterItem prev, VariableConverterItem node) {
    this.insertChild(prev, VariableConvertersContainer.CONVERTER_ITEM, node);
  }

  public static VariableConvertersContainer newInstance(SModel sm, boolean init) {
    return (VariableConvertersContainer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.VariableConvertersContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VariableConvertersContainer newInstance(SModel sm) {
    return VariableConvertersContainer.newInstance(sm, false);
  }
}
