package jetbrains.mps.ide.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.uiLanguage.structure.IComponentInstance;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.uiLanguage.structure.IComponentPart;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IDEDialog extends BaseConcept implements IComponentInstance {
  public static final String concept = "jetbrains.mps.ide.uiLanguage.structure.IDEDialog";
  public static final String TITLE = "title";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String STRETCH = "stretch";
  public static final String DIMENSIONS = "dimensions";
  public static final String CONTENT_PANE = "contentPane";
  public static final String BUTTON = "button";
  public static final String CONTENT = "content";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public IDEDialog(SNode node) {
    super(node);
  }

  public String getTitle() {
    return this.getProperty(IDEDialog.TITLE);
  }

  public void setTitle(String value) {
    this.setProperty(IDEDialog.TITLE, value);
  }

  public String getShortDescription() {
    return this.getProperty(IDEDialog.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(IDEDialog.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(IDEDialog.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(IDEDialog.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(IDEDialog.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(IDEDialog.VIRTUAL_PACKAGE, value);
  }

  public boolean getStretch() {
    return this.getBooleanProperty(IDEDialog.STRETCH);
  }

  public void setStretch(boolean value) {
    this.setBooleanProperty(IDEDialog.STRETCH, value);
  }

  public DialogDimensions getDimensions() {
    return (DialogDimensions) this.getChild(DialogDimensions.class, IDEDialog.DIMENSIONS);
  }

  public void setDimensions(DialogDimensions node) {
    super.setChild(IDEDialog.DIMENSIONS, node);
  }

  public IComponentInstance getContentPane() {
    return (IComponentInstance) this.getChild(IComponentInstance.class, IDEDialog.CONTENT_PANE);
  }

  public void setContentPane(IComponentInstance node) {
    super.setChild(IDEDialog.CONTENT_PANE, node);
  }

  public int getButtonsCount() {
    return this.getChildCount(IDEDialog.BUTTON);
  }

  public Iterator<IDEDialogButton> buttons() {
    return this.children(IDEDialogButton.class, IDEDialog.BUTTON);
  }

  public List<IDEDialogButton> getButtons() {
    return this.getChildren(IDEDialogButton.class, IDEDialog.BUTTON);
  }

  public void addButton(IDEDialogButton node) {
    this.addChild(IDEDialog.BUTTON, node);
  }

  public void insertButton(IDEDialogButton prev, IDEDialogButton node) {
    this.insertChild(prev, IDEDialog.BUTTON, node);
  }

  public int getContentsCount() {
    return this.getChildCount(IDEDialog.CONTENT);
  }

  public Iterator<IComponentPart> contents() {
    return this.children(IComponentPart.class, IDEDialog.CONTENT);
  }

  public List<IComponentPart> getContents() {
    return this.getChildren(IComponentPart.class, IDEDialog.CONTENT);
  }

  public void addContent(IComponentPart node) {
    this.addChild(IDEDialog.CONTENT, node);
  }

  public void insertContent(IComponentPart prev, IComponentPart node) {
    this.insertChild(prev, IDEDialog.CONTENT, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(IDEDialog.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, IDEDialog.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, IDEDialog.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(IDEDialog.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, IDEDialog.SMODEL_ATTRIBUTE, node);
  }

  public static IDEDialog newInstance(SModel sm, boolean init) {
    return (IDEDialog) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ide.uiLanguage.structure.IDEDialog", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IDEDialog newInstance(SModel sm) {
    return IDEDialog.newInstance(sm, false);
  }
}
