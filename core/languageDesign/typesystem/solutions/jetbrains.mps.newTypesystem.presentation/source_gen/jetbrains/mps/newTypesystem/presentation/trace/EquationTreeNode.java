package jetbrains.mps.newTypesystem.presentation.trace;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.LinkedList;
import jetbrains.mps.smodel.IOperationContext;
import java.util.Set;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.ide.projectPane.Icons;

public class EquationTreeNode extends TypeSystemStateTreeNode {
  private List<SNode> myVariables = new LinkedList();

  public EquationTreeNode(IOperationContext operationContext, SNode representative, Set<SNode> variables, State state, EditorComponent editorComponent) {
    super(operationContext);
    StringBuilder sb = new StringBuilder();
    for (SNode var : variables) {
      sb.append(var);
      sb.append(" = ");
    }
    sb.append(representative);
    setNodeIdentifier(sb.toString());
    variables.add(representative);
    myVariables.addAll(variables);
    setIcon(Icons.DEFAULT_ICON);
    setTooltipText(PresentationUtil.getVariablesTooltipPresentation(editorComponent, variables, state));
  }

  @Override
  public List<SNode> getVariables() {
    return myVariables;
  }
}
