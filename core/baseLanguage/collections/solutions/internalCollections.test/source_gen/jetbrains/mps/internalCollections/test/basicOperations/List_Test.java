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
package jetbrains.mps.internalCollections.test.basicOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import org.junit.Test;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Arrays;
import junit.framework.Assert;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import jetbrains.mps.internal.collections.runtime.ArrayUtils;

public class List_Test extends Util_Test {

  @Test()
  public void test_listCreator() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 4, 5);
    this.assertIterableEquals(this.expect5(), test);
  }

  @Test()
  public void test_add() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray();
    for(int i = 1 ; i <= 5 ; i = i + 1) {
      ListSequence.fromList(test).addElement(i);
    }
    this.assertIterableEquals(this.expect5(), test);
  }

  @Test()
  public void test_addAll() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray();
    ListSequence.fromList(test).addSequence(Sequence.fromIterable(this.input5()));
    this.assertIterableEquals(this.expect5(), test);
  }

  @Test()
  public void test_remove() throws Exception {
    List<String> test = ListSequence.<String>fromArray("A", "B", "C", "D", "E");
    for(String s : Arrays.asList("A", "B", "C", "D", "E")) {
      ListSequence.fromList(test).removeElement(s);
    }
    Assert.assertTrue(ListSequence.fromList(test).isEmpty());
    Assert.assertSame(0, ListSequence.fromList(test).count());
    Assert.assertSame(0, ListSequence.fromList(test).count());
  }

  @Test()
  public void test_removeAll() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 4, 5);
    ListSequence.fromList(test).removeSequence(Sequence.fromIterable(this.input5()));
    Assert.assertTrue(ListSequence.fromList(test).isEmpty());
    Assert.assertSame(0, ListSequence.fromList(test).count());
    Assert.assertSame(0, ListSequence.fromList(test).count());
  }

  @Test()
  public void test_reverse() throws Exception {
    List<String> test = ListSequence.<String>fromArray("A", "B", "C", "D", "E");
    this.assertIterableEquals(Arrays.asList("E", "D", "C", "B", "A"), ListSequence.fromList(test).reversedList());
    this.assertIterableEquals(Arrays.asList("A", "B", "C", "D", "E"), test);
  }

  @Test()
  public void test_sameList() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 4, 5);
    List<Integer> test2 = test;
    ListSequence.fromList(test2).removeSequence(Sequence.fromIterable(this.input5()));
    this.assertIterableEquals(test, test2);
    ListSequence.fromList(test2).addSequence(Sequence.fromIterable(this.input5()));
    this.assertIterableEquals(this.input5(), test);
    this.assertIterableEquals(test, test2);
  }

  @Test()
  public void test_toArray() throws Exception {
    List<String> test = ListSequence.<String>fromArray("A", "B", "C");
    String[] arr = ListSequence.fromList(test).toGenericArray(String.class);
    Assert.assertEquals(Arrays.asList(arr), test);
    List<String> test2 = ListSequence.<String>fromArray("X", "Y", "Z");
    String[] strings = ListSequence.fromList(test2).toGenericArray(String.class);
    Assert.assertEquals(Arrays.asList(strings), test2);
  }

  @Test()
  public void test_insertSet() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 5);
    Assert.assertEquals(Arrays.asList(new Integer[]{1,2,3,5}), test);
    int insElm = ListSequence.fromList(test).insertElement(3, 4);
    Assert.assertEquals(4, insElm);
    Assert.assertEquals(Arrays.asList(new Integer[]{1,2,3,4,5}), test);
    int setElm = ListSequence.fromList(test).setElement(2, 0);
    Assert.assertEquals(3, setElm);
  }

  @Test()
  public void test_elementAccess() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 5);
    int val = ListSequence.fromList(test).getElement(3);
    Assert.assertEquals(5, val);
    ListSequence.fromList(test).setElement(3, 4);
    Assert.assertEquals(Arrays.asList(new Integer[]{1,2,3,4}), test);
  }

  @Test()
  public void test_serializeList() throws Exception {
    List<String> test = ListSequence.<String>fromArray("Quick", "brown", "fox");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(test);
    oos.close();
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    List<String> copy = (List<String>)ois.readObject();
    Assert.assertFalse(test == copy);
    Assert.assertEquals(test, copy);
  }

  @Test()
  public void test_emptyLinkedList() throws Exception {
    List<String> llist = ListSequence.fromList(new LinkedList<String>());
    Assert.assertTrue(ListSequence.fromList(llist).isEmpty());
  }

  @Test()
  public void test_nonEmptyLinkedList() throws Exception {
    List<String> llist = ListSequence.fromList(new LinkedList<String>()).addSequence(Sequence.fromArray("A", "B", "C"));
    Assert.assertFalse(ListSequence.fromList(llist).isEmpty());
    Assert.assertEquals(3, ListSequence.fromList(llist).count());
  }

  @Test()
  public void test_clear() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 5);
    Assert.assertTrue(ListSequence.fromList(test).isNotEmpty());
    ListSequence.fromList(test).clear();
    Assert.assertTrue(ListSequence.fromList(test).isEmpty());
  }

  @Test()
  public void test_addFirst() throws Exception {
    List<String> test = ListSequence.<String>fromArray("B", "C");
    ListSequence.fromList(test).insertElement(0, "A");
    this.assertIterableEquals(this.inputABC(), test);
  }

  @Test()
  public void test_addLast() throws Exception {
    List<String> test = ListSequence.<String>fromArray("A", "B");
    ListSequence.fromList(test).addElement("C");
    this.assertIterableEquals(this.inputABC(), test);
  }

  @Test()
  public void test_removeAt() throws Exception {
    List<String> test = ListSequence.<String>fromArray("A", "B", "FOO", "C");
    String foo = ListSequence.fromList(test).removeElementAt(2);
    Assert.assertEquals("FOO", foo);
    this.assertIterableEquals(this.inputABC(), test);
  }

  @Test()
  public void test_removeFirst() throws Exception {
    List<String> test = ListSequence.<String>fromArray("FOO", "A", "B", "C");
    String foo = ListSequence.fromList(test).removeElementAt(0);
    Assert.assertEquals("FOO", foo);
    this.assertIterableEquals(this.inputABC(), test);
  }

  @Test()
  public void test_removeLast() throws Exception {
    List<String> test = ListSequence.<String>fromArray("A", "B", "C", "FOO");
    String foo = ListSequence.fromList(test).removeLastElement();
    Assert.assertEquals("FOO", foo);
    this.assertIterableEquals(this.inputABC(), test);
  }

  @Test()
  public void test_primitiveParameter() throws Exception {
    List<Integer> test = ListSequence.<Integer>fromArray(1, 2, 3, 4, 5);
    this.assertIterableEquals(this.input5(), test);
    List<Integer> TEST = test;
    test = TEST;
    int[] arr = ArrayUtils.toIntArray(ListSequence.fromList(test));
    List<Character> cempty = ListSequence.<Character>fromArray();
    Assert.assertEquals(0, ListSequence.fromList(cempty).toGenericArray(Character.class).length);
    List<Byte> bempty = ListSequence.fromList(new LinkedList<Byte>());
  }

  @Test()
  public void test_array() throws Exception {
    List<int[]> test = ListSequence.<int[]>fromArray(new int[]{1,2,3}, new int[]{3,2,1});
    int[] array = ListSequence.fromList(test).getElement(1);
    Assert.assertSame(3, array.length);
  }

}
