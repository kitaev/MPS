package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellKeyMapKeystroke extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellKeyMapKeystroke";
  public static final String MODIFIERS = "modifiers";
  public static final String KEYCODE = "keycode";

  public CellKeyMapKeystroke(SNode node) {
    super(node);
  }

  public String getModifiers() {
    return this.getProperty(CellKeyMapKeystroke.MODIFIERS);
  }

  public void setModifiers(String value) {
    this.setProperty(CellKeyMapKeystroke.MODIFIERS, value);
  }

  public String getKeycode() {
    return this.getProperty(CellKeyMapKeystroke.KEYCODE);
  }

  public void setKeycode(String value) {
    this.setProperty(CellKeyMapKeystroke.KEYCODE, value);
  }

  public static CellKeyMapKeystroke newInstance(SModel sm, boolean init) {
    return (CellKeyMapKeystroke)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellKeyMapKeystroke", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellKeyMapKeystroke newInstance(SModel sm) {
    return CellKeyMapKeystroke.newInstance(sm, false);
  }
}
