package typesSandbox;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;

public class InnerClosures_Test extends Util_Test {
  public void test_invoke() throws Exception {
    Iterable<String> SEQ = null;
    ISequence<String> seq = null;
    Iterable<String> itr = null;
    seq = SEQ;
    SEQ = seq;
    itr = seq;
    itr = SEQ;
    seq = itr;
    SEQ = itr;
    seq.translate(new ITranslator2<String, Integer>() {
      public Iterable<Integer> translate(final String it) {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
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
                      this.yield(Integer.valueOf(it));
                      return true;
                    case 0:
                      this.__CP__ = 2;
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
    seq.translate(new ITranslator2<String, Integer>() {
      public Iterable<Integer> translate(String it) {
        return new _FunctionTypes._return_P1_E0<Iterable<Integer>, String>() {
          public Iterable<Integer> invoke(final String it2) {
            return new Iterable<Integer>() {
              public Iterator<Integer> iterator() {
                return new YieldingIterator<Integer>() {
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
                          this.yield(Integer.valueOf(it2));
                          return true;
                        case 0:
                          this.__CP__ = 2;
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
        }.invoke(it);
      }
    });
  }
}
