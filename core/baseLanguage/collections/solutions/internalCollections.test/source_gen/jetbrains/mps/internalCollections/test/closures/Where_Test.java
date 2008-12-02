/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Arrays;

public class Where_Test extends Util_Test {

  @Test()
  public void test_whereMethod() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    ISequence<Integer> test = seq.where(new IWhereFilter <Integer>() {

      public boolean accept(Integer it) {
        return it % 2 == 1;
      }

    });
    this.assertIterableEquals(this.expectOdd5(), test.toIterable());
  }

  @Test()
  public void test_whereFilterVar() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    IWhereFilter<Integer> filter = new IWhereFilter <Integer>() {

      public boolean accept(Integer it) {
        return it % 2 == 1;
      }

    };
    ISequence<Integer> test = seq.where(filter);
    this.assertIterableEquals(this.expectOdd5(), test.toIterable());
  }

  @Test()
  public void test_whereOperation() throws Exception {
    Iterable<Integer> seq = this.input5();
    Iterable<Integer> test = Sequence.fromIterable(seq).where(new IWhereFilter <Integer>() {

      public boolean accept(Integer it) {
        return it % 2 == 1;
      }

    });
    Iterable<Integer> expected = Arrays.asList(1, 3, 5);
    this.assertIterableEquals(expected, test);
  }

}
