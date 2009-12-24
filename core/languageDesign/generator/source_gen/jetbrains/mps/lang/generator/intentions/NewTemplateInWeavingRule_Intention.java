package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.nodeEditor.CreateFromUsageUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.NameUtil;

public class NewTemplateInWeavingRule_Intention extends BaseIntention implements Intention {
  public NewTemplateInWeavingRule_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.generator.structure.Weaving_MappingRule";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "New Template";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if (editorContext.getSelectedCell().getLinkDeclaration() != ((LinkDeclaration) SNodeOperations.getAdapter(SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.generator.structure.Weaving_MappingRule", "ruleConsequence")))) {
      return false;
    }
    return SLinkOperations.getTarget(node, "ruleConsequence", true) == null || SConceptOperations.isExactly(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(node, "ruleConsequence", true)), "jetbrains.mps.lang.generator.structure.RuleConsequence");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode applicableConcept = SLinkOperations.getTarget(node, "applicableConcept", false);
    String name = CreateFromUsageUtil.getText(editorContext);
    if (name == null || name.length() == 0) {
      name = "weave_";
      if (applicableConcept != null) {
        name += SPropertyOperations.getString(applicableConcept, "name");
      }
    }
    SNode t = SModelOperations.createNewRootNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.generator.structure.TemplateDeclaration", null);
    SPropertyOperations.set(t, "name", name);
    SLinkOperations.setTarget(t, "applicableConcept", applicableConcept, false);
    t.setProperty(SModelTreeNode.PACK, SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getContainingRoot(node), "jetbrains.mps.lang.core.structure.BaseConcept"), "virtualPackage"));
    //  initialize 'content node' in template  
    SNode contextNodeType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(node, "jetbrains.mps.lang.generator.structure.Weaving_MappingRule"), "contextNodeQuery", true));
    if (SNodeOperations.isInstanceOf(contextNodeType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      SNode contextNodeConcept = SLinkOperations.getTarget(SNodeOperations.cast(contextNodeType, "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false);
      if (contextNodeConcept != SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept")) {
        if (!(SNodeOperations.isInstanceOf(contextNodeConcept, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration"))) {
          SLinkOperations.setTarget(t, "contentNode", SConceptOperations.createNewNode(NameUtil.nodeFQName(contextNodeConcept), null), true);
        }
      }
    }
    // make reference 
    SNode tr = SLinkOperations.setNewChild(node, "ruleConsequence", "jetbrains.mps.lang.generator.structure.TemplateDeclarationReference");
    SLinkOperations.setTarget(tr, "template", t, false);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }
}
