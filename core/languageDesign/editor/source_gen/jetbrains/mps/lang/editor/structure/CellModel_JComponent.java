package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.EditorCellModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.structure.QueryFunction_JComponent;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_JComponent extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_JComponent";
  public static final String COMPONENT_PROVIDER = "componentProvider";

  public CellModel_JComponent(SNode node) {
    super(node);
  }

  public QueryFunction_JComponent getComponentProvider() {
    return (QueryFunction_JComponent)this.getChild(QueryFunction_JComponent.class, CellModel_JComponent.COMPONENT_PROVIDER);
  }

  public void setComponentProvider(QueryFunction_JComponent node) {
    super.setChild(CellModel_JComponent.COMPONENT_PROVIDER, node);
  }


  public static CellModel_JComponent newInstance(SModel sm, boolean init) {
    return (CellModel_JComponent)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_JComponent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_JComponent newInstance(SModel sm) {
    return CellModel_JComponent.newInstance(sm, false);
  }

}
