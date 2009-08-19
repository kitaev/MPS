package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptPart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.lang.actions.structure.ConceptPart";
  public static final String CONCEPT = "concept";
  public static final String PART = "part";

  public ConceptPart(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, ConceptPart.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(ConceptPart.CONCEPT, node);
  }

  public int getPartsCount() {
    return this.getChildCount(ConceptPart.PART);
  }

  public Iterator<MenuPart> parts() {
    return this.children(MenuPart.class, ConceptPart.PART);
  }

  public List<MenuPart> getParts() {
    return this.getChildren(MenuPart.class, ConceptPart.PART);
  }

  public void addPart(MenuPart node) {
    this.addChild(ConceptPart.PART, node);
  }

  public void insertPart(MenuPart prev, MenuPart node) {
    this.insertChild(prev, ConceptPart.PART, node);
  }

  public static ConceptPart newInstance(SModel sm, boolean init) {
    return (ConceptPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.ConceptPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptPart newInstance(SModel sm) {
    return ConceptPart.newInstance(sm, false);
  }
}
