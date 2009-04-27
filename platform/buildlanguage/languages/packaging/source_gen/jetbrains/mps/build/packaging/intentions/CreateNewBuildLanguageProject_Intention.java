package jetbrains.mps.build.packaging.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.intentions.Intention;

public class CreateNewBuildLanguageProject_Intention extends BaseIntention {

  public CreateNewBuildLanguageProject_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.build.packaging.structure.Antcall";
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
    return "Create new buildlanguage project";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "project", false) == null) && (SLinkOperations.getTarget(node, "targetDeclaration", false) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode project = SConceptOperations.createNewNode("jetbrains.mps.buildlanguage.structure.Project", null);
    List<String> externalProps = ListSequence.fromListAndArray(new ArrayList<String>(), "input.dir", "output.dir", "deploy.dir");
    for(String prop : ListSequence.fromList(externalProps)) {
      SNode property = SConceptOperations.createNewNode("jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration", null);
      SPropertyOperations.set(property, "name", prop);
      SLinkOperations.setTarget(property, "type", SConceptOperations.createNewNode("jetbrains.mps.buildlanguage.structure.FileType", null), true);
      SLinkOperations.addChild(project, "property", property);
    }
    SModel model = editorContext.getModel();
    model.addRoot(project);
    SLinkOperations.setTarget(node, "project", project, false);
    SLinkOperations.setTarget(node, "targetDeclaration", SLinkOperations.getTarget(SLinkOperations.getTarget(project, "default", true), "targetDeclaration", false), false);
    MPSEditorOpener opener = editorContext.getOperationContext().getProject().getComponent(MPSEditorOpener.class);
    opener.openNode(project);
  }

  public String getLocationString() {
    return "jetbrains.mps.build.packaging.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    ListSequence.fromList(list).addElement(this);
    return list;
  }

}
