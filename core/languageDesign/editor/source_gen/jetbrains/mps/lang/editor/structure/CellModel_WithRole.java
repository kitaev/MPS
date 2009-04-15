package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.editor.structure.CellModel_AbstractLabel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_WithRole extends CellModel_AbstractLabel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_WithRole";
  public static final String NO_TARGET_TEXT = "noTargetText";
  public static final String EMPTY_NO_TARGET_TEXT = "emptyNoTargetText";
  public static final String READ_ONLY = "readOnly";
  public static final String ALLOW_EMPTY_TEXT = "allowEmptyText";
  public static final String RELATION_DECLARATION = "relationDeclaration";

  public CellModel_WithRole(SNode node) {
    super(node);
  }

  public String getNoTargetText() {
    return this.getProperty(CellModel_WithRole.NO_TARGET_TEXT);
  }

  public void setNoTargetText(String value) {
    this.setProperty(CellModel_WithRole.NO_TARGET_TEXT, value);
  }

  public boolean getEmptyNoTargetText() {
    return this.getBooleanProperty(CellModel_WithRole.EMPTY_NO_TARGET_TEXT);
  }

  public void setEmptyNoTargetText(boolean value) {
    this.setBooleanProperty(CellModel_WithRole.EMPTY_NO_TARGET_TEXT, value);
  }

  public boolean getReadOnly() {
    return this.getBooleanProperty(CellModel_WithRole.READ_ONLY);
  }

  public void setReadOnly(boolean value) {
    this.setBooleanProperty(CellModel_WithRole.READ_ONLY, value);
  }

  public boolean getAllowEmptyText() {
    return this.getBooleanProperty(CellModel_WithRole.ALLOW_EMPTY_TEXT);
  }

  public void setAllowEmptyText(boolean value) {
    this.setBooleanProperty(CellModel_WithRole.ALLOW_EMPTY_TEXT, value);
  }

  public BaseConcept getRelationDeclaration() {
    return (BaseConcept)this.getReferent(BaseConcept.class, CellModel_WithRole.RELATION_DECLARATION);
  }

  public void setRelationDeclaration(BaseConcept node) {
    super.setReferent(CellModel_WithRole.RELATION_DECLARATION, node);
  }


  public static CellModel_WithRole newInstance(SModel sm, boolean init) {
    return (CellModel_WithRole)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_WithRole", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_WithRole newInstance(SModel sm) {
    return CellModel_WithRole.newInstance(sm, false);
  }

}
