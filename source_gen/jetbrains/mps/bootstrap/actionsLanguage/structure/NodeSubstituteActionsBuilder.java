package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class NodeSubstituteActionsBuilder extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder";
  public static String PRECONDITION = "precondition";
  public static String COMMON_INITIALIZER = "commonInitializer";
  public static String PART = "part";
  public static String VARIABLE = "variable";
  public static String APPLICABLE_CONCEPT = "applicableConcept";
  public static String DESCRIPTION = "description";
  public static String ACTIONS_FACTORY_ASPECT_ID = "actionsFactoryAspectId";
  public static String ACTIONS_FILTER_ASPECT_ID = "actionsFilterAspectId";
  public static String PRECONDITION_ASPECT_ID = "preconditionAspectId";
  public static String USE_NEW_ACTIONS = "useNewActions";

  public  NodeSubstituteActionsBuilder(SNode node) {
    super(node);
  }

  public static NodeSubstituteActionsBuilder newInstance(SModel sm, boolean init) {
    return (NodeSubstituteActionsBuilder)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeSubstituteActionsBuilder newInstance(SModel sm) {
    return NodeSubstituteActionsBuilder.newInstance(sm, false);
  }


  public NodeSubstitutePreconditionFunction getPrecondition() {
    return (NodeSubstitutePreconditionFunction)this.getChild(NodeSubstituteActionsBuilder.PRECONDITION);
  }

  public void setPrecondition(NodeSubstitutePreconditionFunction node) {
    super.setChild(NodeSubstituteActionsBuilder.PRECONDITION, node);
  }

  public QueryFunction_Substitute_CommonInitializer getCommonInitializer() {
    return (QueryFunction_Substitute_CommonInitializer)this.getChild(NodeSubstituteActionsBuilder.COMMON_INITIALIZER);
  }

  public void setCommonInitializer(QueryFunction_Substitute_CommonInitializer node) {
    super.setChild(NodeSubstituteActionsBuilder.COMMON_INITIALIZER, node);
  }

  public int getPartsCount() {
    return this.getChildCount(NodeSubstituteActionsBuilder.PART);
  }

  public Iterator<MenuBuilderPart> parts() {
    return this.children(NodeSubstituteActionsBuilder.PART);
  }

  public List<MenuBuilderPart> getParts() {
    return this.getChildren(NodeSubstituteActionsBuilder.PART);
  }

  public void addPart(MenuBuilderPart node) {
    this.addChild(NodeSubstituteActionsBuilder.PART, node);
  }

  public void insertPart(MenuBuilderPart prev, MenuBuilderPart node) {
    this.insertChild(prev, NodeSubstituteActionsBuilder.PART, node);
  }

  public int getVariablesCount() {
    return this.getChildCount(NodeSubstituteActionsBuilder.VARIABLE);
  }

  public Iterator<SubstituteNodeBuilderVariableDeclaration> variables() {
    return this.children(NodeSubstituteActionsBuilder.VARIABLE);
  }

  public List<SubstituteNodeBuilderVariableDeclaration> getVariables() {
    return this.getChildren(NodeSubstituteActionsBuilder.VARIABLE);
  }

  public void addVariable(SubstituteNodeBuilderVariableDeclaration node) {
    this.addChild(NodeSubstituteActionsBuilder.VARIABLE, node);
  }

  public void insertVariable(SubstituteNodeBuilderVariableDeclaration prev, SubstituteNodeBuilderVariableDeclaration node) {
    this.insertChild(prev, NodeSubstituteActionsBuilder.VARIABLE, node);
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration)this.getReferent(NodeSubstituteActionsBuilder.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(NodeSubstituteActionsBuilder.APPLICABLE_CONCEPT, node);
  }

  public String getDescription() {
    return this.getProperty(NodeSubstituteActionsBuilder.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.DESCRIPTION, value);
  }

  public String getActionsFactoryAspectId() {
    return this.getProperty(NodeSubstituteActionsBuilder.ACTIONS_FACTORY_ASPECT_ID);
  }

  public void setActionsFactoryAspectId(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.ACTIONS_FACTORY_ASPECT_ID, value);
  }

  public String getActionsFilterAspectId() {
    return this.getProperty(NodeSubstituteActionsBuilder.ACTIONS_FILTER_ASPECT_ID);
  }

  public void setActionsFilterAspectId(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.ACTIONS_FILTER_ASPECT_ID, value);
  }

  public String getPreconditionAspectId() {
    return this.getProperty(NodeSubstituteActionsBuilder.PRECONDITION_ASPECT_ID);
  }

  public void setPreconditionAspectId(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.PRECONDITION_ASPECT_ID, value);
  }

  public boolean getUseNewActions() {
    return this.getBooleanProperty(NodeSubstituteActionsBuilder.USE_NEW_ACTIONS);
  }

  public void setUseNewActions(boolean value) {
    this.setBooleanProperty(NodeSubstituteActionsBuilder.USE_NEW_ACTIONS, value);
  }

}
