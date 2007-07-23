/*
 * Created Jan 15, 2007 at 2:51:15 PM
 */
package jetbrains.mps.ypath.runtime.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jetbrains.mps.ypath.runtime.IFeatureDescriptor;
import jetbrains.mps.ypath.runtime.ISiblingsFilter;
import jetbrains.mps.ypath.runtime.ITreeTraversal;



/**
 * @author fyodor
 */
public class SiblingsTreeTraversal<T> extends AbstractChainTreeTraversal<T> implements ITreeTraversal<T> {
    
    private final ISiblingsFilter<T> siblingsFilter;

    public SiblingsTreeTraversal (ITreeTraversal<T> source, ISiblingsFilter<T> siblingsFilter, IFeatureDescriptor<T> feature) {
        super (source,feature);
        this.siblingsFilter = siblingsFilter;
    }
    
    private ISiblingsFilter<T> getSiblingFilter () {
        return siblingsFilter;
    }
    
    public Iterator<T> iterator() {
        return new SiblingsIterator (getSourceTraversal().iterator());
    }

    private class SiblingsIterator implements Iterator<T> {

        private final Iterator<T> sourceIterator;
        private Iterator<T> currentSiblingsIterator = null;
        private T currentSource;
        private boolean hasCurrentSource = false;
        private T nextNode = null;
        private boolean hasNextNode = false;

        private SiblingsIterator (Iterator<T> source) {
            this.sourceIterator = source;
            moveToNext();
        }
        
        private void moveToNext() {
            this.nextNode = null;
            this.hasNextNode = false;
            do {
                while (!hasCurrentSource && sourceIterator.hasNext()) {
                    this.currentSource = sourceIterator.next();
                    if (!getSiblingFilter().accept(currentSource)) {
                        continue;
                    }
                    this.hasCurrentSource = true;
                    break;
                }
                
                if (currentSiblingsIterator == null) {
                    T parent = getParent(currentSource);
                    this.currentSiblingsIterator = getChildren(parent).iterator();
                }
                
                while (currentSiblingsIterator.hasNext()) {
                    T sibling = currentSiblingsIterator.next();
                    if (!getSiblingFilter().accept(sibling, currentSource)) {
                        continue;
                    }
                    this.nextNode = sibling;
                    this.hasNextNode = true;
                    return;
                }
                
                this.currentSiblingsIterator = null;
                this.hasCurrentSource = false;
            }
            while (sourceIterator.hasNext());
        }

        public boolean hasNext() {
            return hasNextNode;
        }
        
        public T next() {
            if (!hasNextNode) {
                throw new NoSuchElementException ();
            }
            T tmp = nextNode;
            moveToNext();
            return tmp;
        }
        
        public void remove() {
            throw new UnsupportedOperationException ();
        }

    }
}
