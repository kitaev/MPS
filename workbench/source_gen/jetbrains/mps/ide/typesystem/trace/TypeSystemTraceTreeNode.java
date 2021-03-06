package jetbrains.mps.ide.typesystem.trace;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import java.util.Map;
import java.awt.Color;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.newTypesystem.operation.AbstractOperation;
import jetbrains.mps.ide.projectPane.Icons;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.HashMap;
import jetbrains.mps.newTypesystem.operation.PresentationKind;

public class TypeSystemTraceTreeNode extends MPSTreeNode {
  private static final Map<String, Color> COLOR_MAP = initColors();

  public TypeSystemTraceTreeNode(Object userObject, IOperationContext operationContext, State state, EditorComponent editorComponent) {
    super(userObject, operationContext);
    AbstractOperation operation = (AbstractOperation) userObject;
    this.setAutoExpandable(true);
    this.setIcon(Icons.DEFAULT_ICON);
    List<SNode> variables = operation.getVariables();
    if (variables != null) {
      setTooltipText(PresentationUtil.getVariablesTooltipPresentation(editorComponent, variables, state));
    }
    String nodeId = operation.getPresentation();
    SNode source = operation.getSource();
    if (source != null) {
      nodeId += source.getId();
    } else if (operation.getRule() != null) {
      nodeId += operation.getRule().o2;
    }
    setNodeIdentifier(nodeId);
    setText(operation.getPresentation());
  }

  public TypeSystemTraceTreeNode(Object userObject, IOperationContext operationContext) {
    super(userObject, operationContext);
    AbstractOperation operation = (AbstractOperation) userObject;
    setNodeIdentifier(operation.getPresentation());
    this.setAutoExpandable(true);
    this.setIcon(Icons.DEFAULT_ICON);
  }

  public void doUpdatePresentation() {
    super.doUpdatePresentation();
    AbstractOperation difference = (AbstractOperation) getUserObject();
    setColor(getOperationColor(difference));
  }

  private Color getOperationColor(AbstractOperation difference) {
    String colorId = difference.getPresentationKind();
    Color color = TypeSystemTraceTreeNode.COLOR_MAP.get(colorId);
    return (color != null ?
      color :
      Color.BLACK
    );
  }

  private static Map<String, Color> initColors() {
    Map<String, Color> result = new HashMap<String, Color>();
    result.put(PresentationKind.EQUATION_ADDED, new Color(6751077));
    result.put(PresentationKind.RELATION_ADDED, new Color(119));
    result.put(PresentationKind.RELATION_REMOVED, new Color(1144763));
    result.put(PresentationKind.WHEN_CONCRETE_ADDED, new Color(4486912));
    result.put(PresentationKind.WHEN_CONCRETE_REMOVED, new Color(7816192));
    result.put(PresentationKind.ERROR_ADDED, Color.RED);
    result.put(PresentationKind.TRACE_WARNING, new Color(200, 10, 10));
    result.put(PresentationKind.TRACE_MESSAGE, new Color(0, 0, 255));
    result.put(PresentationKind.TYPE_ASSIGNED, new Color(30464));
    result.put(PresentationKind.TYPE_EXPANDED, new Color(34564));
    result.put(PresentationKind.TYPE_REMOVED, new Color(10066329));
    result.put(PresentationKind.DEFAULT, Color.BLACK);
    return result;
  }
}
