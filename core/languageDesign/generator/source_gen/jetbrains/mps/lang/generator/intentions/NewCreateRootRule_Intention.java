package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.util.Comparing;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class NewCreateRootRule_Intention extends BaseIntention {

  public NewCreateRootRule_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.INamedConcept";
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
    //  Creates new 'conditional root rule' for a root tamplate
    //  (if such rule is not exist yet)
    return "Create Conditional Root Rule";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    SNode annotation = SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), true);
    if (annotation == null) {
      return false;
    }
    if (SLinkOperations.getTarget(annotation, "applicableConcept", false) != null) {
      return false;
    }
    List<SNode> configs = SModelOperations.getRoots(SNodeOperations.getModel(node), "jetbrains.mps.lang.generator.structure.MappingConfiguration");
    if (ListSequence.fromList(configs).isEmpty()) {
      return false;
    }
    SNode usage = ListSequence.fromList(configs).findFirst(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return ListSequence.fromList(SLinkOperations.getTargets(it, "createRootRule", true)).findFirst(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SLinkOperations.getTarget(it, "templateNode", false) == node;
          }
        }) != null;
      }
    });
    //  not used in rule yet?
    return usage == null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    List<SNode> configs = SModelOperations.getRoots(SNodeOperations.getModel(node), "jetbrains.mps.lang.generator.structure.MappingConfiguration");
    if (ListSequence.fromList(configs).count() > 1) {
      Iterable<SNode> sameVPackConfigs = ListSequence.fromList(configs).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return Comparing.equal(SPropertyOperations.getString(it, "virtualPackage"), SPropertyOperations.getString(node, "virtualPackage"));
        }
      });
      if (Sequence.fromIterable(sameVPackConfigs).isNotEmpty()) {
        configs = Sequence.fromIterable(sameVPackConfigs).toListSequence();
      }
    }
    if (ListSequence.fromList(configs).count() > 1) {
      // TODO: let user to choose mapping config?
    }
    //  add new rule
    SNode rule = SLinkOperations.addNewChild(ListSequence.fromList(configs).first(), "createRootRule", "jetbrains.mps.lang.generator.structure.CreateRootRule");
    SLinkOperations.setTarget(rule, "templateNode", node, false);
    //  open in editor
    MPSEditorOpener opener = editorContext.getOperationContext().getComponent(MPSEditorOpener.class);
    opener.editNode(rule, editorContext.getOperationContext());
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

}
