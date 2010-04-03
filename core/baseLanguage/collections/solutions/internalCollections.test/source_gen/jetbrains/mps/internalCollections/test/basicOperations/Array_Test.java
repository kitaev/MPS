package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

public class Array_Test extends Util_Test {
  public void test_iterateArrayFor() throws Exception {
    int[] arr = new int[]{1,2,3,4,5};
    List test = new ArrayList();
    for (int i : arr) {
      test.add(i);
    }
    this.assertIterableEquals(this.expect5(), test);
  }

  public void test_iterateArrayYield() throws Exception {
    final int[] arr = new int[]{1,2,3,4,5};
    Iterable<Integer> test = Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private int _2_i;
              private int _2_i_idx;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i_idx = 0;
                    case 3:
                      if (this._2_i_idx >= arr.length) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_i = arr[this._2_i_idx++];
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(_2_i);
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
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });
    this.assertIterableEquals(this.expect5(), test);
    Iterable<Integer> test2 = Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private int _2_i;
              private int _2_i_idx;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i_idx = 0;
                    case 3:
                      if (this._2_i_idx >= arr.length) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_i = arr[this._2_i_idx++];
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(_2_i);
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
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });
    this.assertIterableEquals(this.expect5(), test2);
    final String[] arr2 = new String[]{"A","B","C"};
    Iterable<String> test3 = Sequence.fromClosure(new ISequenceClosure<String>() {
      public Iterable<String> iterable() {
        return new Iterable<String>() {
          public Iterator<String> iterator() {
            return new YieldingIterator<String>() {
              private int __CP__ = 0;
              private String _2_s;
              private int _2_s_idx;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_s_idx = 0;
                    case 3:
                      if (this._2_s_idx >= arr2.length) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_s = arr2[this._2_s_idx++];
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(_2_s);
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
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });
    this.assertIterableEquals(this.inputABC(), test3);
    Iterable<String> test4 = Sequence.fromClosure(new ISequenceClosure<String>() {
      public Iterable<String> iterable() {
        return new Iterable<String>() {
          public Iterator<String> iterator() {
            return new YieldingIterator<String>() {
              private int __CP__ = 0;
              private String _2_s;
              private int _2_s_idx;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_s_idx = 0;
                    case 3:
                      if (this._2_s_idx >= arr2.length) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_s = arr2[this._2_s_idx++];
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(_2_s);
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
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });
    this.assertIterableEquals(this.inputABC(), test4);
  }
}
