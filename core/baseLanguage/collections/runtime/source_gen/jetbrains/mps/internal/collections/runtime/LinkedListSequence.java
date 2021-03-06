package jetbrains.mps.internal.collections.runtime;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import java.util.Iterator;
import java.util.Queue;
import jetbrains.mps.internal.collections.runtime.backports.Deque;
import jetbrains.mps.baseLanguage.closures.runtime.AdapterClass;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.impl.NullLinkedListSequence;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class LinkedListSequence<T> extends ListSequence<T> implements ILinkedListSequence<T>, ILinkedList<T> {
  protected LinkedListSequence(LinkedList<T> list) {
    super(list);
  }

  public void addFirst(T t) {
    getList().addFirst(t);
  }

  public void addLast(T t) {
    getList().addLast(t);
  }

  public boolean offerFirst(T t) {
    return getList().offerFirst(t);
  }

  public boolean offerLast(T t) {
    return getList().offerLast(t);
  }

  public T removeFirst() {
    return getList().removeFirst();
  }

  public T removeLast() {
    return getList().removeLast();
  }

  public T pollLast() {
    return getList().pollLast();
  }

  public T getFirst() {
    return getList().getFirst();
  }

  public T getLast() {
    return getList().getLast();
  }

  public T peekFirst() {
    return getList().peekFirst();
  }

  public T peekLast() {
    return getList().peekLast();
  }

  public boolean removeFirstOccurrence(Object o) {
    return getList().removeFirstOccurrence(o);
  }

  public boolean offer(T t) {
    return getList().offer(t);
  }

  public T remove() {
    return getList().remove();
  }

  public T poll() {
    return getList().poll();
  }

  public T element() {
    return getList().element();
  }

  public T peek() {
    return getList().peek();
  }

  public void push(T t) {
    getList().push(t);
  }

  public T pop() {
    return getList().pop();
  }

  public Iterator<T> descendingIterator() {
    return null;
  }

  public T pollFirst() {
    return getList().pollFirst();
  }

  public boolean removeLastOccurrence(Object o) {
    return getList().removeLastOccurrence(o);
  }

  public T addLastElement(T t) {
    getList().addLast(t);
    return t;
  }

  public T removeFirstElement() {
    if (Sequence.NULL_WHEN_EMPTY) {
      if (getList().isEmpty()) {
        return null;
      }
    }
    return getList().removeFirst();
  }

  public Queue<T> toQueue() {
    return getList();
  }

  public T addFirstElement(T t) {
    if (Sequence.IGNORE_NULL_VALUES) {
      if (t == null) {
        return null;
      }
    }
    getList().addFirst(t);
    return t;
  }

  public T peekElement() {
    if (Sequence.NULL_WHEN_EMPTY) {
      if (getList().isEmpty()) {
        return null;
      }
    }
    return getList().peek();
  }

  public T popElement() {
    if (Sequence.NULL_WHEN_EMPTY) {
      if (getList().isEmpty()) {
        return null;
      }
    }
    return getList().pop();
  }

  public T pushElement(T t) {
    getList().push(t);
    return t;
  }

  public Deque<T> toDeque() {
    return getList();
  }

  @Override
  public ILinkedListSequence<T> asSynchronized() {
    return (ILinkedListSequence<T>) super.asSynchronized();
  }

  @Override
  public ILinkedListSequence<T> asUnmodifiable() {
    return (ILinkedListSequence<T>) super.asUnmodifiable();
  }

  @Override
  public ILinkedListSequence<T> addSequence(ISequence<? extends T> seq) {
    return (ILinkedListSequence<T>) super.addSequence(seq);
  }

  @Override
  public ILinkedListSequence<T> removeSequence(ISequence<? extends T> seq) {
    return (ILinkedListSequence<T>) super.removeSequence(seq);
  }

  @Override
  public ILinkedListSequence<T> removeWhere(@AdapterClass(value = "IWhereFilter") _FunctionTypes._return_P1_E0<? extends Boolean, ? super T> filter) {
    return (ILinkedListSequence<T>) super.removeWhere(filter);
  }

  @Override
  protected LinkedList<T> getList() {
    return (LinkedList<T>) super.getList();
  }

  public static <U> ILinkedListSequence<U> fromLinkedList(Deque<U> list) {
    if (Sequence.USE_NULL_SEQUENCE) {
      if (list == null) {
        return NullLinkedListSequence.instance();
      }
    }
    if (list instanceof ILinkedListSequence<?>) {
      return (ILinkedListSequence<U>) list;
    }
    if (list instanceof LinkedList) {
      return new LinkedListSequence<U>((LinkedList) list);
    }
    return LinkedListSequence.fromIterable(list);
  }

  public static <U> ILinkedListSequence<U> fromIterable(Iterable<U> it) {
    if (Sequence.USE_NULL_SEQUENCE) {
      if (it == null) {
        return NullLinkedListSequence.instance();
      }
    }
    if (it instanceof ILinkedListSequence<?>) {
      return (ILinkedListSequence<U>) it;
    }
    LinkedList<U> list = new LinkedList<U>();
    if (Sequence.IGNORE_NULL_VALUES) {
      for (U u : it) {
        if (u != null) {
          list.add(u);
        }
      }
    } else
    if (it instanceof Collection<?>) {
      list.addAll((Collection<? extends U>) it);
    } else {
      for (U u : it) {
        list.add(u);
      }
    }
    return new LinkedListSequence<U>(list);
  }

  public static <U> ILinkedListSequence<U> fromListAndArray(LinkedList<U> list, U... array) {
    if (Sequence.NULL_ARRAY_IS_SINGLETON) {
      if (array == null) {
        array = (U[]) Sequence.nullSingletonArray();
      }
    }
    if (Sequence.USE_NULL_SEQUENCE) {
      if (list == null && array == null) {
        return NullLinkedListSequence.instance();
      } else
      if (list == null) {
        list = new LinkedList<U>();
      } else
      if (array == null) {
        if (list instanceof IListSequence<?>) {
          return (ILinkedListSequence<U>) list;
        }
        return new LinkedListSequence<U>(list);
      }
    }
    List<U> input = Arrays.asList(array);
    if (Sequence.IGNORE_NULL_VALUES) {
      for (U u : input) {
        if (u != null) {
          list.add(u);
        }
      }
    } else {
      list.addAll(input);
    }
    if (list instanceof ILinkedListSequence<?>) {
      return (ILinkedListSequence<U>) list;
    }
    return new LinkedListSequence<U>(list);
  }

  public static <U> ILinkedListSequence<U> fromListWithValues(LinkedList<U> list, Iterable<? extends U> it) {
    LinkedList<U> tmp = list;
    if (Sequence.USE_NULL_SEQUENCE) {
      if (list == null && it == null) {
        return NullLinkedListSequence.instance();
      } else
      if (list == null) {
        tmp = new LinkedList<U>();
      } else
      if (it == null) {
        return LinkedListSequence.fromLinkedList(list);
      }
    }
    if (Sequence.IGNORE_NULL_VALUES) {
      for (U u : it) {
        if (u != null) {
          tmp.add(u);
        }
      }
    } else
    if (it instanceof Collection<?>) {
      tmp.addAll((Collection<? extends U>) it);
    } else {
      for (U u : it) {
        tmp.add(u);
      }
    }
    if (tmp instanceof ILinkedListSequence<?>) {
      return (ILinkedListSequence<U>) tmp;
    }
    return new LinkedListSequence<U>(tmp);
  }
}
