package jetbrains.mps.ypath.runtime.dom;

/*Generated by MPS */

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class ChainedIterator<E> implements Iterator<E> {
  private final List<Iterator<E>> iterators;
  private int index = 0;

  public ChainedIterator(Iterator<E>... iterators) {
    this.iterators = Arrays.asList(iterators);
    moveToNext();
  }

  public ChainedIterator(List<Iterator<E>> iteratorsList) {
    this.iterators = iteratorsList;
    moveToNext();
  }

  private void moveToNext() {
    while (index < iterators.size() && !(iterators.get(index).hasNext())) {
      index++;
    }
  }

  public boolean hasNext() {
    return index < iterators.size();
  }

  public E next() {
    if (hasNext()) {
      E tmp = iterators.get(index).next();
      moveToNext();
      return tmp;
    }
    throw new NoSuchElementException();
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}
