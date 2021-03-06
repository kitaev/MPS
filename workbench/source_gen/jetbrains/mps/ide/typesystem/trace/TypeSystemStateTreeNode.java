package jetbrains.mps.ide.typesystem.trace;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.typesystem.util.GoToTypeErrorRuleUtil;
import jetbrains.mps.util.Pair;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import java.util.List;

public class TypeSystemStateTreeNode extends MPSTreeNode {
  protected SNode myNode;
  protected String myRuleModel;
  protected String myRuleId;
  protected State myState;

  public TypeSystemStateTreeNode(IOperationContext operationContext) {
    super(operationContext);
  }

  public TypeSystemStateTreeNode(String presentation, IOperationContext operationContext) {
    super(presentation, operationContext);
    setNodeIdentifier(userObject.toString());
    setIcon(Icons.DEFAULT_ICON);
    this.setAutoExpandable(true);
  }

  public void goToRule() {
    if (myRuleId != null && myRuleModel != null) {
      GoToTypeErrorRuleUtil.goToRuleById(getOperationContext(), new Pair<String, String>(myRuleModel, myRuleId));
    }
  }

  public void goToNode() {
    if (myNode != null && myNode.isRegistered()) {
      getOperationContext().getComponent(MPSEditorOpener.class).editNode(myNode, getOperationContext());
    }
  }

  public List<SNode> getVariables() {
    return null;
  }

  public String getRuleModel() {
    return myRuleModel;
  }

  public String getRuleId() {
    return myRuleId;
  }

  public SNode getSource() {
    return myNode;
  }
}
