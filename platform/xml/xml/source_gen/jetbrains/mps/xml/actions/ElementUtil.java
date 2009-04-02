package jetbrains.mps.xml.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.xml.behavior.XmlRoot_Behavior;
import java.util.List;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.xmlSchema.behavior.ElementDeclaration_Behavior;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public class ElementUtil {

  public static SNode getParentElementDeclaration(SNode node, IScope scope) {
    return getParentElementDeclaration(node, scope, true);
  }

  private static SNode getParentElementDeclaration(SNode node, IScope scope, boolean includeThis) {
    SNode elementDeclaration = null;
    SNode currentNode = node;
    if (!(includeThis)) {
      currentNode = SNodeOperations.getParent(node);
    }
    while (true) {
      if ((currentNode == null)) {
        break;
      }
      if (SNodeOperations.isInstanceOf(currentNode, "jetbrains.mps.xml.structure.Element")) {
        elementDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(currentNode, "jetbrains.mps.xml.structure.Element"), "elementDeclaration", false);
        break;
      }
      if (SNodeOperations.isInstanceOf(currentNode, "jetbrains.mps.xml.structure.Content")) {
        SNode content = SNodeOperations.cast(currentNode, "jetbrains.mps.xml.structure.Content");
        elementDeclaration = ListSequence.fromList(SLinkOperations.getConceptLinkTargets(content, "correspondingElement")).first();
        if ((elementDeclaration != null)) {
          break;
        }
      }
      currentNode = SNodeOperations.getParent(currentNode);
    }
    return elementDeclaration;
  }

  private static SNode findSchema(SNode node, IScope scope) {
    SNode schema = null;
    SNode element = SNodeOperations.getAncestor(node, "jetbrains.mps.xml.structure.Element", true, false);
    if ((element == null)) {
      SNode containingRoot = SNodeOperations.getContainingRoot(node);
      if (SNodeOperations.isInstanceOf(containingRoot, "jetbrains.mps.xml.structure.XmlRoot")) {
        schema = XmlRoot_Behavior.call_getSchema_1213877420378(SNodeOperations.cast(containingRoot, "jetbrains.mps.xml.structure.XmlRoot"), scope);
      }
    } else
    {
      schema = SNodeOperations.getAncestor(SLinkOperations.getTarget(element, "elementDeclaration", false), "jetbrains.mps.xmlSchema.structure.Schema", false, false);
    }
    return schema;
  }

  public static List<SNode> getElementDeclarations(SNode elementDeclaration, SNode node, IScope scope) {
    SNode schema = findSchema(node, scope);
    Set<SNode> elementDeclarationSet = SetSequence.<SNode>fromArray();
    if ((elementDeclaration == null)) {
      if ((schema != null) && SPropertyOperations.getBoolean(schema, "alwaysUseRoot")) {
        elementDeclarationSet.add(SLinkOperations.getTarget(SLinkOperations.getTarget(schema, "rootElementReference", true), "elementDeclaration", false));
      } else
      {
        List<SNode> elementDeclarations = SModelOperations.getNodesIncludingImported(SNodeOperations.getModel(node), scope, "jetbrains.mps.xmlSchema.structure.ElementDeclaration");
        elementDeclarationSet.addAll(elementDeclarations);
      }
    } else
    {
      ElementDeclaration_Behavior.call_checkElements_ed_1213877429846(elementDeclaration, elementDeclarationSet);
    }
    List<SNode> elementDeclarations = ListOperations.<SNode>createList();
    ListSequence.fromList(elementDeclarations).addSequence(SetSequence.fromSet(elementDeclarationSet));
    return elementDeclarations;
  }

}
