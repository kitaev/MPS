/*
 * Created Jan 11, 2007 at 12:46:57 PM
 */
package jetbrains.mps.ypath.runtime;

/**
 * @author fyodor
 */
public class TreeTraversalFactory {

    public static <T> ITreeTraversal<T> From (T t, TreePath <T> treePath) {
        return treePath.startTraversal(t);
    }
    
    public static <T> ITreeTraversal<T> Traverse (ITreeTraversal<T> traversal, TraversalAxis axis) {
        return traversal.traverse(axis);
    }

    public static <T> ITreeTraversal<T> Traverse (ITreeTraversal<T> traversal, TraversalAxis axis, String feature) {
        return traversal.traverse(axis, feature);
    }

    public static <T> ITreeTraversal<T> Traverse (ITreeTraversal<T> traversal, TraversalAxis axis, IFeatureDescriptor<T> featureDesc) {
        return traversal.traverse(axis, featureDesc);
    }

    public static <T> ITreeTraversal<T> Filter (ITreeTraversal<T> traversal, IFilter<T> filter) {
        return traversal.filter(filter);
    }
    
    public static TraversalAxis Axis (String axis) {
        return TraversalAxis.parseValue(axis);
    }
    
}
