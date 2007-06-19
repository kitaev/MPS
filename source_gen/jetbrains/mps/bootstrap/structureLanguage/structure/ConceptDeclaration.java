package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class ConceptDeclaration extends AbstractConceptDeclaration {
  public static String IMPLEMENTS = "implements";
  public static String ICON_PATH = "iconPath";
  public static String ROOTABLE = "rootable";
  public static String EXTENDS = "extends";

  public  ConceptDeclaration(SNode node) {
    super(node);
  }

  public static ConceptDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptDeclaration newInstance(SModel sm) {
    return ConceptDeclaration.newInstance(sm, false);
  }

  public int getImplementsesCount() {
    return this.getChildCount(ConceptDeclaration.IMPLEMENTS);
  }
  public Iterator<InterfaceConceptReference> implementses() {
    return this.children(ConceptDeclaration.IMPLEMENTS);
  }
  public List<InterfaceConceptReference> getImplementses() {
    return this.getChildren(ConceptDeclaration.IMPLEMENTS);
  }
  public void addImplements(InterfaceConceptReference node) {
    this.addChild(ConceptDeclaration.IMPLEMENTS, node);
  }
  public void insertImplements(InterfaceConceptReference prev, InterfaceConceptReference node) {
    this.insertChild(prev, ConceptDeclaration.IMPLEMENTS, node);
  }
  public String getIconPath() {
    return this.getProperty(ConceptDeclaration.ICON_PATH);
  }
  public void setIconPath(String value) {
    this.setProperty(ConceptDeclaration.ICON_PATH, value);
  }
  public boolean getRootable() {
    return this.getBooleanProperty(ConceptDeclaration.ROOTABLE);
  }
  public void setRootable(boolean value) {
    this.setBooleanProperty(ConceptDeclaration.ROOTABLE, value);
  }
  public ConceptDeclaration getExtends() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.EXTENDS);
  }
  public void setExtends(ConceptDeclaration node) {
    super.setReferent(ConceptDeclaration.EXTENDS, node);
  }
}
