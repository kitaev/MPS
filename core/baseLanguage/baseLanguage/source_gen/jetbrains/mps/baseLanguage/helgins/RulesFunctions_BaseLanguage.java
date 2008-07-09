package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.dependencies.InferenceMethod;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.ISequenceIterableAdapter;
import java.util.Iterator;
import jetbrains.mps.closures.runtime.YieldingIterator;
import java.util.List;
import java.util.Map;
import jetbrains.mps.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.util.Pair;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.intentions.BaseIntentionProvider;

public class RulesFunctions_BaseLanguage {
  public static boolean TRACE_METHOD_TYPES = false;

  @InferenceMethod()
  public static void comparisonOp(SNode binOp) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binOp, "rightExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1176897133366", true), SLinkOperations.getTarget(new QuotationClass_21().createNode(), "descriptor", false), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1176897142200", false, 0);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binOp, "leftExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1176897185028", true), SLinkOperations.getTarget(new QuotationClass_22().createNode(), "descriptor", false), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1176897185023", false, 0);
    }
    {
      SNode _nodeToCheck_1029348928467 = binOp;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1203512292516", true), new QuotationClass_23().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1203512292514");
    }
  }

  @InferenceMethod()
  public static void numericOp(final SNode binOp) {
    final SNode rightExpressionType_typevar_1185962758265 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    final SNode leftExpressionType_typevar_1185962769627 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binOp, "rightExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(rightExpressionType_typevar_1185962758265), TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1185962985524", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1185962983223");
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binOp, "leftExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(leftExpressionType_typevar_1185962769627), TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1185963005725", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1185963003424");
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binOp, "rightExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(rightExpressionType_typevar_1185962758265), SLinkOperations.getTarget(new QuotationClass_24().createNode(), "descriptor", false), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1176908856117", false, 0);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(binOp, "leftExpression", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(leftExpressionType_typevar_1185962769627), SLinkOperations.getTarget(new QuotationClass_25().createNode(), "descriptor", false), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1176908902743", false, 0);
    }
    {
      final SNode _representatorVar4 = TypeChecker.getInstance().getEquationManager().getRepresentator(leftExpressionType_typevar_1185962769627);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar4, new Runnable() {

        public void run() {
          {
            final SNode _representatorVar5 = TypeChecker.getInstance().getEquationManager().getRepresentator(rightExpressionType_typevar_1185962758265);
            TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar5, new Runnable() {

              public void run() {
                {
                  SNode _nodeToCheck_1029348928467 = binOp;
                  TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614104384", true), Queries.getBinaryOperationType(TypeChecker.getInstance().getEquationManager().getRepresentator(leftExpressionType_typevar_1185962769627), TypeChecker.getInstance().getEquationManager().getRepresentator(rightExpressionType_typevar_1185962758265)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614104382");
                }
              }

            }, "jetbrains.mps.baseLanguage.helgins", "1185963100352");
          }
        }

      }, "jetbrains.mps.baseLanguage.helgins", "1185963072800");
    }
  }

  public static Iterable<SNode> collectReturnStatements(SNode node) {
    Iterable<SNode> returnStatements = ListSequence.fromList(SNodeOperations.getChildren(node)).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _11_returnStmt;
              private Iterator<SNode> _11_returnStmt_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 11:
                      this._11_returnStmt_it = collectReturnStatements(it).iterator();
                    case 12:
                      if (!(this._11_returnStmt_it.hasNext())) {
                        this.__CP__ = 3;
                        break;
                      }
                      this._11_returnStmt = this._11_returnStmt_it.next();
                      this.__CP__ = 13;
                      break;
                    case 4:
                      if (SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 7;
                      break;
                    case 7:
                      if (SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.ConceptFunction") || SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock") || SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.IStatementListContainer") || SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
                        this.__CP__ = 8;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this.__CP__ = 3;
                      this.yield(it);
                      return true;
                    case 14:
                      this.__CP__ = 12;
                      this.yield(this._11_returnStmt);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      // don't look inside closures and other code-blocks
                      // don't look inside commented statements
                      // don't look inside anything that implements IStatementListContainer (for extensibility)
                      // don't look inside anonymous classes
                      this.__CP__ = 1;
                      break;
                    case 10:
                      this.__CP__ = 11;
                      break;
                    case 13:
                      this.__CP__ = 14;
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
    return returnStatements;
  }

  public static SNode concreteTypeFromGenericType(SNode type, SNode genericClassifier, SNode instanceType) {
    SNode returnType = SNodeOperations.copyNode(type);
    if (genericClassifier == null) {
      return returnType;
    }
    {
      Pattern_8 pattern_ = new Pattern_8(genericClassifier);
      SNode coercedNode_ = TypeChecker.getInstance().getRuntimeSupport().coerce(instanceType, pattern_);
      if (coercedNode_ != null) {
        List<SNode> actualParams = pattern_.PatternVar;
        for(SNode child : SNodeOperations.getDescendants(returnType, null, true)) {
          if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
            SNode tvr = child;
            SNode tvd = SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false);
            int index = ListSequence.fromList(SLinkOperations.getTargets(genericClassifier, "typeVariableDeclaration", true)).indexOf(tvd);
            SNode actualParam = (index < actualParams.size() && index >= 0 ?
              actualParams.get(index) :
              new QuotationClass_26().createNode()
            );
            if (returnType == tvr) {
              returnType = SNodeOperations.copyNode(actualParam);
            } else
            {
              // in this code the 'tvr' is not necessarily *child* of the 'returnType'.
              // in this case the replaceChild(old,new) fails with assertion.
              // new code is safe but might be not correct
              // returnType . replaceChild ( tvr , actualParam . copy ) ;
              SNodeOperations.replaceWithAnother(tvr, SNodeOperations.copyNode(actualParam));
            }
          }
        }
      }
    }
    return returnType;
  }

  @InferenceMethod()
  public static void inference_matchConcreteTypesWithTypeVariables(SNode genericClassifier, SNode instanceType, Map<SNode, List<SNode>> mmap) {
    if ((genericClassifier != null) && mmap != null && !(mmap.isEmpty())) {
      {
        Pattern_9 pattern_1 = new Pattern_9(genericClassifier);
        SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(instanceType, pattern_1);
        if (coercedNode_1 != null) {
          List<SNode> actualParams = pattern_1.PatternVar3;
          int idx = 0;
          for(SNode tvd : SLinkOperations.getTargets(genericClassifier, "typeVariableDeclaration", true)) {
            if (idx < actualParams.size()) {
              List<SNode> nodes = mmap.get(tvd);
              if (nodes != null) {
                SNode tvar = ListSequence.fromList(nodes).getElement(0);
                if (TRACE_METHOD_TYPES) {
                  System.out.println("-2- " + BaseConcept_Behavior.call_getPresentation_1213877396640(tvar) + " :==: " + BaseConcept_Behavior.call_getPresentation_1213877396640(ListSequence.fromList(nodes).getElement(0)));
                }
                {
                  SNode _nodeToCheck_1029348928467 = null;
                  TypeChecker.getInstance().getRuntimeSupport().createEquation(tvar, actualParams.get(idx), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614104608");
                }
              }
            }
            idx = idx + 1;
          }
        }
      }
    }
  }

  @InferenceMethod()
  public static void inference_equateParametersAndReturnType(SNode mc, SNode returnType, Map<SNode, List<SNode>> mmap) {
    {
      SNode arg;
      SNode param;
      Iterator<SNode> arg_iterator = SLinkOperations.getTargets(mc, "actualArgument", true).iterator();
      Iterator<SNode> param_iterator = SLinkOperations.getTargets(SLinkOperations.getTarget(mc, "baseMethodDeclaration", false), "parameter", true).iterator();
      while (true) {
        if (!(arg_iterator.hasNext())) {
          break;
        }
        if (!(param_iterator.hasNext())) {
          break;
        }
        arg = arg_iterator.next();
        param = param_iterator.next();
        {
          SNode matchedType = inference_matchTypeWithTypeVariables(SLinkOperations.getTarget(param, "type", true), mmap);
          if (TRACE_METHOD_TYPES) {
            System.out.println("-1- TYPEOF(" + BaseConcept_Behavior.call_getPresentation_1213877396640(arg) + ") :<=: " + BaseConcept_Behavior.call_getPresentation_1213877396640(matchedType));
          }
          {
            SNode _nodeToCheck_1029348928467 = arg;
            TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614104712", true), matchedType, _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614104708", true, 0);
          }
        }
      }
    }
    if (returnType != null) {
      Pair<SNode, Map<SNode, List<SNode>>> pair;
      SNode matchedType = inference_matchTypeWithTypeVariables(returnType, mmap);
      if (TRACE_METHOD_TYPES) {
        System.out.println("-1- TYPEOF(" + BaseConcept_Behavior.call_getPresentation_1213877396640(mc) + ") :==: " + BaseConcept_Behavior.call_getPresentation_1213877396640(matchedType));
      }
      {
        SNode _nodeToCheck_1029348928467 = mc;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1203441371361", true), matchedType, _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1203441371359");
      }
    }
  }

  @InferenceMethod()
  public static void inference_equateMatchingTypeVariables(Map<SNode, List<SNode>> mmap) {
    if (mmap != null) {
      for(Map.Entry<SNode, List<SNode>> e : mmap.entrySet()) {
        List<SNode> nodes = e.getValue();
        SNode prev = null;
        for(SNode tvar : nodes) {
          if (prev != null && prev != tvar) {
            if (TRACE_METHOD_TYPES) {
              System.out.println("-3- " + BaseConcept_Behavior.call_getPresentation_1213877396640(prev) + " :==: " + BaseConcept_Behavior.call_getPresentation_1213877396640(tvar));
            }
            {
              SNode _nodeToCheck_1029348928467 = null;
              TypeChecker.getInstance().getRuntimeSupport().createEquation(prev, tvar, _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1203452876024");
            }
          }
          prev = tvar;
        }
        if (TRACE_METHOD_TYPES) {
          if ((prev != null)) {
            final SNode var = prev;
            final SNode prevVar_typevar_1204114618000 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
            {
              SNode _nodeToCheck_1029348928467 = null;
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(prevVar_typevar_1204114618000), prev, _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1204114618001");
            }
            {
              final SNode _representatorVar6 = TypeChecker.getInstance().getEquationManager().getRepresentator(prevVar_typevar_1204114618000);
              TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar6, new Runnable() {

                public void run() {
                  System.out.println("-4- " + BaseConcept_Behavior.call_getPresentation_1213877396640(var) + " :==: " + BaseConcept_Behavior.call_getPresentation_1213877396640(TypeChecker.getInstance().getEquationManager().getRepresentator(prevVar_typevar_1204114618000)));
                }

              }, "jetbrains.mps.baseLanguage.helgins", "1204114618006");
            }
          }
        }
      }
    }
  }

  /* package */static SNode inference_matchTypeWithTypeVariables(SNode type, Map<SNode, List<SNode>> mmap) {
    SNode resType = SNodeOperations.copyNode(type);
    if (SNodeOperations.isInstanceOf(resType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      final SNode tvar_typevar_1203439588896 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
      SNode tvd = SLinkOperations.getTarget(resType, "typeVariableDeclaration", false);
      inference_mapTypeVariable(tvd, TypeChecker.getInstance().getEquationManager().getRepresentator(tvar_typevar_1203439588896), mmap);
      resType = TypeChecker.getInstance().getEquationManager().getRepresentator(tvar_typevar_1203439588896);
    } else
    {
      inference_mapTypeVariables(resType, mmap);
    }
    return resType;
  }

  private static void inference_mapTypeVariables(SNode type, Map<SNode, List<SNode>> mmap) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      final SNode tvar_typevar_1203431658168 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
      SNode tvd = SLinkOperations.getTarget(type, "typeVariableDeclaration", false);
      inference_mapTypeVariable(tvd, TypeChecker.getInstance().getEquationManager().getRepresentator(tvar_typevar_1203431658168), mmap);
      SNodeOperations.replaceWithAnother(type, TypeChecker.getInstance().getEquationManager().getRepresentator(tvar_typevar_1203431658168));
    } else
    {
      List<SNode> children = new ArrayList<SNode>(SNodeOperations.getChildren(type));
      for(SNode chld : children) {
        inference_mapTypeVariables(chld, mmap);
      }
    }
  }

  private static void inference_mapTypeVariable(SNode tvd, SNode tvar, Map<SNode, List<SNode>> mmap) {
    putTypeVariable(tvd, tvar, mmap);
  }

  private static void putTypeVariable(SNode tvd, SNode tvar, Map<SNode, List<SNode>> mmap) {
    List<SNode> nodes = mmap.get(tvd);
    if (nodes == null) {
      nodes = new ArrayList<SNode>();
      mmap.put(tvd, nodes);
    }
    ListSequence.fromList(nodes).addElement(tvar);
  }

  public static boolean isWithinStatic(SNode node) {
    SNode staticAncestor = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration","jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration"}, false, false);
    if (staticAncestor != null) {
      return true;
    }
    SNode statementList = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    SNode prevStatementList = null;
    while ((statementList != null)) {
      prevStatementList = statementList;
      statementList = SNodeOperations.getAncestor(statementList, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
    }
    if ((prevStatementList != null)) {
      do {
        SNode matchedNode_1 = SNodeOperations.getParent(prevStatementList, null, false, false);
        {
          boolean matches_1 = false;
          {
            SNode matchingNode_1 = SNodeOperations.getParent(prevStatementList, null, false, false);
            if (matchingNode_1 != null) {
              matches_1 = SModelUtil_new.isAssignableConcept(matchingNode_1.getConceptFqName(), "jetbrains.mps.baseLanguage.structure.ClassConcept");
            }
          }
          if (matches_1) {
            return SLinkOperations.getTarget(matchedNode_1, "staticInitializer", true) == prevStatementList;
          }
        }
      } while(false);
    }
    return false;
  }

  /* package */static void check(Set<SNode> throwables, SNode mainNode) {
    for(SNode livingThrowable : new HashSet<SNode>(throwables)) {
      if (TypeChecker.getInstance().getSubtypingManager().isSubtype(livingThrowable, new QuotationClass_90().createNode()) || TypeChecker.getInstance().getSubtypingManager().isSubtype(livingThrowable, new QuotationClass_89().createNode())) {
        throwables.remove(livingThrowable);
      }
    }
    if (throwables.isEmpty()) {
      return;
    }
    List<SNode> statementLists = SNodeOperations.getAncestors(mainNode, "jetbrains.mps.baseLanguage.structure.StatementList", false);
    for(SNode statementList : statementLists) {
      SNode parent = SNodeOperations.getParent(statementList, null, false, false);
      if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.TryStatement") && SLinkOperations.getTarget(parent, "body", true) == statementList) {
        SNode tryStatement = parent;
        for(SNode catchClause : SLinkOperations.getTargets(tryStatement, "catchClause", true)) {
          SNode throwableType = SLinkOperations.getTarget(SLinkOperations.getTarget(catchClause, "throwable", true), "type", true);
          for(SNode livingThrowable : new HashSet<SNode>(throwables)) {
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(livingThrowable, throwableType)) {
              throwables.remove(livingThrowable);
            }
          }
        }
      }
      if (throwables.isEmpty()) {
        return;
      }
      if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.TryCatchStatement") && SLinkOperations.getTarget(parent, "body", true) == statementList) {
        SNode tryCatchStatement = parent;
        for(SNode catchClause : SLinkOperations.getTargets(tryCatchStatement, "catchClause", true)) {
          SNode throwableType = SLinkOperations.getTarget(SLinkOperations.getTarget(catchClause, "throwable", true), "type", true);
          for(SNode livingThrowable : new HashSet<SNode>(throwables)) {
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(livingThrowable, throwableType)) {
              throwables.remove(livingThrowable);
            }
          }
        }
      }
      if (throwables.isEmpty()) {
        return;
      }
      if (SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration") && SLinkOperations.getTarget(parent, "body", true) == statementList) {
        SNode baseMethodDeclaration = parent;
        for(SNode throwableType : SLinkOperations.getTargets(baseMethodDeclaration, "throwsItem", true)) {
          for(SNode livingThrowable : new HashSet<SNode>(throwables)) {
            if (TypeChecker.getInstance().getSubtypingManager().isSubtype(livingThrowable, throwableType)) {
              throwables.remove(livingThrowable);
            }
          }
        }
        if (!(throwables.isEmpty())) {
          String errorString = "uncaught exceptions:";
          for(SNode exc : throwables) {
            errorString = errorString + " " + exc;
          }
          {
            BaseIntentionProvider intentionProvider = null;
            intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.helgins@5_0.AddExceptionToMethodSignature_Intention");
            intentionProvider.putArgument("throwableType", throwables.iterator().next());
            TypeChecker.getInstance().reportTypeError(mainNode, errorString, "jetbrains.mps.baseLanguage.helgins@5_0", "1210182111558", intentionProvider);
          }
        }
        return;
      }
    }
  }

}
