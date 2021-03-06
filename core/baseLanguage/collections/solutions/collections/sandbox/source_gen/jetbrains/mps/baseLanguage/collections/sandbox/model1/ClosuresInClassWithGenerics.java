package jetbrains.mps.baseLanguage.collections.sandbox.model1;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

/*package*/ class ClosuresInClassWithGenerics<T1, T2> {
  /*package*/ void aaa() {
    Iterable<T2> ss = Sequence.fromClosure(new ISequenceClosure<T2>() {
      public Iterable<T2> iterable() {
        return new Iterable<T2>() {
          public Iterator<T2> iterator() {
            return new YieldingIterator<T2>() {
              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 4:
                      this.__CP__ = 5;
                      this.yield((T2) "s");
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 1;
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
}
