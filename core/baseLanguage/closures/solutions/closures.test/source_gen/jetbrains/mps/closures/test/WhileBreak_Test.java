package jetbrains.mps.closures.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

public class WhileBreak_Test extends ClosuresBase_Test {
  public void test_mps6546() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._return_P0_E0<Iterable<Integer>>() {
      public Iterable<Integer> invoke() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private boolean _3_condition;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 9:
                      if (_3_condition) {
                        this.__CP__ = 10;
                        break;
                      }
                      this.__CP__ = 15;
                      break;
                    case 12:
                      if (_3_condition) {
                        this.__CP__ = 13;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 4:
                      if (_3_condition) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      if (true) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 8;
                      break;
                    case 11:
                      this.__CP__ = 12;
                      this.yield(1);
                      return true;
                    case 0:
                      this._3_condition = true;
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      _3_condition = false;
                      this.__CP__ = 4;
                      break;
                    case 7:
                      this.__CP__ = 9;
                      break;
                    case 10:
                      this.__CP__ = 11;
                      break;
                    case 13:
                      this.__CP__ = 8;
                      break;
                    case 15:
                      this.__CP__ = -1;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    }, new _FunctionTypes._return_P0_E0<Iterable<Integer>>() {
      public Iterable<Integer> invoke() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
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
                      this.__CP__ = 1;
                      this.yield(1);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });
  }
}
