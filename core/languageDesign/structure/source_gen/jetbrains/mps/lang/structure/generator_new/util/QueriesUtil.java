package jetbrains.mps.lang.structure.generator_new.util;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.PropertySupport;
import jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.util.NameUtil;

public class QueriesUtil {

  public static boolean propertyDataType_isString(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration")) {
      return PropertySupport.isString(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(dataType)));
    }
    if (SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration")) {
      return true;
    }
    return false;
  }

  public static boolean propertyDataType_isBoolean(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration")) {
      return PropertySupport.isBoolean(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(dataType)));
    }
    return false;
  }

  public static boolean propertyDataType_isInteger(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration")) {
      return PropertySupport.isInteger(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(dataType)));
    }
    return false;
  }

  public static boolean propertyDataType_isEnum(SNode property) {
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (SNodeOperations.isInstanceOf(dataType, "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration")) {
      return true;
    }
    return false;
  }

  public static boolean isRefLink_card_1_nospec(SNode link) {
    if (SPropertyOperations.hasValue(link, "metaClass", "reference", "reference")) {
      if (SPropertyOperations.hasValue(link, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1", "0..1")) {
        return SLinkOperations.getTarget(link, "specializedLink", false) == null;
      }
    }
    return false;
  }

  public static boolean isRefLink_card_1_spec(SNode link) {
    if (SLinkOperations.getTarget(link, "specializedLink", false) != null) {
      SNode genuineLink = (SNode)SModelUtil_new.getGenuineLinkDeclaration(((LinkDeclaration)SNodeOperations.getAdapter(link))).getNode();
      if (SPropertyOperations.hasValue(genuineLink, "metaClass", "reference", "reference")) {
        if (SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1")) {
          return true;
        }
      }
    }
    return false;
  }

  public static boolean isAggLink_card_1_nospec(SNode link) {
    if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
      if (SPropertyOperations.hasValue(link, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1", "0..1")) {
        return SLinkOperations.getTarget(link, "specializedLink", false) == null;
      }
    }
    return false;
  }

  public static boolean isAggLink_card_n_nospec(SNode link) {
    if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
      if (SPropertyOperations.hasValue(link, "sourceCardinality", "0..n", "0..1") || SPropertyOperations.hasValue(link, "sourceCardinality", "1..n", "0..1")) {
        return SLinkOperations.getTarget(link, "specializedLink", false) == null;
      }
    }
    return false;
  }

  public static boolean isAggLink_card_1_spec(SNode link) {
    if (SLinkOperations.getTarget(link, "specializedLink", false) != null) {
      SNode genuineLink = (SNode)SModelUtil_new.getGenuineLinkDeclaration(((LinkDeclaration)SNodeOperations.getAdapter(link))).getNode();
      if (SPropertyOperations.hasValue(genuineLink, "metaClass", "aggregation", "reference")) {
        if (SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "0..1", "0..1") || SPropertyOperations.hasValue(genuineLink, "sourceCardinality", "1", "0..1")) {
          return true;
        }
      }
    }
    return false;
  }

  public static List<SNode> conceptAndItsInterfaces(SNode concept) {
    List<SNode> result = ListSequence.<SNode>fromArray(concept);
    List<AbstractConceptDeclaration> list = SModelUtil_new.getDirectSuperInterfacesAndTheySupers(((ConceptDeclaration)SNodeOperations.getAdapter(concept)));
    List<SNode> interfaces = BaseAdapter.toNodes(list);
    ListSequence.fromList(result).addSequence(ListSequence.fromList(interfaces));
    return result;
  }

  public static boolean AL_isNodeStereotypeAndSingular(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "node", "node") && QueriesUtil.AL_isSingular(al);
  }

  public static boolean AL_isNodeStereotypeAndPlural(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "node", "node") && QueriesUtil.AL_isPlural(al);
  }

  public static boolean AL_isPropertyStereotypeAndSingular(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "property", "node") && QueriesUtil.AL_isSingular(al);
  }

  public static boolean AL_isPropertyStereotypeAndPlural(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "property", "node") && QueriesUtil.AL_isPlural(al);
  }

  public static boolean AL_isLinkStereotypeAndSingular(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "link", "node") && QueriesUtil.AL_isSingular(al);
  }

  public static boolean AL_isLinkStereotypeAndPlural(SNode al) {
    return SPropertyOperations.hasValue(al, "stereotype", "link", "node") && QueriesUtil.AL_isPlural(al);
  }

  public static boolean AL_isSingular(SNode al) {
    boolean b1 = SPropertyOperations.hasValue(al, "sourceCardinality", "0..1", "0..1");
    return b1;
  }

  public static boolean AL_isPlural(SNode al) {
    boolean b1 = SPropertyOperations.hasValue(al, "sourceCardinality", "0..n", "0..1");
    return b1;
  }

  public static String conceptClassFQName(SNode conceptDeclaration) {
    if ((conceptDeclaration == null)) {
      return "jetbrains.mps.core.structure.BaseConcept";
    }
    return SNodeOperations.getModel(conceptDeclaration).getLongName() + "." + SPropertyOperations.getString(conceptDeclaration, "name");
  }

  public static String enumClassFQName(SNode enumDeclaration) {
    if ((enumDeclaration == null)) {
      return "jetbrains.mps.core.structure.BaseConcept";
    }
    return SNodeOperations.getModel(enumDeclaration).getLongName() + "." + SPropertyOperations.getString(enumDeclaration, "name");
  }

  public static String AL_class_getterName(SNode node) {
    return "get" + NameUtil.capitalize(SPropertyOperations.getString(node, "role"));
  }

  public static String AL_class_listGetterName(SNode node) {
    String role = NameUtil.pluralize(SPropertyOperations.getString(node, "role"));
    return "get" + NameUtil.capitalize(role);
  }

  public static String AL_class_setterName(SNode node) {
    if (QueriesUtil.AL_isSingular(node)) {
      return "set" + NameUtil.capitalize(SPropertyOperations.getString(node, "role"));
    }
    return "add" + NameUtil.capitalize(SPropertyOperations.getString(node, "role"));
  }

}
