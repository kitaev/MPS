package jetbrains.mps.lang.generator.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.InferenceMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.StopIteratingException;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.generator.structure.RootTemplateAnnotation_AnnotationLink;

public class QueriesUtil {

  @InferenceMethod()
  public static void equate_templateFunction_inputNodeType(final TypeCheckingContext typeCheckingContext, SNode contextNode, SNode InputNodeType) {
    SNode enclosingMacro = SNodeOperations.getAncestorWhereConceptInList(contextNode, new String[]{"jetbrains.mps.lang.generator.structure.PropertyMacro","jetbrains.mps.lang.generator.structure.ReferenceMacro","jetbrains.mps.lang.generator.structure.NodeMacro"}, false, false);
    if (enclosingMacro != null) {
      if (SNodeOperations.isInstanceOf(enclosingMacro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
        // inside mapper func?
        if ((SNodeOperations.getAncestor(contextNode, "jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction", true, false) != null)) {
          SNode query = SLinkOperations.getTarget(enclosingMacro, "sourceNodeQuery", true);
          if (query != null) {
            QueriesUtil.equate_outputNodeType_fromSourceQuery(typeCheckingContext, query, InputNodeType);
            return;
          }
        }
      }
      if (SNodeOperations.isInstanceOf(enclosingMacro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro")) {
        // inside mapper func?
        if ((SNodeOperations.getAncestor(contextNode, "jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction", true, false) != null)) {
          SNode query = SLinkOperations.getTarget(enclosingMacro, "sourceNodesQuery", true);
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
        SNode nodeType;
        QueriesUtil.equate_outputNodeType_fromSourceQuery(typeCheckingContext, query, InputNodeType);
        return;
      }
    }
    // ===============
    SNode applicableConcept = QueriesUtil.getApplicableConcept_fromEnvironment(contextNode);
    {
      SNode _nodeToCheck_1029348928467 = null;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(new _Quotations.QuotationClass_0().createNode(applicableConcept, typeCheckingContext), InputNodeType, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1206286374200", intentionProvider);
    }
  }

  private static SNode getEnclosing_SourceSubstituteMacro(SNode node, SNode currMacroNode) {
    if (node == null) {
      return null;
    }
    List<SNode> attributes = node.getAllAttributes();
    SNode prevMacro = null;
    for(SNode attribute : Sequence.fromIterable(attributes)) {
      if (attribute == currMacroNode) {
        break;
      }
      if (SNodeOperations.isInstanceOf(attribute, "jetbrains.mps.lang.generator.structure.SourceSubstituteMacro")) {
        if (SNodeOperations.isInstanceOf(attribute, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
          if (SLinkOperations.getTarget(attribute, "sourceNodeQuery", true) == null) {
            // the query is optional - continue 'enclosing macro' look-up
            continue;
          }
        }
        if (SNodeOperations.isInstanceOf(attribute, "jetbrains.mps.lang.generator.structure.SwitchMacro")) {
          if (SLinkOperations.getTarget(attribute, "sourceNodeQuery", true) == null) {
            // the query is optional - continue 'enclosing macro' look-up
            continue;
          }
        }
        // ========
        prevMacro = attribute;
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
      return SLinkOperations.getTarget(macro, "sourceNodeQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.CopySrcNodeMacro")) {
      return SLinkOperations.getTarget(macro, "sourceNodeQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro")) {
      return SLinkOperations.getTarget(macro, "sourceNodeQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.LoopMacro")) {
      return SLinkOperations.getTarget(macro, "sourceNodesQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.CopySrcListMacro")) {
      return SLinkOperations.getTarget(macro, "sourceNodesQuery", true);
    }
    if (SNodeOperations.isInstanceOf(macro, "jetbrains.mps.lang.generator.structure.MapSrcListMacro")) {
      return SLinkOperations.getTarget(macro, "sourceNodesQuery", true);
    }
    return null;
  }

  @InferenceMethod()
  /* package */static void equate_outputNodeType_fromSourceQuery(final TypeCheckingContext typeCheckingContext, final SNode query, final SNode TypeToEquate) {
    if (query == null) {
      {
        SNode _nodeToCheck_1029348928467 = null;
        BaseIntentionProvider intentionProvider = null;
        typeCheckingContext.createEquation(TypeToEquate, new _Quotations.QuotationClass_1().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1206286245992", intentionProvider);
      }
      return;
    }
    // todo: used in two rules, one of the usages can be converted into non-typesystem rule
    {
      final SNode OutputType = typeCheckingContext.typeOf(query, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1206283548589", false);
      typeCheckingContext.whenConcrete(OutputType, new Runnable() {

        public void run() {
          {
            SNode _nodeToCheck_1029348928467 = null;
            BaseIntentionProvider intentionProvider = null;
            typeCheckingContext.createLessThanInequation(TypeToEquate, new _Quotations.QuotationClass_2().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1190121627948", false, 0, intentionProvider);
          }
          if (SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(OutputType), "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
            {
              SNode _nodeToCheck_1029348928467 = null;
              BaseIntentionProvider intentionProvider = null;
              typeCheckingContext.createEquation(TypeToEquate, new _Quotations.QuotationClass_3().createNode(SLinkOperations.getTarget(typeCheckingContext.getEquationManager().getRepresentator(OutputType), "elementConcept", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1186132911051", intentionProvider);
            }
          } else
          {
            SNode outputSNodeType = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(OutputType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), true, typeCheckingContext);
            if (outputSNodeType != null) {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                typeCheckingContext.createEquation(TypeToEquate, outputSNodeType, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1186132959877", intentionProvider);
              }
            } else
            {
              SNode outputSequenceType = TypeChecker.getInstance().getRuntimeSupport().coerce_(typeCheckingContext.getEquationManager().getRepresentator(OutputType), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), true, typeCheckingContext);
              if (outputSequenceType != null) {
                SNode elementType = SLinkOperations.getTarget(outputSequenceType, "elementType", true);
                SNode outputSNodeType2 = TypeChecker.getInstance().getRuntimeSupport().coerce_(elementType, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.lang.smodel.structure.SNodeType"), true, typeCheckingContext);
                if (outputSNodeType2 != null) {
                  {
                    SNode _nodeToCheck_1029348928467 = null;
                    BaseIntentionProvider intentionProvider = null;
                    typeCheckingContext.createEquation(TypeToEquate, outputSNodeType2, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1186133027887", intentionProvider);
                  }
                }
              }
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902e4(jetbrains.mps.lang.generator.typesystem)", "1186132825697");
    }
  }

  private static SNode getApplicableConcept_fromEnvironment(SNode node) {
    SNode ancestor = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.lang.generator.structure.TemplateDeclaration","jetbrains.mps.lang.generator.structure.BaseMappingRule"}, false, false);
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
      return SLinkOperations.getTarget(ancestor, "applicableConcept", false);
    }
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.lang.generator.structure.BaseMappingRule")) {
      return SLinkOperations.getTarget(ancestor, "applicableConcept", false);
    }
    // ============
    SNode rootAnnotation = SNodeOperations.getContainingRoot(node).getAttribute(RootTemplateAnnotation_AnnotationLink.ROOT_TEMPLATE_ANNOTATION);
    return SLinkOperations.getTarget(rootAnnotation, "applicableConcept", false);
  }

}
