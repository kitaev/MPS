package jetbrains.mps.baseLanguage.collections.unittest.simple_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.List;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class Concat_Test_Test extends TestCase {

  @Test()
  public void test_test1() throws Exception {
    Iterable<Integer> s1 = Sequence.fromClosure(new ISequenceClosure <Integer>() {

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
    Iterable<Integer> s2 = Sequence.fromClosure(new ISequenceClosure <Integer>() {

      public Iterable<Integer> iterable() {
        return new Iterable <Integer>() {

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
                      this.__CP__ = 3;
                      this.yield(3);
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield(4);
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield(5);
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
    List<Integer> s3 = Sequence.fromIterable(s1).concat(Sequence.fromIterable(s2)).toListSequence();
    Assert.assertTrue(ListSequence.fromList(s3).getElement(0) == 1);
    Assert.assertTrue(ListSequence.fromList(s3).getElement(1) == 2);
    Assert.assertTrue(ListSequence.fromList(s3).getElement(2) == 3);
    Assert.assertTrue(ListSequence.fromList(s3).getElement(3) == 3);
    Assert.assertTrue(ListSequence.fromList(s3).getElement(4) == 4);
    Assert.assertTrue(ListSequence.fromList(s3).getElement(5) == 5);
    // null test
    s1 = null;
    Iterable<Integer> s2_ = Sequence.fromIterable(s1).concat(Sequence.fromIterable(s2));
    Assert.assertEquals(3, Sequence.fromIterable(s2_).count());
    Iterable<Integer> s2__ = Sequence.fromIterable(s2).concat(null);
    Assert.assertEquals(3, Sequence.fromIterable(s2__).count());
  }

}
