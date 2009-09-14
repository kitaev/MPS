package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Arrays;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import junit.framework.Assert;
import java.util.NoSuchElementException;

public class Where_Test extends Util_Test {
  public void test_whereMethod() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    ISequence<Integer> test = seq.where(new IWhereFilter<Integer>() {
      public boolean accept(Integer it) {
        return it % 2 == 1;
      }
    });
    this.assertIterableEquals(this.expectOdd5(), test.toIterable());
  }

  public void test_whereFilterVar() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    IWhereFilter<Integer> filter = new IWhereFilter<Integer>() {
      public boolean accept(Integer it) {
        return it % 2 == 1;
      }
    };
    ISequence<Integer> test = seq.where(filter);
    this.assertIterableEquals(this.expectOdd5(), test.toIterable());
  }

  public void test_whereOperation() throws Exception {
    Iterable<Integer> seq = this.input5();
    Iterable<Integer> test = Sequence.fromIterable(seq).where(new IWhereFilter<Integer>() {
      public boolean accept(Integer it) {
        return it % 2 == 1;
      }
    });
    Iterable<Integer> expected = Arrays.asList(1, 3, 5);
    this.assertIterableEquals(expected, test);
  }

  public void test_nextWithoutHasNext() throws Exception {
    Iterator<Integer> it = ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<Integer>(), 1, 2, 3, 4, 5, 6)).where(new IWhereFilter<Integer>() {
      public boolean accept(Integer i) {
        return i % 2 == 0;
      }
    }).iterator();
    Assert.assertSame(2, it.next());
    Assert.assertSame(4, it.next());
    Assert.assertSame(6, it.next());
    Assert.assertFalse(it.hasNext());
    try {
      it.next();
      Assert.fail();
    } catch (NoSuchElementException e) {
      // expected exception
    }
  }
}
