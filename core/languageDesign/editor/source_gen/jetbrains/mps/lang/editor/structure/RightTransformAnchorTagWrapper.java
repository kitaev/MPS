package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RightTransformAnchorTagWrapper extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.RightTransformAnchorTagWrapper";
  public static final String TAG = "tag";

  public RightTransformAnchorTagWrapper(SNode node) {
    super(node);
  }

  public RightTransformAnchorTag getTag() {
    String value = super.getProperty(RightTransformAnchorTagWrapper.TAG);
    return RightTransformAnchorTag.parseValue(value);
  }

  public void setTag(RightTransformAnchorTag value) {
    super.setProperty(RightTransformAnchorTagWrapper.TAG, value.getValueAsString());
  }

  public static RightTransformAnchorTagWrapper newInstance(SModel sm, boolean init) {
    return (RightTransformAnchorTagWrapper) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.RightTransformAnchorTagWrapper", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RightTransformAnchorTagWrapper newInstance(SModel sm) {
    return RightTransformAnchorTagWrapper.newInstance(sm, false);
  }
}
