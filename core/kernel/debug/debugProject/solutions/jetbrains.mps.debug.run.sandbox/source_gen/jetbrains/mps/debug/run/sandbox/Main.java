package jetbrains.mps.debug.run.sandbox;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public class Main {
  public int myI;

  public Main() {
    System.err.println();
  }

  public void foo() {
    this.myI = 5;
    System.err.println("done");
  }

  public static void main(String[] args) {
    new Main();
    new Thread(new Runnable() {
      public void run() {
        int i = 0;
        while (true) {
          i++;
        }
      }
    }).start();
    System.err.println("hello");
    for (int i = 0; i < 2; i++) {
      doSomething();
    }
    new Main().foo();
    SNode n = null;
    System.err.println("" + n);
    doSomething();
    doSomething();
    doSomething();
    while (true) {
      System.err.println("hi");
    }
  }

  public static void doSomething() {
    System.err.println("doing something...");
    System.err.println("doing something once again...");
  }
}
