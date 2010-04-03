package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import org.w3c.dom.Node;
import jetbrains.mps.ypath.runtime.IFilter;
import java.util.AbstractList;
import java.util.AbstractCollection;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;

public class TryFeatures extends TreePath<Node> {
  public TryFeatures() {
    this.registerFeature(new TryFeatures.Desc_Feature_nodes());
    this.registerFeature(new TryFeatures.Desc_Feature_attributes());
  }

  public Node parent(Node node) {
    return TryFeatures.Parent.parent(node);
  }

  private static class Parent {
    public static Node parent(Node node) {
      return node.getParentNode();
    }
  }

  private static class Children {
  }

  public static class foo_NodeKindTrigger implements IFilter<Node> {
    private static TryFeatures.foo_NodeKindTrigger instance;

    private foo_NodeKindTrigger() {
    }

    public boolean accept(Node node) {
      return true;
    }

    public static IFilter<Node> getInstance() {
      if (instance == null) {
        instance = new TryFeatures.foo_NodeKindTrigger();
      }
      return instance;
    }
  }

  public static class foo_BAR_Property {
    public static IFilter<Node> getMatcher(final String matchValue) {
      IFilter filter;
      if (matchValue != null) {
        filter = new IFilter() {
          public boolean accept(Object n) {
            Node node = (Node) n;
            String actualValue = TryFeatures.foo_BAR_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }
        };
      } else {
        filter = new IFilter() {
          public boolean accept(Object n) {
            Node node = (Node) n;
            String actualValue = TryFeatures.foo_BAR_Property.Getter.getValue(node);
            return actualValue == null;
          }
        };
      }
      return (IFilter<Node>) filter;
    }

    private static class Getter {
      public static String getValue(Node node) {
        return "";
      }
    }
  }

  public static class foo_BAZ_Property {
    public static IFilter<Node> getMatcher(final String matchValue) {
      IFilter filter;
      if (matchValue != null) {
        filter = new IFilter() {
          public boolean accept(Object n) {
            Node node = (Node) n;
            String actualValue = TryFeatures.foo_BAZ_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }
        };
      } else {
        filter = new IFilter() {
          public boolean accept(Object n) {
            Node node = (Node) n;
            String actualValue = TryFeatures.foo_BAZ_Property.Getter.getValue(node);
            return actualValue == null;
          }
        };
      }
      return (IFilter<Node>) filter;
    }

    private static class Getter {
      public static String getValue(Node node) {
        return "";
      }
    }
  }

  private static class Feature_nodes extends AbstractList<Node> {
    private Node thisNode;

    public Feature_nodes(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Node get(int idx) {
      if (idx < 0 || idx >= this.size()) {
        throw new IndexOutOfBoundsException();
      }
      return this.thisNode.getChildNodes().item(idx);
    }

    public int size() {
      return this.thisNode.getChildNodes().getLength();
    }
  }

  private static class Feature_attributes extends AbstractCollection<Node> {
    private Node thisNode;

    public Feature_attributes(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Iterable<Node> sequence() {
      final Node _node = this.thisNode;
      return Sequence.fromClosure(new ISequenceClosure<Node>() {
        public Iterable<Node> iterable() {
          return new Iterable<Node>() {
            public Iterator<Node> iterator() {
              return new YieldingIterator<Node>() {
                private int __CP__ = 0;
                private int _3_count;
                private int _4_idx;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 4:
                        this._4_idx = 0;
                      case 5:
                        if (!(_4_idx < _3_count)) {
                          this.__CP__ = 1;
                          break;
                        }
                        this.__CP__ = 6;
                        break;
                      case 7:
                        _4_idx++;
                        this.__CP__ = 5;
                        break;
                      case 8:
                        this.__CP__ = 7;
                        this.yield(_node.getAttributes().item(_4_idx));
                        return true;
                      case 0:
                        this._3_count = _node.getAttributes().getLength();
                        this.__CP__ = 4;
                        break;
                      case 6:
                        this.__CP__ = 8;
                        break;
                      default:
                        break __loop__;
                    }
                  } while (true);
                  return false;
                }
              };
            }
          };
        }
      });
    }

    public Iterator<Node> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return this.thisNode.getAttributes().getLength();
    }
  }

  public static class Desc_Feature_nodes extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {
    public Desc_Feature_nodes() {
    }

    public Iterable<Node> getContents(Node node) {
      return new TryFeatures.Feature_nodes(node);
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

  public static class Desc_Feature_attributes extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {
    public Desc_Feature_attributes() {
    }

    public Iterable<Node> getContents(Node node) {
      return new TryFeatures.Feature_attributes(node);
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
}
