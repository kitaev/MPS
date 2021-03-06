package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.openapi.project.Project;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class NodeNavigationItem {
  private SNode myNode;
  private IOperationContext myContext;
  private Project myProject;

  public NodeNavigationItem(SNode node, IOperationContext context, Project project) {
    myNode = node;
    myContext = context;
    myProject = project;
  }

  public SNode getNode() {
    return myNode;
  }

  public void navigate() {
    new MPSEditorOpener(myProject).openNode(myNode, myContext, true, true);
  }
}
