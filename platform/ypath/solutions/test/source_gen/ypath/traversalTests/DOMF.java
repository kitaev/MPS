/*
 * Copyright 2003-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ypath.traversalTests;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import org.w3c.dom.Node;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;
import java.util.AbstractCollection;
import org.w3c.dom.NodeList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import org.w3c.dom.Element;

public class DOMF extends TreePath<Node> {

  public DOMF() {
    this.registerFeature(new DOMF.Desc_Feature_elements());
  }

  public Node parent(Node node) {
    return DOMF.Parent.parent(node);
  }


  public static IFeatureDescriptor<Node> child(String param) {
    return new DOMF.Desc_Feature_child(param);
  }

  private static class Parent {

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    public Parent(Object enclosingClass, Object closureContext) {
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

    public Children(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }
}
  private static class Feature_elements extends AbstractCollection<Node> {

    private Node thisNode;

    public Feature_elements(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Iterable<Node> sequence() {
      final NodeList cns = this.thisNode.getChildNodes();
      return Sequence.fromClosure(new ISequenceClosure <Node>() {

        public Iterable<Node> iterable() {
          return new Iterable <Node>() {

            public Iterator<Node> iterator() {
              return new YieldingIterator <Node>() {

                private int __CP__ = 0;
                private Node _7_it;
                private int _2_i;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 2:
                        this._2_i = 0;
                      case 3:
                        if (!(this._2_i < cns.getLength())) {
                          this.__CP__ = 1;
                          break;
                        }
                        this.__CP__ = 4;
                        break;
                      case 5:
                        this._2_i = this._2_i + 1;
                        this.__CP__ = 3;
                        break;
                      case 8:
                        if (this._7_it instanceof Element) {
                          this.__CP__ = 9;
                          break;
                        }
                        this.__CP__ = 5;
                        break;
                      case 10:
                        this.__CP__ = 5;
                        this.yield(this._7_it);
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 4:
                        this._7_it = cns.item(this._2_i);
                        this.__CP__ = 8;
                        break;
                      case 9:
                        this.__CP__ = 10;
                        break;
                      default:
                        break __loop__;
                    }
                  } while(true);
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
      final NodeList cns = this.thisNode.getChildNodes();
      Iterable<Node> seq = Sequence.fromClosure(new ISequenceClosure <Node>() {

        public Iterable<Node> iterable() {
          return new Iterable <Node>() {

            public Iterator<Node> iterator() {
              return new YieldingIterator <Node>() {

                private int __CP__ = 0;
                private Node _7_it;
                private int _2_i;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 2:
                        this._2_i = 0;
                      case 3:
                        if (!(this._2_i < cns.getLength())) {
                          this.__CP__ = 1;
                          break;
                        }
                        this.__CP__ = 4;
                        break;
                      case 5:
                        this._2_i = this._2_i + 1;
                        this.__CP__ = 3;
                        break;
                      case 8:
                        if (this._7_it instanceof Element) {
                          this.__CP__ = 9;
                          break;
                        }
                        this.__CP__ = 5;
                        break;
                      case 10:
                        this.__CP__ = 5;
                        this.yield(this._7_it);
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 4:
                        this._7_it = cns.item(this._2_i);
                        this.__CP__ = 8;
                        break;
                      case 9:
                        this.__CP__ = 10;
                        break;
                      default:
                        break __loop__;
                    }
                  } while(true);
                  return false;
                }

              };
            }

          };
        }

      });
      return Sequence.fromIterable(seq).count();
    }

}
  private static class Feature_child extends AbstractCollection<Node> {

    private Node thisNode;
    private String param;

    public Feature_child(Node thisNode, String param) {
      this.thisNode = thisNode;
      this.param = param;
    }

    public Iterable<Node> sequence() {
      final NodeList els = ((Element)this.thisNode).getElementsByTagName(this.param);
      return Sequence.fromClosure(new ISequenceClosure <Node>() {

        public Iterable<Node> iterable() {
          return new Iterable <Node>() {

            public Iterator<Node> iterator() {
              return new YieldingIterator <Node>() {

                private int __CP__ = 0;
                private int _2_i;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 2:
                        this._2_i = 0;
                      case 3:
                        if (!(this._2_i < els.getLength())) {
                          this.__CP__ = 1;
                          break;
                        }
                        this.__CP__ = 4;
                        break;
                      case 5:
                        this._2_i = this._2_i + 1;
                        this.__CP__ = 3;
                        break;
                      case 6:
                        this.__CP__ = 5;
                        this.yield(els.item(this._2_i));
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 4:
                        this.__CP__ = 6;
                        break;
                      default:
                        break __loop__;
                    }
                  } while(true);
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
      return ((Element)this.thisNode).getElementsByTagName(this.param).getLength();
    }

}
  public static class Desc_Feature_elements extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {

    public Desc_Feature_elements() {
    }

    public Iterable<Node> getContents(Node node) {
      return new DOMF.Feature_elements(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "elements";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }

}
  public static class Desc_Feature_child extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {

    private String param;

    public Desc_Feature_child(String param) {
      this.param = param;
    }

    public Iterable<Node> getContents(Node node) {
      return new DOMF.Feature_child(node, this.param);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "child";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }

}

}
