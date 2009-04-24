package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractCreator extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AbstractCreator";
  public static final String BODY = "body";

  public AbstractCreator(SNode node) {
    super(node);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(StatementList.class, AbstractCreator.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(AbstractCreator.BODY, node);
  }


  public static AbstractCreator newInstance(SModel sm, boolean init) {
    return (AbstractCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AbstractCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractCreator newInstance(SModel sm) {
    return AbstractCreator.newInstance(sm, false);
  }

}
