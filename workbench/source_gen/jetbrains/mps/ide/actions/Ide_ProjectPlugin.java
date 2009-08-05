package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.workbench.editors.MPSEditorOpenHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.IConceptAspect_Behavior;
import jetbrains.mps.ide.conceptEditor.ConceptEditorOpenHelper;
import jetbrains.mps.ide.IEditor;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Ide_ProjectPlugin extends BaseProjectPlugin {

  public void initEditors(MPSProject project) {
    MPSEditorOpener opener = project.getComponent(MPSEditorOpener.class);
    opener.registerOpenHandler(new MPSEditorOpenHandler() {

      public SNode getBaseNode(IOperationContext context, SNode node) {
        SNode baseNode = null;
        if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.IConceptAspect")) {
          baseNode = IConceptAspect_Behavior.call_getBaseConcept_2621449412040133768(SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.IConceptAspect"));
        }
        if (baseNode == null) {
          baseNode = ConceptEditorOpenHelper.getBaseNode(context, node);
        }
        if (baseNode == null) {
          return null;
        }
        if (!(ConceptEditorOpenHelper.canOpen(context, baseNode))) {
          return null;
        }
        return baseNode;
      }

      public boolean canOpen(IOperationContext context, SNode node) {
        return node.isInstanceOfConcept("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
      }

      public IEditor open(IOperationContext context, SNode node) {
        return new ConceptDeclaration_TabbedEditor(context, node);
      }
    }, this);
  }

  public List<GeneratedTool> initTools(Project project) {
    List<GeneratedTool> tools = ListSequence.fromList(new ArrayList<GeneratedTool>());
    ListSequence.fromList(tools).addElement(new NodeExplorer_Tool(project));
    ListSequence.fromList(tools).addElement(new ModuleRepository_Tool(project));
    ListSequence.fromList(tools).addElement(new ModelRepository_Tool(project));
    return tools;
  }

}
