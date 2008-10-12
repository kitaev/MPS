package jetbrains.mps.baseLanguage.collections.unittest.query_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import junit.framework.Assert;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Where_Select_Test1 extends TestCase {

  public void test_1() {
    Iterable<Integer> nums = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

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
                      if (!(this._2_i < 10)) {
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
                      this.yield(this._2_i);
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
    // from sequence of 10 numbers
    // take each even number and produce string: "num:<n>"
    final Wrappers._int count = new Wrappers._int(0);
    Iterable<String> strings = Sequence.fromIterable(nums).where(new IWhereFilter <Integer>() {

      public boolean accept(Integer n) {
        return n % 2 == 0;
      }

    }).select(new ISelector <Integer, String>() {

      public String select(Integer n) {
        count.value = count.value + 1;
        return "num:" + n;
      }

    });
    Assert.assertEquals(0, count.value);
    int expectedNum = 0;
    for(String s : strings) {
      String expected = "num:" + expectedNum;
      Assert.assertEquals(expected, s);
      expectedNum = expectedNum + 2;
    }
    Assert.assertEquals(5, count.value);
  }

  public void test_2() {
    // 'where' and 'select' tolerate 'null' operand 
    List<Integer> nums = null;
    Iterable<Integer> evenNums = ListSequence.fromList(nums).where(new IWhereFilter <Integer>() {

      public boolean accept(Integer n) {
        return n % 2 == 0;
      }

    });
    Iterable<String> strings = Sequence.fromIterable(evenNums).select(new ISelector <Integer, String>() {

      public String select(Integer it) {
        return "" + it;
      }

    });
    Assert.assertEquals(0, Sequence.fromIterable(strings).count());
  }

  public void test_3() {
    // 'select' skips all 'null'-s
    List<String> list = ListSequence.<String>fromArray("1", "2", "3");
    Iterable<String> empty = ListSequence.fromList(list).select(new ISelector <String, String>() {

      public String select(String it) {
        return (String)null;
      }

    });
    Assert.assertTrue(Sequence.fromIterable(empty).isEmpty());
  }

}
