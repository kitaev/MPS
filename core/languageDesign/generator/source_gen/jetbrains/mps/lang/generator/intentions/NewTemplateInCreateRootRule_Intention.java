package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.nodeEditor.CreateFromUsageUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.Setter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class NewTemplateInCreateRootRule_Intention extends BaseIntention {

  public NewTemplateInCreateRootRule_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.generator.structure.CreateRootRule";
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
    return "New Root Template";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return SLinkOperations.getTarget(node, "templateNode", false) == null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    final Wrappers._T<String> name = new Wrappers._T<String>(CreateFromUsageUtil.getText(editorContext));
    if (name.value == null || name.value.length() == 0) {
      name.value = "_name_";
    }
    final SNode rule = node;
    CreateFromUsageUtil.showCreateNewRootMenu(editorContext, new Condition <SNode>() {

      public boolean met(SNode c) {
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.TemplateSwitch")) {
          return false;
        }
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.MappingConfiguration")) {
          return false;
        }
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
          return false;
        }
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.MappingScript")) {
          return false;
        }
        return true;
      }
    }, new Setter <SNode>() {

      public void set(SNode root) {
        if (!(SNodeOperations.isInstanceOf(root, "jetbrains.mps.lang.core.structure.INamedConcept"))) {
          return;
        }
        SPropertyOperations.set(SNodeOperations.cast(root, "jetbrains.mps.lang.core.structure.INamedConcept"), "name", name.value);
        SLinkOperations.setTarget(rule, "templateNode", SNodeOperations.cast(root, "jetbrains.mps.lang.core.structure.INamedConcept"), false);
      }
    });
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    ListSequence.fromList(list).addElement(this);
    return list;
  }

}
