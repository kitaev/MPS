package treepath_dom;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import org.w3c.dom.Node;
import jetbrains.mps.ypath.runtime.IFilter;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
import treepath_dom.DOM2.ELEMENT_tag_Property;
import treepath_dom.DOM2.ATTR_name_Property;
import treepath_dom.DOM2.ATTR_value_Property;
import java.util.AbstractCollection;
import jetbrains.mps.baseLanguage.ext.collections.internal.SequenceWithSupplier;
import java.util.Iterator;
import java.util.AbstractList;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;

public class DOM2 extends TreePath<Node> {

  public  DOM2() {
    this.registerFeature(new DOM2.Desc_Feature_attributes());
    this.registerFeature(new DOM2.Desc_Feature_nodes());
  }

  public Node parent(Node node) {
    return DOM2.Parent.parent(node);
  }

  private static class Parent {

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    public  Parent(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static Node parent(Node node) {
      return node.getParentNode();
    }

}
  private static class Children {

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    public  Children(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }
}
  public static class ELEMENT_NodeKindTrigger implements IFilter<Node> {
    public static DOM2.ELEMENT_NodeKindTrigger instance;

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    private  ELEMENT_NodeKindTrigger() {
    }
    public  ELEMENT_NodeKindTrigger(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static IFilter<Node> getInstance() {
      if(DOM2.ELEMENT_NodeKindTrigger.instance == null) {
        DOM2.ELEMENT_NodeKindTrigger.instance = new DOM2.ELEMENT_NodeKindTrigger();
      }
      return DOM2.ELEMENT_NodeKindTrigger.instance;
    }


    public boolean accept(Node e) {
      return e instanceof Element;
    }

}
  public static class ATTR_NodeKindTrigger implements IFilter<Node> {
    public static DOM2.ATTR_NodeKindTrigger instance;

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    private  ATTR_NodeKindTrigger() {
    }
    public  ATTR_NodeKindTrigger(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static IFilter<Node> getInstance() {
      if(DOM2.ATTR_NodeKindTrigger.instance == null) {
        DOM2.ATTR_NodeKindTrigger.instance = new DOM2.ATTR_NodeKindTrigger();
      }
      return DOM2.ATTR_NodeKindTrigger.instance;
    }


    public boolean accept(Node a) {
      return a instanceof Attr;
    }

}
  public static class ELEMENT_tag_Property {

    public static IFilter<Node> getMatcher(final String matchValue) {
      IFilter filter;
      if(matchValue != null) {
        filter = new IFilter() {

          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM2.ELEMENT_tag_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }

        };
      } else
      {
        filter = new IFilter() {

          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM2.ELEMENT_tag_Property.Getter.getValue(node);
            return actualValue == null;
          }

        };
      }
      return (IFilter<Node>)filter;
    }

    private static class Getter {

      /* package */Object _enclosingClass;
      /* package */Object _closureContext;

      public  Getter(Object enclosingClass, Object closureContext) {
        this._enclosingClass = enclosingClass;
        this._closureContext = (Object)closureContext;
      }

      public static String getValue(Node e) {
        return ((Element)e).getTagName();
      }

}

}
  public static class ATTR_name_Property {

    public static IFilter<Node> getMatcher(final String matchValue) {
      IFilter filter;
      if(matchValue != null) {
        filter = new IFilter() {

          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM2.ATTR_name_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }

        };
      } else
      {
        filter = new IFilter() {

          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM2.ATTR_name_Property.Getter.getValue(node);
            return actualValue == null;
          }

        };
      }
      return (IFilter<Node>)filter;
    }

    private static class Getter {

      /* package */Object _enclosingClass;
      /* package */Object _closureContext;

      public  Getter(Object enclosingClass, Object closureContext) {
        this._enclosingClass = enclosingClass;
        this._closureContext = (Object)closureContext;
      }

      public static String getValue(Node a) {
        return ((Attr)a).getName();
      }

}

}
  public static class ATTR_value_Property {

    public static IFilter<Node> getMatcher(final String matchValue) {
      IFilter filter;
      if(matchValue != null) {
        filter = new IFilter() {

          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM2.ATTR_value_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }

        };
      } else
      {
        filter = new IFilter() {

          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM2.ATTR_value_Property.Getter.getValue(node);
            return actualValue == null;
          }

        };
      }
      return (IFilter<Node>)filter;
    }

    private static class Getter {

      /* package */Object _enclosingClass;
      /* package */Object _closureContext;

      public  Getter(Object enclosingClass, Object closureContext) {
        this._enclosingClass = enclosingClass;
        this._closureContext = (Object)closureContext;
      }

      public static String getValue(Node a) {
        return ((Attr)a).getValue();
      }

}

}
  private static class Feature_attributes extends AbstractCollection<Node> {

    private Node thisNode;

    public  Feature_attributes(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Iterable<Node> sequence() {
      final zClosureContext _zClosureContext = new zClosureContext();
      _zClosureContext._node = this.thisNode;
      return new SequenceWithSupplier<Node>(new zValueSupplier(null, _zClosureContext));
    }

    public Iterator<Node> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return this.thisNode.getAttributes().getLength();
    }

    public boolean add(Node value) {
      boolean __alreadyContains__ = this.contains(value);
      this.thisNode.getAttributes().setNamedItem(value);
      return __alreadyContains__;
    }

}
  private static class Feature_nodes extends AbstractList<Node> {

    private Node thisNode;

    public  Feature_nodes(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Node get(int idx) {
      if(idx < 0 || idx >= this.size()) {
        throw new IndexOutOfBoundsException();
      }
      return this.thisNode.getChildNodes().item(idx);
    }

    public int size() {
      return this.thisNode.getChildNodes().getLength();
    }

    public Node set(int idx, Node value) {
      if(idx < 0 || idx >= this.size()) {
        throw new IndexOutOfBoundsException();
      }
      Node __oldValue__ = this.get(idx);
      this.thisNode.replaceChild(this.thisNode.getChildNodes().item(idx), value);
      return __oldValue__;
    }

    public void add(int idx, Node value) {
      if(idx < 0 || idx > this.size()) {
        throw new IndexOutOfBoundsException();
      }
      if(idx < this.thisNode.getChildNodes().getLength()) {
        this.thisNode.insertBefore(this.thisNode.getChildNodes().item(idx), value);
      } else
      {
        this.thisNode.appendChild(value);
      }
    }

    public Node remove(int idx) {
      if(idx < 0 || idx >= this.size()) {
        throw new IndexOutOfBoundsException();
      }
      Node __oldValue__ = this.get(idx);
      this.thisNode.removeChild(this.thisNode.getChildNodes().item(idx));
      return __oldValue__;
    }

}
  public static class Desc_Feature_attributes extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {

    public  Desc_Feature_attributes() {
    }

    public Iterable<Node> getContents(Node node) {
      return new DOM2.Feature_attributes(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "attributes";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }

}
  public static class Desc_Feature_nodes extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {

    public  Desc_Feature_nodes() {
    }

    public Iterable<Node> getContents(Node node) {
      return new DOM2.Feature_nodes(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "nodes";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }

}

}
