package jetbrains.mps.baseLanguage.collections.unittest.simple_operations;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import org.junit.Test;
import junit.framework.Assert;
import java.util.HashSet;
import java.util.HashMap;

public class NaiveSetOperations_Test extends TestCase {
  public static Iterable<String> aabbcc = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("a");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("a");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("b");
                    return true;
                  case 5:
                    this.__CP__ = 6;
                    this.yield("b");
                    return true;
                  case 6:
                    this.__CP__ = 7;
                    this.yield("c");
                    return true;
                  case 7:
                    this.__CP__ = 1;
                    this.yield("c");
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
  public static Iterable<String> aabbc = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("a");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("a");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("b");
                    return true;
                  case 5:
                    this.__CP__ = 6;
                    this.yield("b");
                    return true;
                  case 6:
                    this.__CP__ = 1;
                    this.yield("c");
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
  public static Iterable<String> aabbcccdde = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("a");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("a");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("b");
                    return true;
                  case 5:
                    this.__CP__ = 6;
                    this.yield("b");
                    return true;
                  case 6:
                    this.__CP__ = 7;
                    this.yield("c");
                    return true;
                  case 7:
                    this.__CP__ = 8;
                    this.yield("c");
                    return true;
                  case 8:
                    this.__CP__ = 9;
                    this.yield("c");
                    return true;
                  case 9:
                    this.__CP__ = 10;
                    this.yield("d");
                    return true;
                  case 10:
                    this.__CP__ = 11;
                    this.yield("d");
                    return true;
                  case 11:
                    this.__CP__ = 1;
                    this.yield("e");
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
  public static Iterable<String> ccaabbcc = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("c");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("c");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("a");
                    return true;
                  case 5:
                    this.__CP__ = 6;
                    this.yield("a");
                    return true;
                  case 6:
                    this.__CP__ = 7;
                    this.yield("b");
                    return true;
                  case 7:
                    this.__CP__ = 8;
                    this.yield("b");
                    return true;
                  case 8:
                    this.__CP__ = 9;
                    this.yield("c");
                    return true;
                  case 9:
                    this.__CP__ = 1;
                    this.yield("c");
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
  public static Iterable<String> abc = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("a");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("b");
                    return true;
                  case 4:
                    this.__CP__ = 1;
                    this.yield("c");
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
  public static Iterable<String> cccdde = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("c");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("c");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("c");
                    return true;
                  case 5:
                    this.__CP__ = 6;
                    this.yield("d");
                    return true;
                  case 6:
                    this.__CP__ = 7;
                    this.yield("d");
                    return true;
                  case 7:
                    this.__CP__ = 1;
                    this.yield("e");
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
  public static Iterable<String> abcde = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("a");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("b");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("c");
                    return true;
                  case 5:
                    this.__CP__ = 6;
                    this.yield("d");
                    return true;
                  case 6:
                    this.__CP__ = 1;
                    this.yield("e");
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
  public static Iterable<String> aabb = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator<String>() {

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
                    this.yield("a");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("a");
                    return true;
                  case 4:
                    this.__CP__ = 5;
                    this.yield("b");
                    return true;
                  case 5:
                    this.__CP__ = 1;
                    this.yield("b");
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
  public static Iterable<String> c = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("c");
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
  public static Iterable<String> cc = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("c");
                    return true;
                  case 3:
                    this.__CP__ = 1;
                    this.yield("c");
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
  public static Iterable<String> ccc = Sequence.fromClosure(new ISequenceClosure <String>() {

    public Iterable<String> iterable() {
      return new Iterable <String>() {

        public Iterator<String> iterator() {
          return new YieldingIterator <String>() {

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
                    this.yield("c");
                    return true;
                  case 3:
                    this.__CP__ = 4;
                    this.yield("c");
                    return true;
                  case 4:
                    this.__CP__ = 1;
                    this.yield("c");
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

  @Test()
  public void test_union() throws Exception {
    this.assertIterableEqualsIgnoreOrder(aabbcccdde, Sequence.fromIterable(aabbcc).union(Sequence.fromIterable(cccdde)));
    this.assertIterableEqualsIgnoreOrder(aabbcccdde, Sequence.fromIterable(cccdde).union(Sequence.fromIterable(aabbcc)));
  }

  @Test()
  public void test_exclude() throws Exception {
    this.assertIterableEqualsIgnoreOrder(cc, Sequence.fromIterable(aabbcc).substract(Sequence.fromIterable(aabb)));
    this.assertIterableEqualsIgnoreOrder(aabb, Sequence.fromIterable(aabbcc).substract(Sequence.fromIterable(ccc)));
    this.assertIterableEqualsIgnoreOrder(aabbc, Sequence.fromIterable(aabbcc).substract(Sequence.fromIterable(c)));
    this.assertIterableEqualsIgnoreOrder(abc, Sequence.fromIterable(aabbcc).substract(Sequence.fromIterable(abc)));
  }

  @Test()
  public void test_intersect() throws Exception {
    this.assertIterableEqualsIgnoreOrder(cc, Sequence.fromIterable(aabbcc).intersect(Sequence.fromIterable(cccdde)));
    this.assertIterableEqualsIgnoreOrder(cc, Sequence.fromIterable(cccdde).intersect(Sequence.fromIterable(aabbcc)));
    this.assertIterableEqualsIgnoreOrder(cc, Sequence.fromIterable(ccc).intersect(Sequence.fromIterable(cc)));
    this.assertIterableEqualsIgnoreOrder(cc, Sequence.fromIterable(cc).intersect(Sequence.fromIterable(ccc)));
    this.assertIterableEqualsIgnoreOrder(cc, Sequence.fromIterable(cc).intersect(Sequence.fromIterable(ccaabbcc)));
  }

  public void assertSameContents(Iterable<String> seq1, Iterable<String> seq2) {
    Assert.assertSame(Sequence.fromIterable(seq1).count(), Sequence.fromIterable(seq2).count());
    for(String x : seq1) {
      Assert.assertTrue(Sequence.fromIterable(seq2).contains(x));
    }
    for(String y : seq2) {
      Assert.assertTrue(Sequence.fromIterable(seq1).contains(y));
    }
  }

  public  <T>void assertIterableEquals(Iterable<T> exp, Iterable<T> test) {
    Iterator<T> expIt = exp.iterator();
    Iterator<T> testIt = test.iterator();
    while (expIt.hasNext() && testIt.hasNext()) {
      Assert.assertEquals(expIt.next(), testIt.next());
    }
    Assert.assertFalse(expIt.hasNext());
    Assert.assertFalse(testIt.hasNext());
  }

  public  <T>void assertIterableEqualsAsSet(Iterable<T> exp, Iterable<T> test) {
    HashSet<T> expSet = new HashSet<T>();
    for(T e : exp) {
      Assert.assertTrue(expSet.add(e));
    }
    Iterator<T> testIt = test.iterator();
    while (testIt.hasNext()) {
      Assert.assertTrue(expSet.remove(testIt.next()));
    }
    Assert.assertTrue(expSet.isEmpty());
    Assert.assertFalse(testIt.hasNext());
  }

  public  <T>void assertIterableEqualsIgnoreOrder(Iterable<T> exp, Iterable<T> test) {
    HashMap<T, Integer> cardMap = new HashMap<T, Integer>();
    for(T e : exp) {
      Integer card = cardMap.get(e);
      cardMap.put(e, (card != null ?
        card + 1 :
        1
      ));
    }
    Iterator<T> testIt = test.iterator();
    while (testIt.hasNext()) {
      T next = testIt.next();
      Integer card = cardMap.remove(next);
      Assert.assertFalse(card == null);
      if (card > 1) {
        cardMap.put(next, card - 1);
      }
    }
    Assert.assertTrue(cardMap.isEmpty());
    Assert.assertFalse(testIt.hasNext());
  }

}
