package jetbrains.mps.lang.core.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_Constraints_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_Constraints_NonTypesystemRule() {
  }

  public void applyRule(final SNode baseConcept, final TypeCheckingContext typeCheckingContext) {
    IOperationContext operationContext = typeCheckingContext.getOperationContext();
    if (operationContext == null) {
      return;
    }

    SNode node = baseConcept;
    ModelConstraintsManager cm = ModelConstraintsManager.getInstance();

    if (!(node.isAttribute())) {
      if (node.getParent() != null && !(node.getParent().isUnknown())) {
        String role = node.getRole_();
        LinkDeclaration link = node.getParent().getLinkDeclaration(role);

        if (link == null) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Child in a role with unknown link", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "4950342498455637390", intentionProvider, errorTarget);
          }
          return;
        }

        boolean canBeChild = cm.canBeChild(node.getConceptFqName(), operationContext, node.getParent(), link.getNode());
        if (!(canBeChild)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Node isn't applicable in the context", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "5622704259074610949", intentionProvider, errorTarget);
            {
              SNode _foreign_34989546 = cm.getCanBeChildBlock(operationContext, node.getConceptFqName());
              _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
            }
          }
        }
      }

      if (node.isRoot()) {
        boolean canBeRoot = cm.canBeRoot(operationContext, node.getConceptFqName(), node.getModel());
        if (!(canBeRoot)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Not rootable concept added as root", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "5622704259074611001", intentionProvider, errorTarget);
            {
              SNode _foreign_34989546 = cm.getCanBeRootBlock(operationContext, node.getConceptFqName());
              _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
            }
          }
        }
      }
    }

    for (SNode child : node.getChildren()) {
      SNode childConcept = BaseAdapter.fromAdapter(child.getConceptDeclarationAdapter());
      LinkDeclaration link = node.getLinkDeclaration(child.getRole_());
      if (link == null) {
        continue;
      }
      if (!(cm.canBeParent(node, childConcept, link.getNode(), operationContext))) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Node isn't applicable in the context", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "5622704259074611096", intentionProvider, errorTarget);
          {
            SNode _foreign_34989546 = cm.getCanBeParentBlock(node, operationContext);
            _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
          }
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
