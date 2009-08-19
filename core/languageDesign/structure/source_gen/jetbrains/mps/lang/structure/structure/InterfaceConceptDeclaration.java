package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InterfaceConceptDeclaration extends AbstractConceptDeclaration {
  public static final String concept = "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration";
  public static final String EXTENDS = "extends";

  public InterfaceConceptDeclaration(SNode node) {
    super(node);
  }

  public int getExtendsesCount() {
    return this.getChildCount(InterfaceConceptDeclaration.EXTENDS);
  }

  public Iterator<InterfaceConceptReference> extendses() {
    return this.children(InterfaceConceptReference.class, InterfaceConceptDeclaration.EXTENDS);
  }

  public List<InterfaceConceptReference> getExtendses() {
    return this.getChildren(InterfaceConceptReference.class, InterfaceConceptDeclaration.EXTENDS);
  }

  public void addExtends(InterfaceConceptReference node) {
    this.addChild(InterfaceConceptDeclaration.EXTENDS, node);
  }

  public void insertExtends(InterfaceConceptReference prev, InterfaceConceptReference node) {
    this.insertChild(prev, InterfaceConceptDeclaration.EXTENDS, node);
  }

  public static InterfaceConceptDeclaration newInstance(SModel sm, boolean init) {
    return (InterfaceConceptDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InterfaceConceptDeclaration newInstance(SModel sm) {
    return InterfaceConceptDeclaration.newInstance(sm, false);
  }
}
