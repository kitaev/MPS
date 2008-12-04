package jetbrains.mps.closures.test;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.List;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.Arrays;

public class YieldClosures_Test extends ClosuresBase_Test {

  @Test()
  public void test_ifStatement() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        exp.add(1);
        if (true) {
          exp.add(2);
        }
        if (false) {
          exp.add(3);
        } else
        {
          exp.add(4);
        }
        exp.add(5);
        if (false) {
          exp.add(6);
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

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
                      if (true) {
                        this.__CP__ = 4;
                        break;
                      }
                      this.__CP__ = 5;
                      break;
                    case 5:
                      if (false) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 12:
                      if (false) {
                        this.__CP__ = 13;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 2:
                      this.__CP__ = 3;
                      this.yield(1);
                      return true;
                    case 6:
                      this.__CP__ = 5;
                      this.yield(2);
                      return true;
                    case 9:
                      this.__CP__ = 8;
                      this.yield(3);
                      return true;
                    case 11:
                      this.__CP__ = 8;
                      this.yield(4);
                      return true;
                    case 8:
                      this.__CP__ = 12;
                      this.yield(5);
                      return true;
                    case 14:
                      this.__CP__ = 1;
                      this.yield(6);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 9;
                      break;
                    case 10:
                      this.__CP__ = 11;
                      break;
                    case 13:
                      this.__CP__ = 14;
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

    });
  }

  @Test()
  public void test_whileStatement() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        int i = 3;
        exp.add(i);
        while (i > 0) {
          int j = 1;
          exp.add(j);
          while (j <= 3) {
            exp.add(i * j);
            j = j + 1;
          }
          exp.add(j);
          i = i - 1;
        }
        exp.add(i);
        // must not return anything
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _3_i;
              private int _8_j;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 5:
                      if (this._3_i > 0) {
                        this.__CP__ = 6;
                        break;
                      }
                      this.__CP__ = 16;
                      break;
                    case 10:
                      if (this._8_j <= 3) {
                        this.__CP__ = 11;
                        break;
                      }
                      this.__CP__ = 14;
                      break;
                    case 4:
                      this.__CP__ = 5;
                      this.yield(this._3_i);
                      return true;
                    case 9:
                      this.__CP__ = 10;
                      this.yield(this._8_j);
                      return true;
                    case 12:
                      this.__CP__ = 13;
                      this.yield(this._3_i * this._8_j);
                      return true;
                    case 14:
                      this.__CP__ = 15;
                      this.yield(this._8_j);
                      return true;
                    case 16:
                      this.__CP__ = 17;
                      this.yield(this._3_i);
                      return true;
                    case 0:
                      this._3_i = 3;
                      this.__CP__ = 4;
                      break;
                    case 17:
                      // placeholder
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this._8_j = 1;
                      this.__CP__ = 9;
                      break;
                    case 15:
                      this._3_i = this._3_i - 1;
                      this.__CP__ = 5;
                      break;
                    case 11:
                      this.__CP__ = 12;
                      break;
                    case 13:
                      this._8_j = this._8_j + 1;
                      this.__CP__ = 10;
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

    });
  }

  @Test()
  public void test_doWhileStatement() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        exp.add(-1);
        int i = 3;
        exp.add(i);
        do {
          int j = i;
          exp.add(j);
          do {
            exp.add(j * i);
            j = j - 1;
            exp.add(j + i);
          } while(j > 0);
          i = i - 1;
        } while(i > 0);
        i = 0;
        exp.add(i);
        // must not return value
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _4_i;
              private int _10_j;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 7:
                      if (this._4_i > 0) {
                        this.__CP__ = 6;
                        break;
                      }
                      this.__CP__ = 8;
                      break;
                    case 13:
                      if (this._10_j > 0) {
                        this.__CP__ = 12;
                        break;
                      }
                      this.__CP__ = 14;
                      break;
                    case 2:
                      this.__CP__ = 3;
                      this.yield(-1);
                      return true;
                    case 5:
                      this.__CP__ = 6;
                      this.yield(this._4_i);
                      return true;
                    case 11:
                      this.__CP__ = 12;
                      this.yield(this._10_j);
                      return true;
                    case 15:
                      this.__CP__ = 16;
                      this.yield(this._10_j * this._4_i);
                      return true;
                    case 17:
                      this.__CP__ = 13;
                      this.yield(this._10_j + this._4_i);
                      return true;
                    case 18:
                      this.__CP__ = 19;
                      this.yield(this._4_i);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 3:
                      this._4_i = 3;
                      this.__CP__ = 5;
                      break;
                    case 8:
                      this._4_i = 0;
                      this.__CP__ = 18;
                      break;
                    case 19:
                      // placeholder
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this._10_j = this._4_i;
                      this.__CP__ = 11;
                      break;
                    case 14:
                      this._4_i = this._4_i - 1;
                      this.__CP__ = 7;
                      break;
                    case 12:
                      this.__CP__ = 15;
                      break;
                    case 16:
                      this._10_j = this._10_j - 1;
                      this.__CP__ = 17;
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

    });
  }

  @Test()
  public void test_forStatement() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        for(int i = 0 ; i < 3 ; i = i + 1) {
          for(int j = 0 ; j < 3 ; j = j + 1) {
            exp.add(i);
            exp.add(j);
          }
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _2_i;
              private int _6_j;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i = 0;
                    case 3:
                      if (!(this._2_i < 3)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._2_i = this._2_i + 1;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      this._6_j = 0;
                    case 7:
                      if (!(this._6_j < 3)) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 8;
                      break;
                    case 9:
                      this._6_j = this._6_j + 1;
                      this.__CP__ = 7;
                      break;
                    case 10:
                      this.__CP__ = 11;
                      this.yield(this._2_i);
                      return true;
                    case 11:
                      this.__CP__ = 9;
                      this.yield(this._6_j);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    case 8:
                      this.__CP__ = 10;
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

    });
  }

  @Test()
  public void test_foreachStatement() throws Exception {
    final List<Integer> data1 = (List<Integer>)Arrays.asList(1, 2, 3, 4, 5);
    final List<Integer> data2 = (List<Integer>)Arrays.asList(1, 2, 3, 4, 5);
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        for(int i : data1) {
          exp.add(i);
          for(int j : data2) {
            exp.add(j);
            exp.add(i + j);
          }
          exp.add(i * i);
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _2_i;
              private Iterator<Integer> _2_i_it;
              private int _6_j;
              private Iterator<Integer> _6_j_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i_it = data1.iterator();
                    case 3:
                      if (!(this._2_i_it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_i = this._2_i_it.next();
                      this.__CP__ = 4;
                      break;
                    case 6:
                      this._6_j_it = data2.iterator();
                    case 7:
                      if (!(this._6_j_it.hasNext())) {
                        this.__CP__ = 9;
                        break;
                      }
                      this._6_j = this._6_j_it.next();
                      this.__CP__ = 8;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      this.yield(this._2_i);
                      return true;
                    case 10:
                      this.__CP__ = 11;
                      this.yield(this._6_j);
                      return true;
                    case 11:
                      this.__CP__ = 7;
                      this.yield(this._2_i + this._6_j);
                      return true;
                    case 9:
                      this.__CP__ = 3;
                      this.yield(this._2_i * this._2_i);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
                      break;
                    case 8:
                      this.__CP__ = 10;
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

    });
  }

  @Test()
  public void test_dmitriev() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        int a = 0;
        for(int i = 0 ; i < 10 ; i = i + 1) {
          for(int j = 0 ; j < 10 ; j = j + 1) {
            if (i + j < 5) {
              continue;
            }
            if (i < j) {
              a = a + i + j;
              exp.add(a);
            }
          }
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _3_a;
              private int _8_j;
              private int _4_i;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      this._4_i = 0;
                    case 5:
                      if (!(this._4_i < 10)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this._4_i = this._4_i + 1;
                      this.__CP__ = 5;
                      break;
                    case 8:
                      this._8_j = 0;
                    case 9:
                      if (!(this._8_j < 10)) {
                        this.__CP__ = 7;
                        break;
                      }
                      this.__CP__ = 10;
                      break;
                    case 11:
                      this._8_j = this._8_j + 1;
                      this.__CP__ = 9;
                      break;
                    case 14:
                      if (this._4_i < this._8_j) {
                        this.__CP__ = 16;
                        break;
                      }
                      this.__CP__ = 11;
                      break;
                    case 12:
                      if (this._4_i + this._8_j < 5) {
                        this.__CP__ = 13;
                        break;
                      }
                      this.__CP__ = 14;
                      break;
                    case 18:
                      this.__CP__ = 11;
                      this.yield(this._3_a);
                      return true;
                    case 0:
                      this._3_a = 0;
                      this.__CP__ = 4;
                      break;
                    case 6:
                      this.__CP__ = 8;
                      break;
                    case 10:
                      this.__CP__ = 12;
                      break;
                    case 16:
                      this._3_a = this._3_a + this._4_i + this._8_j;
                      this.__CP__ = 18;
                      break;
                    case 13:
                      this.__CP__ = 11;
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

    });
  }

  @Test()
  public void test_switchStatement() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        for(Fruits fr : Arrays.asList(new Fruits[]{Fruits.APPLES,Fruits.ORANGES,Fruits.CARS})) {
          switch (fr) {
            case APPLES:
              exp.add(1);
              exp.add(2);
              // fall through
            case ORANGES:
              exp.add(3);
              break;
            default:
              exp.add(-1);
              break;
          }
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private Fruits _2_fr;
              private Iterator<Fruits> _2_fr_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_fr_it = Arrays.asList(new Fruits[]{Fruits.APPLES,Fruits.ORANGES,Fruits.CARS}).iterator();
                    case 3:
                      if (!(this._2_fr_it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_fr = this._2_fr_it.next();
                      this.__CP__ = 4;
                      break;
                    case 5:
                      switch (this._2_fr) {
                        case APPLES:
                          this.__CP__ = 6;
                          break __switch__;
                        case ORANGES:
                          this.__CP__ = 7;
                          break __switch__;
                        default:
                          this.__CP__ = 14;
                          break __switch__;
                      }
                    case 8:
                      this.__CP__ = 9;
                      this.yield(1);
                      return true;
                    case 9:
                      this.__CP__ = 10;
                      this.yield(2);
                      return true;
                    case 12:
                      this.__CP__ = 13;
                      this.yield(3);
                      return true;
                    case 15:
                      this.__CP__ = 16;
                      this.yield(-1);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
                      break;
                    case 6:
                      this.__CP__ = 8;
                      break;
                    case 10:
                      // fall through
                      this.__CP__ = 7;
                      break;
                    case 7:
                      this.__CP__ = 12;
                      break;
                    case 13:
                      this.__CP__ = 3;
                      break;
                    case 14:
                      this.__CP__ = 15;
                      break;
                    case 16:
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

    });
  }

  @Test()
  public void test_elseIfClauses() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        for(int i = 1 ; i <= 10 ; i = i + 1) {
          if (i % 2 == 0) {
            exp.add(i * 10);
          } else if (i % 3 == 0) {
            exp.add(i * 100);
          } else if (i % 5 == 0) {
            exp.add(i * 1000);
          } else
          {
            exp.add(i * 10000);
            if (true) {
              exp.add(i * 100000);
            }
          }
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _2_i;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_i = 1;
                    case 3:
                      if (!(this._2_i <= 10)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._2_i = this._2_i + 1;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      if (this._2_i % 2 == 0) {
                        this.__CP__ = 7;
                        break;
                      } else if (this._2_i % 3 == 0) {
                        this.__CP__ = 9;
                        break;
                      } else if (this._2_i % 5 == 0) {
                        this.__CP__ = 11;
                        break;
                      }
                      this.__CP__ = 13;
                      break;
                    case 16:
                      if (true) {
                        this.__CP__ = 17;
                        break;
                      }
                      this.__CP__ = 5;
                      break;
                    case 8:
                      this.__CP__ = 5;
                      this.yield(this._2_i * 10);
                      return true;
                    case 10:
                      this.__CP__ = 5;
                      this.yield(this._2_i * 100);
                      return true;
                    case 14:
                      this.__CP__ = 15;
                      this.yield(this._2_i * 10000);
                      return true;
                    case 12:
                      this.__CP__ = 5;
                      this.yield(this._2_i * 1000);
                      return true;
                    case 18:
                      this.__CP__ = 5;
                      this.yield(this._2_i * 100000);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    case 9:
                      this.__CP__ = 10;
                      break;
                    case 13:
                      this.__CP__ = 14;
                      break;
                    case 11:
                      this.__CP__ = 12;
                      break;
                    case 15:
                      this.__CP__ = 16;
                      break;
                    case 17:
                      this.__CP__ = 18;
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

    });
  }

  @Test()
  public void test_mps_1503() throws Exception {
    this.assertResultsEqual(new _FunctionTypes._void_P1_E0 <List<Integer>>() {

      public void invoke(List<Integer> exp) {
        int val = 0;
        if (false) {
          val = 42;
        } else
        if (true) {
          int foo = -1;
          val = 24;
        }
        if (val != 0) {
          exp.add(val);
        }
      }

    }, new _FunctionTypes._return_P0_E0 <Iterable<Integer>>() {

      public Iterable<Integer> invoke() {
        return new Iterable <Integer>() {

          public Iterator<Integer> iterator() {
            return new YieldingIterator <Integer>() {

              private int __CP__ = 0;
              private int _3_val;
              private int _11_foo;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      if (false) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 8;
                      break;
                    case 6:
                      if (this._3_val != 0) {
                        this.__CP__ = 12;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 8:
                      if (true) {
                        this.__CP__ = 9;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 13:
                      this.__CP__ = 1;
                      this.yield(this._3_val);
                      return true;
                    case 0:
                      this._3_val = 0;
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this._3_val = 42;
                      this.__CP__ = 6;
                      break;
                    case 12:
                      this.__CP__ = 13;
                      break;
                    case 9:
                      this._11_foo = -1;
                      this._3_val = 24;
                      this.__CP__ = 6;
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

    });
  }

}
