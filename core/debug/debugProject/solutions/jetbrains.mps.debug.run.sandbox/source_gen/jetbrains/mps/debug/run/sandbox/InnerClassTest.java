package jetbrains.mps.debug.run.sandbox;

/*Generated by MPS */


public class InnerClassTest {
  public InnerClassTest() {
    new InnerClassTest.MyInnerClass().doSmth();
  }

  public static void main(String[] args) {
    new InnerClassTest();
  }

  public class MyInnerClass {
    private int myField = 239;

    public MyInnerClass() {
    }

    public void doSmth() {
      System.out.println("Doing something!");
    }
  }
}
