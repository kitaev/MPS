package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionDeclaration extends BaseConcept implements IClassifier, ICheckedNamePolicy {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ActionDeclaration";
  public static final String ICON_PATH = "iconPath";
  public static final String CAPTION = "caption";
  public static final String DESCRIPTION = "description";
  public static final String MNEMONIC = "mnemonic";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_ALWAYS_VISIBLE = "isAlwaysVisible";
  public static final String OUTSIDE_COMMAND_EXECUTION = "outsideCommandExecution";
  public static final String UPDATE_BLOCK = "updateBlock";
  public static final String EXECUTE_FUNCTION = "executeFunction";
  public static final String KEYSTROKE = "keystroke";
  public static final String METHOD_DECLARATION = "methodDeclaration";
  public static final String PARAMETER = "parameter";
  public static final String CONSTRUCTION_PARAMETER = "constructionParameter";
  public static final String PLACES = "places";

  public ActionDeclaration(SNode node) {
    super(node);
  }

  public String getIconPath() {
    return this.getProperty(ActionDeclaration.ICON_PATH);
  }

  public void setIconPath(String value) {
    this.setProperty(ActionDeclaration.ICON_PATH, value);
  }

  public String getCaption() {
    return this.getProperty(ActionDeclaration.CAPTION);
  }

  public void setCaption(String value) {
    this.setProperty(ActionDeclaration.CAPTION, value);
  }

  public String getDescription() {
    return this.getProperty(ActionDeclaration.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(ActionDeclaration.DESCRIPTION, value);
  }

  public String getMnemonic() {
    return this.getProperty(ActionDeclaration.MNEMONIC);
  }

  public void setMnemonic(String value) {
    this.setProperty(ActionDeclaration.MNEMONIC, value);
  }

  public String getName() {
    return this.getProperty(ActionDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ActionDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ActionDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsAlwaysVisible() {
    return this.getBooleanProperty(ActionDeclaration.IS_ALWAYS_VISIBLE);
  }

  public void setIsAlwaysVisible(boolean value) {
    this.setBooleanProperty(ActionDeclaration.IS_ALWAYS_VISIBLE, value);
  }

  public boolean getOutsideCommandExecution() {
    return this.getBooleanProperty(ActionDeclaration.OUTSIDE_COMMAND_EXECUTION);
  }

  public void setOutsideCommandExecution(boolean value) {
    this.setBooleanProperty(ActionDeclaration.OUTSIDE_COMMAND_EXECUTION, value);
  }

  public UpdateBlock getUpdateBlock() {
    return (UpdateBlock)this.getChild(UpdateBlock.class, ActionDeclaration.UPDATE_BLOCK);
  }

  public void setUpdateBlock(UpdateBlock node) {
    super.setChild(ActionDeclaration.UPDATE_BLOCK, node);
  }

  public ExecuteBlock getExecuteFunction() {
    return (ExecuteBlock)this.getChild(ExecuteBlock.class, ActionDeclaration.EXECUTE_FUNCTION);
  }

  public void setExecuteFunction(ExecuteBlock node) {
    super.setChild(ActionDeclaration.EXECUTE_FUNCTION, node);
  }

  public KeyMapKeystroke getKeystroke() {
    return (KeyMapKeystroke)this.getChild(KeyMapKeystroke.class, ActionDeclaration.KEYSTROKE);
  }

  public void setKeystroke(KeyMapKeystroke node) {
    super.setChild(ActionDeclaration.KEYSTROKE, node);
  }

  public int getMethodDeclarationsCount() {
    return this.getChildCount(ActionDeclaration.METHOD_DECLARATION);
  }

  public Iterator<DefaultClassifierMethodDeclaration> methodDeclarations() {
    return this.children(DefaultClassifierMethodDeclaration.class, ActionDeclaration.METHOD_DECLARATION);
  }

  public List<DefaultClassifierMethodDeclaration> getMethodDeclarations() {
    return this.getChildren(DefaultClassifierMethodDeclaration.class, ActionDeclaration.METHOD_DECLARATION);
  }

  public void addMethodDeclaration(DefaultClassifierMethodDeclaration node) {
    this.addChild(ActionDeclaration.METHOD_DECLARATION, node);
  }

  public void insertMethodDeclaration(DefaultClassifierMethodDeclaration prev, DefaultClassifierMethodDeclaration node) {
    this.insertChild(prev, ActionDeclaration.METHOD_DECLARATION, node);
  }

  public int getParametersCount() {
    return this.getChildCount(ActionDeclaration.PARAMETER);
  }

  public Iterator<ActionParameter> parameters() {
    return this.children(ActionParameter.class, ActionDeclaration.PARAMETER);
  }

  public List<ActionParameter> getParameters() {
    return this.getChildren(ActionParameter.class, ActionDeclaration.PARAMETER);
  }

  public void addParameter(ActionParameter node) {
    this.addChild(ActionDeclaration.PARAMETER, node);
  }

  public void insertParameter(ActionParameter prev, ActionParameter node) {
    this.insertChild(prev, ActionDeclaration.PARAMETER, node);
  }

  public int getConstructionParametersCount() {
    return this.getChildCount(ActionDeclaration.CONSTRUCTION_PARAMETER);
  }

  public Iterator<ActionConstructionParameterDeclaration> constructionParameters() {
    return this.children(ActionConstructionParameterDeclaration.class, ActionDeclaration.CONSTRUCTION_PARAMETER);
  }

  public List<ActionConstructionParameterDeclaration> getConstructionParameters() {
    return this.getChildren(ActionConstructionParameterDeclaration.class, ActionDeclaration.CONSTRUCTION_PARAMETER);
  }

  public void addConstructionParameter(ActionConstructionParameterDeclaration node) {
    this.addChild(ActionDeclaration.CONSTRUCTION_PARAMETER, node);
  }

  public void insertConstructionParameter(ActionConstructionParameterDeclaration prev, ActionConstructionParameterDeclaration node) {
    this.insertChild(prev, ActionDeclaration.CONSTRUCTION_PARAMETER, node);
  }

  public int getPlacesesCount() {
    return this.getChildCount(ActionDeclaration.PLACES);
  }

  public Iterator<ActionPlaceSpecification> placeses() {
    return this.children(ActionPlaceSpecification.class, ActionDeclaration.PLACES);
  }

  public List<ActionPlaceSpecification> getPlaceses() {
    return this.getChildren(ActionPlaceSpecification.class, ActionDeclaration.PLACES);
  }

  public void addPlaces(ActionPlaceSpecification node) {
    this.addChild(ActionDeclaration.PLACES, node);
  }

  public void insertPlaces(ActionPlaceSpecification prev, ActionPlaceSpecification node) {
    this.insertChild(prev, ActionDeclaration.PLACES, node);
  }


  public static ActionDeclaration newInstance(SModel sm, boolean init) {
    return (ActionDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionDeclaration newInstance(SModel sm) {
    return ActionDeclaration.newInstance(sm, false);
  }

}
