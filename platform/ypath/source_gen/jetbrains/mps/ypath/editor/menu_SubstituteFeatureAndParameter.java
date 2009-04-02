package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuComponent;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.util.Pair;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ypath.runtime.TraversalAxis;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ypath.behavior.TreePath_Behavior;
import jetbrains.mps.ypath.behavior.ITreePathExpression_Behavior;
import jetbrains.mps.ypath.actions.TraversalAxisUtil;
import jetbrains.mps.ypath.behavior.IParamFeature_Behavior;
import jetbrains.mps.smodel.SModel;

public class menu_SubstituteFeatureAndParameter extends AbstractCellMenuComponent {

  public menu_SubstituteFeatureAndParameter() {
    super(new SubstituteInfoPart[]{new menu_SubstituteFeatureAndParameter.IterateOperation_generic_cellMenu0()});
  }
  public static class IterateOperation_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public IterateOperation_generic_cellMenu0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      List<Pair> res = ListSequence.<Pair>fromArray();
      ListSequence.fromList(res).addElement(new Pair(null, null));
      TraversalAxis axis = TraversalAxis.parseValue(SPropertyOperations.getString_def(node, "axis", "DESCENDANTS"));
      SNode tpoe = SNodeOperations.getAncestor(node, "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
      if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(tpoe, "expression", true)), "jetbrains.mps.ypath.structure.TreePathType")) {
        SNode nodeType = SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(tpoe, "expression", true)), "nodeType", true);
        for(SNode feat : Sequence.fromIterable(TreePath_Behavior.call_getFeature_1213877481312(ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe), nodeType))) {
          if (TraversalAxisUtil.isAcceptableFeatureForAxis(feat, axis)) {
            if (SNodeOperations.isInstanceOf(feat, "jetbrains.mps.ypath.structure.IParamFeature")) {
              for(SNode pw : ListSequence.fromList(IParamFeature_Behavior.call_getParameterObjects_1213877340242(feat, nodeType))) {
                ListSequence.fromList(res).addElement(new Pair(feat, pw));
              }
            } else
            {
              ListSequence.fromList(res).addElement(new Pair(feat, null));
            }
          }
        }
      }
      return res;
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Pair)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Pair parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SNode fe = (SNode)parameterObject.o1;
      SNode pw = (SNode)parameterObject.o2;
      SLinkOperations.setTarget(node, "paramObject", pw, true);
      SLinkOperations.setTarget(node, "usedFeature", fe, false);
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Pair)parameterObject);
    }

    public String getMatchingText_internal(Pair parameterObject) {
      SNode fe = (SNode)parameterObject.o1;
      SNode pw = (SNode)parameterObject.o2;
      if ((fe == null)) {
        return "*";
      } else
      if ((pw != null)) {
        return SPropertyOperations.getString(pw, "name") + " | " + SPropertyOperations.getString(fe, "name");
      } else
      {
        return SPropertyOperations.getString(fe, "name");
      }
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Pair)parameterObject);
    }

    public String getDescriptionText_internal(Pair parameterObject) {
      SNode fe = (SNode)parameterObject.o1;
      if ((fe == null)) {
        return "all features";
      } else
      if (SNodeOperations.isInstanceOf(fe, "jetbrains.mps.ypath.structure.IParamFeature")) {
        return "parameterized feature in " + SPropertyOperations.getString(SNodeOperations.getParent(fe), "name");
      } else
      {
        return "feature in " + SPropertyOperations.getString(SNodeOperations.getParent(fe), "name");
      }
    }

}

}
