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
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.ypath.behavior.IFeature_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class menu_FeatureSetOpposite extends AbstractCellMenuComponent {
  public menu_FeatureSetOpposite() {
    super(new SubstituteInfoPart[]{new menu_FeatureSetOpposite.IFeature_generic_cellMenu0()});
  }

  public static class IFeature_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {
    public IFeature_generic_cellMenu0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      List<Pair> res = ListSequence.fromList(new ArrayList<Pair>());
      final SNode srcNode = node;
      final boolean isGeneric = SNodeOperations.isInstanceOf(srcNode, "jetbrains.mps.ypath.structure.IGenericFeature");
      for (SNode fe : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(srcNode), "jetbrains.mps.ypath.structure.TreePathAspect"), "features", true)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return it != srcNode && ((isGeneric ?
            SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.IGenericFeature") :
            !(SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.IGenericFeature"))
          ));
        }
      })) {
        ListSequence.fromList(res).addElement(new Pair<SNode, Boolean>(fe, Boolean.TRUE));
        ListSequence.fromList(res).addElement(new Pair<SNode, Boolean>(fe, Boolean.FALSE));
      }
      return res;
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Pair)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Pair parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SNode fe = (SNode)parameterObject.o1;
      Boolean mu = (Boolean)parameterObject.o2;
      IFeature_Behavior.call_setOpposite_1213877499629(node, fe, mu);
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Pair)parameterObject);
    }

    public String getMatchingText_internal(Pair parameterObject) {
      SNode fe = (SNode)parameterObject.o1;
      Boolean mu = (Boolean)parameterObject.o2;
      return (mu ?
        "<-> " + SPropertyOperations.getString(fe, "name") :
        "<-  " + SPropertyOperations.getString(fe, "name")
      );
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Pair)parameterObject);
    }

    public String getDescriptionText_internal(Pair parameterObject) {
      SNode fe = (SNode)parameterObject.o1;
      Boolean mu = (Boolean)parameterObject.o2;
      return (mu ?
        "set mutual opposite feature" :
        "set opposite feature"
      );
    }
  }
}
