package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetReferentSearchScopeOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetReferentSearchScopeOperation";
  public static final String REFERENCE_LINK = "referenceLink";
  public static final String OPERATION_CONTEXT = "operationContext";

  public Node_GetReferentSearchScopeOperation(SNode node) {
    super(node);
  }

  public LinkDeclaration getReferenceLink() {
    return (LinkDeclaration)this.getReferent(LinkDeclaration.class, Node_GetReferentSearchScopeOperation.REFERENCE_LINK);
  }

  public void setReferenceLink(LinkDeclaration node) {
    super.setReferent(Node_GetReferentSearchScopeOperation.REFERENCE_LINK, node);
  }

  public Expression getOperationContext() {
    return (Expression)this.getChild(Expression.class, Node_GetReferentSearchScopeOperation.OPERATION_CONTEXT);
  }

  public void setOperationContext(Expression node) {
    super.setChild(Node_GetReferentSearchScopeOperation.OPERATION_CONTEXT, node);
  }


  public static Node_GetReferentSearchScopeOperation newInstance(SModel sm, boolean init) {
    return (Node_GetReferentSearchScopeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetReferentSearchScopeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetReferentSearchScopeOperation newInstance(SModel sm) {
    return Node_GetReferentSearchScopeOperation.newInstance(sm, false);
  }

}
