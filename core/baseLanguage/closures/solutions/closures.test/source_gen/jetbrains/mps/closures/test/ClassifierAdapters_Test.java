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
package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import org.junit.Test;
import jetbrains.mps.baseLanguage.closures.util.Constants;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import junit.framework.Assert;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;

public class ClassifierAdapters_Test extends TestCase {

  @Test()
  public void test_interfaceAsFunctionType() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(Integer d) {
        return "Done: " + Integer.valueOf(d);
      }

    };
    if (!(Constants.ONLY_CLOSURE_LITERAL_AS_FUNCTION_TYPE)) {
      assert false : "Fix the test";
      /*
        _FunctionTypes._return_P1_E0<? extends String, ? super Integer> ft = wrk;
        int res = 1234;
        Assert.assertEquals("Done: 1234", ft.invoke(res));
      */
    }
  }

  @Test()
  public void test_functionTypeAsInterface() throws Exception {
    _FunctionTypes._return_P1_E0<? extends String, ? super Integer> cls = new _FunctionTypes._return_P1_E0 <String, Integer>() {

      public String invoke(Integer foo) {
        return "Done: " + foo;
      }

    };
    if (!(Constants.ONLY_CLOSURE_LITERAL_AS_FUNCTION_TYPE)) {
      assert false : "Fix the test";
      /*
        Worker wrk = cls;
        Assert.assertEquals("Done: 4321", wrk.doWork(4321));
      */
    }
  }

  @Test()
  public void test_closureLiteralAsInterface() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(Integer foo) {
        return "Done: " + foo;
      }

    };
    Assert.assertEquals("Done: 4321", wrk.doWork(4321));
  }

  @Test()
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

  @Test()
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

  @Test()
  public void test_instanceMethodCall() throws Exception {
    Assert.assertEquals("1234", this.makeWork(new Worker() {

      public String doWork(Integer i) {
        return String.valueOf(i);
      }

    }, 1234));
    Assert.assertEquals("4321", this.makeWork(new Worker() {

      public String doWork(Integer i) {
        return String.valueOf(i);
      }

    }, 4321));
  }

  @Test()
  public void test_exceptions() throws Exception {
    try {
      this.process(new Processor() {

        public int process(String instr) throws ProcessingException {
          if (Integer.parseInt(instr) < 0) {
            throw new ProcessingException();
          }
          return 1;
        }

      }, "-1");
      Assert.fail();
    } catch (ProcessingException e) {
      // expected exception
    }
  }

  @Test()
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

  @Test()
  public void test_closureLiteralAsParameterToConstructor() throws Exception {
    final Wrappers._int foo = new Wrappers._int(-1);
    Thread trd = new Thread(new Runnable() {

      public void run() {
        foo.value = 42;
      }

    });
    trd.start();
    try {
      trd.join();
    } finally {
      Assert.assertEquals(42, foo.value);
    }
  }

  @Test()
  public void test_wrongParametersNumber() throws Exception {
    this.acceptWorker(new Worker() {

      public String doWork(Integer i) {
        return String.valueOf(i);
      }

    });
  }

  @Test()
  public void test_returnWorker() throws Exception {
    Worker wrk = this.returnWorker();
  }

  @Test()
  public void test_returnProcessor() throws Exception {
    Processor prc = this.returnProcessor();
    try {
      prc.process("foobar");
      Assert.fail();
    } catch (ProcessingException e) {
      // expected exception
    }
  }

  public void acceptWorker(Worker one, Worker two) {
  }

  public void acceptWorker(Worker one) {
  }

  public String makeWork(Worker wrk, Integer i) {
    return wrk.doWork(i);
  }

  public int process(Processor prc, String instr) throws ProcessingException {
    return prc.process(instr);
  }

  public Worker returnWorker() {
    return new Worker() {

      public String doWork(Integer i) {
        return String.valueOf(i);
      }

    };
  }

  public Processor returnProcessor() {
    return new Processor() {

      public int process(String str) throws ProcessingException {
        throw new ProcessingException(str);
      }

    };
  }

}
