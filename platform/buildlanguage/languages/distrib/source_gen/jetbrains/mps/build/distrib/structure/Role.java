package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Role extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.distrib.structure.Role";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public Role(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Role.NAME);
  }

  public void setName(String value) {
    this.setProperty(Role.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Role.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Role.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Role.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Role.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Role.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Role.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(Role._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, Role._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, Role._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(Role._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Role._$ATTRIBUTE, node);
  }

  public static Role newInstance(SModel sm, boolean init) {
    return (Role) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.Role", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Role newInstance(SModel sm) {
    return Role.newInstance(sm, false);
  }
}
