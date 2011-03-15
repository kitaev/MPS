package jetbrains.mps.smodel;

/*Generated by MPS */

import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;

public class SNodeUtil {
  public static final String concept_IResolveInfo = "jetbrains.mps.lang.core.structure.IResolveInfo";
  public static final String concept_INamedConcept = "jetbrains.mps.lang.core.structure.INamedConcept";
  public static final String concept_BaseConcept = "jetbrains.mps.lang.core.structure.BaseConcept";
  public static final String concept_AbstractConceptDeclaration = "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
  public static final String concept_ConceptDeclaration = "jetbrains.mps.lang.structure.structure.ConceptDeclaration";
  public static final String concept_InterfaceConceptDeclaration = "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration";
  public static final String link_ConceptDeclaration_extends = "extends";
  public static final String link_ConceptDeclaration_implements = "implements";
  public static final String link_AbstractConceptDeclaration_conceptProperty = "conceptProperty";
  public static final String link_AbstractConceptDeclaration_linkDeclaration = "linkDeclaration";
  public static final String link_AbstractConceptDeclaration_propertyDeclaration = "propertyDeclaration";
  public static String property_INamedConcept_name = "name";
  public static final String property_LinkDeclaration_role = "role";
  public static final String property_IResolveInfo_resolveInfo = "resolveInfo";
  public static final String property_BaseConcept_virtualPackage = "virtualPackage";
  public static final String property_BaseConcept_alias = "alias";
  public static final String property_BaseConcept_shortDescription = "shortDescription";
  public static final String link_ReferenceMacro_AnnotationLink = "referenceMacro";
  public static final String CPR_BaseConcept_alias = "alias";
  public static final String CPR_BaseConcept_abstract = "abstract";

  public SNodeUtil() {
  }

  public static String getPresentation(SNode node) {
    return ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", new Class[]{SNode.class}));
  }

  public static String getDetailedPresentation(SNode node) {
    return ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getDetailedPresentation_2354269628709769373", new Class[]{SNode.class}));
  }

  public static boolean isDefaultSubstitutable(SNode node) {
    return ((Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"), "call_isDefaultSubstitutable_7429110134803670673", new Class[]{SNode.class}));
  }

  public static int getMetaLevel(SNode node) {
    return ((Integer) BehaviorManager.getInstance().invoke(Integer.class, SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getMetaLevel_3981318653438234726", new Class[]{SNode.class}));
  }

  public static String getConceptDeclarationAlias(SNode conceptDeclaration) {
    return SPropertyOperations.getString(conceptDeclaration, "alias");
  }

  public static boolean isInstanceOfConceptDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return node.getConceptFqName().equals("jetbrains.mps.lang.structure.structure.ConceptDeclaration");
  }

  public static boolean isInstanceOfInterfaceConceptDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    return node.getConceptFqName().equals("jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration");
  }

  public static boolean isInstanceOfAbstractConceptDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.ConceptDeclaration") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }

  public static boolean isInstanceOfConceptProperty(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.BooleanConceptProperty") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.StringConceptProperty") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.IntegerConceptProperty") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.ConceptProperty");
  }

  public static SNode getConceptProperty_Declaration(SNode property) {
    return SLinkOperations.getTarget(property, "conceptPropertyDeclaration", false);
  }

  public static boolean getConceptPropertyDeclaration_IsInheritable(SNode propertyDeclaration) {
    return SPropertyOperations.getBoolean(propertyDeclaration, "inheritable");
  }

  public static boolean isInstanceOfConceptPropertyDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.StringConceptPropertyDeclaration") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.IntegerConceptPropertyDeclaration") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration");
  }

  public static boolean getConceptDeclaration_IsRootable(SNode concept) {
    return SPropertyOperations.getBoolean(concept, "rootable");
  }

  public static SNode getConceptDeclaration_Extends(SNode concept) {
    return SLinkOperations.getTarget(concept, "extends", false);
  }

  public static Iterable<SNode> getConceptDeclaration_Implements(SNode concept) {
    return ListSequence.fromList(SLinkOperations.getTargets(concept, "implements", true)).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "intfc", false);
      }
    });
  }

  public static Iterable<SNode> getConceptDeclaration_ImplementsReferenceNodes(SNode concept) {
    return SLinkOperations.getTargets(concept, "implements", true);
  }

  public static Iterable<SNode> getConcept_LinkDeclarations(SNode concept) {
    return SLinkOperations.getTargets(concept, "linkDeclaration", true);
  }

  public static Iterable<SNode> getConcept_PropertyDeclarations(SNode concept) {
    return SLinkOperations.getTargets(concept, "propertyDeclaration", true);
  }

  public static Iterable<SNode> getConcept_ConceptProperties(SNode concept) {
    return SLinkOperations.getTargets(concept, "conceptProperty", true);
  }

  public static Iterable<SNode> getConcept_ConceptLinks(SNode concept) {
    return SLinkOperations.getTargets(concept, "conceptLink", true);
  }

  public static Iterable<SNode> getConcept_ConceptPropertyDeclarations(SNode concept) {
    return SLinkOperations.getTargets(concept, "conceptPropertyDeclaration", true);
  }

  public static Iterable<SNode> getConcept_ConceptLinkDeclarations(SNode concept) {
    return SLinkOperations.getTargets(concept, "conceptLinkDeclaration", true);
  }

  public static Iterable<SNode> getInterfaceConceptDeclaration_Extends(SNode concept) {
    return ListSequence.fromList(SLinkOperations.getTargets(concept, "extends", true)).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return SLinkOperations.getTarget(it, "intfc", false);
      }
    });
  }

  public static Iterable<SNode> getInterfaceConceptDeclaration_ExtendsReferenceNodes(SNode concept) {
    return SLinkOperations.getTargets(concept, "extends", true);
  }

  public static String getNodeShortDescription(SNode node) {
    return SPropertyOperations.getString(node, "shortDescription");
  }

  public static String getConceptShortDescription(SNode concept) {
    return SConceptPropertyOperations.getString(concept, "shortDescription");
  }

  public static String getConceptAlias(SNode concept) {
    return SConceptPropertyOperations.getString(concept, "alias");
  }

  public static String getResolveInfo(SNode node) {
    return SPropertyOperations.getString(node, "resolveInfo");
  }

  public static boolean isInstanceOfLinkDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.LinkDeclaration");
  }

  public static boolean isInstanceOfPropertyDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.PropertyDeclaration");
  }

  public static SNode getPropertyDeclaration_DataType(SNode decl) {
    return SLinkOperations.getTarget(decl, "dataType", false);
  }

  public static boolean isInstanceOfPrimitiveDataTypeDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration");
  }

  public static boolean isInstanceOfEnumerationDataTypeDeclaration(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration");
  }

  public static boolean getLinkDeclaration_IsReference(SNode link) {
    return SPropertyOperations.hasValue(link, "metaClass", "reference", "reference");
  }

  public static boolean getLinkDeclaration_IsExactlyOneMultiplicity(SNode link) {
    return SPropertyOperations.hasValue(link, "sourceCardinality", "1", "0..1");
  }

  public static boolean getLinkDeclaration_IsAtLeastOneMultiplicity(SNode link) {
    return SPropertyOperations.hasValue(link, "sourceCardinality", "1", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1..n", "0..1");
  }

  public static boolean getLinkDeclaration_IsSingular(SNode link) {
    return ((Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(link, "jetbrains.mps.lang.structure.structure.LinkDeclaration"), "call_isSingular_1213877254557", new Class[]{SNode.class}));
  }

  public static boolean isInstanceOfIntegerConceptProperty(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.IntegerConceptPropertyDeclaration");
  }

  public static boolean isInstanceOfStringConceptProperty(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.StringConceptPropertyDeclaration");
  }

  public static boolean isInstanceOfBooleanConceptProperty(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration");
  }

  public static boolean isInstanceOfConceptLink(SNode node) {
    if (node == null) {
      return false;
    }
    String conceptFqName = node.getConceptFqName();
    return conceptFqName.equals("jetbrains.mps.lang.structure.structure.AggregationConceptLink") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.ReferenceConceptLink") || conceptFqName.equals("jetbrains.mps.lang.structure.structure.ConceptLink");
  }

  public static SNode getConceptLink_Declaration(SNode link) {
    return SLinkOperations.getTarget(link, "conceptLinkDeclaration", false);
  }

  public static Object getConceptPropertyValue(SNode property) {
    if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.structure.structure.StringConceptProperty")) {
      return SPropertyOperations.getString(SNodeOperations.cast(property, "jetbrains.mps.lang.structure.structure.StringConceptProperty"), "value");
    } else if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.structure.structure.IntegerConceptProperty")) {
      return SPropertyOperations.getInteger(SNodeOperations.cast(property, "jetbrains.mps.lang.structure.structure.IntegerConceptProperty"), "value");
    } else if (SNodeOperations.isInstanceOf(property, "jetbrains.mps.lang.structure.structure.BooleanConceptProperty")) {
      return Boolean.TRUE;
    }
    return null;
  }
}
