package jetbrains.mps.debug.evaluation.sandbox.sandbox;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;

public class AClass<T extends List> {
  public int myI = 3;

  public AClass() {

  }

  public Object get(Object o) {
    return null;
  }

  public void foo(T t) {
    t = null;
    Object o = null;
    if (o != null) {

    }
    Iterable<Character> tenDigits = Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private int _3_i;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      if (true) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this.__CP__ = 4;
                      this.yield(_3_i++);
                      return true;
                    case 0:
                      this._3_i = 0;
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
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
    })).take(10).<Character>select(new ISelector<Integer, Character>() {
      public Character select(Integer it) {
        return ("" + it).charAt(0);
      }
    });
    int sum = Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
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
                      if (!(_2_i <= 10)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      _2_i++;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      this.__CP__ = 5;
                      this.yield(_2_i);
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
                } while (true);
                return false;
              }
            };
          }
        };
      }
    })).foldLeft(0, new ILeftCombinator<Integer, Integer>() {
      public Integer combine(Integer s, Integer it) {
        return it + s;
      }
    });
  }

  public void bar() {
  }
}
