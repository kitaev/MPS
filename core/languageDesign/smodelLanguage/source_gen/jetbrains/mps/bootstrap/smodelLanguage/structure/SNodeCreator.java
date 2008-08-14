package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SNodeCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator";
  public static String CREATED_TYPE = "createdType";
  public static String PROTOTYPE_NODE = "prototypeNode";

  public SNodeCreator(SNode node) {
    super(node);
  }

  public SNodeType getCreatedType() {
    return (SNodeType)this.getChild(SNodeCreator.CREATED_TYPE);
  }

  public void setCreatedType(SNodeType node) {
    super.setChild(SNodeCreator.CREATED_TYPE, node);
  }

  public Expression getPrototypeNode() {
    return (Expression)this.getChild(SNodeCreator.PROTOTYPE_NODE);
  }

  public void setPrototypeNode(Expression node) {
    super.setChild(SNodeCreator.PROTOTYPE_NODE, node);
  }


  public static SNodeCreator newInstance(SModel sm, boolean init) {
    return (SNodeCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SNodeCreator newInstance(SModel sm) {
    return SNodeCreator.newInstance(sm, false);
  }

}
