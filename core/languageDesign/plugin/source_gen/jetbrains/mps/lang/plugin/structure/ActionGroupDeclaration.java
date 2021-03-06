package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionGroupDeclaration extends BaseConcept implements INamedConcept, ActionGroupMember, IClassifier, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration";
  public static final String CAPTION = "caption";
  public static final String MNEMONIC = "mnemonic";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_INTERNAL = "isInternal";
  public static final String IS_POPUP = "isPopup";
  public static final String IS_INVISIBLE_WHEN_DISABLED = "isInvisibleWhenDisabled";
  public static final String CONTENTS = "contents";
  public static final String MODIFIER = "modifier";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ActionGroupDeclaration(SNode node) {
    super(node);
  }

  public String getCaption() {
    return this.getProperty(ActionGroupDeclaration.CAPTION);
  }

  public void setCaption(String value) {
    this.setProperty(ActionGroupDeclaration.CAPTION, value);
  }

  public String getMnemonic() {
    return this.getProperty(ActionGroupDeclaration.MNEMONIC);
  }

  public void setMnemonic(String value) {
    this.setProperty(ActionGroupDeclaration.MNEMONIC, value);
  }

  public String getName() {
    return this.getProperty(ActionGroupDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ActionGroupDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ActionGroupDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionGroupDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionGroupDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionGroupDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionGroupDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionGroupDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsInternal() {
    return this.getBooleanProperty(ActionGroupDeclaration.IS_INTERNAL);
  }

  public void setIsInternal(boolean value) {
    this.setBooleanProperty(ActionGroupDeclaration.IS_INTERNAL, value);
  }

  public boolean getIsPopup() {
    return this.getBooleanProperty(ActionGroupDeclaration.IS_POPUP);
  }

  public void setIsPopup(boolean value) {
    this.setBooleanProperty(ActionGroupDeclaration.IS_POPUP, value);
  }

  public boolean getIsInvisibleWhenDisabled() {
    return this.getBooleanProperty(ActionGroupDeclaration.IS_INVISIBLE_WHEN_DISABLED);
  }

  public void setIsInvisibleWhenDisabled(boolean value) {
    this.setBooleanProperty(ActionGroupDeclaration.IS_INVISIBLE_WHEN_DISABLED, value);
  }

  public GroupContents getContents() {
    return (GroupContents) this.getChild(GroupContents.class, ActionGroupDeclaration.CONTENTS);
  }

  public void setContents(GroupContents node) {
    super.setChild(ActionGroupDeclaration.CONTENTS, node);
  }

  public int getModifiersCount() {
    return this.getChildCount(ActionGroupDeclaration.MODIFIER);
  }

  public Iterator<ModificationStatement> modifiers() {
    return this.children(ModificationStatement.class, ActionGroupDeclaration.MODIFIER);
  }

  public List<ModificationStatement> getModifiers() {
    return this.getChildren(ModificationStatement.class, ActionGroupDeclaration.MODIFIER);
  }

  public void addModifier(ModificationStatement node) {
    this.addChild(ActionGroupDeclaration.MODIFIER, node);
  }

  public void insertModifier(ModificationStatement prev, ModificationStatement node) {
    this.insertChild(prev, ActionGroupDeclaration.MODIFIER, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ActionGroupDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ActionGroupDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ActionGroupDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ActionGroupDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ActionGroupDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static ActionGroupDeclaration newInstance(SModel sm, boolean init) {
    return (ActionGroupDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionGroupDeclaration newInstance(SModel sm) {
    return ActionGroupDeclaration.newInstance(sm, false);
  }
}
