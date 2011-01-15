package jetbrains.mps.baseLanguage.collections.samples.sequence_queries;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.StopIteratingException;

/*package*/ class Main_map_operation {
  /*package*/ static void main(String[] args) {
    Iterable<Integer> nums = Sequence.fromClosure(new ISequenceClosure<Integer>() {
      public Iterable<Integer> iterable() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private int _3_num;

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
                      this.__CP__ = 7;
                      this.yield(_3_num);
                      return true;
                    case 0:
                      this._3_num = 0;
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 7:
                      _3_num++;
                      this.__CP__ = 4;
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
    System.out.println("from infinite sequence take first 10 numbers,");
    System.out.println("ignore odd numbers,");
    System.out.println("map each even number to two strings");
    final Wrappers._int count = new Wrappers._int(0);
    Iterable<String> strings = Sequence.fromIterable(nums).<String>translate(new ITranslator2<Integer, String>() {
      public Iterable<String> translate(final Integer n) {
        return new Iterable<String>() {
          public Iterator<String> iterator() {
            return new YieldingIterator<String>() {
              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      if (n >= 10) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 6:
                      if (n % 2 != 0) {
                        this.__CP__ = 9;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 8:
                      this.__CP__ = 6;
                      this.yield("this never yielded");
                      return true;
                    case 10:
                      this.__CP__ = 12;
                      this.yield("----: " + n);
                      return true;
                    case 12:
                      this.__CP__ = 13;
                      this.yield("*100: " + (n * 100));
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 13:
                      count.value++;
                      this.__CP__ = 3;
                      break;
                    case 5:
                      throw new StopIteratingException();
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
    System.out.println("count (before):" + count.value);
    for (String s : Sequence.fromIterable(strings)) {
      System.out.println(s);
    }
    System.out.println("count (after):" + count.value);
  }
}
