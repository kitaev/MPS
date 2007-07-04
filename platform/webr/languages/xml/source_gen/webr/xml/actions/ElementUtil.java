package webr.xml.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

public class ElementUtil {

  public static SNode getParentElement(SNode node) {
    SNode elementDeclaration = null;
    while(true) {
      if((node == null)) {
        break;
      }
      if(SNodeOperations.isInstanceOf(node, "webr.xml.structure.Element")) {
        elementDeclaration = SLinkOperations.getTarget(node, "elementDeclaration", false);
        break;
      }
      if(SNodeOperations.isInstanceOf(node, "webr.xml.structure.Content")) {
        SNode content = node;
        elementDeclaration = SequenceOperations.getFirst(SLinkOperations.getConceptLinkTargets(content, "elementForChildren"));
        if((elementDeclaration != null)) {
          break;
        }
        elementDeclaration = SequenceOperations.getFirst(SLinkOperations.getConceptLinkTargets(content, "correspondingElement"));
        if((elementDeclaration != null)) {
          break;
        }
      }
      node = SNodeOperations.getParent(node, null, false, false);
    }
    return elementDeclaration;
  }
  public static SNode findSchema(SNode node) {
    SNode schema = null;
    SNode element = SNodeOperations.getAncestor(node, "webr.xml.structure.Element", true, false);
    if((element == null)) {
      SNode containingRoot = SNodeOperations.getContainingRoot(node);
      if(SNodeOperations.isInstanceOf(containingRoot, "webr.xmlInternal.structure.XmlFile")) {
        schema = SLinkOperations.getTarget(containingRoot, "schema", false);
      }
    } else
    {
      schema = SNodeOperations.getAncestor(SLinkOperations.getTarget(element, "elementDeclaration", false), "webr.xmlSchema.structure.Schema", false, false);
    }
    return schema;
  }
  public static List<SNode> getElementDeclarations(SNode schema, SNode elementDeclaration) {
    List<SNode> elementDeclarations = new ArrayList<SNode>();
    if((elementDeclaration == null)) {
      if((schema != null) && SPropertyOperations.getBoolean(schema, "alwaysUseRoot")) {
        ListOperations.addElement(elementDeclarations, SLinkOperations.getTarget(SLinkOperations.getTarget(schema, "rootElementReference", true), "elementDeclaration", false));
      }
    } else
    {
    }
    return elementDeclarations;
  }
}
