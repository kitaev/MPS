package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SequenceCreator extends AbstractCreator {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.SequenceCreator";
  public static final String ELEMENT_TYPE = "elementType";
  public static final String INITIALIZER = "initializer";

  public SequenceCreator(SNode node) {
    super(node);
  }

  public Type getElementType() {
    return (Type)this.getChild(Type.class, SequenceCreator.ELEMENT_TYPE);
  }

  public void setElementType(Type node) {
    super.setChild(SequenceCreator.ELEMENT_TYPE, node);
  }

  public ClosureLiteral getInitializer() {
    return (ClosureLiteral)this.getChild(ClosureLiteral.class, SequenceCreator.INITIALIZER);
  }

  public void setInitializer(ClosureLiteral node) {
    super.setChild(SequenceCreator.INITIALIZER, node);
  }


  public static SequenceCreator newInstance(SModel sm, boolean init) {
    return (SequenceCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SequenceCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SequenceCreator newInstance(SModel sm) {
    return SequenceCreator.newInstance(sm, false);
  }

}
