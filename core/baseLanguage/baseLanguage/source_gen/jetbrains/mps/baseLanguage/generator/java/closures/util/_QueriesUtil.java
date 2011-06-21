package jetbrains.mps.baseLanguage.generator.java.closures.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Collections;
import java.util.ArrayList;
import jetbrains.mps.util.Condition;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class _QueriesUtil {
  public _QueriesUtil() {
  }

  public static SNode find_EnclosingContextOwner_ClosureContext_generatedClass(SNode inputNode, ITemplateGenerator generator) {
    SNode contextOwner = ClosuresUtil.findEnclosingClosureContextOwner(inputNode);
    if (contextOwner != null) {
      SNode generatedClass = find_ContextOwner_ClosureContext_generatedClass(contextOwner, generator);
      if (generatedClass != null) {
        return generatedClass;
      }
    }
    return SModelUtil.findNodeByFQName("java.lang.Object", SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassConcept"), generator.getScope());
  }

  public static SNode find_ContextOwner_ClosureContext_generatedClass(SNode inputNode, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(inputNode, ClosuresMappingId.CONTEXT_OWNER__CLOSURE_CONTEXT__CLASS);
  }

  public static SNode find_ContextOwner_ClosureContext_generatedClass_constructor(SNode inputNode, ITemplateGenerator generator) {
    SNode generatedClass = (SNode) find_ContextOwner_ClosureContext_generatedClass(inputNode, generator);
    if (generatedClass != null) {
      return ListSequence.fromList(SLinkOperations.getTargets(generatedClass, "constructor", true)).first();
    }
    return null;
  }

  public static SNode find_Closure_generatedClosureAdapter_constructor(SNode closure, ITemplateGenerator generator) {
    SNode closureAdapterClass = (SNode) generator.findOutputNodeByInputNodeAndMappingName(closure, ClosuresMappingId.CLOSURE__ADAPTER_CLASS);
    return ListSequence.fromList(SLinkOperations.getTargets(closureAdapterClass, "constructor", true)).first();
  }

  public static SNode resolve_VariableDeclStmt_Variable_ClosureContext_generatedField(SNode localVarDeclStmt, ITemplateGenerator generator) {
    SNode var = SLinkOperations.getTarget(localVarDeclStmt, "localVariableDeclaration", true);
    if ((var != null)) {
      return (SNode) generator.findOutputNodeByInputNodeAndMappingName(var, ClosuresMappingId.VARIABLE__CLOSURE_CONTEXT__CLASS_FIELD);
    }
    return null;
  }

  public static SNode resolve_VariableReference_Variable_ClosureContext_generatedField(SNode varRef, ITemplateGenerator generator) {
    SNode variableAdapter = SLinkOperations.getTarget(varRef, "variableDeclaration", false);
    if ((variableAdapter != null)) {
      return (SNode) generator.findOutputNodeByInputNodeAndMappingName(variableAdapter, ClosuresMappingId.VARIABLE__CLOSURE_CONTEXT__CLASS_FIELD);
    }
    return null;
  }

  public static List<SNode> getList_ContextOwner_ifMethod_ParmsUsedInClosure(SNode inputNode, ITemplateGenerator generator) {
    if (!((SNodeOperations.isInstanceOf(inputNode, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")))) {
      return Collections.emptyList();
    }
    List<SNode> variablesUsedInClosure = ClosuresUtil.getVariablesUsedInClosure(inputNode, generator);
    List<SNode> parms = new ArrayList<SNode>();
    for (SNode var : variablesUsedInClosure) {
      if (SNodeOperations.isInstanceOf(var, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")) {
        parms.add(var);
      }
    }
    return parms;
  }

  public static List<SNode> getList_ContextOwner_VariablesUsedInClosure(SNode inputNode, ITemplateGenerator generator) {
    return ClosuresUtil.getVariablesUsedInClosure(inputNode, generator);
  }

  public static String getString_VariableDeclaration_nameInClosureContext(SNode varDecl, ITemplateGenerator generator) {
    SNode contextOwner = ClosuresUtil.findEnclosingClosureContextOwner(varDecl);
    return ClosuresUtil.getVariableNameInClosureContext(contextOwner, varDecl, generator);
  }

  /**
   * method should be invoked in $MAP-SRC$ because it relay weaved members (MAP-SRC is processed after all other mappings)
   */
  public static SNode create_closureContextObject(SNode nodeInsideClosure, ITemplateGenerator generator) {
    // find enclosing closure or closure context owner 
    SNode enclosingClosureOrContextOwner = nodeInsideClosure.findParent(new Condition<SNode>() {
      public boolean met(SNode object) {
        if (SNodeOperations.isInstanceOf(object, "jetbrains.mps.baseLanguage.structure.Closure")) {
          return true;
        }
        return ClosuresUtil.isClosureContextOwner(object);
      }
    });
    SModel model = generator.getOutputModel();
    if (enclosingClosureOrContextOwner != null && ClosuresUtil.isClosureContextOwner(enclosingClosureOrContextOwner)) {
      SNode varDeclStmt_output = (SNode) generator.findOutputNodeByInputNodeAndMappingName(enclosingClosureOrContextOwner, ClosuresMappingId.CONTEXT_OWNER__CLOSURE_CONTEXT__VARIABLE_DECL_STMT);
      if ((varDeclStmt_output != null)) {
        SNode variable = SLinkOperations.getTarget(varDeclStmt_output, "localVariableDeclaration", true);
        SNode variableRef = SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
        SLinkOperations.setTarget(variableRef, "variableDeclaration", variable, false);
        return variableRef;
      }
    }
    // no variable found - return 'null' 
    return SModelOperations.createNewNode(model, "jetbrains.mps.baseLanguage.structure.NullLiteral", null);
  }
}
