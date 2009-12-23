package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContinueStatement extends Statement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ContinueStatement";
  public static final String LABEL = "label";
  public static final String LOOP_LABEL_REFERENCE = "loopLabelReference";

  public ContinueStatement(SNode node) {
    super(node);
  }

  public String getLabel() {
    return this.getProperty(ContinueStatement.LABEL);
  }

  public void setLabel(String value) {
    this.setProperty(ContinueStatement.LABEL, value);
  }

  public LoopLabelReference getLoopLabelReference() {
    return (LoopLabelReference) this.getChild(LoopLabelReference.class, ContinueStatement.LOOP_LABEL_REFERENCE);
  }

  public void setLoopLabelReference(LoopLabelReference node) {
    super.setChild(ContinueStatement.LOOP_LABEL_REFERENCE, node);
  }

  public static ContinueStatement newInstance(SModel sm, boolean init) {
    return (ContinueStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ContinueStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContinueStatement newInstance(SModel sm) {
    return ContinueStatement.newInstance(sm, false);
  }
}
