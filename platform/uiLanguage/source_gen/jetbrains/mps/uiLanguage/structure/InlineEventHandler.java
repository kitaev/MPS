package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineEventHandler extends BaseConcept implements IComponentPart {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.InlineEventHandler";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EVENT = "event";
  public static final String HANDLER = "handler";

  public InlineEventHandler(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(InlineEventHandler.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InlineEventHandler.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InlineEventHandler.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InlineEventHandler.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InlineEventHandler.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InlineEventHandler.VIRTUAL_PACKAGE, value);
  }

  public EventDeclaration getEvent() {
    return (EventDeclaration)this.getReferent(EventDeclaration.class, InlineEventHandler.EVENT);
  }

  public void setEvent(EventDeclaration node) {
    super.setReferent(InlineEventHandler.EVENT, node);
  }

  public Statement getHandler() {
    return (Statement)this.getChild(Statement.class, InlineEventHandler.HANDLER);
  }

  public void setHandler(Statement node) {
    super.setChild(InlineEventHandler.HANDLER, node);
  }

  public static InlineEventHandler newInstance(SModel sm, boolean init) {
    return (InlineEventHandler)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.InlineEventHandler", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineEventHandler newInstance(SModel sm) {
    return InlineEventHandler.newInstance(sm, false);
  }
}
