package jetbrains.mps.lang.editor.generator.baseLanguage.template.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderNameUtil;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.StopIteratingException;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;

public class QueriesUtil {
  private static Object CELL_READABLE_ID = new Object();

  public static String getProviderClassNameForCellWithRole(SNode node) {
    String conceptFqName = node.getConceptFqName();
    String something = NameUtil.removeStructureFromFqName(conceptFqName);
    return CellProviderNameUtil.getProviderClassName(something);
  }

  public static SNode getGeneratedClassByContainingRoot(SNode inputNode, TemplateQueryContext genctx) {
    SNode containingRoot = SNodeOperations.getContainingRoot(inputNode);
    return genctx.getOutputNodeByInputNodeAndMappingLabel(containingRoot, "generatedClass");
  }

  public static SNode getGeneratedClassByCellContainer(SNode inputCellModel, TemplateQueryContext genctx) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(inputCellModel), "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList")) {
      if (SNodeOperations.hasRole(inputCellModel, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", "emptyCellModel")) {
        return genctx.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(inputCellModel), "nodeListHandler");
      }
    }
    //     otherwise get 'generatedClass' by enclosing 'editor component'
    SNode ancestor = SNodeOperations.getAncestor(inputCellModel, "jetbrains.mps.lang.editor.structure.BaseEditorComponent", false, false);
    return genctx.getOutputNodeByInputNodeAndMappingLabel(ancestor, "generatedClass");
  }

  public static SNode getGeneratedClassByAncestor(SNode inputNode, final TemplateQueryContext genctx) {
    List<SNode> ancestors = SNodeOperations.getAncestors(inputNode, null, false);
    Iterable<SNode> outputClasses = ListSequence.fromList(ancestors).translate(new ITranslator2 <SNode, SNode>() {

      public Iterable<SNode> translate(final SNode it) {
        return new Iterable <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _5_output;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 6:
                      if (this._5_output != null) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 8:
                      this.__CP__ = 9;
                      this.yield(this._5_output);
                      return true;
                    case 2:
                      this._5_output = genctx.getOutputNodeByInputNodeAndMappingLabel(it, "generatedClass");
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    case 9:
                      throw new StopIteratingException();
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
    });
    return Sequence.fromIterable(outputClasses).first();
  }

  public static String keyMapActionClassName(SNode keyMapItem) {
    SNode keyMapDeclaration = SNodeOperations.cast(SNodeOperations.getParent(keyMapItem), "jetbrains.mps.lang.editor.structure.CellKeyMapDeclaration");
    int index = 0;
    for(SNode curItem : ListSequence.fromList(SLinkOperations.getTargets(keyMapDeclaration, "item", true))) {
      if (curItem == keyMapItem) {
        break;
      }
      index++ ;
    }
    return SPropertyOperations.getString(keyMapDeclaration, "name") + "_Action" + index;
  }

  public static String getUnicName(String name, SNode root, TemplateQueryContext context) {
    SNode bigCell = root;
    Set<String> namesSet = ((Set<String>)context.getStepObject(bigCell));
    if (namesSet == null) {
      namesSet = SetSequence.<String>fromArray();
      context.putStepObject(bigCell, namesSet);
    }
    String result = name;
    int index = 1;
    while (SetSequence.fromSet(namesSet).contains(result)) {
      result = name + "_" + index;
      index++ ;
    }
    SetSequence.fromSet(namesSet).addElement(result);
    return result;
  }

}
