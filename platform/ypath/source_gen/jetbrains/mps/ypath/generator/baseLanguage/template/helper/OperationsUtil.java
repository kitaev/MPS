package jetbrains.mps.ypath.generator.baseLanguage.template.helper;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.ypath.behavior.ITreePathExpression_Behavior;
import jetbrains.mps.ypath.runtime.TraversalAxis;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.ypath.actions.TraversalAxisUtil;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ypath.behavior.IParamFeature_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class OperationsUtil {

  public static List<SNode> substituteApplicableOperations(SNode wildCardOp) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(wildCardOp, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature") && (SLinkOperations.getTarget(wildCardOp, "paramObject", true) != null)) {
      return ListSequence.<SNode>fromArray(wildCardOp);
    }
    SNode tpoe = SNodeOperations.getAncestor(wildCardOp, "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false);
    final SNode nodeType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(tpoe, "expression", true));
    SNode tp = ITreePathExpression_Behavior.call_getTreePath_1213877496973(tpoe);
    final TraversalAxis axis = TraversalAxis.parseValue(SPropertyOperations.getString_def(wildCardOp, "axis", "DESCENDANTS"));
    List<SNode> features = ((SLinkOperations.getTarget(wildCardOp, "usedFeature", false) == null) ?
      ListSequence.fromList(SLinkOperations.getTargets(tp, "features", true)).where(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return TraversalAxisUtil.isAcceptableFeatureForAxis(it, axis);
        }

      }).toListSequence() :
      ListSequence.<SNode>fromArray(SLinkOperations.getTarget(wildCardOp, "usedFeature", false))
    );
    return ListSequence.fromList(features).translate(new ITranslator2 <SNode, SNode>() {

      public Iterable<SNode> translate(final SNode it) {
        return new Iterable <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _10_io;
              private SNode _18_io;
              private SNode _6_po;
              private Iterator<SNode> _6_po_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 6:
                      this._6_po_it = Sequence.fromIterable(IParamFeature_Behavior.call_getParameterObjects_1213877340242(it, nodeType)).iterator();
                    case 7:
                      if (!(this._6_po_it.hasNext())) {
                        this.__CP__ = 3;
                        break;
                      }
                      this._6_po = this._6_po_it.next();
                      this.__CP__ = 8;
                      break;
                    case 4:
                      if (SNodeOperations.isInstanceOf(it, "jetbrains.mps.ypath.structure.IParamFeature")) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 12;
                      break;
                    case 14:
                      if (TraversalAxisUtil.isUsingOpposite(axis) && (SLinkOperations.getTarget(it, "opposite", false) == null)) {
                        this.__CP__ = 15;
                        break;
                      }
                      this.__CP__ = 16;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 11:
                      this.__CP__ = 7;
                      this.yield(this._10_io);
                      return true;
                    case 19:
                      this.__CP__ = 3;
                      this.yield(this._18_io);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      this._10_io = SConceptOperations.createNewNode("jetbrains.mps.ypath.structure.IterateOperation", null);
                      SLinkOperations.setTarget(this._10_io, "usedFeature", it, false);
                      SPropertyOperations.set(this._10_io, "axis", axis.getValue());
                      SLinkOperations.setTarget(this._10_io, "paramObject", this._6_po, true);
                      this.__CP__ = 11;
                      break;
                    case 12:
                      this.__CP__ = 13;
                      break;
                    case 13:
                      this.__CP__ = 14;
                      break;
                    case 16:
                      this._18_io = SConceptOperations.createNewNode("jetbrains.mps.ypath.structure.IterateOperation", null);
                      SLinkOperations.setTarget(this._18_io, "usedFeature", it, false);
                      SPropertyOperations.set(this._18_io, "axis", axis.getValue());
                      this.__CP__ = 19;
                      break;
                    case 15:
                      this.__CP__ = 1;
                      break;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    default:
                      break __loop__;
                  }
                } while(true);
                return false;
              }

            };
          }

        };
      }

    }).toListSequence();
  }

  public static SNode unwrapExpression(SNode wrappedExp) {
    SNode expression = wrappedExp;
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
      expression = SLinkOperations.getTarget(expression, "expression", true);
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.ypath.structure.TreePathAdapterExpression")) {
      expression = SLinkOperations.getTarget(expression, "expression", true);
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.CastExpression")) {
      expression = SLinkOperations.getTarget(expression, "expression", true);
    }
    return expression;
  }

}
