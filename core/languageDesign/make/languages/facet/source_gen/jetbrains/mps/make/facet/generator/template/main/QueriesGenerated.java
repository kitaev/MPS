package jetbrains.mps.make.facet.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.make.facet.behavior.FacetDeclaration_Behavior;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_Behavior;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.util.JavaNameUtil;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.generator.template.MapSrcMacroContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueriesGenerated {
  public static boolean createRootRule_Condition_671853460608709085(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.make.facet.structure.FacetDeclaration")).isNotEmpty();
  }

  public static boolean createRootRule_Condition_2824583209542435179(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.make.facet.structure.FacetDeclaration")).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1463237460565231755(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.getModel(SLinkOperations.getTarget(_context.getNode(), "target", false)) == SNodeOperations.getModel(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_1463237460565232363(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.getModel(SLinkOperations.getTarget(_context.getNode(), "target", false)) != SNodeOperations.getModel(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1919086248986829201(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return FacetDeclaration_Behavior.call_getFacetFqName_1919086248986828221(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(_context.getOriginalCopiedInputNode(_context.getNode()), "jetbrains.mps.make.facet.structure.FacetReferenceExpression"), "reference", true), "facet", false));
  }

  public static Object propertyMacro_GetPropertyValue_5086995156117240631(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return IWillBeClassifier_Behavior.call_classifierName_4609636120081351397(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350277729(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode origMod = SModelOperations.getModuleStub(_context.getOriginalInputModel());
    if (SNodeOperations.isInstanceOf(origMod, "jetbrains.mps.lang.project.structure.Language")) {
      return SPropertyOperations.getString(SNodeOperations.cast(origMod, "jetbrains.mps.lang.project.structure.Language"), "namespace") + "." + SPropertyOperations.getString(_context.getNode(), "name");
    }
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350200028(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5086995156117328675(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getTemplateValue() + NameUtil.toValidIdentifier(SPropertyOperations.getString(_context.getNode(), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_3097736894717613589(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "ResourcesPolicy"), "transform")).equals(SPropertyOperations.getString_def(_context.getNode(), "resourcesPolicy", "TRANSFORM")) || SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "ResourcesPolicy"), "consume")).equals(SPropertyOperations.getString_def(_context.getNode(), "resourcesPolicy", "TRANSFORM")));

  }

  public static Object propertyMacro_GetPropertyValue_7082294419595105985(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "ResourcesPolicy"), "transform")).equals(SPropertyOperations.getString_def(_context.getNode(), "resourcesPolicy", "TRANSFORM")) || SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "ResourcesPolicy"), "produce")).equals(SPropertyOperations.getString_def(_context.getNode(), "resourcesPolicy", "TRANSFORM")));
  }

  public static Object propertyMacro_GetPropertyValue_3868725017587329779(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return JavaNameUtil.fqClassName(SLinkOperations.getTarget(_context.getNode(), "parameters", true), SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "parameters", true), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_3868725017587343025(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return JavaNameUtil.fqClassName(SLinkOperations.getTarget(_context.getNode(), "parameters", true), SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "parameters", true), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350267984(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.cast(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration"), "name");
  }

  public static Object propertyMacro_GetPropertyValue_5189627237350270310(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return FacetDeclaration_Behavior.call_getFacetFqName_1919086248986828221(SLinkOperations.getTarget(SNodeOperations.cast(_context.getOriginalCopiedInputNode(_context.getNode()), "jetbrains.mps.make.facet.structure.FacetReference"), "facet", false));
  }

  public static Object propertyMacro_GetPropertyValue_7320828025189345716(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6872280991287185431(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "target", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6648795410106216330(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String fqn = INamedConcept_Behavior.call_getFqName_1213877404258(SNodeOperations.cast(SNodeOperations.getParent(SLinkOperations.getTarget(_context.getNode(), "target", false)), "jetbrains.mps.make.facet.structure.FacetDeclaration"));
    String facetClass = fqn + "_Facet";
    String trgClass = "Target_" + NameUtil.toValidIdentifier(SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "target", false), "name"));
    String paramClass = SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "target", false), "parameters", true), "name");
    return facetClass + "." + trgClass + "." + paramClass;
  }

  public static Object propertyMacro_GetPropertyValue_6770065340518006094(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "target", false), "name");
  }

  public static Object referenceMacro_GetReferent_671853460608694391(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "TargetDeclaration_class"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_1330985609386428780(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getNode();
  }

  public static Object referenceMacro_GetReferent_671853460608824185(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "FacetDeclaration_class"), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_2146492603954835938(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "TargetDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_3344436107830202786(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false), "parameters", true), "ParametersDeclaration_class");
  }

  public static Object referenceMacro_GetReferent_1463237460565231716(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "target", false), "parameters", true), "ParametersDeclaration_class");
  }

  public static boolean ifMacro_Condition_7320828025189279641(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "parameters", true), "component", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_1977954644795426653(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "job", true), "config", true) != null);
  }

  public static boolean ifMacro_Condition_3868725017587322815(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "parameters", true) != null);
  }

  public static boolean ifMacro_Condition_4902059885395479673(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "parameters", true), "component", true)).isNotEmpty();
  }

  public static boolean ifMacro_Condition_5189627237350267862(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "dependency", true)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode d) {
        return SPropertyOperations.getString_def(d, "qualifier", "BEFORE") == SEnumOperations.getEnumMemberValue(((SNode) _context.getVariable("qualifier")));
      }
    });
  }

  public static boolean ifMacro_Condition_5189627237350270268(final IOperationContext operationContext, final IfMacroContext _context) {
    return ListSequence.fromList(((List<SNode>) _context.getVariable("related"))).isNotEmpty();
  }

  public static SNode sourceNodeQuery_2146492603954835971(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_2146492603954835982(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_6872280991287182715(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_6872280991287182723(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_5189627237350272581(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_7320828025189279645(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "parameters", true);
  }

  public static SNode sourceNodeQuery_3916013743093752820(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "job", true), "job", true);
  }

  public static SNode sourceNodeQuery_1977954644795426657(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "job", true), "config", true);
  }

  public static Object templateArgumentQuery_5189627237350270329(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "optional", true);
  }

  public static Object templateArgumentQuery_5189627237350270355(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "required", true);
  }

  public static Object templateArgumentQuery_5189627237350270366(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "extended", true);
  }

  public static Object templateArgumentQuery_5189627237350268044(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "not after");
  }

  public static Object templateArgumentQuery_5189627237350268053(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "after");
  }

  public static Object templateArgumentQuery_5189627237350268062(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "not before");
  }

  public static Object templateArgumentQuery_5189627237350268071(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)", "TargetDependencyQualifier"), "before");
  }

  public static Iterable sourceNodesQuery_5189627237350272573(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "targetDeclaration", true);
  }

  public static Iterable sourceNodesQuery_671853460608694403(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "targetDeclaration", true);
  }

  public static Iterable sourceNodesQuery_1330985609386428769(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "input", true), "resourceType", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, "classifier", false) != null);
      }
    }).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "classifier", false);
      }
    });
  }

  public static Iterable sourceNodesQuery_4902059885395479729(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "parameters", true), "component", true);
  }

  public static Iterable sourceNodesQuery_5189627237350267857(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "dependency", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode d) {
        return SPropertyOperations.getString_def(d, "qualifier", "BEFORE") == SEnumOperations.getEnumMemberValue(((SNode) _context.getVariable("qualifier")));
      }
    }).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode d) {
        return SLinkOperations.getTarget(d, "dependsOn", false);
      }
    });
  }

  public static Iterable sourceNodesQuery_5189627237350270300(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ((List<SNode>) _context.getVariable("related"));
  }

  public static Iterable sourceNodesQuery_671853460608824199(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.make.facet.structure.FacetDeclaration")).sort(new ISelector<SNode, Comparable<?>>() {
      public Comparable<?> select(SNode fd) {
        return SPropertyOperations.getString(fd, "name");
      }
    }, true);
  }

  public static Iterable sourceNodesQuery_7320828025189345730(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "component", true);
  }

  public static SNode mapSrcMacro_mapper_4902059885395546854(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0cc().createNode(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getParentOutputNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "staticInnerClassifiers", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode cls) {
        return SNodeOperations.isInstanceOf(cls, "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
      }
    }));
  }

  public static SNode mapSrcMacro_mapper_4902059885395479710(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0dc().createNode(_context.getNode());
  }

  public static SNode mapSrcMacro_mapper_4902059885395547328(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0ec().createNode(ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getParentOutputNode(), "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "staticInnerClassifiers", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode cls) {
        return SNodeOperations.isInstanceOf(cls, "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration");
      }
    }));
  }

  public static SNode mapSrcMacro_mapper_4902059885395479721(final IOperationContext operationContext, final MapSrcMacroContext _context) {
    return new QueriesGenerated.QuotationClass_x583g4_a0a0fc().createNode(_context.getNode());
  }

  public static class QuotationClass_x583g4_a0a0cc {
    public QuotationClass_x583g4_a0a0cc() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0dc {
    public QuotationClass_x583g4_a0a0dc() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("component", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0ec {
    public QuotationClass_x583g4_a0a0ec() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0fc {
    public QuotationClass_x583g4_a0a0fc() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("component", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
