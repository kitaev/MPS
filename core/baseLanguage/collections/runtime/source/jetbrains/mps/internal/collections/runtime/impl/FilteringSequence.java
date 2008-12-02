/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.internal.collections.runtime.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;


/**
 * @author fyodor
 */
public class FilteringSequence<U> extends AbstractChainedSequence<U,U> implements Iterable<U>{
    
    private final IWhereFilter<? super U> filter;

    public FilteringSequence(Sequence<U> input, IWhereFilter<? super U> filter) {
        super (input);
        if (filter == null) {
            throw new NullPointerException ();
        }
        this.filter = filter;
    }

    public Iterator<U> iterator() {
        return new FilteringIterator ();
    }
    
    private class FilteringIterator implements Iterator<U> {
        
        private Iterator<U> inputIterator;
        private int hasNext = -1;
        private U next;

        public boolean hasNext() {
            if (hasNext < 0) {
                this.inputIterator = getInput().toIterable().iterator();
                moveToNext();
            }
            return hasNext > 0;
        }
        
        public U next() {
            if (hasNext <= 0) {
                throw new NoSuchElementException ();
            }
            U tmp = next;
            moveToNext ();
            return tmp;
        }
        
        public void remove() {
            throw new UnsupportedOperationException ();
        }
        
        private void moveToNext() {
            this.hasNext = 0;
            this.next = null;
            while (inputIterator.hasNext()) {
                U tmp = inputIterator.next();
                if (filter.accept(tmp)) {
                    this.next = tmp;
                    this.hasNext = 1;
                    break;
                }
            }
        }
    }
    
}
