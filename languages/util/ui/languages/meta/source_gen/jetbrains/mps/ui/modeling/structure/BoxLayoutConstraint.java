package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BoxLayoutConstraint extends LayoutConstraint {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint";
  public static final String H_CONSTRAINT = "hConstraint";
  public static final String V_CONSTRAINT = "vConstraint";

  public BoxLayoutConstraint(SNode node) {
    super(node);
  }

  public HorizontalConstraint getHConstraint() {
    return (HorizontalConstraint) this.getChild(HorizontalConstraint.class, BoxLayoutConstraint.H_CONSTRAINT);
  }

  public void setHConstraint(HorizontalConstraint node) {
    super.setChild(BoxLayoutConstraint.H_CONSTRAINT, node);
  }

  public VerticalConstraint getVConstraint() {
    return (VerticalConstraint) this.getChild(VerticalConstraint.class, BoxLayoutConstraint.V_CONSTRAINT);
  }

  public void setVConstraint(VerticalConstraint node) {
    super.setChild(BoxLayoutConstraint.V_CONSTRAINT, node);
  }

  public static BoxLayoutConstraint newInstance(SModel sm, boolean init) {
    return (BoxLayoutConstraint) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BoxLayoutConstraint newInstance(SModel sm) {
    return BoxLayoutConstraint.newInstance(sm, false);
  }
}
