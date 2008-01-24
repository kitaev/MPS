package jetbrains.mps.closures.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.closures.generator.baseLanguage.template.helper.PrepStatementUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.closures.constraints.FunctionType_Behavior;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.core.constraints.BaseConcept_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Collections;
import java.util.Comparator;
import java.text.Collator;
import java.util.Iterator;
import java.util.ArrayList;
import jetbrains.mps.closures.generator.baseLanguage.template.helper.StatementListUtil;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;
import jetbrains.mps.generator.template.MappingScriptContext;

public class QueriesGenerated {

  public static boolean createRootRule_Condition_1199624188477(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return !(SequenceOperations.isEmpty(SModelOperations.getNodes(_context.getSourceModel(), "jetbrains.mps.closures.structure.ClosureLiteral")));
  }

  public static boolean baseMappingRule_Condition_1201018816706(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201026182242(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201026184426(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201193354452(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201194112613(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201204773236(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "initializer", true) != null);
  }

  public static boolean baseMappingRule_Condition_1201017719800(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201017688485(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201093930999(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return PrepStatementUtil.getPrepData(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), _context.getGenerator()) != null;
  }

  public static boolean baseMappingRule_Condition_1201016704101(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    final zClosureContext _zClosureContext = new zClosureContext();
    SNode cl;
    return SequenceOperations.isEmpty(SequenceOperations.select(SequenceOperations.where(SNodeOperations.getDescendants(_context.getNode(), null, false), new zPredicate(null, _zClosureContext)), new zSelector(null, _zClosureContext)));
  }

  public static boolean baseMappingRule_Condition_1201016795856(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    final zClosureContext1 _zClosureContext1 = new zClosureContext1();
    SNode cl;
    return !(SequenceOperations.isEmpty(SequenceOperations.select(SequenceOperations.where(SNodeOperations.getDescendants(_context.getNode(), null, false), new zPredicate1(null, _zClosureContext1)), new zSelector1(null, _zClosureContext1))));
  }

  public static Object propertyMacro_GetPropertyValue_1201095804027(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[0];
  }

  public static Object propertyMacro_GetPropertyValue_1201204858049(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (String)PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
  }

  public static Object propertyMacro_GetPropertyValue_1201093988343(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (String)PrepStatementUtil.getPrepData(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), _context.getGenerator());
  }

  public static Object propertyMacro_GetPropertyValue_1199652367054(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String shortName = "_FunctionTypes." + FunctionType_Behavior.call_getSignature_1199633062014(_context.getNode());
    return JavaNameUtil.fqClassName(_context.getSourceModel(), shortName);
  }

  public static Object propertyMacro_GetPropertyValue_1199624292228(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return FunctionType_Behavior.call_getSignature_1199633062014(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1201048297671(final IOperationContext operationContext, final PropertyMacroContext _context) {
    {
      IMatchingPattern pattern_1201204928478 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType");
      SNode coercedNode_1201204928460 = TypeChecker.getInstance().getRuntimeSupport().coerce(SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(_context.getNode()), "resultType", true), pattern_1201204928478);
      if(coercedNode_1201204928460 != null) {
        return BaseConcept_Behavior.call_getPresentation_1180102203531(SLinkOperations.getTarget(coercedNode_1201204928460, "elementType", true));
      }
    }
    return null;
  }

  public static Object propertyMacro_GetPropertyValue_1201048260874(final IOperationContext operationContext, final PropertyMacroContext _context) {
    {
      IMatchingPattern pattern_1201204928512 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType");
      SNode coercedNode_1201204928494 = TypeChecker.getInstance().getRuntimeSupport().coerce(SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(_context.getNode()), "resultType", true), pattern_1201204928512);
      if(coercedNode_1201204928494 != null) {
        return BaseConcept_Behavior.call_getPresentation_1180102203531(SLinkOperations.getTarget(coercedNode_1201204928494, "elementType", true));
      }
    }
    return null;
  }

  public static Object propertyMacro_GetPropertyValue_1201019320624(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (String)PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
  }

  public static Object propertyMacro_GetPropertyValue_1201023446586(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[0];
  }

  public static Object propertyMacro_GetPropertyValue_1201093772964(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (String)PrepStatementUtil.getPrepData(SLinkOperations.getTarget(_context.getNode(), "variable", true), _context.getGenerator());
  }

  public static Object propertyMacro_GetPropertyValue_1201023446649(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[1];
  }

  public static Object propertyMacro_GetPropertyValue_1201023446682(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[4];
  }

  public static Object propertyMacro_GetPropertyValue_1201094822855(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[2];
  }

  public static Object propertyMacro_GetPropertyValue_1201023446713(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[3];
  }

  public static Object propertyMacro_GetPropertyValue_1201023446743(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[1];
  }

  public static Object propertyMacro_GetPropertyValue_1201024123512(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[0];
  }

  public static Object propertyMacro_GetPropertyValue_1201025995317(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[1];
  }

  public static Object propertyMacro_GetPropertyValue_1201093274493(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (String)PrepStatementUtil.getPrepData(SLinkOperations.getTarget(_context.getNode(), "variable", true), _context.getGenerator());
  }

  public static Object propertyMacro_GetPropertyValue_1201191004478(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[0];
  }

  public static Object propertyMacro_GetPropertyValue_1201190969333(final IOperationContext operationContext, final PropertyMacroContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    return labels[1];
  }

  public static Object referenceMacro_GetReferent_1199624866931(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    final zClosureContext2 _zClosureContext2 = new zClosureContext2();
    _zClosureContext2.sig = FunctionType_Behavior.call_getSignature_1199633062014(TypeChecker.getInstance().getTypeOf(_context.getNode()));
    SNode fts = _context.getGenerator().getOutputModel().getRootByName("_FunctionTypes");
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(fts), new zPredicate2(null, _zClosureContext2)));
  }

  public static Object referenceMacro_GetReferent_1201049158321(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode fts = _context.getGenerator().getOutputModel().getRootByName("_FunctionTypes");
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(fts), new zPredicate3(null, null)));
  }

  public static Object referenceMacro_GetReferent_1201044570620(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    final zClosureContext3 _zClosureContext3 = new zClosureContext3();
    _zClosureContext3.sig = FunctionType_Behavior.call_getSignature_1199633062014(TypeChecker.getInstance().getTypeOf(_context.getNode()));
    SNode fts = _context.getGenerator().getOutputModel().getRootByName("_FunctionTypes");
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(fts), new zPredicate4(null, _zClosureContext3)));
  }

  public static boolean ifMacro_Condition_1201049059863(final IOperationContext operationContext, final IfMacroContext _context) {
    return Boolean.TRUE.equals(_context.getGenerator().getGeneratorSessionContext().getSessionObject("foundClosureLiteralsWithYield"));
  }

  public static SNode sourceNodeQuery_1201204863526(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "initializer", true);
  }

  public static SNode sourceNodeQuery_1201019808021(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "localVariableDeclaration", true);
  }

  public static SNode sourceNodeQuery_1199644437387(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "function", true)), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199646374717(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "function", true);
  }

  public static SNode sourceNodeQuery_1199712173382(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.closures.structure.ClosureLiteral", false, false)), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199712173395(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode sourceNodeQuery_1199638621010(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199624915150(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(_context.getNode()), "resultType", true);
  }

  public static SNode sourceNodeQuery_1199625045481(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_1201044612692(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(_context.getNode()), "resultType", true);
  }

  public static SNode sourceNodeQuery_1201045061496(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    {
      IMatchingPattern pattern_1201204929337 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType");
      SNode coercedNode_1201204929321 = TypeChecker.getInstance().getRuntimeSupport().coerce(SLinkOperations.getTarget(TypeChecker.getInstance().getTypeOf(_context.getNode()), "resultType", true), pattern_1201204929337);
      if(coercedNode_1201204929321 != null) {
        return SLinkOperations.getTarget(coercedNode_1201204929321, "elementType", true);
      }
    }
    return null;
  }

  public static SNode sourceNodeQuery_1201019303193(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "type", true);
  }

  public static SNode sourceNodeQuery_1201093791966(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "variable", true), "initializer", true);
  }

  public static SNode sourceNodeQuery_1201023446671(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "condition", true);
  }

  public static SNode sourceNodeQuery_1201023446733(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "iteration", true);
  }

  public static SNode sourceNodeQuery_1201026062018(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1201093247930(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "variable", true), "type", true);
  }

  public static List sourceNodesQuery_1199644424783(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static List sourceNodesQuery_1199712173374(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static List sourceNodesQuery_1199638584204(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    final zClosureContext4 _zClosureContext4 = new zClosureContext4();
    _zClosureContext4.idx = 1;
    return SequenceOperations.toList(SequenceOperations.select(SLinkOperations.getTargets(_context.getNode(), "parameterType", true), new zSelector2(null, _zClosureContext4)));
  }

  public static List sourceNodesQuery_1199624603942(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    Iterable<SNode> clTypes = SequenceOperations.select(SModelOperations.getNodes(_context.getSourceModel(), "jetbrains.mps.closures.structure.ClosureLiteral"), new zSelector3(null, null));
    List<SNode> funTypes = SModelOperations.getNodes(_context.getSourceModel(), "jetbrains.mps.closures.structure.FunctionType");
    List<SNode> typesList = SequenceOperations.toList(SequenceOperations.union(clTypes, funTypes));
    Collections.sort(typesList, new Comparator() {

      public int compare(Object x, Object y) {
        return Collator.getInstance().compare(FunctionType_Behavior.call_getSignature_1199633062014(((SNode)x)), FunctionType_Behavior.call_getSignature_1199633062014(((SNode)y)));
      }

    });
    SNode prev = null;
    for(Iterator it = ((List)typesList).iterator() ; it.hasNext() ; ) {
      SNode next = ((SNode)it.next());
      if(Collator.getInstance().compare(FunctionType_Behavior.call_getSignature_1199633062014(((SNode)prev)), FunctionType_Behavior.call_getSignature_1199633062014(((SNode)next))) == 0) {
        it.remove();
      } else
      {
        prev = next;
      }
    }
    return typesList;
  }

  public static List sourceNodesQuery_1199624932349(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static List sourceNodesQuery_1201044612684(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static List sourceNodesQuery_1201190892393(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "statement", true);
  }

  public static List sourceNodesQuery_1201187449746(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    Integer[] labels = (Integer[])PrepStatementUtil.getPrepData(_context.getNode(), _context.getGenerator());
    int BEGIN = labels[0];
    int END = labels[1];
    List<SNode> results = new ArrayList<SNode>();
    List<SNode> stmts = StatementListUtil.selectStatementsUntilControlStatement(_context.getNode());
    do {
      int beginLabel = BEGIN;
      int endLabel = END;
      SNode lastStmt = null;
      SNode slist = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null);
      for(SNode stmt : stmts) {
        SNode tmp = SNodeOperations.copyNode(stmt);
        SLinkOperations.addChild(slist, "statement", tmp);
        PrepStatementUtil.putPrepData(tmp, PrepStatementUtil.getPrepData(stmt, _context.getGenerator()), _context.getGenerator());
        if(SNodeOperations.isInstanceOf(tmp, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
          SNode lvd = SLinkOperations.getTarget(tmp, "localVariableDeclaration", true);
          PrepStatementUtil.putPrepData(lvd, PrepStatementUtil.getPrepData(SLinkOperations.getTarget(stmt, "localVariableDeclaration", true), _context.getGenerator()), _context.getGenerator());
        }
        lastStmt = stmt;
      }
      SNode cstmt = null;
      if((lastStmt != null)) {
        cstmt = SNodeOperations.getNextSibling(lastStmt);
      } else
      {
        List<SNode> allstmts = (List<SNode>)SLinkOperations.getTargets(_context.getNode(), "statement", true);
        cstmt = (allstmts.size() > 0 ?
          allstmts.get(0) :
          null
        );
      }
      if((cstmt != null)) {
        labels = (Integer[])PrepStatementUtil.getPrepData(cstmt, _context.getGenerator());
        endLabel = (labels != null ?
          labels[0] :
          -1
        );
        lastStmt = SNodeOperations.getNextSibling(cstmt);
        while((lastStmt != null)) {
          stmts = StatementListUtil.selectStatementsUntilControlStatement(_context.getNode(), lastStmt);
          if(stmts.size() == 0) {
            cstmt = lastStmt;
            lastStmt = SNodeOperations.getNextSibling(lastStmt);
          } else
          {
            labels = (Integer[])PrepStatementUtil.getPrepData(cstmt, _context.getGenerator());
            BEGIN = (labels != null ?
              labels[labels.length - 1] :
              -1
            );
            break;
          }
        }
      } else
      {
        stmts = null;
      }
      results.add(slist);
      PrepStatementUtil.putPrepData(slist, new Integer[]{beginLabel,endLabel}, _context.getGenerator());
    } while(stmts != null && stmts.size() > 0);
    return results;
  }

  public static SNode mapSrcMacro_mapper_1201095804047(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201204852664(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201093972407(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201093763655(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201023446702(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201094822875(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201023446763(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201025995337(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201026049281(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode mapSrcMacro_mapper_1201190950941(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1201018804729(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode gne = _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.closures.structure.ClosureLiteral", false, false), "closure_class");
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getDescendants(gne, null, false), new zPredicate5(null, null)));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1201023865086(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode gne = _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.closures.structure.ClosureLiteral", false, false), "closure_class");
    SNode md = SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getDescendants(gne, null, false), new zPredicate6(null, null)));
    SNode dostmt = SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(SLinkOperations.getTarget(md, "body", true)), new zPredicate7(null, null)));
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(SLinkOperations.getTarget(dostmt, "body", true)), new zPredicate8(null, null)));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1201026203690(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode gne = _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.closures.structure.ClosureLiteral", false, false), "closure_class");
    SNode md = SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getDescendants(gne, null, false), new zPredicate9(null, null)));
    SNode dostmt = SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(SLinkOperations.getTarget(md, "body", true)), new zPredicate10(null, null)));
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(SLinkOperations.getTarget(dostmt, "body", true)), new zPredicate11(null, null)));
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1201193348813(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    SNode gne = _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.closures.structure.ClosureLiteral", false, false), "closure_class");
    SNode md = SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getDescendants(gne, null, false), new zPredicate12(null, null)));
    SNode dostmt = SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(SLinkOperations.getTarget(md, "body", true)), new zPredicate13(null, null)));
    return SequenceOperations.getFirst(SequenceOperations.where(SNodeOperations.getChildren(SLinkOperations.getTarget(dostmt, "body", true)), new zPredicate14(null, null)));
  }

  public static void mappingScript_CodeBlock_1201011417446(final IOperationContext operationContext, final MappingScriptContext _context) {
    final zClosureContext5 _zClosureContext5 = new zClosureContext5();
    Iterable<SNode> closures = SequenceOperations.where(SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.closures.structure.ClosureLiteral"), new zPredicate16(null, _zClosureContext5));
    boolean found = false;
    for(SNode cl : closures) {
      PrepStatementUtil.prepStatementList(SLinkOperations.getTarget(cl, "body", true), _context.getGenerator());
      found = true;
    }
    if(found) {
      _context.getGenerator().getGeneratorSessionContext().putSessionObject("foundClosureLiteralsWithYield", Boolean.TRUE);
    }
  }

}
