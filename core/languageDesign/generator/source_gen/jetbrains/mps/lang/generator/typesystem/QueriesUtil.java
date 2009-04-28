package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.StopIteratingException;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class QueriesUtil {

  @InferenceMethod()
  public static void equate_templateFunction_inputNodeType(final TypeCheckingContext typeCheckingContext, SNode contextNode, SNode InputNodeType) {
    SNode enclosingMacro = SNodeOperations.getAncestorWhereConceptInList(contextNode, new String[]{"jetbrains.mps.lang.generator.structure.PropertyMacro","jetbrains.mps.lang.generator.structure.ReferenceMacro","jetbrains.mps.lang.generator.structure.NodeMacro"}, false, false);
    if (enclosingMacro != null) {
      if (SNodeOperations.isInstanceOf(enclosingMacro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
        // inside mapper func or post-mapper function?
        if ((SNodeOperations.getAncestorWhereConceptInList(contextNode, new String[]{"jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction","jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction"}, true, false) != null)) {
          SNode query = SLinkOperations.getTarget(SNodeOperations.cast(enclosingMacro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro"), "sourceNodeQuery", true);
          if (query != null) {
            QueriesUtil.equate_outputNodeType_fromSourceQuery(typeCheckingContext, query, InputNodeType);
            return;
          }
        }
      }
      if (SNodeOperations.isInstanceOf(enclosingMacro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro")) {
        // inside mapper func or post-mapper function?
        if ((SNodeOperations.getAncestorWhereConceptInList(contextNode, new String[]{"jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction","jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction"}, true, false) != null)) {
          SNode query = SLinkOperations.getTarget(SNodeOperations.cast(enclosingMacro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro"), "sourceNodesQuery", true);
          if (query != null) {
            QueriesUtil.equate_outputNodeType_fromSourceQuery(typeCheckingContext, query, InputNodeType);
            return;
          }
        }
      }
      SNode enclosingNodeMacro = (SNodeOperations.isInstanceOf(enclosingMacro, "jetbrains.mps.lang.generator.structure.NodeMacro") ?
        enclosingMacro :
        null
      );
      SNode macroOwner = SNodeOperations.getParent(enclosingMacro);
      SNode prevSourceSubstituteMacro = QueriesUtil.getEnclosing_SourceSubstituteMacro(macroOwner, enclosingNodeMacro);
      if (prevSourceSubstituteMacro != null) {
        SNode query = QueriesUtil.getQueryFunction_fromSourceSubstituteMacro(prevSourceSubstituteMacro);
        QueriesUtil.equate_outputNodeType_fromSourceQuery(typeCheckingContext, query, InputNodeType);
        return;
      }
    }
    // ===============
    SNode applicableConcept = QueriesUtil.getApplicableConcept_fromEnvironment(contextNode);
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)new _Quotations.QuotationClass_0().createNode(applicableConcept, typeCheckingContext), (SNode)InputNodeType, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1206286374200", intentionProvider);
    }
  }

  private static SNode getEnclosing_SourceSubstituteMacro(SNode node, SNode currMacroNode) {
    if (node == null) {
      return null;
    }
    List<SNode> attributes = SNodeOperations.getAllAttributes(node);
    SNode prevMacro = null;
    for(SNode attribute : ListSequence.fromList(attributes)) {
      if (attribute == currMacroNode) {
        break;
      }
      if (SNodeOperations.isInstanceOf(attribute, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro")) {
        if (SNodeOperations.isInstanceOf(attribute, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
          if (SLinkOperations.getTarget(SNodeOperations.cast(attribute, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro"), "sourceNodeQuery", true) == null) {
            // the query is optional - continue 'enclosing macro' look-up
            continue;
          }
        }
        if (SNodeOperations.isInstanceOf(attribute, "jetbrains.mps.lang.generator.structure.SwitchMacro")) {
          if (SLinkOperations.getTarget(SNodeOperations.cast(attribute, "jetbrains.mps.lang.generator.structure.SwitchMacro"), "sourceNodeQuery", true) == null) {
            // the query is optional - continue 'enclosing macro' look-up
            continue;
          }
        }
        // ========
        prevMacro = SNodeOperations.cast(attribute, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro");
      }
    }
    // ========
    if (prevMacro != null) {
      return prevMacro;
    }
    return getEnclosing_SourceSubstituteMacro(SNodeOperations.getParent(node), null);
  }

  public static SNode getEnclosing_TemplateFragment(SNode node) {
    //  find first ancestor (inclusive) which has a template fragment attribute
    Iterable<SNode> TFs = ListSequence.fromList(SNodeOperations.getAncestors(node, null, true)).translate(new ITranslator2 <SNode, SNode>() {

      public Iterable<SNode> translate(final SNode it) {
        return new Iterable <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _5_TF;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 6:
                      if (this._5_TF != null) {
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
                      this.yield(this._5_TF);
                      return true;
                    case 2:
                      this._5_TF = SLinkOperations.getTarget(((SNode)it), AttributesRolesUtil.childRoleFromAttributeRole("templateFragment"), true);
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
    return Sequence.fromIterable(TFs).first();
  }

  private static SNode getQueryFunction_fromSourceSubstituteMacro(SNode macro) {
    if (macro == null) {
      return null;
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.SwitchMacro")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(macro, "jetbrains.mps.lang.generator.structure.SwitchMacro"), "sourceNodeQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.CopySrcNodeMacro")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(macro, "jetbrains.mps.lang.generator.structure.CopySrcNodeMacro"), "sourceNodeQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(macro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro"), "sourceNodeQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.LoopMacro")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(macro, "jetbrains.mps.lang.generator.structure.LoopMacro"), "sourceNodesQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.CopySrcListMacro")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(macro, "jetbrains.mps.lang.generator.structure.CopySrcListMacro"), "sourceNodesQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(macro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro"), "sourceNodesQuery", true);
    }
    return null;
  }

  @InferenceMethod()
  /* package */static void equate_outputNodeType_fromSourceQuery(final TypeCheckingContext typeCheckingContext, final SNode query, final SNode TypeToEquate) {
    if (query == null) {
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)new _Quotations.QuotationClass_1().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1206286245992", intentionProvider);
      }
      return;
    }
    final SNode Concept_typevar_1226671834537 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(query, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1226671782084", false), (SNode)new _Quotations.QuotationClass_2().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1226671834537), typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1226671834537), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1226671793009", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)TypeToEquate, (SNode)new _Quotations.QuotationClass_3().createNode(typeCheckingContext.getEquationManager().getRepresentator(Concept_typevar_1226671834537), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1226671862829", intentionProvider);
    }
  }

  public static SNode getOutputNodeType_fromSourceQuery(SNode query) {
    if (query == null) {
      return new _Quotations.QuotationClass_4().createNode();
    }
    SNode OutputType = TypeChecker.getInstance().getTypeOf(query);
    if (SNodeOperations.isInstanceOf(OutputType, "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
      return new _Quotations.QuotationClass_5().createNode(SLinkOperations.getTarget(SNodeOperations.cast(OutputType, "jetbrains.mps.lang.smodel.structure.SNodeListType"), "elementConcept", false));
    } else
    {
      SNode outputSNodeType = TypeChecker.getInstance().getRuntimeSupport().coerce_(OutputType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), true);
      if (outputSNodeType != null) {
        return outputSNodeType;
      } else
      {
        SNode outputSequenceType = TypeChecker.getInstance().getRuntimeSupport().coerce_(OutputType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), true);
        if (outputSequenceType != null) {
          SNode elementType = SLinkOperations.getTarget(outputSequenceType, "elementType", true);
          SNode outputSNodeType2 = TypeChecker.getInstance().getRuntimeSupport().coerce_(elementType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), true);
          if (outputSNodeType2 != null) {
            return outputSNodeType2;
          }
        }
      }
    }
    return new _Quotations.QuotationClass_6().createNode();
  }

  private static SNode getApplicableConcept_fromEnvironment(SNode node) {
    SNode ancestor = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.lang.generator.structure.TemplateDeclaration","jetbrains.mps.lang.generator.structure.BaseMappingRule"}, false, false);
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(ancestor, "jetbrains.mps.lang.generator.structure.TemplateDeclaration"), "applicableConcept", false);
    }
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.lang.generator.structure.BaseMappingRule")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(ancestor, "jetbrains.mps.lang.generator.structure.BaseMappingRule"), "applicableConcept", false);
    }
    // ============
    SNode rootAnnotation = SLinkOperations.getTarget(SNodeOperations.getContainingRoot(node), AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), true);
    return SLinkOperations.getTarget(SNodeOperations.cast(rootAnnotation, "jetbrains.mps.lang.generator.structure.RootTemplateAnnotation"), "applicableConcept", false);
  }

}
