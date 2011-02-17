package jetbrains.mps.lang.smodel.generator.smodelAdapter;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class AttributeOperations {
  private AttributeOperations() {
  }

  public static String getOldRole(SNode node) {
    if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.core.structure.PropertyAttribute")) {
      return AttributesRolesUtil.childRoleFromPropertyAttributeRole(SConceptPropertyOperations.getString(node, "role"), SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.PropertyAttribute"), "propertyName"));
    } else if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.core.structure.LinkAttribute")) {
      return AttributesRolesUtil.childRoleFromLinkAttributeRole(SConceptPropertyOperations.getString(node, "role"), SPropertyOperations.getString(SNodeOperations.cast(node, "jetbrains.mps.lang.core.structure.LinkAttribute"), "linkRole"));
    } else {
      return AttributesRolesUtil.childRoleFromAttributeRole(SConceptPropertyOperations.getString(node, "role"));
    }
    // <node> 
  }

  public static boolean isNewAttributeInOldRole(SNode node, String oldRole) {
    return SNodeOperations.hasRole(node, "jetbrains.mps.lang.core.structure.BaseConcept", "_$attribute") && oldRole.equals(getOldRole(node));
  }

  public static Iterable<SNode> getAttributes(SNode node, final IAttributeDescriptor descriptor) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "_$attribute", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return descriptor.match(it);
      }
    });
  }

  public static SNode getAttribute(SNode node, IAttributeDescriptor descriptor) {
    Iterable<SNode> list = getAttributes(node, descriptor);
    if (Sequence.fromIterable(list).isEmpty()) {
      return null;
    }
    // todo: error if more than 1 attribute found 
    return Sequence.fromIterable(list).first();
  }

  public static SNode addAttribute(SNode node, IAttributeDescriptor descriptor, SNode value) {
    ListSequence.fromList(SLinkOperations.getTargets(node, "_$attribute", true)).addElement(value);
    descriptor.update(value);
    return value;
  }

  public static SNode insertAttribute(SNode node, SNode anchor, IAttributeDescriptor descriptor, SNode value) {
    node.insertChild(anchor, "_$attribute", value);
    descriptor.update(value);
    return value;
  }

  public static void deleteAttribute(SNode node, IAttributeDescriptor descriptor, SNode value) {
    List<SNode> list = new ArrayList<SNode>();
    ListSequence.fromList(list).addSequence(Sequence.fromIterable(getAttributes(node, descriptor)));
    for (SNode attribute : ListSequence.fromList(list)) {
      if (value == null || value == attribute) {
        SNodeOperations.deleteNode(attribute);
      }
    }
  }

  public static SNode setAttribute(SNode node, IAttributeDescriptor descriptor, SNode value) {
    Iterable<SNode> oldlist = getAttributes(node, descriptor);
    if (Sequence.fromIterable(oldlist).isEmpty()) {
      if ((value == null)) {
        return null;
      }
      addAttribute(node, descriptor, value);
    } else if ((value == null)) {
      deleteAttribute(node, descriptor, value);
    } else {
      // todo: error if more than 1 attribute found 
      descriptor.update(value);
    }
    return value;
  }

  public static List<SNode> getAttributeList(SNode node, IAttributeDescriptor descriptor) {
    return ((node == null) ?
      null :
      new AttributeOperations.AttributeList(node, descriptor)
    );
  }

  public static SNode createAndSetAttrbiute(SNode node, IAttributeDescriptor descriptor, String newConceptFqname) {
    return setAttribute(node, descriptor, (SNode) SModelOperations.createNewNode(SNodeOperations.getModel(node), newConceptFqname));
  }

  public static SNode createAndAddAttribute(SNode node, IAttributeDescriptor descriptor, String newConceptFqname) {
    return addAttribute(node, descriptor, (SNode) SModelOperations.createNewNode(SNodeOperations.getModel(node), newConceptFqname));
  }

  public static SNode getLinkDeclaration(SNode attribute) {
    return SNodeOperations.as(SModelSearchUtil.findLinkDeclaration(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(attribute)), getLinkRole(attribute)), "jetbrains.mps.lang.structure.structure.LinkDeclaration");
  }

  public static String getLinkRole(SNode attribute) {
    if (!(SNodeOperations.hasRole(attribute, "jetbrains.mps.lang.core.structure.BaseConcept", "_$attribute"))) {
      // compatibility with old attributes 
      return AttributesRolesUtil.getLinkRoleFromLinkAttributeRole(SNodeOperations.getContainingLinkRole(attribute));
    }
    return SPropertyOperations.getString(attribute, "linkRole");
  }

  public static SNode getPropertyDeclaration(SNode attribute) {
    return SNodeOperations.as(SModelSearchUtil.findPropertyDeclaration(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(attribute)), getPropertyName(attribute)), "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
  }

  public static String getPropertyName(SNode attribute) {
    if (!(SNodeOperations.hasRole(attribute, "jetbrains.mps.lang.core.structure.BaseConcept", "_$attribute"))) {
      // compatibility with old attributes 
      return AttributesRolesUtil.getPropertyNameFromPropertyAttributeRole(SNodeOperations.getContainingLinkRole(attribute));
    }
    return SPropertyOperations.getString(attribute, "propertyName");
  }

  public static void $$$$$$$$$$$$$$$$$$$$() {
  }

  public static boolean isAttribute(SNode node) {
    return SNodeOperations.hasRole(node, "jetbrains.mps.lang.core.structure.BaseConcept", "_$attribute") || AttributesRolesUtil.isAttributeRole(SNodeOperations.getContainingLinkRole(node));
  }

  public static List<SNode> getAllAttributes(SNode node) {
    return SLinkOperations.getTargets(node, "_$attribute", true);
  }

  public static List<SNode> getNodeAttributes(SNode node) {
    return Sequence.fromIterable(getAttributes(node, new IAttributeDescriptor.NodeAttributeString(null))).toListSequence();
    // <node> 
  }

  public static SNode getNodeAttribute(SNode node, String role) {
    return getAttribute(node, new IAttributeDescriptor.NodeAttributeString(role));
  }

  public static List<SNode> getNodeAttributes(SNode node, String role) {
    return Sequence.fromIterable(getAttributes(node, new IAttributeDescriptor.NodeAttributeString(role))).toListSequence();
  }

  public static void setNodeAttribute(SNode node, String role, SNode attribute) {
    setAttribute(node, new IAttributeDescriptor.NodeAttributeString(role), attribute);
  }

  public static void addNodeAttribute(SNode node, String role, SNode attribute) {
    addAttribute(node, new IAttributeDescriptor.NodeAttributeString(role), attribute);
  }

  public static void setPropertyAttribute(SNode node, String role, String propertyName, SNode propertyAttribute) {
    setAttribute(node, new IAttributeDescriptor.PropertyAttributeString(role, propertyName), propertyAttribute);
  }

  public static void addPropertyAttribute(SNode node, String role, String propertyName, SNode propertyAttribute) {
    addAttribute(node, new IAttributeDescriptor.PropertyAttributeString(role, propertyName), propertyAttribute);
  }

  public static SNode getPropertyAttribute(SNode node, String role, String propertyName) {
    return getAttribute(node, new IAttributeDescriptor.PropertyAttributeString(role, propertyName));
  }

  public static List<SNode> getPropertyAttributes(SNode node, String role, String propertyName) {
    return Sequence.fromIterable(getAttributes(node, new IAttributeDescriptor.PropertyAttributeString(role, propertyName))).toListSequence();
  }

  public static Set<SNode> getPropertyAttributeForPropertyName(SNode node, String propertyName) {
    return SetSequence.fromSetWithValues(new HashSet<SNode>(), getAttributes(node, new IAttributeDescriptor.PropertyAttributeString(null, propertyName)));
  }

  public static Set<String> getPropertyNamesFromAttributes(SNode node) {
    return SetSequence.fromSetWithValues(new HashSet<String>(), Sequence.fromIterable(getAttributes(node, new IAttributeDescriptor.PropertyAttributeString(null, null))).<String>select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return getPropertyName(SNodeOperations.as(it, "jetbrains.mps.lang.core.structure.PropertyAttribute"));
      }
    }).where(new IWhereFilter<String>() {
      public boolean accept(String name) {
        return name != null;
      }
    }));
  }

  public static void setLinkAttribute(SNode node, String role, String linkRole, SNode linkAttribute) {
    setAttribute(node, new IAttributeDescriptor.LinkAttributeString(role, linkRole), linkAttribute);
  }

  public static void addLinkAttribute(SNode node, String role, String linkRole, SNode linkAttribute) {
    addAttribute(node, new IAttributeDescriptor.LinkAttributeString(role, linkRole), linkAttribute);
  }

  public static SNode getLinkAttribute(SNode node, String role, String linkRole) {
    return getAttribute(node, new IAttributeDescriptor.LinkAttributeString(role, linkRole));
  }

  public static List<SNode> getLinkAttributes(SNode node, String role, String linkRole) {
    return Sequence.fromIterable(getAttributes(node, new IAttributeDescriptor.LinkAttributeString(role, linkRole))).toListSequence();
  }

  public static Set<SNode> getLinkAttributeForLinkRole(SNode node, String linkRole) {
    return SetSequence.fromSetWithValues(new HashSet<SNode>(), getAttributes(node, new IAttributeDescriptor.LinkAttributeString(null, linkRole)));
  }

  public static Set<String> getLinkNamesFromAttributes(SNode node) {
    return SetSequence.fromSetWithValues(new HashSet<String>(), Sequence.fromIterable(getAttributes(node, new IAttributeDescriptor.LinkAttributeString(null, null))).<String>select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return getLinkRole(SNodeOperations.as(it, "jetbrains.mps.lang.core.structure.LinkAttribute"));
      }
    }).where(new IWhereFilter<String>() {
      public boolean accept(String role) {
        return role != null;
      }
    }));
  }

  public static class AttributeList extends AbstractSNodeList {
    private IAttributeDescriptor myAttributeDescriptor;

    public AttributeList(SNode attributed, IAttributeDescriptor descriptor) {
      super(attributed, "_$attribute", AttributeOperations.getAttribute(SNodeOperations.cast(attributed, "jetbrains.mps.lang.core.structure.BaseConcept"), descriptor));
      myAttributeDescriptor = descriptor;
    }

    protected void insertAfter(SNode node, SNode anchorNode) {
      AttributeOperations.insertAttribute(myReferenceContainer, anchorNode, myAttributeDescriptor, (SNode) node);
    }

    protected void doAddReference(SNode node) {
      AttributeOperations.addAttribute(myReferenceContainer, myAttributeDescriptor, (SNode) node);
    }

    protected void doRemoveReference(SNode node) {
      AttributeOperations.deleteAttribute(myReferenceContainer, myAttributeDescriptor, (SNode) node);
    }
  }
}
