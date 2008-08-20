package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.ISequenceIterableAdapter;
import java.util.Iterator;
import jetbrains.mps.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.closures.runtime._FunctionTypes;
import java.util.List;
import jetbrains.mps.ypath.runtime.TreeTraversalFactory;

public class SnodeDemo {

  public static void main(String[] args) {
    final SNode foo = null;
    ListSequence.fromList((SLinkOperations.getTargets(foo, "implements", true))).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this.__CP__ = 1;
                      this.yield(SLinkOperations.getTarget(it, "intfc", false));
                      return true;
                    case 0:
                      this.__CP__ = 2;
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

    }).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _2__zzz_;
              private Iterator<SNode> _2__zzz__it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2__zzz__it = SLinkOperations.getTargets(it, "extends", true).iterator();
                    case 3:
                      if (!(this._2__zzz__it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2__zzz_ = this._2__zzz__it.next();
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(this._2__zzz_);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
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
    // The following ypath construct should result in the same expression as above
    Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure <SNode>() {

      public Iterable<SNode> iterable() {
        return new Iterable <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _3__zzz_;
              private SNode _4__yyy_;
              private Iterator<SNode> _4__yyy__it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      this._4__yyy__it = SLinkOperations.getTargets(this._3__zzz_, "implements", true).iterator();
                    case 5:
                      if (!(this._4__yyy__it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._4__yyy_ = this._4__yyy__it.next();
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 5;
                      this.yield(this._4__yyy_);
                      return true;
                    case 0:
                      this._3__zzz_ = foo;
                      this.__CP__ = 4;
                      break;
                    case 6:
                      this.__CP__ = 7;
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

    })).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this.__CP__ = 1;
                      this.yield(SLinkOperations.getTarget(it, "intfc", false));
                      return true;
                    case 0:
                      this.__CP__ = 2;
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

    }).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _2__yyy_;
              private Iterator<SNode> _2__yyy__it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2__yyy__it = SLinkOperations.getTargets(it, "extends", true).iterator();
                    case 3:
                      if (!(this._2__yyy__it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2__yyy_ = this._2__yyy__it.next();
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(this._2__yyy_);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
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
    // Another pair of tests
//    ListSequence.fromList(ListSequence.<SNode>fromArray(SLinkOperations.getTarget(foo, "extends", false))).translate(new ITranslator <SNode>() {
//
//      public ISequence<S> translate(SNode it) {
//with_parents:
//        for(SNode p : ListSequence.<SNode>fromArray(SNodeOperations.getParent(it, null, false, false))) {
//          for(SNode c : SNodeOperations.getChildren(p)) {
//            if (it == c) {
//              break with_parents;
//            }
//          }
//        }
//      }
//
//    });
    ListSequence.fromList(ListSequence.<SNode>fromArray(SLinkOperations.getTarget(foo, "extends", false))).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _5__yyy_;
              private Iterator<SNode> _5__yyy__it;
              private SNode _2__zzz_;
              private Iterator<SNode> _2__zzz__it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2__zzz__it = ListSequence.<SNode>fromArray(SNodeOperations.getParent(it, null, false, false)).iterator();
                    case 3:
                      if (!(this._2__zzz__it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2__zzz_ = this._2__zzz__it.next();
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._5__yyy__it = SNodeOperations.getChildren(this._2__zzz_).iterator();
                    case 6:
                      if (!(this._5__yyy__it.hasNext())) {
                        this.__CP__ = 3;
                        break;
                      }
                      this._5__yyy_ = this._5__yyy__it.next();
                      this.__CP__ = 7;
                      break;
                    case 8:
                      if (it == this._5__yyy_) {
                        this.__CP__ = 9;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 10:
                      this.__CP__ = 6;
                      this.yield(this._5__yyy_);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
                      break;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    case 9:
                      this.__CP__ = 1;
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
    // And another one
//    ListSequence.fromList(ListSequence.<SNode>fromArray(foo)).translate(new ITranslator <SNode, SNode>() {
//
//      public ISequence<SNode> translate(SNode it) {
//        return new _FunctionTypes._return_P1_E0 <Iterable<SNode>, SNode>() {
//
//          public Iterable<SNode> invoke(final SNode _zzz_) {
//            return new Iterable <SNode>() {
//
//              public Iterator<SNode> iterator() {
//                return new YieldingIterator <SNode>() {
//
//                  private int __CP__ = 0;
//                  private SNode _2__yyy_;
//                  private Iterator<SNode> _2__yyy__it;
//
//                  protected boolean moveToNext() {
//__loop__:
//                    do {
//__switch__:
//                      switch (this.__CP__) {
//                        case -1:
//                          assert false : "Internal error";
//                          return false;
//                        case 2:
//                          this._2__yyy__it = SNodeOperations.getChildren(_zzz_).iterator();
//                        case 3:
//                          if (!(this._2__yyy__it.hasNext())) {
//                            this.__CP__ = 1;
//                            break;
//                          }
//                          this._2__yyy_ = this._2__yyy__it.next();
//                          this.__CP__ = 4;
//                          break;
//                        case 5:
//                          this.__CP__ = 6;
//                          this.yield(this._2__yyy_);
//                          return true;
//                        case 0:
//                          this.__CP__ = 2;
//                          break;
//                        case 4:
//                          this.__CP__ = 5;
//                          break;
//                        case 6:
//                          invoke(this._2__yyy_);
//                          this.__CP__ = 3;
//                          break;
//                        default:
//                          break __loop__;
//                      }
//                    } while(true);
//                    return false;
//                  }
//
//                };
//              }
//
//            };
//          }
//
//        }.invoke(it);
//      }
//
//    });
    Sequence.fromClosure(new ISequenceClosure <SNode>() {

      public Iterable<SNode> iterable() {
        return new Iterable <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _3__zzz_;
              private List<SNode> _5__yyy_;
              private SNode _9__xxx_;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 6:
                      if (ListSequence.fromList(this._5__yyy_).isNotEmpty()) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 10:
                      this.__CP__ = 11;
                      this.yield(this._9__xxx_);
                      return true;
                    case 0:
                      this._3__zzz_ = foo;
                      this.__CP__ = 1;
                      break;
                    case 3:
                      this._5__yyy_ = ListSequence.<SNode>fromArray();
                      ListSequence.fromList(this._5__yyy_).addSequence(ListSequence.fromList(SNodeOperations.getChildren(this._3__zzz_)));
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this._9__xxx_ = ListSequence.fromList(this._5__yyy_).first();
                      ListSequence.fromList(this._5__yyy_).removeElement(this._9__xxx_);
                      this.__CP__ = 10;
                      break;
                    case 11:
                      ListSequence.fromList(this._5__yyy_).addSequence(ListSequence.fromList(SNodeOperations.getChildren(this._9__xxx_)));
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
    // Following is just a test
    Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure <SNode>() {

      public Iterable<SNode> iterable() {
        return new Iterable <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;
              private SNode _3__zzz_;
              private SNode _4__yyy_;
              private Iterator<SNode> _4__yyy__it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      this._4__yyy__it = SLinkOperations.getTargets(this._3__zzz_, "implements", true).iterator();
                    case 5:
                      if (!(this._4__yyy__it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._4__yyy_ = this._4__yyy__it.next();
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 5;
                      this.yield(this._4__yyy_);
                      return true;
                    case 0:
                      this._3__zzz_ = foo;
                      this.__CP__ = 4;
                      break;
                    case 6:
                      this.__CP__ = 7;
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

    })).translate(new ITranslator <SNode, SNode>() {

      public ISequence<SNode> translate(final SNode it) {
        return new ISequenceIterableAdapter <SNode>() {

          public Iterator<SNode> iterator() {
            return new YieldingIterator <SNode>() {

              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this.__CP__ = 1;
                      this.yield(SLinkOperations.getTarget(it, "intfc", false));
                      return true;
                    case 0:
                      this.__CP__ = 2;
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
    TreeTraversalFactory.Traverse(new SNODE().startTraversal(foo), TreeTraversalFactory.Axis("ANCESTORS"));
  }

}
