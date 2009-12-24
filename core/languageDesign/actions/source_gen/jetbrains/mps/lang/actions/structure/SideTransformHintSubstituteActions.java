package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SideTransformHintSubstituteActions extends BaseConcept implements INamedConcept, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ACTIONS_BUILDER = "actionsBuilder";

  public SideTransformHintSubstituteActions(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(SideTransformHintSubstituteActions.NAME);
  }

  public void setName(String value) {
    this.setProperty(SideTransformHintSubstituteActions.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(SideTransformHintSubstituteActions.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SideTransformHintSubstituteActions.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SideTransformHintSubstituteActions.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SideTransformHintSubstituteActions.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SideTransformHintSubstituteActions.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SideTransformHintSubstituteActions.VIRTUAL_PACKAGE, value);
  }

  public int getActionsBuildersCount() {
    return this.getChildCount(SideTransformHintSubstituteActions.ACTIONS_BUILDER);
  }

  public Iterator<SideTransformHintSubstituteActionsBuilder> actionsBuilders() {
    return this.children(SideTransformHintSubstituteActionsBuilder.class, SideTransformHintSubstituteActions.ACTIONS_BUILDER);
  }

  public List<SideTransformHintSubstituteActionsBuilder> getActionsBuilders() {
    return this.getChildren(SideTransformHintSubstituteActionsBuilder.class, SideTransformHintSubstituteActions.ACTIONS_BUILDER);
  }

  public void addActionsBuilder(SideTransformHintSubstituteActionsBuilder node) {
    this.addChild(SideTransformHintSubstituteActions.ACTIONS_BUILDER, node);
  }

  public void insertActionsBuilder(SideTransformHintSubstituteActionsBuilder prev, SideTransformHintSubstituteActionsBuilder node) {
    this.insertChild(prev, SideTransformHintSubstituteActions.ACTIONS_BUILDER, node);
  }

  public static SideTransformHintSubstituteActions newInstance(SModel sm, boolean init) {
    return (SideTransformHintSubstituteActions) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SideTransformHintSubstituteActions newInstance(SModel sm) {
    return SideTransformHintSubstituteActions.newInstance(sm, false);
  }
}
