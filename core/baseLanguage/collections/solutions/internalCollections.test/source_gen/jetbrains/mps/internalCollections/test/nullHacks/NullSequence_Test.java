/*
 * Copyright 2003-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.internalCollections.test.nullHacks;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.Sequence;
import junit.framework.Assert;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.ISequence;

public class NullSequence_Test extends Util_Test {

  @Test()
  public void test_nullSequence() throws Exception {
    if (Sequence.USE_NULL_SEQUENCE) {
      Iterable<Integer> nullSeq = null;
      Assert.assertNull(nullSeq);
      Assert.assertNull(Sequence.fromIterable(nullSeq).first());
      Assert.assertNull(Sequence.fromIterable(nullSeq).last());
      Assert.assertEquals(0, Sequence.fromIterable(nullSeq).count());
      Assert.assertEquals(0, Sequence.fromIterable(nullSeq).count());
      List<Integer> list5 = ListSequence.<Integer>fromArray(1, 2, 3, 4, 5);
      ListSequence.fromList(list5).addSequence(Sequence.fromIterable(nullSeq));
      this.assertIterableEquals(this.expect5(), list5);
      ListSequence.fromList(list5).removeSequence(Sequence.fromIterable(nullSeq));
      this.assertIterableEquals(this.expect5(), list5);
    }
  }

  @Test()
  public void test_nullCompareOperations() throws Exception {
    if (Sequence.USE_NULL_SEQUENCE) {
      Iterable<Integer> input = this.input5();
      this.assertIterableEquals(this.expect5(), Sequence.fromIterable(input).concat(null));
      this.assertIterableEquals(this.expect5(), Sequence.fromIterable(input).union(null));
      this.assertIterableEquals(this.expectEmpty(), Sequence.fromIterable(input).intersect(null));
      this.assertIterableEquals(this.expect5(), Sequence.fromIterable(input).disjunction(null));
      this.assertIterableEquals(this.expect5(), Sequence.fromIterable(input).subtract(null));
    }
  }

  @Test()
  public void test_nullTranslate() throws Exception {
    if (Sequence.USE_NULL_SEQUENCE) {
      Iterable<Integer> input = this.input5();
      Iterable<String> nullSeq = Sequence.fromIterable(input).translate(new ITranslator2 <Integer, String>() {

        public Iterable<String> translate(Integer it) {
          return ((ISequence<String>)null);
        }

      });
      Assert.assertEquals(0, Sequence.fromIterable(nullSeq).count());
      Assert.assertEquals(0, Sequence.fromIterable(nullSeq).count());
    }
  }

  @Test()
  public void test_nullList() throws Exception {
    if (Sequence.USE_NULL_SEQUENCE) {
      List<Integer> nullList = null;
      Assert.assertNull(nullList);
      Assert.assertNull(ListSequence.fromList(nullList).first());
      Assert.assertNull(ListSequence.fromList(nullList).last());
      Assert.assertNull(ListSequence.fromList(nullList).getElement(0));
      Assert.assertNull(ListSequence.fromList(nullList).getElement(-1));
      Assert.assertEquals(0, ListSequence.fromList(nullList).count());
      Assert.assertEquals(0, ListSequence.fromList(nullList).count());
    }
  }

  @Test()
  public void test_forEach() throws Exception {
    if (Sequence.USE_NULL_SEQUENCE) {
      for(Object foo : Sequence.emptySequence()) {
      }
    }
  }

  @Test()
  public void test_nullArray() throws Exception {
    int[] arr = null;
    /*
      for(int i : arr) {
        Assert.assertTrue(false);
      }
    */
  }

}
