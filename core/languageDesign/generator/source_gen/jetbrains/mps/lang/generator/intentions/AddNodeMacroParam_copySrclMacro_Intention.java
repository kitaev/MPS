package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.lang.generator.editor.QueriesUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.Intention;

public class AddNodeMacroParam_copySrclMacro_Intention extends BaseIntention {

  private SNode myParameter;

  public AddNodeMacroParam_copySrclMacro_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isParameterized() {
    return true;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Node Macro CopySrcl: node." + BaseConcept_Behavior.call_getPresentation_1213877396640(this.myParameter);
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(SNodeOperations.getModel(node).getModelDescriptor().getModule() instanceof Generator)) {
      return false;
    }
    return QueriesUtil.isNodeMacroApplicable(node);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode nodeMacro = QueriesUtil.addNodeMacro(node);
    SNode copySrcListMacro = SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.CopySrcListMacro", null);
    SNodeOperations.replaceWithAnother(nodeMacro, copySrcListMacro);
    SNode referentValue = SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery", null);
    SNode dotExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
    SNode linkAccess = SConceptOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SLinkListAccess", null);
    SLinkOperations.setTarget(linkAccess, "link", this.myParameter, false);
    SLinkOperations.setTarget(dotExpression, "operation", linkAccess, true);
    SLinkOperations.setTarget(dotExpression, "operand", SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode", null), true);
    SNode expressionStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SLinkOperations.setTarget(expressionStatement, "expression", dotExpression, true);
    SLinkOperations.addChild(SLinkOperations.getTarget(referentValue, "body", true), "statement", expressionStatement);
    SLinkOperations.setTarget(copySrcListMacro, "sourceNodesQuery", referentValue, true);
    // set caret
    editorContext.selectAndSetCaret(copySrcListMacro, 2);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }


  private static List<SNode> parameter(final SNode node, final EditorContext editorContext) {
    SNode sourceNode = MacroIntentionsUtil.getContextNodeConcept_fast(node);
    if (sourceNode == null) {
      return null;
    }
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for(SNode child : AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(sourceNode)) {
      if (SPropertyOperations.hasValue(child, "sourceCardinality", "0..n", "0..1") || SPropertyOperations.hasValue(child, "sourceCardinality", "1..n", "0..1")) {
        ListSequence.fromList(result).addElement(child);
      }
    }
    return result;
  }

  public static List<Intention> instances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    List<SNode> paramList = parameter(node, editorContext);
    if (paramList != null) {
      for(SNode param : paramList) {
        AddNodeMacroParam_copySrclMacro_Intention intention = new AddNodeMacroParam_copySrclMacro_Intention();
        intention.myParameter = param;
        ListSequence.fromList(list).addElement(intention);
      }
    }
    return list;
  }

}
