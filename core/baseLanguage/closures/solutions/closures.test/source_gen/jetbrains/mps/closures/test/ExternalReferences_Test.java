package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.closures.runtime.FunctionTypes;
import junit.framework.Assert;

public class ExternalReferences_Test extends TestCase {

  public void test_localVariableDeclaration() throws Exception {
    final int foo = 42;
    int bar = new FunctionTypes._R <Integer>() {

      public Integer invoke() {
        return foo;
      }

    }.invoke();
    Assert.assertEquals(foo, bar);
  }

  public void test_methodParameter() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(final Integer d) {
        return new FunctionTypes._R <String>() {

          public String invoke() {
            return "Done: " + d;
          }

        }.invoke();
      }

    };
    Assert.assertEquals("Done: 1234", wrk.doWork(1234));
  }

  public void test_field() throws Exception {
    Worker wrk = new Worker() {

      public int field;
      public int foo;

      public String doWork(Integer foo) {
        this.foo = foo;
        this.field = this.foo;
        return new FunctionTypes._R <String>() {

          public String invoke() {
            return "Done: " + field;
          }

        }.invoke();
      }

    };
    Assert.assertEquals("Done: 4321", wrk.doWork(4321));
  }

}
