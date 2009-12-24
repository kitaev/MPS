package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GroupAnchor extends BaseConcept implements INamedConcept, ActionGroupMember {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.GroupAnchor";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public GroupAnchor(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(GroupAnchor.NAME);
  }

  public void setName(String value) {
    this.setProperty(GroupAnchor.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(GroupAnchor.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GroupAnchor.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GroupAnchor.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GroupAnchor.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GroupAnchor.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GroupAnchor.VIRTUAL_PACKAGE, value);
  }

  public static GroupAnchor newInstance(SModel sm, boolean init) {
    return (GroupAnchor) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GroupAnchor", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GroupAnchor newInstance(SModel sm) {
    return GroupAnchor.newInstance(sm, false);
  }
}
