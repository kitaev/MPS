package jetbrains.mps.closures.test;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SequenceFunctionTypes_Test extends ClosuresBase_Test {

  @Test()
  public void test_returnSequence() throws Exception {
    _FunctionTypes._return_P0_E0<? extends Iterable<Integer>> fun1 = null;
    _FunctionTypes._return_P0_E0<? extends Iterable<Integer>> fun2 = null;
    fun1 = fun2;
    fun2 = fun1;
    final Iterable<Integer> seq = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.yield(Integer.valueOf(1));
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
    fun1 = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return seq;
      }

    };
    fun1 = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return ListSequence.<Integer>fromArray(Integer.valueOf(1));
      }

    };
    fun1 = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.yield(Integer.valueOf(1));
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

    };
    fun1 = new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.yield(1);
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

    };
  }

  @Test()
  public void test_acceptSequence() throws Exception {
    _FunctionTypes._void_P1_E0<? super Iterable<Integer>> fun1 = new _FunctionTypes._void_P1_E0 <Iterable<Integer>>() {

      public void invoke(Iterable<Integer> p) {
      }

    };
    _FunctionTypes._void_P1_E0<? super Iterable<Integer>> fun2 = new _FunctionTypes._void_P1_E0 <Iterable<Integer>>() {

      public void invoke(Iterable<Integer> p) {
      }

    };
    fun1 = fun2;
    fun2 = fun1;
  }

  @Test()
  public void test_resultsReturnSequence() throws Exception {
    final Iterable<Integer> seq = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.__CP__ = 3;
                      this.yield(1);
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield(2);
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield(3);
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
    this.assertResultsEqual(new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return seq;
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      this.__CP__ = 3;
                      this.yield(1);
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield(2);
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield(3);
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
  }

}
