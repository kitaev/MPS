package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.List;
import java.util.ArrayList;
import junit.framework.Assert;
import java.util.Iterator;

public class ClosuresBase_Test extends TestCase {

  @Test()
  public void test_stub() throws Exception {
    // this method exists only to calm down the JUnit complaining about lacking tests
  }

  public void assertResultsEqual(_FunctionTypes._void_P1_E0<? super List<Integer>> expected, _FunctionTypes._return_P0_E0<? extends Iterable<Integer>> test) {
    List<Integer> expectedList = new ArrayList<Integer>();
    expected.invoke(expectedList);
    List<Integer> testList = new ArrayList<Integer>();
    for(Integer i : test.invoke()) {
      testList.add(i);
    }
    Assert.assertEquals(expectedList, testList);
  }

  public void assertResultsEqual(_FunctionTypes._return_P0_E0<? extends Iterable<Integer>> expected, _FunctionTypes._return_P0_E0<? extends Iterable<Integer>> test) {
    Iterator<Integer> expIt = expected.invoke().iterator();
    Iterator<Integer> testIt = expected.invoke().iterator();
    while (expIt.hasNext() && testIt.hasNext()) {
      Assert.assertEquals(expIt.next(), testIt.next());
    }
    Assert.assertFalse(expIt.hasNext());
    Assert.assertFalse(testIt.hasNext());
  }

}
