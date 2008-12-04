package jetbrains.mps.internalCollections.test.closures;

/*Generated by MPS */

import org.junit.Test;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.util.Arrays;
import jetbrains.mps.internal.collections.runtime.StopIteratingException;
import junit.framework.Assert;
import java.util.Collections;

public class Mapper_Test extends Util_Test {

  @Test()
  public void test_mapMethod() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    ISequence<Integer> test = seq.translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it1) {
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
                      this.yield(it1);
                      return true;
                    case 3:
                      this.__CP__ = 1;
                      this.yield(it1 * 2);
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

    });
    Iterable<Integer> expected = Arrays.asList(1, 2, 2, 4, 3, 6, 4, 8, 5, 10);
    this.assertIterableEquals(expected, test.toIterable());
  }

  @Test()
  public void test_mapperVar() throws Exception {
    ISequence<Integer> seq = Sequence.fromIterable(this.input5());
    ITranslator2<Integer, Integer> trans = new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer i) {
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
                      this.yield(i);
                      return true;
                    case 3:
                      this.__CP__ = 1;
                      this.yield(i * 2);
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
    Iterable<Integer> expected = Arrays.asList(1, 2, 2, 4, 3, 6, 4, 8, 5, 10);
    this.assertIterableEquals(expected, seq.translate(trans).toIterable());
    this.assertIterableEquals(expected, seq.translate(trans).toIterable());
  }

  @Test()
  public void test_mappingOperation() throws Exception {
    Iterable<Integer> test = Sequence.fromIterable(this.input5()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer i) {
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
                      this.yield(i);
                      return true;
                    case 3:
                      this.__CP__ = 1;
                      this.yield(i * 2);
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

    });
    this.assertIterableEquals(Arrays.asList(1, 2, 2, 4, 3, 6, 4, 8, 5, 10), test);
  }

  @Test()
  public void test_legacyMapper() throws Exception {
    Iterable<Integer> test = Sequence.fromIterable(this.input5()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                      this.yield(it);
                      return true;
                    case 3:
                      this.__CP__ = 1;
                      this.yield(it * 2);
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

    });
    this.assertIterableEquals(Arrays.asList(1, 2, 2, 4, 3, 6, 4, 8, 5, 10), test);
  }

  @Test()
  public void test_stopSkip() throws Exception {
    Iterable<Integer> test = Sequence.fromIterable(this.input10()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                    case 4:
                      if (it % 2 == 1) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 8:
                      if (it > 5) {
                        this.__CP__ = 9;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this.__CP__ = 8;
                      this.yield(it);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 1;
                      break;
                    case 9:
                      throw new StopIteratingException();
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

    });
    this.assertIterableEquals(Arrays.asList(2, 4, 6), test);
    Iterable<Integer> test2 = Sequence.fromIterable(this.input10()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                    case 4:
                      if (it % 2 == 1) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 8:
                      if (it > 5) {
                        this.__CP__ = 9;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this.__CP__ = 8;
                      this.yield(it);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 1;
                      break;
                    case 9:
                      throw new StopIteratingException();
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

    });
    this.assertIterableEquals(Arrays.asList(2, 4, 6), test2);
  }

  @Test()
  public void test_stopBug() throws Exception {
    Iterable<Integer> test = Sequence.fromIterable(this.input5()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                    case 4:
                      if (it == 5) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this.__CP__ = 7;
                      this.yield(5);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 7:
                      throw new StopIteratingException();
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

    });
    this.assertIterableEquals(Arrays.asList(5), test);
    Iterable<Integer> test2 = Sequence.fromIterable(this.input5()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                    case 4:
                      if (false) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 7:
                      this.__CP__ = 6;
                      this.yield(999);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 6:
                      throw new StopIteratingException();
                    case 5:
                      this.__CP__ = 7;
                      break;
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

    });
    Assert.assertTrue(Sequence.fromIterable(test2).isEmpty());
    Iterable<Integer> test3 = Sequence.fromIterable(this.input5()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                    case 4:
                      if (it == 5) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 3;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 6:
                      this.__CP__ = 7;
                      this.yield(5);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 6;
                      break;
                    case 7:
                      throw new StopIteratingException();
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

    });
    this.assertIterableEquals(Arrays.asList(5), test3);
    Iterable<Integer> test4 = Sequence.fromIterable(this.input5()).translate(new ITranslator2 <Integer, Integer>() {

      public Iterable<Integer> translate(final Integer it) {
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
                    case 4:
                      if (false) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 6;
                      break;
                    case 3:
                      if (false) {
                        this.__CP__ = 2;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 7:
                      this.__CP__ = 6;
                      this.yield(999);
                      return true;
                    case 2:
                      this.__CP__ = 4;
                      break;
                    case 6:
                      throw new StopIteratingException();
                    case 5:
                      this.__CP__ = 7;
                      break;
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

    });
    Assert.assertTrue(Sequence.fromIterable(test4).isEmpty());
  }

  @Test()
  public void test_selectMany() throws Exception {
    //  only testing compileability of the generated code
    Iterable<B> bs = Sequence.fromIterable(Collections.<B>emptyList());
    Sequence.fromIterable(bs).translate(new ITranslator2 <B, A>() {

      public Iterable<A> translate(B it) {
        return it.as;
      }

    });
    Sequence.fromIterable(bs).translate(new ITranslator2 <B, A>() {

      public Iterable<A> translate(B it) {
        return it.listofa;
      }

    });
    Sequence.fromIterable(bs).translate(new ITranslator2 <B, A>() {

      public Iterable<A> translate(B it) {
        return it.seqofa;
      }

    });
    Sequence.fromIterable(bs).translate(new ITranslator2 <B, A>() {

      public Iterable<A> translate(B it) {
        return it.iterableofa;
      }

    });
  }

}
