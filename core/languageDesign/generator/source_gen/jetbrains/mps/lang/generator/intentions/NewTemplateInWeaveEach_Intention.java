package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.CreateFromUsageUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;

public class NewTemplateInWeaveEach_Intention extends BaseIntention {
  public NewTemplateInWeaveEach_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.generator.structure.WeaveEach_RuleConsequence";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
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
    return (SLinkOperations.getTarget(node, "template", false) == null) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.generator.structure.Weaving_MappingRule");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode applicableConcept = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.lang.generator.structure.Weaving_MappingRule"), "applicableConcept", false);
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
    //  initialize 'content node'
    SNode ownerRule = SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.Weaving_MappingRule", false, false);
    SNode contextNodeType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(ownerRule, "jetbrains.mps.lang.generator.structure.Weaving_MappingRule"), "contextNodeQuery", true));
    if (SNodeOperations.isInstanceOf(contextNodeType, "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      SNode contextNodeConcept = SLinkOperations.getTarget(SNodeOperations.cast(contextNodeType, "jetbrains.mps.lang.smodel.structure.SNodeType"), "concept", false);
      if (contextNodeConcept != SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept")) {
        if (!(SNodeOperations.isInstanceOf(contextNodeConcept, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration"))) {
          SLinkOperations.setTarget(t, "contentNode", SConceptOperations.createNewNode(NameUtil.nodeFQName(contextNodeConcept), null), true);
        }
      }
    }
    //  make reference
    SLinkOperations.setTarget(node, "template", t, false);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }
}
