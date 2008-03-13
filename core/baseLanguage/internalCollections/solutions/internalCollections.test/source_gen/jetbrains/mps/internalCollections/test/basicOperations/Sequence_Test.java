package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import jetbrains.mps.internal.collections.runtime.Sequence;
import junit.framework.Assert;
import java.util.Collections;

public class Sequence_Test extends Util_Test {

  public void test_sequenceMethods() throws Exception {
    Sequence<Integer> input = Sequence.fromIterable(this.input5());
    Assert.assertEquals(((Integer)1), input.first());
    Assert.assertEquals(((Integer)5), input.last());
    Assert.assertEquals(5, input.count());
    for(Integer i : this.input5()) {
      Assert.assertEquals(true, input.contains(i));
      Assert.assertEquals(i - 1, input.indexOf(i));
    }
    Assert.assertEquals(false, input.contains(-1));
    Assert.assertEquals(false, input.isEmpty());
    Assert.assertEquals(true, input.isNotEmpty());
    Assert.assertEquals(true, Sequence.fromIterable(Collections.emptyList()).isEmpty());
    Assert.assertEquals(false, Sequence.fromIterable(Collections.emptyList()).isNotEmpty());
  }

  public void test_sequenceOperations() throws Exception {
    Iterable<Integer> input = this.input5();
    Assert.assertEquals(((Integer)1), Sequence.fromIterable(input).first());
    Assert.assertEquals(((Integer)5), Sequence.fromIterable(input).last());
    Assert.assertEquals(5, Sequence.fromIterable(input).count());
    for(Integer i : this.input5()) {
      Assert.assertEquals(true, Sequence.fromIterable(input).contains(i));
      Assert.assertEquals(i - 1, Sequence.fromIterable(input).indexOf(i));
    }
    Assert.assertEquals(false, Sequence.fromIterable(input).contains(-1));
    Assert.assertEquals(false, Sequence.fromIterable(input).isEmpty());
    Assert.assertEquals(true, Sequence.fromIterable(input).isNotEmpty());
    Assert.assertEquals(true, Sequence.fromIterable(this.inputEmpty()).isEmpty());
    Assert.assertEquals(false, Sequence.fromIterable(this.inputEmpty()).isNotEmpty());
  }

}
