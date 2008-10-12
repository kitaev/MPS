package jetbrains.mps.baseLanguage.collections.unittest.simple_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Collections;
import junit.framework.Assert;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SimpleOperations1 extends TestCase {

  public void test_S1() {
    Iterable<Object> S = Sequence.fromClosure(new ISequenceClosure <Object>() {

      public Iterable<Object> iterable() {
        return Collections.<Object>emptyList();
      }

    });
    Assert.assertEquals(null, Sequence.fromIterable(S).first());
    Assert.assertEquals(null, Sequence.fromIterable(S).first());
    Assert.assertEquals(null, Sequence.fromIterable(S).last());
    Assert.assertEquals(null, Sequence.fromIterable(S).last());
    Assert.assertEquals(true, Sequence.fromIterable(S).isEmpty());
    Assert.assertEquals(-1, Sequence.fromIterable(S).indexOf("0"));
  }

  public void test_S2() {
    Iterable<String> S = Sequence.fromClosure(new ISequenceClosure <String>() {

      public Iterable<String> iterable() {
        return new Iterable <String>() {

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
                    case 2:
                      this.__CP__ = 3;
                      this.yield("0");
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield("1");
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield("2");
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
    Assert.assertEquals("0", Sequence.fromIterable(S).first());
    Assert.assertEquals("0", Sequence.fromIterable(S).first());
    Assert.assertEquals("2", Sequence.fromIterable(S).last());
    Assert.assertEquals("2", Sequence.fromIterable(S).last());
    Assert.assertEquals(false, Sequence.fromIterable(S).isEmpty());
    Assert.assertEquals(0, Sequence.fromIterable(S).indexOf("0"));
    Assert.assertEquals(1, Sequence.fromIterable(S).indexOf("1"));
    Assert.assertEquals(2, Sequence.fromIterable(S).indexOf("2"));
    Assert.assertEquals(-1, Sequence.fromIterable(S).indexOf("3"));
  }

  public void test_S3() {
    Iterable<String> S = Sequence.fromClosure(new ISequenceClosure <String>() {

      public Iterable<String> iterable() {
        return new Iterable <String>() {

          public Iterator<String> iterator() {
            return new YieldingIterator <String>() {

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
                      this.yield("0");
                      return true;
                    case 3:
                      this.__CP__ = 4;
                      this.yield("1");
                      return true;
                    case 4:
                      this.__CP__ = 1;
                      this.yield("2");
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
    int count = 0;
    for(String s : S) {
      Assert.assertEquals("" + count, s);
      count = count + 1;
      Assert.assertEquals("0", Sequence.fromIterable(S).first());
      Assert.assertEquals("2", Sequence.fromIterable(S).last());
      Assert.assertEquals(false, Sequence.fromIterable(S).isEmpty());
    }
  }

  public void test_L1() {
    List<String> L = ListSequence.<String>fromArray();
    Assert.assertEquals(null, ListSequence.fromList(L).first());
    Assert.assertEquals(null, ListSequence.fromList(L).first());
    Assert.assertEquals(null, ListSequence.fromList(L).last());
    Assert.assertEquals(null, ListSequence.fromList(L).last());
    Assert.assertEquals(0, ListSequence.fromList(L).count());
    Assert.assertEquals(true, ListSequence.fromList(L).isEmpty());
  }

  public void test_L2() {
    List<String> L = ListSequence.<String>fromArray("0", "1", "2");
    Assert.assertEquals("0", ListSequence.fromList(L).first());
    Assert.assertEquals("0", ListSequence.fromList(L).first());
    Assert.assertEquals("2", ListSequence.fromList(L).last());
    Assert.assertEquals("2", ListSequence.fromList(L).last());
    Assert.assertEquals(3, ListSequence.fromList(L).count());
    Assert.assertEquals(false, ListSequence.fromList(L).isEmpty());
  }

}
