package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import java.util.Map;
import java.util.List;
import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import java.util.HashMap;
import java.util.LinkedList;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.HashSet;

public class NullableAnalyzerRules {
  private static NullableAnalyzerRules instance;

  private Map<String, List<DataFlowConstructor>> myApplicableMap = new HashMap<String, List<DataFlowConstructor>>();
  private List<DataFlowConstructor> myConceptRules = new LinkedList();
  private Map<SNode, Set<DataFlowConstructor>> myConceptRulesCache = new HashMap();

  public NullableAnalyzerRules() {
    {
      DataFlowConstructor rule = new RuleEqualsNull();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleIfNullReturn();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleNotEqualsNull();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleNotEqualsNullAnd();
      String conceptName = "jetbrains.mps.baseLanguage.structure.IfStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new WhileNotNull();
      String conceptName = "jetbrains.mps.baseLanguage.structure.WhileStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleAssertNull();
      String conceptName = "jetbrains.mps.baseLanguage.structure.AssertStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    {
      DataFlowConstructor rule = new RuleForLoop();
      String conceptName = "jetbrains.mps.baseLanguage.structure.ForStatement";
      if (!(myApplicableMap.containsKey(conceptName))) {
        myApplicableMap.put(conceptName, new LinkedList<DataFlowConstructor>());
      }
      myApplicableMap.get(conceptName).add(rule);
    }
    myConceptRules.add(new RuleAfterDotExpression());
    myConceptRules.add(new RuleCreator());
    myConceptRules.add(new RuleFieldReference());
    myConceptRules.add(new RuleMethodCall());
    myConceptRules.add(new RuleNullLiteral());
    myConceptRules.add(new RuleVariableDeclaration());
    myConceptRules.add(new IfNullReturnAll());
    myConceptRules.add(new RuleTernaryOperation());
  }

  public void apply(SNode nodeToApply, Program program) {
    for (SNode descendant : nodeToApply.getDescendants()) {
      String key = descendant.getConceptFqName();
      if (myApplicableMap.containsKey(key)) {
        for (DataFlowConstructor rule : myApplicableMap.get(key)) {
          if (rule.isApplicable(descendant)) {
            rule.performActions(program, descendant);
          }
        }
      }
      for (DataFlowConstructor rule : getRules(descendant)) {
        rule.performActions(program, descendant);
      }
    }
  }

  private Set<DataFlowConstructor> getRules(SNode node) {
    SNode concept = SNodeOperations.getConceptDeclaration(node);
    Set<DataFlowConstructor> cachedResult = myConceptRulesCache.get(concept);
    if (cachedResult != null) {
      return cachedResult;
    }
    Set<DataFlowConstructor> result = new HashSet<DataFlowConstructor>();
    for (DataFlowConstructor rule : myConceptRules) {
      if (rule.isApplicable(node)) {
        result.add(rule);
      }
    }
    myConceptRulesCache.put(concept, result);
    return result;
  }

  public static NullableAnalyzerRules getInstance() {
    if (instance == null) {
      instance = new NullableAnalyzerRules();
    }
    return instance;
  }
}
