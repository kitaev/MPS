package sample3;

/*Generated by MPS */

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import jetbrains.mps.ypath.runtime.TreeTraversalFactory;
import treepath_dom.DOM;
import jetbrains.mps.ypath.runtime.CompositeFilter;

public class XmlDemo {

  public static void main(String[] args) {
    String INPUT = "<doc> <a><b><foobar/><findme baz=\"fooblin\"/></b><c></c></a> </doc>";
    try {
      InputStream is = new ByteArrayInputStream(INPUT.getBytes());
      Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
      for(Node node : TreeTraversalFactory.Filter(TreeTraversalFactory.Traverse(new DOM().startTraversal(doc), TreeTraversalFactory.Axis("DESCENDANTS")), DOM.ELEMENT_NodeKindTrigger.getInstance())) {
        System.out.println(node);
      }
      for(Node node : TreeTraversalFactory.Filter(TreeTraversalFactory.Traverse(TreeTraversalFactory.Filter(TreeTraversalFactory.Traverse(new DOM().startTraversal(doc), TreeTraversalFactory.Axis("DESCENDANTS")), new CompositeFilter<Node>(DOM.ELEMENT_NodeKindTrigger.getInstance(), DOM.ELEMENT_tag_Property.getMatcher("a"))), TreeTraversalFactory.Axis("DESCENDANTS")), new CompositeFilter<Node>(DOM.ELEMENT_NodeKindTrigger.getInstance(), DOM.ELEMENT_tag_Property.getMatcher("findme")))) {
        System.out.println("Found: " + node);
      }
      for(Node node : TreeTraversalFactory.Filter(TreeTraversalFactory.Traverse(TreeTraversalFactory.Filter(TreeTraversalFactory.Traverse(new DOM().startTraversal(doc), TreeTraversalFactory.Axis("DESCENDANTS")), new CompositeFilter<Node>(DOM.ELEMENT_NodeKindTrigger.getInstance(), DOM.ELEMENT_tag_Property.getMatcher("a"))), TreeTraversalFactory.Axis("DESCENDANTS")), new CompositeFilter<Node>(DOM.ELEMENT_NodeKindTrigger.getInstance(), DOM.ELEMENT_tag_Property.getMatcher("findme")))) {
        System.out.println("Found again: " + node);
      }
    } catch (Exception ignored) {
    }
  }

}
