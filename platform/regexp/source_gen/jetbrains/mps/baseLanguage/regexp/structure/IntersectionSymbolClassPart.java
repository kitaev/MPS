package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IntersectionSymbolClassPart extends SymbolClassPart {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart";
  public static final String LEFT = "left";
  public static final String RIGHT = "right";

  public IntersectionSymbolClassPart(SNode node) {
    super(node);
  }

  public SymbolClassRegexpAndPart getLeft() {
    return (SymbolClassRegexpAndPart)this.getChild(SymbolClassRegexpAndPart.class, IntersectionSymbolClassPart.LEFT);
  }

  public void setLeft(SymbolClassRegexpAndPart node) {
    super.setChild(IntersectionSymbolClassPart.LEFT, node);
  }

  public SymbolClassRegexpAndPart getRight() {
    return (SymbolClassRegexpAndPart)this.getChild(SymbolClassRegexpAndPart.class, IntersectionSymbolClassPart.RIGHT);
  }

  public void setRight(SymbolClassRegexpAndPart node) {
    super.setChild(IntersectionSymbolClassPart.RIGHT, node);
  }


  public static IntersectionSymbolClassPart newInstance(SModel sm, boolean init) {
    return (IntersectionSymbolClassPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IntersectionSymbolClassPart newInstance(SModel sm) {
    return IntersectionSymbolClassPart.newInstance(sm, false);
  }

}
