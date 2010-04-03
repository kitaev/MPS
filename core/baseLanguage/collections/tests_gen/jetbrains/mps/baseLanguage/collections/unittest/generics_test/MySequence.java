package jetbrains.mps.baseLanguage.collections.unittest.generics_test;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

/*package*/ class MySequence<T> {
  /*package*/ Iterable<T> get() {
    return Sequence.fromClosure(new ISequenceClosure<T>() {
      public Iterable<T> iterable() {
        return new Iterable<T>() {
          public Iterator<T> iterator() {
            return new YieldingIterator<T>() {
              private int __CP__ = 0;
              private T _7_next;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 8:
                      if (_7_next == null) {
                        this.__CP__ = 9;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 4:
                      if (true) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 10:
                      this.__CP__ = 4;
                      this.yield(_7_next);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._7_next = MySequence.this.getNext();
                      this.__CP__ = 8;
                      break;
                    case 9:
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

  /*package*/ T getNext() {
    return null;
  }
}
