package jetbrains.mps.baseLanguage.generator.java.closures.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.Condition;
import java.util.List;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.generator.GenerationSessionContext;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ClosuresUtil {
  private static Object CLOSURE_CONTEXT_DATA = new Object();

  public static boolean isClosureContextOwner(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
      return true;
    }
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ConceptFunction") && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Closure"));
  }

  public static SNode findEnclosingClosureContextOwner(SNode node) {
    if (node == null) {
      return null;
    }
    return node.findParent(new Condition <SNode>() {

      public boolean met(SNode n) {
        return isClosureContextOwner(n);
      }
    });
  }

  public static List<SNode> getVariablesUsedInClosure(SNode contextOwner, ITemplateGenerator generator) {
    ensureClosureContextOwnerProcessed(contextOwner, generator);
    return getClosureContextData(contextOwner, generator).getVariables();
  }

  public static String getVariableNameInClosureContext(SNode contextOwner, SNode var, ITemplateGenerator generator) {
    ensureClosureContextOwnerProcessed(contextOwner, generator);
    return getClosureContextData(contextOwner, generator).getVariableName(var);
  }

  public static boolean isVariableUsedInClosure(SNode contextOwner, SNode var, ITemplateGenerator generator) {
    ensureClosureContextOwnerProcessed(contextOwner, generator);
    return getClosureContextData(contextOwner, generator).hasVariable(var);
  }

  public static boolean hasVariablesUsedInClosure(SNode contextOwner, ITemplateGenerator generator) {
    ensureClosureContextOwnerProcessed(contextOwner, generator);
    return !(getClosureContextData(contextOwner, generator).isEmpty());
  }

  private static void ensureClosureContextOwnerProcessed(SNode node, ITemplateGenerator generator) {
    if (!(isClosureContextOwner(node))) {
      throw new RuntimeException("node can't be owner of a closure context " + node.getDebugText());
    }
    if (getClosureContextData(node, generator) == null) {
      // init ClosureContextData
      GenerationSessionContext sessionContext = generator.getGeneratorSessionContext();
      Map<SNode, ClosuresUtil.ClosureContextData> closureContexts = ((Map<SNode, ClosuresUtil.ClosureContextData>)sessionContext.getTransientObject(CLOSURE_CONTEXT_DATA));
      if (closureContexts == null) {
        closureContexts = MapSequence.fromMap(new HashMap<SNode, ClosuresUtil.ClosureContextData>());
        sessionContext.putTransientObject(CLOSURE_CONTEXT_DATA, closureContexts);
      }
      MapSequence.fromMap(closureContexts).put(node, new ClosuresUtil.ClosureContextData());
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
        processMethodDeclaration(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), generator);
      } else
      {
        processConceptFunction(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ConceptFunction"), generator);
      }
    }
  }

  private static boolean processMethodDeclaration(SNode method, ITemplateGenerator generator) {
    if (SLinkOperations.getTarget(method, "body", true) == null) {
      return false;
    }
    if (ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(method, "body", true), "jetbrains.mps.baseLanguage.structure.Closure", false)).isEmpty()) {
      return false;
    }
    Set<SNode> varDecl = SetSequence.fromSetWithValues(new HashSet<SNode>(), SLinkOperations.getTargets(method, "parameter", true));
    return processNode(method, SLinkOperations.getTarget(method, "body", true), varDecl, generator);
  }

  private static boolean processConceptFunction(SNode concFunc, ITemplateGenerator generator) {
    if (SLinkOperations.getTarget(concFunc, "body", true) == null) {
      return false;
    }
    if (ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(concFunc, "body", true), "jetbrains.mps.baseLanguage.structure.Closure", false)).isEmpty()) {
      return false;
    }
    return processNode(concFunc, SLinkOperations.getTarget(concFunc, "body", true), SetSequence.fromSet(new HashSet<SNode>()), generator);
  }

  private static boolean processNode(SNode contextOwner, SNode node, Set<SNode> localVariables, ITemplateGenerator generator) {
    boolean outerVarsFound = false;
    for(SNode child : ListSequence.fromList(SNodeOperations.getChildren(node))) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
        SetSequence.fromSet(localVariables).addElement(SNodeOperations.cast(child, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
      } else if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.Closure")) {
        if (processClosure(contextOwner, SNodeOperations.cast(child, "jetbrains.mps.baseLanguage.structure.Closure"), localVariables, generator)) {
          outerVarsFound = true;
        }
      }
      if (processNode(contextOwner, child, localVariables, generator)) {
        outerVarsFound = true;
      }
    }
    return outerVarsFound;
  }

  private static boolean processClosure(SNode contextOwner, SNode closure, Set<SNode> localVars, ITemplateGenerator generator) {
    if (SLinkOperations.getTarget(closure, "body", true) == null) {
      return false;
    }
    return processClosureNode(contextOwner, SLinkOperations.getTarget(closure, "body", true), localVars, generator);
  }

  private static boolean processClosureNode(SNode contextOwner, SNode node, Set<SNode> localVars, ITemplateGenerator generator) {
    boolean outerVarsFound = false;
    for(SNode child : ListSequence.fromList(SNodeOperations.getChildren(node))) {
      // skip inner closure
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.Closure")) {
        continue;
      }
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.LocalVariableReference") || SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.ParameterReference")) {
        SNode variable = SLinkOperations.getTarget(SNodeOperations.cast(child, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
        if (SetSequence.fromSet(localVars).contains(variable)) {
          getClosureContextData(contextOwner, generator).putVariable(variable);
          outerVarsFound = true;
        }
      } else
      {
        if (processClosureNode(contextOwner, child, localVars, generator)) {
          outerVarsFound = true;
        }
      }
    }
    return outerVarsFound;
  }

  private static ClosuresUtil.ClosureContextData getClosureContextData(SNode contextOwner, ITemplateGenerator generator) {
    GenerationSessionContext sessionContext = generator.getGeneratorSessionContext();
    Map<SNode, ClosuresUtil.ClosureContextData> closureContexts = ((Map<SNode, ClosuresUtil.ClosureContextData>)sessionContext.getTransientObject(CLOSURE_CONTEXT_DATA));
    if (closureContexts == null) {
      return null;
    }
    return MapSequence.fromMap(closureContexts).get(contextOwner);
  }

  public static class ClosureContextData {

    private Map<SNode, String> myVar2Name;
    private Map<String, SNode> myName2Var;
    private List<SNode> myVars;

    public ClosureContextData() {
    }

    public List<SNode> getVariables() {
      if (this.myVars == null) {
        return ListOperations.<SNode>createList();
      }
      return this.myVars;
    }

    public String getVariableName(SNode var) {
      return MapSequence.fromMap(this.myVar2Name).get(var);
    }

    public boolean isEmpty() {
      return this.myVars == null || ListSequence.fromList(this.myVars).isEmpty();
    }

    public boolean hasVariable(SNode var) {
      if (this.myVar2Name == null) {
        return false;
      }
      return MapSequence.fromMap(this.myVar2Name).containsKey(var);
    }

    /* package */void putVariable(SNode var) {
      this.ensureInitialized();
      if (this.hasVariable(var)) {
        return;
      }
      int count = 1;
      String name = SPropertyOperations.getString(var, "name");
      while (MapSequence.fromMap(this.myName2Var).containsKey(name)) {
        name = SPropertyOperations.getString(var, "name") + (count++ );
      }
      MapSequence.fromMap(this.myName2Var).put(name, var);
      MapSequence.fromMap(this.myVar2Name).put(var, name);
      ListSequence.fromList(this.myVars).addElement(var);
    }

    private void ensureInitialized() {
      if (this.myVars == null) {
        this.myVar2Name = MapSequence.fromMap(new HashMap<SNode, String>());
        this.myName2Var = MapSequence.fromMap(new HashMap<String, SNode>());
        this.myVars = ListOperations.<SNode>createList();
      }
    }

}

}
