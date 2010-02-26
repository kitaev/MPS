package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import javax.swing.JComponent;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.CopyUtil;

public class OverrideConceptMethodStrategy extends BaseMethodUpdateStrategy {
  public OverrideConceptMethodStrategy() {
  }

  public void updateMethod(SNode sourceMethod, SNode method) {
    super.updateMethod(sourceMethod, method);
    Iterable<SNode> paramList = ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return new OverrideConceptMethodStrategy.QuotationClass_3gioqg_a0a0a0a0b0a().createNode(it);
      }
    });
    SNode superCallExpr = new OverrideConceptMethodStrategy.QuotationClass_3gioqg_a0a2a0().createNode(Sequence.fromIterable(paramList).toListSequence(), sourceMethod);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).addElement(new OverrideConceptMethodStrategy.QuotationClass_3gioqg_a0a0a0d0a().createNode(superCallExpr));
    } else {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).addElement(this.getReturnStatement(superCallExpr));
    }
  }

  public String getTitle() {
    return "Override Method";
  }

  public JComponent createAdditionalOptionsComponent() {
    return this.getReturnCheckBox();
  }

  public static class QuotationClass_3gioqg_a0a2a0 {
    public QuotationClass_3gioqg_a0a2a0() {
    }

    public SNode createNode(Object parameter_3gioqg_a0a0a0a2a0, Object parameter_3gioqg_a0a0a0c0a) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3gioqg_a0a2a0 = null;
      SNode quotedNode_3gioqg_a0a0c0a = null;
      SNode quotedNode_3gioqg_a0a0c0a_0 = null;
      SNode quotedNode_3gioqg_a0a0a2a0 = null;
      {
        quotedNode_3gioqg_a0a2a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3gioqg_a0a2a0 = quotedNode_3gioqg_a0a2a0;
        {
          quotedNode_3gioqg_a0a0c0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.SuperNodeExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_3gioqg_a0a0c0a = quotedNode_3gioqg_a0a0c0a;
          quotedNode_3gioqg_a0a2a0.addChild("operand", quotedNode1_3gioqg_a0a0c0a);
        }
        {
          quotedNode_3gioqg_a0a0c0a_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_3gioqg_a0a0c0a_0 = quotedNode_3gioqg_a0a0c0a_0;
          quotedNode1_3gioqg_a0a0c0a_0.setReferent("baseMethodDeclaration", (SNode) parameter_3gioqg_a0a0a0c0a);
          {
            List<SNode> nodes = (List<SNode>) parameter_3gioqg_a0a0a0a2a0;
            for (SNode child : nodes) {
              quotedNode_3gioqg_a0a0c0a_0.addChild("actualArgument", HUtil.copyIfNecessary(child));
            }
          }
          quotedNode_3gioqg_a0a2a0.addChild("operation", quotedNode1_3gioqg_a0a0c0a_0);
        }
        result = quotedNode1_3gioqg_a0a2a0;
      }
      return result;
    }
  }

  public static class QuotationClass_3gioqg_a0a0a0a0b0a {
    public QuotationClass_3gioqg_a0a0a0a0b0a() {
    }

    public SNode createNode(Object parameter_3gioqg_a0a0a0a0a0b0a) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3gioqg_a0a0a0a0b0a = null;
      {
        quotedNode_3gioqg_a0a0a0a0b0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3gioqg_a0a0a0a0b0a = quotedNode_3gioqg_a0a0a0a0b0a;
        quotedNode1_3gioqg_a0a0a0a0b0a.setReferent("variableDeclaration", (SNode) parameter_3gioqg_a0a0a0a0a0b0a);
        result = quotedNode1_3gioqg_a0a0a0a0b0a;
      }
      return result;
    }
  }

  public static class QuotationClass_3gioqg_a0a0a0d0a {
    public QuotationClass_3gioqg_a0a0a0d0a() {
    }

    public SNode createNode(Object parameter_3gioqg_a0a0a0a0a3a0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3gioqg_a0a0a0d0a = null;
      SNode quotedNode_3gioqg_a0a0a0a3a0 = null;
      {
        quotedNode_3gioqg_a0a0a0d0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3gioqg_a0a0a0d0a = quotedNode_3gioqg_a0a0a0d0a;
        {
          quotedNode_3gioqg_a0a0a0a3a0 = (SNode) parameter_3gioqg_a0a0a0a0a3a0;
          SNode quotedNode1_3gioqg_a0a0a0a3a0;
          if (_parameterValues_129834374.contains(quotedNode_3gioqg_a0a0a0a3a0)) {
            quotedNode1_3gioqg_a0a0a0a3a0 = CopyUtil.copy(quotedNode_3gioqg_a0a0a0a3a0);
          } else {
            _parameterValues_129834374.add(quotedNode_3gioqg_a0a0a0a3a0);
            quotedNode1_3gioqg_a0a0a0a3a0 = quotedNode_3gioqg_a0a0a0a3a0;
          }
          if (quotedNode1_3gioqg_a0a0a0a3a0 != null) {
            quotedNode_3gioqg_a0a0a0d0a.addChild("expression", HUtil.copyIfNecessary(quotedNode1_3gioqg_a0a0a0a3a0));
          }
        }
        result = quotedNode1_3gioqg_a0a0a0d0a;
      }
      return result;
    }
  }
}
