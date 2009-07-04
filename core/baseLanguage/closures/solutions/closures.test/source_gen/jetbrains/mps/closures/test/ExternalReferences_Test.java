package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import junit.framework.Assert;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

public class ExternalReferences_Test extends TestCase {

  @Test()
  public void test_localVariableDeclaration() throws Exception {
    final int foo = 42;
    int bar = new _FunctionTypes._return_P0_E0 <Integer>() {

      public Integer invoke() {
        return foo;
      }
    }.invoke();
    Assert.assertEquals(foo, bar);
  }

  @Test()
  public void test_alteredLocalvariable() throws Exception {
    final Wrappers._int res = new Wrappers._int(0);
    for(int i = 1 ; i <= 5 ; i++ ) {
      new _FunctionTypes._return_P0_E0 <Integer>() {

        public Integer invoke() {
          return res.value++ ;
        }
      }.invoke();
    }
    res.value = res.value - 5;
    Assert.assertEquals(0, res.value);
  }

  @Test()
  public void test_alteredLocalVariable2() throws Exception {
    final Wrappers._int res = new Wrappers._int(0);
    for(int i = 1 ; i <= 5 ; i++ ) {
      for(int j : new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

        public Iterable<Integer> invoke() {
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
                      case 3:
                        this.__CP__ = 1;
                        this.yield(-1);
                        return true;
                      case 0:
                        res.value++ ;
                        this.__CP__ = 3;
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
      }.invoke()) {
      }
    }
    res.value = res.value - 5;
    Assert.assertEquals(0, res.value);
  }

  @Test()
  public void test_alteredLocalVariable3() throws Exception {
    final Wrappers._T<byte[]> bytes = new Wrappers._T<byte[]>(new byte[1]);
    new _FunctionTypes._void_P0_E0() {

      public void invoke() {
        bytes.value = new byte[3];
        //  no return value
      }
    }.invoke();
    Assert.assertSame(3, bytes.value.length);
  }

  @Test()
  public void test_methodParameter() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(final Integer d) {
        return new _FunctionTypes._return_P0_E0 <String>() {

          public String invoke() {
            return "Done: " + d;
          }
        }.invoke();
      }
    };
    Assert.assertEquals("Done: 1234", wrk.doWork(1234));
  }

  @Test()
  public void test_methodParameter2() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(Integer d) {
        final Wrappers._T<Integer> _d = new Wrappers._T<Integer>(d);
        new _FunctionTypes._return_P0_E0 <Integer>() {

          public Integer invoke() {
            return _d.value = _d.value * 2;
          }
        }.invoke();
        return "Done: " + _d.value;
      }
    };
    Assert.assertEquals("Done: 2468", wrk.doWork(1234));
  }

  @Test()
  public void test_field() throws Exception {
    Worker wrk = new Worker() {

      public int field;
      public int foo;

      public String doWork(Integer foo) {
        this.foo = foo;
        this.field = this.foo;
        return new _FunctionTypes._return_P0_E0 <String>() {

          public String invoke() {
            return "Done: " + field;
          }
        }.invoke();
      }
    };
    Assert.assertEquals("Done: 4321", wrk.doWork(4321));
  }

  @Test()
  public void test_mps4102() throws Exception {
    int a;
    for(final Wrappers._int i = new Wrappers._int(0) ; i.value < 10 ; i.value++ ) {
      a = new _FunctionTypes._return_P0_E0 <Integer>() {

        public Integer invoke() {
          return i.value;
        }
      }.invoke();
    }
  }

}
