package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.closures.runtime.FunctionTypes;
import junit.framework.Assert;
import java.util.Iterator;
import jetbrains.mps.closures.runtime.YieldingIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ClassifierAdapters_Test extends TestCase {

  public void test_interfaceAsFunctionType() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(Integer d) {
        return "Done: " + Integer.valueOf(d);
      }

    };
    FunctionTypes._R_from_T<? extends String, ? super Integer> ft = new _Adapters.Worker_to__R_from_T_adapter(wrk);
    Assert.assertEquals("Done: 1234", ft.invoke(1234));
  }

  public void test_functionTypeAsInterface() throws Exception {
    FunctionTypes._R_from_T<? extends String, ? super Integer> cls = new FunctionTypes._R_from_T <String, Integer>() {

      public String invoke(Integer foo) {
        return "Done: " + foo;
      }

    };
    Worker wrk = new _Adapters._R_from_T_to_Worker_adapter(cls);
    Assert.assertEquals("Done: 4321", wrk.doWork(4321));
  }

  public void test_closureLiteralAsInterface() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(Integer foo) {
        return "Done: " + foo;
      }

    };
    Assert.assertEquals("Done: 4321", wrk.doWork(4321));
  }

  public void test_yieldClosureLiteralAsInterface() throws Exception {
    NumberGenerator ng = new NumberGenerator() {

      public Iterable<Integer> generate() {
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

    };
    Integer[] exp = new Integer[]{1,2,3};
    int i = 0;
    for(Integer in : ng.generate()) {
      Assert.assertEquals(exp[i], in);
      i = i + 1;
    }
  }

  public void test_genericInterfaceAdapter() throws Exception {
    Generator<Integer> g = new Generator <Integer>() {

      public Iterable<Integer> generate() {
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

    };
    Integer exp = 1;
    for(Integer i : g.generate()) {
      Assert.assertEquals(exp, i);
      exp = exp + 1;
    }
    Assert.assertEquals(exp, (Integer)4);
  }

  public void test_instanceMethodCall() throws Exception {
    Assert.assertEquals("1234", this.makeWork(new Worker() {

      public String doWork(Integer iiiiiiiiiiii) {
        return String.valueOf(iiiiiiiiiiii);
      }

    }, 1234));
    /*
      Assert.assertEquals("4321", this.makeWork(new FunctionTypes._R_from_T <String, Integer>() {

        public String invoke(Integer xxxxxxxxxxx) {
          return String.valueOf(xxxxxxxxxxx);
        }

      }, 4321));
    */
  }

  public void test_closureLiteralAsComparator() throws Exception {
    List<Integer> list = new ArrayList<Integer>();
    list.addAll(Arrays.asList(new Integer[]{4,3,5,1,2}));
    // ===================================================================
    // The following is a hack!
    // In reality we could only substitute an interface that has a single method.
    // This example works only because java.util.Comparator defines compare() before equals()
    // Why declare equals() in an interface escapes me: it's already there and declaring it in an interface doesn't change anything
    // Besides, overriding only equals() without overriding also hashCode() is simply plain wrong.
    // ===================================================================
    Collections.sort(list, new Comparator <Object>() {

      public int compare(Object a, Object b) {
        return a.hashCode() - b.hashCode();
      }

    });
    Assert.assertEquals(Arrays.asList(new Integer[]{1,2,3,4,5}), list);
  }

  public void test_wrongParametersNumber() throws Exception {
    this.acceptWorker(new Worker() {

      public String doWork(Integer i) {
        return String.valueOf(i);
      }

    });
  }

  public void acceptWorker(Worker one, Worker two) {
  }

  public void acceptWorker(Worker one) {
  }

  public String makeWork(Worker wrk, Integer i) {
    return wrk.doWork(i);
  }

}
