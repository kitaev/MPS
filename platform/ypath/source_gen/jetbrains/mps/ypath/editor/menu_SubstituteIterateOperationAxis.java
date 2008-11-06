package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.Triplet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ypath.runtime.TraversalAxis;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ypath.behavior.TreePath_Behavior;
import jetbrains.mps.ypath.behavior.ITreePathExpression_Behavior;
import jetbrains.mps.ypath.actions.TraversalAxisUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.ypath.behavior.IParamFeature_Behavior;
import jetbrains.mps.smodel.SModel;

public class menu_SubstituteIterateOperationAxis extends AbstractCellMenuComponent {

  public menu_SubstituteIterateOperationAxis() {
    super(new SubstituteInfoPart[]{new menu_SubstituteIterateOperationAxis.IterateOperation_generic_cellMenu1()});
  }
  public static class IterateOperation_generic_cellMenu1 extends AbstractCellMenuPart_Generic_Group {

    public IterateOperation_generic_cellMenu1() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      SNode tpoe = SNodeOperations.getAncestor(node, "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
      List<Triplet> res = ListSequence.<Triplet>fromArray();
      if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(tpoe, "expression", true)), "jetbrains.mps.ypath.structure.TreePathType")) {
        SNode nodeType = SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(tpoe, "expression", true)), "nodeType", true);
        for(TraversalAxis axis : Sequence.fromIterable(TraversalAxis.getConstants())) {
          ListSequence.fromList(res).addElement(new Triplet(axis, null, null));
          for(SNode feat : Sequence.fromIterable(TreePath_Behavior.call_getFeature_1213877481312(ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe), nodeType))) {
            if (TraversalAxisUtil.isAcceptableFeatureForAxis(feat, axis)) {
              if (SPropertyOperations.getBoolean(feat, "default")) {
                ListSequence.fromList(res).addElement(new Triplet(axis, feat, null));
              } else
              if (SNodeOperations.isInstanceOf(feat, "jetbrains.mps.ypath.structure.IParamFeature")) {
                for(SNode pw : Sequence.fromIterable(IParamFeature_Behavior.call_getParameterObjects_1213877340242(feat, nodeType))) {
                  ListSequence.fromList(res).addElement(new Triplet(axis, feat, pw));
                }
              } else
              {
                ListSequence.fromList(res).addElement(new Triplet(axis, feat, null));
              }
            }
          }
        }
      }
      return res;
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Triplet)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Triplet parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      TraversalAxis axis = (TraversalAxis)parameterObject.first();
      SNode feat = (SNode)parameterObject.second();
      SNode pw = (SNode)parameterObject.third();
      SPropertyOperations.set(node, "axis", axis.getValue());
      SLinkOperations.setTarget(node, "usedFeature", feat, false);
      SLinkOperations.setTarget(node, "paramObject", pw, true);
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Triplet)parameterObject);
    }

    public String getMatchingText_internal(Triplet parameterObject) {
      TraversalAxis axis = (TraversalAxis)parameterObject.first();
      SNode feat = (SNode)parameterObject.second();
      SNode pw = (SNode)parameterObject.third();
      String suffix = "";
      if ((feat == null)) {
        suffix = " *";
      } else
      {
        if (SPropertyOperations.getBoolean(feat, "default")) {
          suffix = "";
        } else
        if ((pw != null)) {
          suffix = SPropertyOperations.getString(pw, "name");
        } else
        {
          suffix = SPropertyOperations.getString(feat, "name");
        }
      }
      return TraversalAxisUtil.getOperationSign(axis) + suffix;
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Triplet)parameterObject);
    }

    public String getDescriptionText_internal(Triplet parameterObject) {
      TraversalAxis axis = (TraversalAxis)parameterObject.first();
      SNode feat = (SNode)parameterObject.second();
      SNode pw = (SNode)parameterObject.third();
      String suffix = "";
      if ((feat == null)) {
        suffix = "all";
      } else
      {
        if (SPropertyOperations.getBoolean(feat, "default")) {
          suffix = "default";
        } else
        if ((pw != null)) {
          suffix = SPropertyOperations.getString(pw, "name") + " " + SPropertyOperations.getString(feat, "name");
        } else
        {
          suffix = SPropertyOperations.getString(feat, "name");
        }
      }
      return "iterate " + axis.getName() + " @" + suffix;
    }

}

}
